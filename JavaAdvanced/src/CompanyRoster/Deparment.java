package CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Deparment {
    private String name;
    private List<Employee> employeeList;

    public Deparment(String name){
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


    public void addEmloyee(Employee employee){
        employeeList.add(employee);
    }

    public double calculateAverSalary(){
        return this.employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }

    public List<Employee> getList() {
        return employeeList;
    }

    public void setList(List<Employee> list) {
        this.employeeList = list;
    }


}
