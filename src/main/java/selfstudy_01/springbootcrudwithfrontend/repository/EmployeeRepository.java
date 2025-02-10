package selfstudy_01.springbootcrudwithfrontend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import selfstudy_01.springbootcrudwithfrontend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
