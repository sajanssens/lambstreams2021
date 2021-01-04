package org.example.lambstreams2021.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {

    @Test // annotatie
    void testSetDateStart() {
        // given
        Employee jeroen = new Employee("Jeroen Verwoert");

        // when
        jeroen.setDateStart(LocalDate.of(2018, 10, 1));

        // then
        String s = jeroen.toString();
        assertThat(s).containsSequence("2018-10-01");
    }

    @Test
    void testName() {
        // given
        Employee bram = new Employee("Bram Janssens");

        // when
        String s = bram.toString();

        // then
        assertThat(s).containsSequence("Bram Janssens");
    }
}
