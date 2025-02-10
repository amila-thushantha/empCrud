package selfstudy_01.springbootcrudwithfrontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import selfstudy_01.springbootcrudwithfrontend.model.Employee;
import selfstudy_01.springbootcrudwithfrontend.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootcrudwithfrontendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootcrudwithfrontendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

//		Employee employee = new Employee();
//		employee.setFirstName("Ramesh");
//		employee.setLastName("Fadatare");
//		employee.setEmailId("Hq4bO@example.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Amila");
//		employee1.setLastName("thushanthz");
//		employee1.setEmailId("Hq4bO@thusha.com");
//		employeeRepository.save(employee1);
	}
}
