package com.likelion.javaproject2.week7.day1;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearTest {

    @org.junit.jupiter.api.Test
    void checkLeapYear() {
        assertEquals(true , LeapYear.checkLeapYear(2020));
    }
}