package ru.job4j.school;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    private List<Student> students = new ArrayList<>();
    private Student stud1 = new Student(40);
    private Student stud2 = new Student(1);
    private Student stud3 = new Student(50);
    private Student stud4 = new Student(60);
    private Student stud5 = new Student(70);
    private Student stud6 = new Student(80);
    private Student stud7 = new Student(100);
    private Student stud8 = new Student(0);

    @Before
    public void prepareData() {
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        students.add(stud5);
        students.add(stud6);
        students.add(stud7);
        students.add(stud8);
    }

    @Test
    public void whenScore70to100() {
        List<Student> expect = new ArrayList<>();
        expect.add(stud5);
        expect.add(stud6);
        expect.add(stud7);
        List<Student> result = School.collect(students, i -> i.score >= 70 && i.score <= 100);
        assertThat(result, is(expect));
    }

    @Test
    public void whenScore50to70() {
        List<Student> expect = new ArrayList<>();
        expect.add(stud3);
        expect.add(stud4);
        List<Student> result = School.collect(students, i -> i.score >= 50 && i.score < 70);
        assertThat(result, is(expect));
    }

    @Test
    public void whenScore0to50() {
        List<Student> expect = new ArrayList<>();
        expect.add(stud1);
        expect.add(stud2);
        List<Student> result = School.collect(students, i -> i.score > 0 && i.score < 50);
        assertThat(result, is(expect));
    }
}
