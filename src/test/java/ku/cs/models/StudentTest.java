package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s;
    /*@BeforeAll
    static void initial() {
        s = new Student("6700000000", "Test");
    }*/
    @BeforeEach
    void setUp() {
        s = new Student("6700000000", "Test");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 45.12")
    void testAddScore(){
        s.addScore(45.12);
        assertEquals(45.12, s.getScore());
    }

    @Test
    void testCaculateScore(){
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    void testdConstructer2(){
        Student a = new Student("6700000000", "Test");
        assertEquals("6700000000",a.getId() );
        assertEquals("Test",a.getName());
        assertEquals(0, a.getScore());
    }

    @Test
    void testdConstructer3(){
        Student a = new Student("6700000000", "Test",50);
        assertEquals("6700000000",a.getId() );
        assertEquals("Test",a.getName());
        assertEquals(50, a.getScore());
    }

    @Test
    void testChangeName(){
        s.changeName("New");
        assertEquals("New", s.getName());
    }

    @Test
    void testIsId(){
        assertEquals(true,s.isId("6700000000"));
    }

    @Test
    void testIsNameContains(){
        assertEquals(true,s.isNameContains("Test"));
    }

}