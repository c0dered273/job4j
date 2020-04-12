package ru.job4j.school;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    private List<Student> students = new ArrayList<>();
    private Student stud1 = new Student("Name1", "Surname1", 40);
    private Student stud2 = new Student("Name2", "Surname2", 1);
    private Student stud3 = new Student("Name3", "Surname3", 50);
    private Student stud4 = new Student("Name1", "Surname4", 60);
    private Student stud5 = new Student("Name2", "Surname5", 70);
    private Student stud6 = new Student("Name3", "Surname6", 80);
    private Student stud7 = new Student("Name4", "Surname7", 100);
    private Student stud8 = new Student("Name5", "Surname2", 0);

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
        List<Student> result = School.collect(students, i -> i.getScore() >= 70 && i.getScore() <= 100);
        assertThat(result, is(expect));
    }

    @Test
    public void whenScore50to70() {
        List<Student> expect = new ArrayList<>();
        expect.add(stud3);
        expect.add(stud4);
        List<Student> result = School.collect(students, i -> i.getScore() >= 50 && i.getScore() < 70);
        assertThat(result, is(expect));
    }

    @Test
    public void whenScore0to50() {
        List<Student> expect = new ArrayList<>();
        expect.add(stud1);
        expect.add(stud2);
        List<Student> result = School.collect(students, i -> i.getScore() > 0 && i.getScore() < 50);
        assertThat(result, is(expect));
    }

    @Test
    public void whenConvertListToMapBySurname() {
        Map<String, Student> expect = new HashMap<>();
        expect.put(stud1.getSurname(), stud1);
        expect.put(stud2.getSurname(), stud2);
        expect.put(stud3.getSurname(), stud3);
        expect.put(stud4.getSurname(), stud4);
        expect.put(stud5.getSurname(), stud5);
        expect.put(stud6.getSurname(), stud6);
        expect.put(stud7.getSurname(), stud7);
        Map<String, Student> result = School.toMapBySurname(students);
        assertThat(expect, is(result));
    }

    @Test
    public void whenScoreMoThen65() {
        students.add(null);
        List<Student> expect = new ArrayList<>();
        expect.add(stud7);
        expect.add(stud6);
        expect.add(stud5);
        List <Student> result = School.levelOf(students, 65);
        assertThat(result, is(expect));
    }
}
