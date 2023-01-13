package model;

public class Nurse extends User{
    private String specialty;

    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado");
        System.out.println("Hospital: Cruz Verde");
        System.out.println("Departamentos: Nutricion, Pediatria");
    }
}
