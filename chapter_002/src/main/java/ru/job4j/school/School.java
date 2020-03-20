package ru.job4j.school;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    public static Map<String, Student> toMapBySurname (List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(Student::getSurname, e -> e, (oldValue, newValue) -> oldValue));
    }
}
