/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App classUnderTest;

    int[] num1 = {1, 2};
    int[] num2 = {3, 20};
    int[] expected = {4, 22};
    String[] operation = {"add"};

    @BeforeEach
    void setUp() {
        classUnderTest = new App();
    }

//    @Test
//    @DisplayName("greeting Test")
//    void appHasAGreeting() {
//        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
//    }


//    @Test
//    @DisplayName("Calculate Test")
//    void calculateDivideTest() {
//        for (int index = 0; index < num1.length; index++) {
//            int testResul = classUnderTest.calculate(num1[index], num2[index], operation[index]);
//            assertEquals(, testResul);
//        }
//    }

//    int expected() {
//        return 10;
//    }

    @Test
    @DisplayName("Calculate Test")
    void calculateAddTest() {
        for (int index = 0; index < num1.length; index++) {
            int testResult = classUnderTest.calculate(num1[index], num2[index], operation[0]);
            assertEquals(expected[index], testResult);
        }
    }

    @Test
    void pluralizeTest() {
        String result = classUnderTest.pluralize("apple", 2);
        assertEquals("apples", result);
    }
}
