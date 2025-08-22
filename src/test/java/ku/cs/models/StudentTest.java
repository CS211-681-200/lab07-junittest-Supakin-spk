package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
    @BeforeAll
    static void init(){
        s = new Student("6710451445","Thanagon");
    }
    @Test
    @DisplayName("เพืมคะแนนนิสิต 49 และ 2 คะแนน")
    void testAddScore(){
        s.addScore(60);
        assertEquals(60,s.getScore());
    }
    @Test
    @DisplayName("ทดสอบเพื่มคะแนน 60 คะแนน และ อ๊อปเจต ตำนวนเกรดออกมา")
    void testCalculateGrade(){
        assertEquals("C",s.grade());
    }

    @Test
    @DisplayName("ทดสอบ Setter changeName")
    void testChangeName(){
        Student s1 = new Student("6710451445","Supakin");
        s1.changeName("Thammagon");
        assertEquals("Thammagon",s1.getName());
    }

    @Test
    @DisplayName("ทดสอบ isId")
    void testIsId(){
        assertEquals(true,s.isId("6710451445"));
    }

    @Test
    @DisplayName("ทดสอบ isNameContain")
    void testIsNameContains(){
        assertEquals(true,s.isNameContains("gon"));
    }
}