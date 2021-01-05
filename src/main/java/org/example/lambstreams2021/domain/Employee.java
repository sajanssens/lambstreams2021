package org.example.lambstreams2021.domain;

import java.time.LocalDate;

// C+S+T == jump to test (or create one)

public class Employee {

    private String name;
    private LocalDate dateStart;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, LocalDate date) {
        this.name = name;
        this.dateStart = date;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dateStart=" + dateStart +
                '}';
    }
}
