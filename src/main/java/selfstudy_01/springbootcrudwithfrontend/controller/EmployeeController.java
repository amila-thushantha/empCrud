package selfstudy_01.springbootcrudwithfrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import selfstudy_01.springbootcrudwithfrontend.exception.ResourceNotFountException;
import selfstudy_01.springbootcrudwithfrontend.model.Employee;
import selfstudy_01.springbootcrudwithfrontend.repository.EmployeeRepository;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping()
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //build create employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    //build get employee by id
    @GetMapping("{id}")
    public Employee getEmployeeById(@PathVariable("id") long id) {
        Employee employee=employeeRepository.findById((int) id).orElseThrow(() -> new ResourceNotFountException("Employee not exist with id: "+id));
        return ResponseEntity.ok(employee).getBody();
    }

    //update employee
    @PutMapping("{id}")
    public Employee updateEmployee(@PathVariable("id") long id, @RequestBody Employee employeeDetails) {
        Employee employee=employeeRepository.findById((int) id).orElseThrow(() -> new ResourceNotFountException("Employee not exist with id: "+id));
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmailId(employeeDetails.getEmailId());
        Employee updatedEmployee=employeeRepository.save(employee);
        return updatedEmployee;
    }

    //delete employee
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") long id) {
        Employee employee = employeeRepository.findById((int) id)
                .orElseThrow(() -> new ResourceNotFountException("Employee not exist with id: " + id));
        employeeRepository.delete(employee);
        return ResponseEntity.noContent().build(); // Return 204 No Content
    }


}
