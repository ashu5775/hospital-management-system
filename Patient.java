public class Patient {
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }

    @Override
    public String toString() {
        return "Patient Name: " + name + "\n" +
               "Medical History: " + medicalHistory;
    }
}
