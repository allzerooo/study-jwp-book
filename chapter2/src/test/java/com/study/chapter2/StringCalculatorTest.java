package com.study.chapter2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    @DisplayName("구분자를 기준으로 문자열을 분리하기")
    void separateStringWithSeparator() {
        String str = "1,2:3";
        String[] nums = str.split("[:,]");

        assertEquals(3, nums.length);
    }

    @Test
    @DisplayName("커스텀 구분자 찾기")
    void findCustomSeparator() {
        String str = "//;₩n1;2;3";

        Pattern pattern = Pattern.compile("[/][/](.*?)[₩][n]");
        Matcher matcher = pattern.matcher(str);

        String separator = null;

        while (matcher.find()) {
            separator = matcher.group(1);
        }

        assertEquals(";", separator);
    }
}