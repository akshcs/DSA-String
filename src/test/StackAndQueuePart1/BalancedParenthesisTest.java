package test.StackAndQueuePart1;

import StackAndQueuePart1.BalancedParenthesis;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedParenthesisTest {
    @BeforeEach
    public void setUp(){

    }

    @Test
    public void validParenthesis(){
        String S = "{[]}()";
        assertTrue(BalancedParenthesis.isValid(S));
    }

    @Test
    public void inValidParenthesis(){
        String S = "{[]})(";
        assertFalse(BalancedParenthesis.isValid(S));
    }
}
