package Day3;

public class Engineer extends Person {
    private boolean inventCode;
    private boolean executeTests;
    private String profession;

    public Engineer(String name, String surName, int age, boolean canSpeakEnglish,String profession, boolean executeTests, boolean inventCode) {
        this.setName(name);
        this.setSurName(surName);
        this.setAge(age);
        this.setCanSpeakEnglish(canSpeakEnglish);
        this.setProfession(profession);
        this.setInventCode(inventCode);
        this.setExecuteTests(executeTests);
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public boolean executeTests() {
        return executeTests;
    }
    public void setExecuteTests(boolean executeTests) {
        this.executeTests = executeTests;
    }
    public boolean inventCode() {
        return inventCode;
    }
    public void setInventCode(boolean inventCode) {
        this.inventCode = inventCode;
    }
}
