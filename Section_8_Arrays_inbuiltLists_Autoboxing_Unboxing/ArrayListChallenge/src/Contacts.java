public class Contacts {

    private int phoneNumber;
    private String name;

    public Contacts(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
