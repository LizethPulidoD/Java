package com.epam.tasks;

import com.epam.tasks.arrays.sorter.Sorter;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class SortingAppTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    public void testZeroArgument() {
        String[] argument = new String[0];
        Sorter.sortArray(argument);
    }

    @Test
    public void testSingleArgument() {
        String[] argument = new String[]{"2"};
        int[] expected = new int[]{2};
        Assert.assertArrayEquals(expected, Sorter.sortArray(argument));
    }

    @Test
    public void testMoreThanTenArguments() throws IOException {
        for (String line : moreThanTenArgumentsCases()) {
            thrown.expect(IndexOutOfBoundsException.class);
            Sorter.sortArray(line.split(" "));
        }
    }

    public static String[] moreThanTenArgumentsCases() throws IOException {
        InputStream in = Files.newInputStream(Paths.get("src/main/resources/inputMoreThanTenArguments.txt"));
        return IOUtils.readLines(in, "UTF-8").toArray(new String[0]);
    }
}


