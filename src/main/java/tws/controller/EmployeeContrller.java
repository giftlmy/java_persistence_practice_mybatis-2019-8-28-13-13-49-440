package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tws.entity.Employee;
import tws.repository.EmployeeMapper;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeContrller {
    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping
    public ResponseEntity<List<Employee>> queryAll(){
        List<Employee> employees = employeeMapper.queryAll();
        return ResponseEntity.ok(employees);
    }

}
