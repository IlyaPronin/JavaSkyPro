package pro.sky.JavaSkyPro.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.JavaSkyPro.Employee;
import pro.sky.JavaSkyPro.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam String employeeName, @RequestParam String employeeLastName) {
        return employeeService.add(employeeName, employeeLastName);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam String employeeName, @RequestParam String employeeLastName) {
        return employeeService.remove(employeeName, employeeLastName);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam String employeeName, @RequestParam String employeeLastName) {
        return employeeService.find(employeeName, employeeLastName);
    }

    @GetMapping("/")
    public List<Employee> list() {
        return employeeService.list();
    }
}
