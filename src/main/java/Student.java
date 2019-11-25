import java.time.LocalDate;

public class Student {
    private String name;
    private int age;
    private LocalDate DOB;
    private long ID;
    private String username;
    private String modules;
    private String courses;

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

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
    public void setID(long ID) {
        this.ID = ID;
    }
}
