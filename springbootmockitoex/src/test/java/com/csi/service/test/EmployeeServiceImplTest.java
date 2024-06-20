package com.csi.service.test;

import com.csi.entity.Employee;
import com.csi.repository.EmployeeRepository;
import com.csi.service.IEmployeeService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeServiceImplTest {

    @Autowired
    private IEmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

    @Test
    public void findAllTest() {

        Mockito.when(employeeRepository.findAll()).thenReturn(Stream.of(new Employee(121, "SWARA", "PUNE", 78000.22, 87878788787L, new Date(), "Swara@CS.COM", "SWARA"),
                new Employee(122, "RAM", "PUNE", 78000.22, 87878788787L, new Date(), "Swara@CS.COM", "SWARA"),
                new Employee(191, "LAKSHMI", "PUNE", 78000.22, 87878788787L, new Date(), "Swara@CS.COM", "SWARA")).toList());

        Assertions.assertEquals(3, employeeService.findAll().size());
    }

    @Test
    public void saveTest() {

        Employee employee = new Employee(122, "RAM", "PUNE", 78000.22, 87878788787L, new Date(), "Swara@CS.COM", "SWARA");

        employeeService.save(employee);

        Mockito.verify(employeeRepository, Mockito.times(1)).save(employee);
    }

    @Test
    public void updateTest() {
        Employee employee = new Employee(122, "RAM", "PUNE", 78000.22, 87878788787L, new Date(), "Swara@CS.COM", "SWARA");

        employeeService.update(employee);

        Mockito.verify(employeeRepository, Mockito.times(1)).save(employee);
    }

    @Test
    public void deleteByIdTest() {
        Employee employee = new Employee(122, "RAM", "PUNE", 78000.22, 87878788787L, new Date(), "Swara@CS.COM", "SWARA");

        employeeService.deleteById(employee.getEmpId());

        Mockito.verify(employeeRepository, Mockito.times(1)).deleteById(employee.getEmpId());
    }


}
