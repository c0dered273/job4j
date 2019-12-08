package ru.job4j.pojo;

import java.util.Calendar;

public class Student {
    private String fio;
    private String group;
    private Calendar entryDate;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Calendar getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Calendar entryDate) {
        this.entryDate = entryDate;
    }
}
