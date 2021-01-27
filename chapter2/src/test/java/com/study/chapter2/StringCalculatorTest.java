package com.study.chapter2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    @DisplayName("구분자를 기준으로 문자열을 분리하기")
    void separateStringWithSeparator() {
        String str = "1,2:3";
        String[] nums = str.split("[:,]");

        assertEquals(3, nums.length);
    }
}