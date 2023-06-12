package pro.sky.JavaSkyPro;

import org.springframework.stereotype.Service;
import pro.sky.JavaSkyPro.Exeption.EmployeeAlreadyAddedException;
import pro.sky.JavaSkyPro.Exeption.EmployeeNotFoundException;
import pro.sky.JavaSkyPro.Exeption.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {
    //    Реализовать в сервисе три метода, которые принимают в качестве параметров firstName и lastName:
//
//            1. Добавить сотрудника.
//            2. Удалить сотрудника.
//            3. Найти сотрудника.

    private static final int SIZE = 5;
    private final List<Employee> employees = new ArrayList<>(SIZE);

    public Employee add(String employeeName, String employeeLastName) {
        Employee employee = new Employee(employeeName, employeeLastName);
        if (employees.size() < SIZE) {
            for (Employee empl : employees) {
                if (empl.equals(employee)) {
                    throw new EmployeeAlreadyAddedException();
                }
            }
            employees.add(employee);
            return employee;
        }
        throw new EmployeeStorageIsFullException();
    }


    public Employee find(String employeeName, String employeeLastName) {
        Employee employee = new Employee(employeeName, employeeLastName);
        for (Employee employee1 : employees) {
            if (employees.equals(employee1)) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException();
    }

    public Employee remove(String employeeName, String employeeLastName) {
        Employee employee = new Employee(employeeName, employeeLastName);
        if (employees.remove(employees)) {
            return employee;
        }

        throw new EmployeeNotFoundException();
    }

    public List<Employee> list() {
        return Collections.unmodifiableList(employees);
    }
}