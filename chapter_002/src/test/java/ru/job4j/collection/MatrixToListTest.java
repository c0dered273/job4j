package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class MatrixToListTest {
    @Test
    public void whenConvertMatrixToList() {
        Integer[][] matrix = {{11, 12}, {21, 22}, {31, 32}};
        List<Integer> expect = new ArrayList<>(
                List.of(
                        11, 12, 21, 22, 31, 32
                )
        );
        List<Integer> result = MatrixToList.convertMatrixToList(matrix);
        assertThat(result, is(expect));
    }
}
