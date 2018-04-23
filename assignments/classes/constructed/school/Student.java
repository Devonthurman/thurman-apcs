package school;

import java.util.*;

public class Student {
    public String firstName;
    public String lastName;
    public int id;

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getfullname(){
       String fullname= firstName+" "+lastName;
       return fullname;
    }
    public String tostring(){
        String studentinfo="Name: "+firstName+" "+lastName+"; ID:"+id;
        return studentinfo;
    }
}