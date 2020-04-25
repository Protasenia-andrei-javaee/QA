package DAY6;

import DAY6.Entity.AutomatedTest;
import DAY6.Entity.ManualTest;
import DAY6.Entity.Test;
import DAY6.Entity.TestLevel;
import DAY6.Worker.AutomationEngineer;
import DAY6.Worker.Engineer;
import DAY6.Worker.TestEngineer;

public class Runner {
    public static void main(String[] args) {
        Engineer testEngineer = new TestEngineer();
        Engineer automationEngineer = new AutomationEngineer();

        Test manualTest = new ManualTest(TestLevel.API, 3);
        Test automatedTest = new AutomatedTest(TestLevel.GUI, 5);

        testEngineer.executeTest(manualTest);
        testEngineer.executeTest(automatedTest);
        automationEngineer.executeTest(manualTest);
        automationEngineer.executeTest(automatedTest);
    }
}
