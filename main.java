public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Tayfun", (double)1500.0, 58, 2010);
        System.out.println(employee + "\nVergi = " + employee.tax()+ "\nBonus = " + employee.bonus() +
                "\nMaas Artisi = " + employee.raiseSalary() +
                "\nVergi Ve Bonuslar ile Birlikte Maas = " + (employee.salary + employee.bonus() - employee.tax()) +
                "\nToplam Maas = " + (employee.salary + employee.raiseSalary()+ employee.bonus() - employee.tax()));
    }
}
