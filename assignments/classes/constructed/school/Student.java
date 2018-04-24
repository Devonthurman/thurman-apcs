package school;
import java.util.*;

public class Student {
    public String firstName;
    public String lastName;
    public int id;
    public ArrayList<course> courses;

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.courses= new ArrayList<course>();
    }

    public String getfullname(){
       String fullname= firstName+" "+lastName;
       return fullname;
    }
    public String tostring(){
        String studentinfo="Name: "+firstName+" "+lastName+"; ID:"+id;
        return studentinfo;
    }
    public void addcourses(course c){
        courses.add(c);
    }
}