public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
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
            return (this.salary * 0.15);
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return (this.salary * 0.10);
        } else if (2021 - this.hireYear < 10) {
            return (this.salary * 0.05);
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Adi= %s\nMaasi= %.1f\nCalisma Saati= %d\nBaslangic Yili= %d",
                this.name,this.salary,this.workHours,this.hireYear);
    }
}
