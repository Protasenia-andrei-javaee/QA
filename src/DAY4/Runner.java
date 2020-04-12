package DAY4;

import DAY4.Entity.AutomatedTest;
import DAY4.Entity.ManualTest;
import DAY4.Entity.TestLevel;
import DAY4.Worker.AutomationEngineer;
import DAY4.Worker.TestEngineer;

public class Runner {
    public static void main(String[] args) {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.API, 7);
        TestEngineer testEngineer = new TestEngineer();
        ManualTest manualTest = new ManualTest(TestLevel.GUI, 2);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        System.out.println("automatedTest.apply(testEngineer): " + automatedTest.apply(testEngineer));
        System.out.println("automatedTest.apply(automationEngineer): " + automatedTest.apply(automationEngineer));
        System.out.println("manualTest.apply(automationEngineer): " + manualTest.apply(automationEngineer));
        System.out.println("manualTest.apply(testEngineer): " + manualTest.apply(testEngineer));
    }
}
