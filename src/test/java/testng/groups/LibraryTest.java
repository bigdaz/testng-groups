/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package testng.groups;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class LibraryTest {
    @Test(groups = {"main"}) public void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertFalse(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
}
