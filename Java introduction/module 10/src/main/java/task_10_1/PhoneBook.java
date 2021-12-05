package task_10_1;



public class PhoneBook {

    private String address;
    private final String FULLNAME;
    private String phoneNumber;


    public PhoneBook(String address, String fullName) {
        this.address = address;
        this.FULLNAME = fullName;
    }

    public PhoneBook(String address, String fullName, String phoneNumber) {
        this.address = address;
        this.FULLNAME = fullName;
        this.phoneNumber = phoneNumber;
    }


}
