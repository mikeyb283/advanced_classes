public class Main {
  public static void main(String[] args) {

    //instantiating objects of the Employee class
    Employee employee536 = new Employee("Button Ben", PositionTitle.ADMINISTRATION, true, 27.00, 1);
    Employee employee720 = new Employee("Doe Jane", PositionTitle.MAINTENANCE, false, 21.00, 3);
    Employee employee987 = new Employee("Smith John", PositionTitle.PRODUCTION, false, 22.00, 2);

    //calling the print method for each employee
    employee536.print();
    employee536.calculate(45);
    employee720.print();
    employee720.calculate(50);
    employee987.print();
    employee987.calculate(35);
  }
}
