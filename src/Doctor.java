public class Doctor {
    int id;
    String name;
    String specialty;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name) {
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.name = name;
    }

    public void showName() {
        System.out.println(name);
    }
}
