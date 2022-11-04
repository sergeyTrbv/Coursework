package CurseWork;

import java.util.Objects;

public class Employee {
    private final String fullName;
    private int salary;
    private String departament;
    private static int counter;
    private int id;

    public Employee(String fullName, int salary, String departament) {
        this.fullName = fullName;
        this.salary = salary;
        this.departament = departament;
        id = counter++;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartament() {
        return this.departament;
    }

    public String toString() {
        return "Ф.И.О: " + getFullName() + ". Зарплата: " + getSalary() + " ₽" + ". Отдел: " + departament + ". ID сотрудника: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, id, salary);
    }
}
