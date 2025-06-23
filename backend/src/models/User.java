package models;

public class User {
    private int userId;
    private String name;
    private String email;

    // No-argument constructor
    public User() {
        // Initialize fields with default values if necessary
        this.userId = 0;
        this.name = "";
        this.email = "";
    }

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}