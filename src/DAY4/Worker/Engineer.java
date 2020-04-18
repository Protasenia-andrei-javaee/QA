package DAY4.Worker;

import DAY4.Entity.Result;
import DAY4.Entity.Test;

public abstract class Engineer {
    private int SkillRandom = 10;
    private int skill;
    private int anxiety = 3;

    public int getSkill() {
        return skill;
    }

    public void setSkill(int i) {
        this.skill = (int) (1 + Math.random() * SkillRandom);
    }

    public int getAnxiety() {
        return anxiety;
    }
    public Result executeTest(Test test) {
        return null;
    }
}
