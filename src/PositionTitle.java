public enum PositionTitle {

  ADMINISTRATION("Administration"), PRODUCTION("Production"), SALES("Sales"),
  MAINTENANCE("Maintenance"), TECHNICAL("Technical"), SECRETARIAL("Secretarial");


  private String employeeName;

  PositionTitle (String employeeName) {
    this.employeeName = employeeName;
  }

}
