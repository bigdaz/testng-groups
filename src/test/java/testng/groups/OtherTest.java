/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testng.groups;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class OtherTest {
    @Test(groups = {"other"}) public void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertFalse(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
}
