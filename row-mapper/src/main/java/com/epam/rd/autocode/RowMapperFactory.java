package com.epam.rd.autocode;

import com.epam.rd.autocode.domain.Employee;
import com.epam.rd.autocode.domain.FullName;
import com.epam.rd.autocode.domain.Position;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

public class RowMapperFactory {

    public RowMapper<Employee> employeeRowMapper() {
        return resultSet -> {
            BigInteger id = BigInteger.valueOf(resultSet.getInt("id"));
            FullName fullName = new FullName(resultSet.getString("firstName"),
                    resultSet.getString("lastName"), resultSet.getString("middleName"));
            Position position = Position.valueOf(resultSet.getString("position"));
            LocalDate hired = resultSet.getDate("hiredate").toLocalDate();
            BigDecimal salary = resultSet.getBigDecimal("salary");

            return new Employee(id, fullName, position, hired, salary);
        };
    }
}
