package DAY6.Test.runner;

import DAY6.Test.tests.BasicEngineerTest;
import DAY6.Test.tests.ExecuteTest;
import DAY6.Test.tests.InstabilityTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({BasicEngineerTest.class, ExecuteTest.class, InstabilityTest.class})
public class TestRunner {
}