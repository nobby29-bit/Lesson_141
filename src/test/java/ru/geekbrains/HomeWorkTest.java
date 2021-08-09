package ru.geekbrains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTest {
    @Test
    void arrayAfter() {
        Assertions.assertThrows(RuntimeException.class, ()->HomeWork.arrayAfter(new int []{1,8,6}));
    }
    @Test
    void arrayAfterTest() {
        Assertions.assertThrows(RuntimeException.class, ()->HomeWork.arrayAfter(new int []{1,4,5,8,6}));
    }
    @Test
     void search() {

        Assertions.assertTrue(HomeWork.search(new int []{ 1, 1, 1, 4, 4, 1, 4, 4}));

    }
    @Test
    void testSearch() {

        Assertions.assertTrue(HomeWork.search(new int []{ 1, 1, 1,4}));

    }
}
