package com.csi.service;

import com.csi.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    Employee save(Employee employee);

    Optional<Employee> findById(int empId);

    List<Employee> findAll();

    Employee update(Employee employee);

    void deleteById(int empId);
}
