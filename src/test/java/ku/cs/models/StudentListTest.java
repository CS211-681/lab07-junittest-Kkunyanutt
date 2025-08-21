package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    StudentList sList;
    @BeforeEach
    void setUp() {
        sList = new StudentList();
        sList.addNewStudent("6700000001", "Test1");
        sList.addNewStudent("6700000002", "Test2",50);
        sList.addNewStudent("6700000003", "Test2",60);
    }

    @Test
    void testAddStudent() {
        assertEquals(3, sList.getStudents().size());
    }

    @Test
    void testFindStudentById(){
        assertEquals("Test1",sList.findStudentById("6700000001").getName());
    }

    @Test
    void testFilterByName(){
        StudentList filter = sList.filterByName("Test2");
        assertEquals(2,filter.getStudents().size());
    }

    @Test
    void testGiveScoreToId(){
        sList.giveScoreToId("6700000001",70);
        assertEquals(70,sList.findStudentById("6700000001").getScore());
    }

    @Test
    void testViewGradeOfId(){
        assertEquals("C",sList.findStudentById("6700000003").grade());
    }
}