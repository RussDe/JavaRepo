package company.lesson6.builder.inheritance;

public class Main {
  public static void main(String[] args) {
    Person person = new Person.PersonBuilder()
            .withName("Alex")
            .withPosition("Developer")
            .build();
  }

  Employee employee = new Employee.EmployeeBuilder()
          .withName("Den")
          .withPosition("gg")
          .withOfficeName("Office")
          .build();
}
