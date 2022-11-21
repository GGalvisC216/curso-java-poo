import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor doctorAlejandro = new Doctor();
        doctorAlejandro.name = "Alejandro Rodríguez";
        doctorAlejandro.showName();
        doctorAlejandro.showId();
        System.out.println(Doctor.sequence);

        Doctor doctorAna = new Doctor();
        doctorAna.name = "Ana Rodríguez";
        doctorAna.showName();
        doctorAna.showId();
        System.out.println(Doctor.sequence);

        showMenu();
    }
}