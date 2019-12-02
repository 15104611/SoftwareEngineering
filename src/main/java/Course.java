import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    private String cName;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();

    public Course(String cName, LocalDate startDate, LocalDate endDate) {
        this.cName = cName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getcName() {return cName;}
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public void setcName(String cName) {this.cName = cName;}
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void addStudents(Student student) {
        students.add(student);
    }
    public void removeStudents(Student student) {
        students.remove(student);
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
}
