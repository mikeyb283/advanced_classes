public class Employee {


  //class definition
  private String  employeeName;
  private String  startDate;
  private PositionTitle  position;
  private boolean salariedEmployee;
  private double  payRate;
  private int     shiftWorked;

  //default constructor
  public Employee(String employeeName, PositionTitle position, boolean salariedEmployee, double payRate, int shiftWorked) {
    this.employeeName = employeeName;
    this.position = position;
    this.salariedEmployee = salariedEmployee;
    this.payRate = payRate;
    this.shiftWorked = shiftWorked;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public PositionTitle getPosition() {
    return position;
  }

  public void setPosition(PositionTitle position) {
    this.position = position;
  }

  public boolean isSalariedEmployee() {
    return salariedEmployee;
  }

  public void setSalariedEmployee(boolean salariedEmployee) {
    this.salariedEmployee = salariedEmployee;
  }

  public double getPayRate() {
    return payRate;
  }

  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }

  public int getShiftWorked() {
    return shiftWorked;
  }

  public void setShiftWorked(int shiftWorked) {
    this.shiftWorked = shiftWorked;
  }

  /*
Method: print

Use: To format and display the employee information

Return: void
 */
  public void print() {
    System.out.println("\nEmployee Name\t\tPosition\t\tSalary\t\tPay Rate\t\tShift");
    System.out.printf("%8s", getEmployeeName());
    System.out.printf("%20s", getPosition());
    System.out.printf("%13s", isSalariedEmployee());
    System.out.printf("%15s", (java.text.NumberFormat.getCurrencyInstance().format(getPayRate())));
    System.out.printf("%15s", "(" + getShiftWorked() + ")\n") ;
    System.out.printf("\n");

  }

  /*
Method: calculate

Use: To calculate payrates and determine overtime

Return: void
*/
  public  void calculate(double hours) {
    double differential = 0;
    switch (shiftWorked) {
      case 1:
        differential = 0;
        break;
      case 2:
        differential = payRate * .05;
        break;
      case 3:
        differential = payRate * .1;
        break;
    }
    double over_time = 0;
    if (isSalariedEmployee()) {
      hours = 40;
      over_time = 0;
    }
    if (hours > 40) {
      over_time = hours - 40;
      hours = (hours + (over_time * 1.5));
    }

    double pay = payRate + differential;
    double weekly_pay = (pay * hours);
    System.out.println("Earnings: " +(java.text.NumberFormat.getCurrencyInstance().format(weekly_pay)));
    System.out.println();
  }
}