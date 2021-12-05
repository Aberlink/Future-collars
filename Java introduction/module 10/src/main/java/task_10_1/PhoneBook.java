package task_10_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

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
