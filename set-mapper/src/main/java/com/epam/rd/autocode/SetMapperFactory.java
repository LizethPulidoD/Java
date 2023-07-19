package com.epam.rd.autocode;


import com.epam.rd.autocode.domain.Employee;
import com.epam.rd.autocode.domain.FullName;
import com.epam.rd.autocode.domain.Position;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class
SetMapperFactory {

    public SetMapper<Set<Employee>> employeesSetMapper() {
        return resultSet -> {
            Set<Employee> employees = new HashSet<>();
            int index=1;
            while (resultSet.absolute(index)){
                BigInteger id = BigInteger.valueOf(resultSet.getInt("id"));
                FullName fullName = new FullName(resultSet.getString("firstName"),
                        resultSet.getString("lastName"), resultSet.getString("middleName"));
                Position position = Position.valueOf(resultSet.getString("position"));
                LocalDate hired = resultSet.getDate("hiredate").toLocalDate();
                BigDecimal salary = resultSet.getBigDecimal("salary");
                BigInteger managerId = BigInteger.valueOf(resultSet.getInt("manager"));
                Employee employee= new Employee(id, fullName, position, hired, salary,getManager(resultSet,managerId));
                employees.add(employee);
                index++;
            }
            return employees;
        };
    }

    public Employee getManager(ResultSet resultSet, BigInteger employeeId) throws SQLException {
        Employee employee = null;
        resultSet.first();
        while (resultSet.next()) {
            if (BigInteger.valueOf(resultSet.getInt("id")).equals(employeeId)) {
                BigInteger id = BigInteger.valueOf(resultSet.getInt("id"));
                FullName fullName = new FullName(resultSet.getString("firstName"),
                        resultSet.getString("lastName"), resultSet.getString("middleName"));
                Position position = Position.valueOf(resultSet.getString("position"));
                LocalDate hired = resultSet.getDate("hiredate").toLocalDate();
                BigDecimal salary = resultSet.getBigDecimal("salary");
                BigInteger managerId = BigInteger.valueOf(resultSet.getInt("manager"));
                Employee manager = getManager(resultSet, managerId);
                employee = new Employee(id, fullName, position, hired, salary, manager);
            }
        }
        return employee;
    }
}
