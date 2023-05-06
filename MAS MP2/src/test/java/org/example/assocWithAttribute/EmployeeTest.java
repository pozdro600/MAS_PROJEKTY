package org.example.assocWithAttribute;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;

    @BeforeEach
    void setUp() {
        employee = new Employee("Jan Kowalski");
    }

    @Test
    void testEmployeeCreation() {
        assertNotNull(employee);
        assertEquals("Jan Kowalski", employee.getName());
        assertTrue(employee.getEmploymentHistories().isEmpty());
    }

    @Test
    void testAddEmploymentHistory() {
        Company company = new Company("ABC");
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2022, 1, 1);
        EmploymentHistory employmentHistory = new EmploymentHistory(employee, company, startDate, endDate);

        employee.addEmploymentHistory(employmentHistory);
        assertFalse(employee.getEmploymentHistories().isEmpty());
        assertEquals(1, employee.getEmploymentHistories().size());
        assertTrue(employee.getEmploymentHistories().contains(employmentHistory));
    }

    @Test
    void testRemoveEmploymentHistory() {
        Company company = new Company("ABC");
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2022, 1, 1);
        EmploymentHistory employmentHistory = new EmploymentHistory(employee, company, startDate, endDate);

        employee.addEmploymentHistory(employmentHistory);
        employee.removeEmploymentHistory(employmentHistory);
        assertTrue(employee.getEmploymentHistories().isEmpty());
    }
}
