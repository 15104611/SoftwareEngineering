import java.time.LocalDate;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private LocalDate DOB;
    private int ID;
    private String username;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Student(String name, int age, LocalDate DOB, int ID) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public LocalDate getDOB() {return DOB;}
    public int getID() {
        return ID;
    }
    public String getUsername() {
        if (username == null) {
            String n = getName();
            n = n.replaceAll("\\p{Blank}","");
            int i = getAge();
            username = "" + n + "" + i;
            return username;
        }
        return username;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setDOB(LocalDate DOB) {this.DOB = DOB; }
    public void setID(int ID) {this.ID = ID;}
    public void setUsername(String userName) {
        String temp = userName;
        temp = temp.replaceAll("\\p{Blank}","");
        this.username = temp;
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
