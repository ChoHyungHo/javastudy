package io.codingtest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class VersionTest {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    public void Constructor_CreateVersionWithNoArgumentContructor_GetIllegalArgumentException(){
        Version v = new Version();
    }

    @Test
    public void Constructor_CreateVersionWithNoArgumentContructor_GetIllegalArgumentExceptionAndMessage(){
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage(illegalMessage);
        Version v = new Version();
    }

    private String illegalMessage = "You should create with version no.";
}
