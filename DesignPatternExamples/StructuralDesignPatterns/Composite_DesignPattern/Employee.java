package StructuralDesignPatterns.Composite_DesignPattern;
import java.util.ArrayList;
import java.util.List;


public class Employee {
    private String name,dept;
    private int salary;
    private List<Employee> employeeList;

    public Employee(String name,String dept,int salary)
    {
        employeeList=new ArrayList<>() ;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
    }

    public void AddEmployee(Employee newEmployee)
    {
        employeeList.add(newEmployee) ;
    }
    public void RemoveEmployee(Employee employee)
    {
        employeeList.remove(employee) ;
    }
    public List<Employee> getEmployeeList()
    {
        return employeeList ;
    }
    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }



}
