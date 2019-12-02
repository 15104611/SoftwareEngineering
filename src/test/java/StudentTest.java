import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

class StudentTest {
    private LocalDate DOB = LocalDate.of(1990, 12, 15);
    private Student student = new Student("Joey Maloney", 28, DOB, 15104611);

    @Test
    void testNameAgeDOBID() {
        String name = student.getName();
        Assert.assertEquals("Joey Maloney", name);

        student.setName("Moey Jaloney");
        String newName = student.getName();
        Assert.assertEquals("Moey Jaloney", newName);

        int age = student.getAge();
        Assert.assertEquals(28, age);

        student.setAge(29);
        int newAge = student.getAge();
        Assert.assertEquals(29, newAge);

        LocalDate DOB1 = student.getDOB();
        Assert.assertEquals(DOB, DOB1);

        LocalDate newDOB = LocalDate.of(1991, 10, 15);
        student.setDOB(newDOB);
        LocalDate testDOB = student.getDOB();
        Assert.assertEquals(newDOB, testDOB);

        int ID = student.getID();
        Assert.assertEquals(15104611, ID);

        student.setID(12345678);
        int newID = student.getID();
        Assert.assertEquals(12345678, newID);
    }

    @Test
    void testUserName() {
        String userName = student.getUsername();
        Assert.assertEquals("JoeyMaloney28", userName);

        student.setUsername("Moey Jaloney29");
        String newUserName = student.getUsername();
        Assert.assertEquals("MoeyJaloney29", newUserName);
    }

    @Test
    void testModulesCourses() {
        ArrayList modules = student.getModules();
        Assert.assertEquals(new ArrayList<Module>(),modules);

        Module module = new Module("CT417",108980);
        ArrayList<Module> newModules = new ArrayList<Module>();
        newModules.add(module);
        student.addModules(module);

        Assert.assertEquals(newModules,student.getModules());

        ArrayList courses = student.getCourses();
        Assert.assertEquals(new ArrayList<Course>(), courses);

        LocalDate start = LocalDate.of(2019, 10, 1);
        LocalDate end = LocalDate.of(2020, 5, 15);

        Course course = new Course("4BP", start, end);
        ArrayList<Course> newCourses = new ArrayList<Course>();
        newCourses.add(course);
        student.addCourses(course);
        Assert.assertEquals(newCourses, student.getCourses());
    }
}
