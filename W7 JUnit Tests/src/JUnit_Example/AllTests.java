// Sets the package
package JUnit_Example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AreaTest.class, CircumferenceTest.class, orkTest.class, ComparisonTest.class, ArrayTest.class })
public class AllTests {

}
