package com.kylemoore;

import com.kylemoore.flaky.FlakyTest;
import junit.framework.Test;
import junit.framework.TestSuite;

public class OldSchoolSuite extends TestSuite {

    public OldSchoolSuite(Class<?>... classes) {
        super(classes);
    }

    public static Test suite() {
        Class<?>[] testClasses = { FlakyTest.class, NotFlakyTest.class };

        TestSuite suite = new OldSchoolSuite(testClasses);
        suite.setName("OldSchool Suite");

        return suite;
    }
}
