import java.util.ArrayList;

public class Module {
    private String modName;
    private int ID;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Module(String modName, int ID) {
        this.modName = modName;
        this.ID = ID;
    }

    public String getModName() {return modName;}
    public int getID() {return ID;}
    public ArrayList<Student> getStudents() {
        return students;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setModName(String modName) {this.modName = modName;}
    public void setID(int ID) {this.ID = ID;}

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void addStudents(Student student) {students.add(student);}
    public void removeStudents(Student student) {students.remove(student);}

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    public void addCourses(Course course) {courses.add(course);}
    public void removeCourses(Course course) {courses.remove(course);}
}
