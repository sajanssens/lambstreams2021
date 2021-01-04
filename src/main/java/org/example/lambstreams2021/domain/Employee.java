package org.example.lambstreams2021.domain;

import java.time.LocalDate;

// C+S+T == jump to test (or create one)

public class Employee {

    private String name;
    private LocalDate dateStart;

    public Employee(String name) {
        this.name = name;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dateStart=" + dateStart +
                '}';
    }
}
