package ui;

import model.Doctor;

import java.rmi.server.UID;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome " + UIMenu.patientLogged.getName());
            System.out.println("1. Book and appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showBookAppointMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);
    }

    private static void showBookAppointMenu() {
        int response = 0;
        do {
            System.out.println(":: Book an appointment");
            System.out.println(":: Select date");
            // Numeracion de la lista de fechas
                // Indice de la fecha seleccionada
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int num = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                List<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    num++;
                    System.out.println(num + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(j, UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(num, doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelect = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");

            for(Map.Entry<Integer, Doctor> doc: doctorAvailableSelect.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName()
                    + ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate()
                    + ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1) {
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime()
                );
                System.out.println("Appointment booked");
                System.out.println();
                break;
            }

        } while (response != 0);
    }

    private static void showPatientMyAppointments() {
        System.out.println("::My Appointments");
        if(UIMenu.patientLogged.getAppointmentDoctors().size() == 0) {
            System.out.println("Don't have appointments");
            return;
        }

        for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
            int j = i + 1;
            System.out.println(j + ". "
                + "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate()
                + " Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime()
                + "\nDoctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName()
            );

        }
    }
}
