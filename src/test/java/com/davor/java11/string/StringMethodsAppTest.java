package com.davor.java11.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("String Method")
class StringMethodsAppTest {

    @Test
    void testMethod1() {
        List<String> stringLines = StringMethodsApp.method1();
        assertEquals(stringLines.size(), 3);
        assertEquals(stringLines.get(0), "Baeldung helps");
        assertEquals(stringLines.get(1), "developers");
        assertEquals(stringLines.get(2), "explore Java.");
    }
}