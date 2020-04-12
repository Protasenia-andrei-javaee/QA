package DAY4.Test;

import DAY4.Entity.ManualTest;
import DAY4.Entity.Result;
import DAY4.Entity.TestLevel;
import DAY4.Worker.AutomationEngineer;
import org.junit.Assert;
import org.junit.Test;

public class ManualTestFailed {

    @Test
    public void manualTestFailed() {
        ManualTest manualTest = new ManualTest(TestLevel.GUI, 2);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals("ManualTest, AutomationEngineer, GUI 9, instability 2, anxiety 3: ", Result.FAILED, manualTest.apply(automationEngineer));
    }
}
