package com.kylemoore;

import junit.framework.TestCase;

public class NotFlakyTest extends TestCase {

    public void testNeverFlaky() {
        // Get current time in milliseconds
        long currentTimeMillis = System.currentTimeMillis();

        System.out.println("Current time in ms: " + currentTimeMillis);
        System.out.println("Test will pass");

        assertTrue("always passes", true);
    }
}
