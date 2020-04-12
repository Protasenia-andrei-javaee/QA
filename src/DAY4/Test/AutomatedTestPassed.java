package DAY4.Test;

import DAY4.Entity.AutomatedTest;
import DAY4.Entity.Result;
import DAY4.Entity.TestLevel;
import DAY4.Worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class AutomatedTestPassed {

    @Test
    public void automatedTestPassed() {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.API, 2);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals("AutomatedTest, TestEngineer, API 3, instability 2, anxiety 3: ", Result.PASSED, automatedTest.apply(testEngineer));
    }
}
