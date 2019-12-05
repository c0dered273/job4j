package ru.job4j.pojo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFIO("Иванов Сергей Петрович");
        student.setGroup("ТММ432");
        student.setEntryDate(new GregorianCalendar(2002, Calendar.SEPTEMBER, 2));
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy");
        System.out.println(student.getFIO() + " поступил в группу " + student.getGroup() + " в "
                + dateFormat.format(student.getEntryDate().getTime()));
    }
}
