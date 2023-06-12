package pro.sky.JavaSkyPro;

import java.util.Objects;

public class Employee {
    private final String employeeName;

    private final String employeeLastName;

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public Employee(String employeeName, String employeeLastName) {

        this.employeeName = employeeName;
        this.employeeLastName = employeeLastName;


    }


    @Override
    public String toString() {
        return employeeName + " " + employeeLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getEmployeeName(), employee.getEmployeeName()) && Objects.equals(getEmployeeLastName(), employee.getEmployeeLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeName(), getEmployeeLastName());
    }
}
