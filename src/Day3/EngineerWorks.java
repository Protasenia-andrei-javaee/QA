package Day3;

public class EngineerWorks {
    public static void main(String[] args) {
        Engineer manualEngineer = new Engineer("Bob", "York", 17, true, "Manual Enginner", false, true);
        Engineer automationEngineer = new Engineer("Andrew", "Minski", 35, false, "QA", false, true);

        System.out.println(manualEngineer.getProfession() + "; Execute Tests: " + manualEngineer.executeTests() + "; Invent Code: " + manualEngineer.inventCode() + "; " + manualEngineer.getName() + " " + manualEngineer.getSurName() + "; " + manualEngineer.getAge() + "; Can speak english: " + manualEngineer.humanSpeaks());
        System.out.println(automationEngineer.getProfession() + "; Execute Tests: " + automationEngineer.executeTests() + "; Invent Code: " + automationEngineer.inventCode() + "; " + automationEngineer.getName() + " " + automationEngineer.getSurName() + "; " + automationEngineer.getAge() + "; Can speak english: " + automationEngineer.humanSpeaks());
    }
}
