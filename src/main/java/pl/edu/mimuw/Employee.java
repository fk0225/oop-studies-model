package pl.edu.mimuw;

public class Employee extends Person{
  protected String EmployeeID;
  //an abstract isActive??
  protected boolean currentlyEmployed;
  public Employee()
  {
    super();
    this.currentlyEmployed=true;
  }
  public Employee(String name, String pesel,String EmployeeID)
  {
    super(name,pesel);
    this.currentlyEmployed=true;
    this.EmployeeID=EmployeeID;
  }
  public void quit()
  {
    this.currentlyEmployed=false;
  }

  public boolean isCurrentlyEmployed()
  {
    return currentlyEmployed;
  }

  @Override
  public String toString() {
    var sb=new StringBuilder();

    return "Employee{" +
      "EmployeeID='" + EmployeeID + '\'' +
      ", currentlyEmployed=" + currentlyEmployed +
      '}';
  }
}
