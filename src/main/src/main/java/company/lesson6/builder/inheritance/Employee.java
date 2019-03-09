package company.lesson6.builder.inheritance;

public class Employee extends Person {
  String officeName;

  private Employee(EmployeeBuilder employeeBuilder) {
    super(employeeBuilder);
    this.officeName = employeeBuilder.officeName;
  }


  public static class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
    private String officeName;

    public Employee build(){
      return new Employee(this);
    }

    public EmployeeBuilder withOfficeName (String officeName){
      this.officeName = officeName;
      return self();
    }

    @Override
    protected EmployeeBuilder self() {
      return this;
    }
  }
}
