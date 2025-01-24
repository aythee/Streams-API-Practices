package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralNumbersProblemSolution;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.CharSequenceUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

/*
 * Given a list of Strings : ["as", "123", "32", "2as"],
 * Create another list that contains only integers.
 * The output should be: [123,32]
 */
class A_ExtractIntegersTest {
    @Test
    @Disabled
    void testCheckAllIntegersWithoutAlphabets(){
        var input = List.of("1","12","12a","a12");
        var yourSolution = input.stream()
                .filter(A_ExtractIntegersTest::isNumeric) // Фильтруем только строки, которые являются числами
                // Преобразуем их в Integer
                .collect(Collectors.toList()); // Собираем результат в список

        var mySolution = GeneralNumbersProblemSolution.getNumberOnly(input);

        Assertions.assertEquals(mySolution, yourSolution);

    }
    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.chars().allMatch(Character::isDigit); // Проверяем, что все символы - цифры
    }

}
