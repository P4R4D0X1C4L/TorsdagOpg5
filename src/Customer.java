import java.lang.String;

public class Customer {

    private String firstName = "";
    private String lastName = "";
    private String userName = "";
    private int id;
    private static int counter = 1;

    Customer(String firstName, String lastName, String userName) {
        setFirstName(firstName);
        setLastName(lastName);
        setUserName(userName);
        setId(counter);
        counter++;
    }

    @Override
    public String toString(){       // Prints all data for each attribute
        return "Username: " + getUserName() + ", First Name: " + getFirstName() + ", Last Name: " + getLastName() + ", ID: " + getId();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
