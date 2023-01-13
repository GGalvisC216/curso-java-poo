package model;

public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient (String name, String email) {
        super(name,email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight + " Kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " m";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historia clinica");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + ", Weight: " + getWeight()
                + ", Height: " + getHeight() + ", Blood: " + blood;
    }
}
