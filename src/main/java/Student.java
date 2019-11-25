import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private LocalDate DOB;
    private long ID;
    private String username;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Student(String name, int age, LocalDate DOB, long ID) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public LocalDate getDOB() {return DOB;}
    public String getUsername() {
        String n = getName();
        int i = getAge();
        username = "" + n + "" + i;
        return username;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setDOB(LocalDate DOB) {this.DOB = DOB; }
    public void setID(long ID) {this.ID = ID;}
    public void setUsername(String username) {
        this.username = username;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    public void addModules(Module module) {
        modules.add(module);
    }
    public void removeModules(Module module) {
        modules.remove(module);
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    public void addCourses(Course course) {
        courses.add(course);
    }
    public void removeCourses(Course course) {
        courses.remove(course);
    }
}
