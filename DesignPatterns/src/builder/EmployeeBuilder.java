package builder;

import com.company.exercise.Employee;

public  class EmployeeBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private String nameOfEmployer;
    private String phoneNumber;
    private String email;
    private int salary;


    public EmployeeBuilder wtihFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public EmployeeBuilder withAge(int age) {
        this.age = age;
        return this;
    }
    public EmployeeBuilder withNameOfEmployer(String NameOfEmployer) {
        this.nameOfEmployer = NameOfEmployer;
        return this;
    }
    public EmployeeBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public EmployeeBuilder withEmail(String email) {
        this.email = email;
        return this;
    }
    public EmployeeBuilder withFirstName(int salary) {
        this.salary = salary;
        return this;
    }
}

