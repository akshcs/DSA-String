package test.StringPart1;

import StringPart1.ReverseString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    @BeforeEach
    public void setUp(){

    }

    @Test
    public void assertReverseStringWithoutSpaces(){
        assertEquals("Blue is Sky", ReverseString.reverseWords("Sky is Blue"));
    }

    @Test
    public void assertReverseStringWithSpaces(){
        assertEquals("Blue is Sky", ReverseString.reverseWords("  Sky   is   Blue "));
    }
}
