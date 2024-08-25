public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public void bookAppointment() {
        doctor.addPatient(patient);  // Add patient to the doctor's list
    }

    public String getDate() {
        return date;
    }
}
