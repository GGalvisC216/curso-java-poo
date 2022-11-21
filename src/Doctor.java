public class Doctor {
    static int sequence = 0;
    int id;
    String name;
    String specialty;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
        id = sequence++;
    }

    Doctor(String name) {
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.name = name;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
