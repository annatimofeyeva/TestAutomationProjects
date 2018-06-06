import java.util.HashMap;
public class FitzSubjectInformationHashMap {
    public static void main(String[] args) {
        HashMap<String, String> personInformation = new HashMap<String, String>();
        personInformation.put("Case ID", "111");
        personInformation.put("Suspect Type", "Victim");
        personInformation.put("Last Name (*)", "Smith");
        personInformation.put("First Name (*)", "John");
        personInformation.put("Middle Name", "SS");
        personInformation.put("Nickname(AKA)", "NNN");
        personInformation.put("Date of Birth", "12/04/1990");
        personInformation.put("Age", "28");
        personInformation.put("Sex", "M");
        personInformation.put("Race", "Korean");
        personInformation.put("Height (ft)", "5'4”");
        personInformation.put("Weight (lbs)", "165");
        personInformation.put("Build", "Medium");
        personInformation.put("Hair Color", "Brown");
        personInformation.put("Hair Length", "Short");
        personInformation.put("Hair Style", "Crew Cut");
        personInformation.put("Eye Color", "Brown");
        personInformation.put("Complexion", "Medium");
        personInformation.put("Teeth", "Rotten");
        personInformation.put("Hand Preference", "Right");
        personInformation.put("Primary Language", "Korean");
        personInformation.put("Street Address", "1111 Main street");
        personInformation.put("City", "Seoul");
        personInformation.put("Zip", "999999");
        personInformation.put("Telephone", "1111111111");
        personInformation.put("E-Mail", "John@john.com");

        int size = personInformation.size();
        System.out.println("This is personHashMap size: " + size);

        // get from hashmap:

        String suspectType = personInformation.get("Suspect Type");
        System.out.println("Syspect type: " + suspectType);
    }
}
