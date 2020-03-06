package JUnit_Example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AreaTest.class, CircumferenceTest.class })
public class AllTests {

}
