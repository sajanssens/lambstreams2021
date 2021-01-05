package org.example.lambstreams2021.passingcode;

import org.example.lambstreams2021.domain.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowMinusYear = now.minusYears(1);

        List<Employee> em = Arrays.asList(new Employee("Jeroen", nowMinusYear), new Employee("Bram", now), new Employee("C"));

        em.sort(new Comparator<>() {
            @Override public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        em.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));

        System.out.println(em);

        em.sort(new Comparator<>() {
            @Override public int compare(Employee o1, Employee o2) {
                if (o1.getDateStart() == null) return 1;
                if (o2.getDateStart() == null) return -1;

                return o1.getDateStart().compareTo(o2.getDateStart());
            }
        });

        System.out.println(em);

    }

}
