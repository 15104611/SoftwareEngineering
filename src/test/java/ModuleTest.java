import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

class ModuleTest {
    private Module module = new Module("CT417",108980);

    @Test
    void testModNameAndID() {
        String modName = module.getModName();
        Assert.assertEquals("CT417",modName);

        module.setModName("Software Engineering 3");
        String newModName = module.getModName();
        Assert.assertEquals("Software Engineering 3",newModName);

        int ID = module.getID();
        Assert.assertEquals(108980,ID);

        module.setID(417);
        int newID = module.getID();
        Assert.assertEquals(417,newID);
    }

    @Test
    void testStudent() {
        ArrayList students = module.getStudents();
        Assert.assertEquals(new ArrayList<Student>(),students);

        LocalDate DOB = LocalDate.of(1990,12,15);
        Student student = new Student("Joey Maloney",28,DOB,15104611);
        ArrayList<Student> students1 = new ArrayList<Student>();
        students1.add(student);
        module.addStudents(student);
        Assert.assertEquals(students1, module.getStudents());
    }
}