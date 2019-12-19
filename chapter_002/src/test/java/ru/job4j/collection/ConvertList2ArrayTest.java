package ru.job4j.collection;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void convert3ArraysToList() {
        ConvertList2Array list = new ConvertList2Array();
        List<int[]> sourceList = new ArrayList<>();
        sourceList.add(new int[]{1, 2, 3, 4, 5});
        sourceList.add(new int[]{6, 7});
        sourceList.add(new int[]{8, 9, 10});
        List<Integer> result = list.convert(sourceList);
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertThat(result, is(expect));
    }
}