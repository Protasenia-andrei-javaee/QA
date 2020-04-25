package runner;

import tests.BasicEngineerTest;
import tests.ExecuteTest;
import tests.InstabilityTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({BasicEngineerTest.class, ExecuteTest.class, InstabilityTest.class})
public class TestRunner {
}