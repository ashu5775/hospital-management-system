import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Aditya Singh", "Neurology");
        Doctor doctor2 = new Doctor("Dr. Ashutosh Singh", "Endocrinology");

        // Create and input details for the first patient
        System.out.println("Enter details for the first patient:");

        System.out.print("Patient Name: ");
        String patient1Name = scanner.nextLine();

        System.out.print("Patient Age: ");
        int patient1Age = Integer.parseInt(scanner.nextLine());

        System.out.print("Medical History: ");
        String patient1MedicalHistory = scanner.nextLine();

        Patient patient1 = new Patient(patient1Name, patient1Age, patient1MedicalHistory);

        // Input details for the first appointment
        System.out.print("Enter appointment date for " + patient1Name + " (YYYY-MM-DD): ");
        String appointment1Date = scanner.nextLine();

        // Create and input details for the second patient
        System.out.println("\nEnter details for the second patient:");

        System.out.print("Patient Name: ");
        String patient2Name = scanner.nextLine();

        System.out.print("Patient Age: ");
        int patient2Age = Integer.parseInt(scanner.nextLine());

        System.out.print("Medical History: ");
        String patient2MedicalHistory = scanner.nextLine();

        Patient patient2 = new Patient(patient2Name, patient2Age, patient2MedicalHistory);

        // Input details for the second appointment
        System.out.print("Enter appointment date for " + patient2Name + " (YYYY-MM-DD): ");
        String appointment2Date = scanner.nextLine();

        // Create appointments
        Appointment appointment1 = new Appointment(patient1, doctor1, appointment1Date);
        Appointment appointment2 = new Appointment(patient2, doctor2, appointment2Date);

        // Book the appointments
        appointment1.bookAppointment();
        appointment2.bookAppointment();

        // Print the appointment booking information
        System.out.println("\nAppointment booked with " + doctor1.getName() + " on " + appointment1.getDate());
        System.out.println("Appointment booked with " + doctor2.getName() + " on " + appointment2.getDate());

        // Print a newline to separate appointments from patient lists
        System.out.println();

        // Display patients under each doctor
        System.out.println("Patients under " + doctor1.getName() + ":");
        doctor1.viewPatients();

        System.out.println();

        System.out.println("Patients under " + doctor2.getName() + ":");
        doctor2.viewPatients();

        // Close the scanner
        scanner.close();
    }
}
