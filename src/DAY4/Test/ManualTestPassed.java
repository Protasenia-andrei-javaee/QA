package DAY4.Test;

import DAY4.Entity.ManualTest;
import DAY4.Entity.Result;
import DAY4.Entity.TestLevel;
import DAY4.Worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class ManualTestPassed {

    @Test
    public void manualTestPassed() {
        ManualTest manualTest = new ManualTest(TestLevel.UNIT, 4);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals("ManualTest, TestEngineer, UNIT 1, instability 4, anxiety 3: ", Result.PASSED, manualTest.apply(testEngineer));
    }
}
