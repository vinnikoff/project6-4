/**
 * Created by VINNI on 08.12.16.
 */
public class User {
    long id;
    String firstName;
    String lastName;
    int salary;
    int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (getClass() != o.getClass())
            return false;

        User e = (User) o;

        return this.id == e.getId() && this.salary == e.getSalary() && this.balance == e.getBalance() &&
                this.firstName.equals(e.getFirstName()) &&
                this.lastName.equals(e.getLastName());

    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", balance=" + balance +
                '}';
    }
}
