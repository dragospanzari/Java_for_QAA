public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("David" , "Wolfee", 2990.9);
        Employee employee2 = new Employee("John", "Geoffrey", 1750.0);

        System.out.println("Primul angajat este: " + employee1.getFirstName() + " " + employee1.getLastName() + ", iar salariul anual este de :" + String.format("%.2f",(12*employee1.getMonthlySalary())) + " USD");
        System.out.println("Al doilea angajat este: " + employee2.getFirstName() + " " + employee2.getLastName() + ", iar salariul anual este de :" + String.format("%.2f",(12*employee2.getMonthlySalary())) + " USD");

        System.out.println("Dupa marirea salariului cu 10%, angajatul " + employee1.getFirstName() + " " + employee1.getLastName() + " va avea un salariu anual de: " + String.format("%.2f",(12*(1.10*employee1.getMonthlySalary()))) + " USD");
        System.out.println("Dupa marirea salariului cu 10%, angajatul " + employee2.getFirstName() + " " + employee2.getLastName() + " va avea un salariu anual de: " + String.format("%.2f",(12*(1.10*employee2.getMonthlySalary())))+ " USD");
    }

}
