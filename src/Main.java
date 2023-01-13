import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor doctorAna = new Doctor("Ana Salgado", "ana@mail.com");
        doctorAna.setSpecialty("Pediatra");
        doctorAna.addAvailableAppointment(new Date(), "4pm");
        doctorAna.addAvailableAppointment(new Date(), "10am");
        doctorAna.addAvailableAppointment(new Date(), "1pm");

        System.out.println(doctorAna);
        /*
        for (model.Doctor.AvailableAppointment availableAppointment:
             doctorAna.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " +
                    availableAppointment.getTime());
        }
        */

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("123465789");
        patient.setPhoneNumber("12346578");
        System.out.println(patient.getPhoneNumber());

        System.out.println(patient);

    }
}