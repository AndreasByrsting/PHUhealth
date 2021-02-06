package AndreasG;

public class User {
    private String id;
    private String pass;
    private String address;
    private String temperature;

    public User() {
    }

    public User(String id, String pass, String address, String temperature) {
        this.id = id;
        this.pass = pass;
        this.address = address;
        this.temperature = temperature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pass='" + pass + '\'' +
                ", address='" + address + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }
}
