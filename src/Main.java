import model.*;

import java.util.Date;

import static ui.UIMenu.setupData;
import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        setupData();
        showMenu();
        /*
        Doctor doctorAna = new Doctor("Ana Salgado", "ana@mail.com");
        doctorAna.setSpecialty("Pediatra");
        doctorAna.addAvailableAppointment(new Date(), "4pm");
        doctorAna.addAvailableAppointment(new Date(), "10am");
        doctorAna.addAvailableAppointment(new Date(), "1pm");

        System.out.println(doctorAna);

        User user = new Doctor("Andres", "andres@mail.com");
        user.showDataUser();

        User userPatient = new Patient("Jose", "jose@mail.com");
        userPatient.showDataUser();

        User userAnonymous = new User("Juana", "juana@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Usuario");
                System.out.println("Externo al hospital");
            }
        };

        userAnonymous.showDataUser();
        System.out.println(userAnonymous);


        ISchedulable iSchedulable = new AppointmentDoctor();
        iSchedulable.schedule();

        for (model.Doctor.AvailableAppointment availableAppointment:
             doctorAna.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " +
                    availableAppointment.getTime());
        }


        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("123465789");
        patient.setPhoneNumber("12346578");
        System.out.println(patient.getPhoneNumber());

        System.out.println(patient);
        */
    }
}