public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Tayfun Doganay", 1200, 47, 2012);
        System.out.println(employee + "\n Tax = " + employee.tax()+ "\t Bonus= " + employee.bonus() +
                "\n raiseSalary = " + employee.raiseSalary());

    }
}
