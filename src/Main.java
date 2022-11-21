import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor doctorAna = new Doctor("Ana Salgado", "Pediatrics");
        System.out.println(doctorAna.id);
        System.out.println(doctorAna.name);
        System.out.println(doctorAna.specialty);
    }
}