package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    @Test
    void testReadData(){
        StudentHardCodeDatasource datasource = new StudentHardCodeDatasource();
        StudentList l = new StudentList();
        l.addNewStudent("6710400001", "First");
        l.addNewStudent("6710400002", "Second");
        l.addNewStudent("6710400003", "Third");
        l.addNewStudent("6710400004", "Fourth");
        assertEquals(l.getStudents().size(),datasource.readData().getStudents().size());
    }
}