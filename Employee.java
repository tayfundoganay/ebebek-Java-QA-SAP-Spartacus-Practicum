public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        return this.salary<1000?0:(this.salary * 0.03);
    }
    public int bonus(){
        return this.workHours<40?0: (this.workHours-40)*30;
    }

    public double raiseSalary() {
        if (2021 - this.hireYear > 19) {
            return (this.salary + bonus() - tax()) * 1.15;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return (this.salary + bonus() - tax()) * 1.10;
        } else if (2021 - this.hireYear < 10) {
            return (this.salary + bonus() - tax()) * 1.05;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Name= %s\tSalary= %d\tworkHours= %d\thireYear= %d",
                this.name,this.salary,this.workHours,this.hireYear);
    }
}
