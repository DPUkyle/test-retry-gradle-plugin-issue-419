package com.kylemoore.flaky;

import junit.framework.TestCase;

public class FlakyTest extends TestCase {

    public void testFlakiness() {
        // Get current time in milliseconds
        long currentTimeMillis = System.currentTimeMillis();
        
        // Convert to string to easily check the last digit
        String timeString = String.valueOf(currentTimeMillis);
        char lastDigit = timeString.charAt(timeString.length() - 1);
        
        // Fail the test unless the last digit is 7
        boolean shouldPass = lastDigit == '7';
        
        System.out.println("Current time in ms: " + currentTimeMillis);
        System.out.println("Last digit: " + lastDigit);
        System.out.println("Test will " + (shouldPass ? "pass" : "fail"));
        
        assertTrue("Test fails because current time doesn't end with 7", shouldPass);
    }
}
