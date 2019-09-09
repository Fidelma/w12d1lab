package staff.management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String nationalInsuranceNumber, double salary, String deptNAme, double budget){

        super(name, nationalInsuranceNumber, salary, deptNAme);
        this.budget = budget;

    }

    public double getBudget(){
        return this.budget;
    }
}
