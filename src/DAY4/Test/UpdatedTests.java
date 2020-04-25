package DAY4.Test;

import DAY4.Entity.AutomatedTest;
import DAY4.Entity.ManualTest;
import DAY4.Entity.Result;
import DAY4.Entity.TestLevel;
import DAY4.Worker.AutomationEngineer;
import DAY4.Worker.Engineer;
import DAY4.Worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class UpdatedTests {
    private static DAY4.Entity.Test test;
    private static Engineer engineer;

    @Test
    public void Instability_0(){
        test = new ManualTest(TestLevel.GUI, 0);
        Assert.assertEquals(1, test.getInstability());
    }

    @Test
    public void Instability_14(){
        test = new ManualTest(TestLevel.GUI, 14);
        Assert.assertEquals(10, test.getInstability());
    }

    @Test
    public void Instability_8(){
        test = new ManualTest(TestLevel.GUI, 8);
        Assert.assertEquals(8, test.getInstability());
    }

    @Test
    public void manualTestAEngineerFailed() {
        test = new ManualTest(TestLevel.GUI, 10);
        engineer = new AutomationEngineer();
        engineer.setSkill(8);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.FAILED, test.apply(engineer));
    }

    @Test
    public void manualTestAEngineerPassed() {
        test = new ManualTest(TestLevel.API, 4);
        engineer = new AutomationEngineer();
        engineer.setSkill(5);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.PASSED, test.apply(engineer));
    }

    @Test
    public void automatedTestTEngineerFailed() {
        test = new AutomatedTest(TestLevel.GUI, 9);
        engineer = new TestEngineer();
        engineer.setSkill(7);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.FAILED, test.apply(engineer));
    }

    @Test
    public void automatedTestTEngineerPassed() {
        test = new AutomatedTest(TestLevel.UNIT, 5);
        engineer = new TestEngineer();
        engineer.setSkill(1);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.PASSED, test.apply(engineer));
    }

    @Test
    public void automatedTestAEngineerFailed() {
        test = new AutomatedTest(TestLevel.GUI, 9);
        engineer = new AutomationEngineer();
        engineer.setSkill(1);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.FAILED, test.apply(engineer));
    }

    @Test
    public void manualTestTEngineerPassed() {
        test = new ManualTest(TestLevel.API, 2);
        engineer = new TestEngineer();
        engineer.setSkill(1);
        Assert.assertEquals(test.getClass().toString() + " " + engineer.getClass().toString(), Result.PASSED, test.apply(engineer));
    }


}
