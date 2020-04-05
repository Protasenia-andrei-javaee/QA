package Day3;

public class Human {
    private int age;
    private boolean canSpeakEnglish;

    public void setAge(int age) {
        this.age = age;
    }

    public void setCanSpeakEnglish(boolean canSpeakEnglish) {
        this.canSpeakEnglish = canSpeakEnglish;
    }
    public int getAge() {
        return age;
    }

    public boolean humanSpeaks() {
        return canSpeakEnglish;
    }


}
