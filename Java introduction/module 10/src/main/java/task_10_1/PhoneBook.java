package task_10_1;

public class PhoneBook {

    private String address;
    private String FULLNAME;
    private String phoneNumber;

    public PhoneBook(String address, String fullName, String phoneNumber) {
        this.address = address;
        this.FULLNAME = fullName;
        this.phoneNumber = phoneNumber;
    }

    public String getFULLNAME() {
        return FULLNAME;
    }
}
