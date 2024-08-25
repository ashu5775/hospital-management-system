import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients assigned.");
        } else {
            for (Patient patient : patients) {
                System.out.println("Patient Name: " + patient.getName());
                System.out.println("Medical History: " + patient.getMedicalHistory());
                System.out.println("Age: " + patient.getAge());
                System.out.println();
            }
        }
    }
}
