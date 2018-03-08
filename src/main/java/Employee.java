public abstract class Employee {
    private String name;
    private int NI;
    private double salary;
    public double bonus;
    //is this correct way to do it?

    public Employee(String name, int NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
        this.bonus = bonus;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNI() {
        return NI;
    }

    public void setNI(int NI) {
        this.NI = NI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double salary){
        this.salary = salary * 1.2;
    }

    public void payBonus(double bonus){
        this.bonus = salary * 0.01;
    }
}
