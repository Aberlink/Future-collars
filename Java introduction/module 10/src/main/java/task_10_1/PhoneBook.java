package task_10_1;

import java.util.Optional;

public class PhoneBook {

    private Optional<String> address;
    private Optional<String> FULLNAME;
    private String phoneNumber;

    public PhoneBook(Optional<String> address, Optional<String> fullName, String phoneNumber) {
        this.address = address;
        this.FULLNAME = fullName;
        this.phoneNumber = phoneNumber;
    }

    public Optional<String> getFULLNAME() {
        return FULLNAME;
    }
}
