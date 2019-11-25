import java.util.ArrayList;

public class Course {
    private String cName;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();

    public Course(String cName) {
        this.cName = cName;
    }

    public String getcName() {return cName;}

    public void setcName(String cName) {this.cName = cName;}
}
