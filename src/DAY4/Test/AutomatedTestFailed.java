package DAY4.Test;

import DAY4.Entity.AutomatedTest;
import DAY4.Entity.Result;
import DAY4.Entity.TestLevel;
import DAY4.Worker.AutomationEngineer;
import org.junit.Assert;
import org.junit.Test;

public class AutomatedTestFailed {

    @Test
    public void automatedTestFailed() {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.GUI, 5);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals("AutomationTest, AutomationEngineer, Gui 9, instability 5, anxiety 1: ", Result.FAILED, automatedTest.apply(automationEngineer));
    }
}
