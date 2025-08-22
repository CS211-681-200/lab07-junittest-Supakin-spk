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
        studentList.addNewStudent("67100001","A");
        studentList.addNewStudent("67100002","B");
        studentList.addNewStudent("67100003","C");
        studentList.addNewStudent("67100004","D");
    }
    @Test
    @DisplayName("Test addNewStudent")
    void testAddNewStudent(){
        studentList.addNewStudent("6712345","KongKong");
        assertEquals("6712345",studentList.findStudentById("6712345").getId();
    }
    @Test
    @DisplayName("Test giveScoreToId")
    void testGiveScoreToId(){
        studentList.giveScoreToId("67100001",80);
        assertEquals("A",studentList.viewGradeOfId("67100001"));
    }
}