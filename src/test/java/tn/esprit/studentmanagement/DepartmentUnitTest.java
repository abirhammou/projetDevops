package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tn.esprit.studentmanagement.entities.Department;

public class DepartmentUnitTest {

    @Test
    void testGettersSetters() {
        Department d = new Department();
        d.setName("Computer Science");
        d.setLocation("Building A");
        d.setPhone("12345");
        d.setHead("Dr. Smith");

        assertEquals("Computer Science", d.getName());
        assertEquals("Building A", d.getLocation());
        assertEquals("12345", d.getPhone());
        assertEquals("Dr. Smith", d.getHead());
    }
}
