import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor doctorAna = new Doctor("Ana Salgado", "Pediatrics");
        System.out.println(doctorAna.id);
        System.out.println(doctorAna.name);
        System.out.println(doctorAna.specialty);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("123465789");
        patient.setPhoneNumber("12346578");
        System.out.println(patient.getPhoneNumber());

    }
}