public class Doctor {
    static int sequence = 1;
    int id;
    String name;
    String email;
    String specialty;

    Doctor(){
        System.out.println("Building Doctor object");
        id = sequence++;
    }

    Doctor(String name, String specialty) {
        this();
        System.out.println("The doctor's name is: " + name);
        this.name = name;
        this.specialty = specialty;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
