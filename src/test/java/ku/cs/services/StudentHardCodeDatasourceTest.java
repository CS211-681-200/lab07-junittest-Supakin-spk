package ku.cs.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    StudentHardCodeDatasource data;
    Object list;
    @BeforeEach
    void init(){
         data = new StudentHardCodeDatasource();
         Object  list = data.readData();
    }
    @Test
    @DisplayName("ตรวจสอบว่า ค่าจาก Data มีจริงไหม")
    void testObjectNullOrNot() {
        assertEquals(null,list);
    }


}