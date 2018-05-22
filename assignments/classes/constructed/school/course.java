package school;
import java.util.*;
public class course{
    public String coursename;
    public String courseid;
    public String teachername;
    public String room;
    public course(String coursename, String courseid, String teachername, String room) {
        this.coursename = coursename;
        this.courseid = courseid;
        this.teachername = teachername;
        this.room = room;
    }

    public String coursetostring(){
        return "Course: "+coursename+"; ID:"+courseid+"; Teacher: "+ teachername+"; Room:"+room;
    }
}