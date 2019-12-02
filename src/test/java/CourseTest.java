import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

class CourseTest {
    private LocalDate start = LocalDate.of(2018,10,1);
    private LocalDate end = LocalDate.of(2019,4,15);
    private Course course = new Course("CS",start,end);

    @Test
    void testCourseNameGetSet()
    {
        String courseName = course.getcName();
        Assert.assertEquals("CS",courseName);

        course.setcName("CT");
        String newCourseName = course.getcName();
        Assert.assertEquals("CT",newCourseName);
    }

    @Test
    void testDateSetGet()
    {
        LocalDate checkStart = course.getStartDate();
        Assert.assertEquals(start,checkStart);

        LocalDate start1 = LocalDate.of(2018,9,30);
        LocalDate end1 = LocalDate.of(2019,4,20);

        course.setStartDate(start1);
        LocalDate newStart = course.getStartDate();
        Assert.assertEquals(start1,newStart);

        LocalDate checkEnd = course.getEndDate();
        Assert.assertEquals(end,checkEnd);

        course.setEndDate(end1);
        LocalDate newEnd = course.getEndDate();
        Assert.assertEquals(end1,newEnd);
    }

    @Test
    void testModulesSetGet()
    {
        ArrayList modules = course.getModules();
        Assert.assertEquals(new ArrayList<Module>(),modules);

        Module module = new Module("CS416",123456789);
        ArrayList<Module> modules1 = new ArrayList<Module>();
        modules1.add(module);
        course.addModules(module);

        Assert.assertEquals(modules1,course.getModules());

    }

    @Test
    void testStudent()
    {
        ArrayList students = course.getStudents();
        Assert.assertEquals(new ArrayList<Student>(),students);

        LocalDate DOB = LocalDate.of(1990,12,15);

        Student student = new Student("Joey Maloney",28,DOB,15104611);
        ArrayList<Student> students1 = new ArrayList<Student>();

        students1.add(student);
        course.addStudents(student);

        Assert.assertEquals(students1, course.getStudents());
    }
}