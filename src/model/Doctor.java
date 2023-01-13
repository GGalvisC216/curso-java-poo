package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String specialty;

    public Doctor(String name, String email) {
        super(name, email);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialty: " + specialty + "\nAvailable: " + availableAppointments.toString();
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment (Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "\nDate: " + date + ", Time: " + time;
        }
    }
}
