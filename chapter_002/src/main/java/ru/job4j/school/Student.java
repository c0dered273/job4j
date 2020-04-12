package ru.job4j.school;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private int score;

    public Student(String name, String surname, int score) {
        this.name = name;
        this.surname = surname;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return Integer.compare(this.score, o.getScore());
    }
}
