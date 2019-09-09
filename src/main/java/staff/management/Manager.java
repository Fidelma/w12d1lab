package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String debtName;

    public Manager(String name, String nationalInsuranceNumber, double  salary, String deptName) {

        super(name, nationalInsuranceNumber, salary);
        this.debtName = deptName;

    }

    public String getDepartment(){
        return this.debtName;
    }
}
