package ku.cs.models;

import ku.cs.services.StudentHardCodeDatasource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentListTest { ;
    StudentList studentList;
    @BeforeEach
    void init(){
        studentList = new StudentList();
        studentList.addNewStudent("67100001","A");
        studentList.addNewStudent("67100002","B");
        studentList.addNewStudent("67100003","C");
        studentList.addNewStudent("67100004","D");
    }
    @Test
    @DisplayName("ทดสอบ addNewStudent")
    void testAddNewStudent(){
        studentList.addNewStudent("6712345","KongKong");
        assertEquals(5,studentList.getSize());
    }
    @Test
    @DisplayName("ทดสอบ giveScoreToId")
    void testGiveScoreToId(){
        studentList.giveScoreToId("67100001",80);
        assertEquals("A",studentList.viewGradeOfId("67100001"));
    }

    @Test
    @DisplayName("ทดสอบ finStudentById")
    void testFindStudentById(){
        assertEquals("A",studentList.findStudentById("67100001").getName());
    }

    @Test
    @DisplayName("ทดสอบ filterByName")
    void testFilterByName(){
        studentList.addNewStudent("6712345","AA");
        assertEquals(2,studentList.filterByName("A").getSize());
    }

    @Test
    @DisplayName("ทดสอบ viewGradeOfId")
    void testViewGradeOfId(){
        studentList.findStudentById("67100001").addScore(80);
        assertEquals("A",studentList.viewGradeOfId("67100001"));
    }
}