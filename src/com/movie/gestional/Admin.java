package com.movie.gestional;

public class Admin implements User {
    private final int id;
    private final String name;
    private final String email;
    private final String adminCode; // Special Admin ID

    public Admin(int id, String name, String email, String adminCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.adminCode = adminCode;
    }

    @Override
    public int getId() { return id; }

    @Override
    public String getName() { return name; }

    @Override
    public String getEmail() { return email; }

    @Override
    public void displayInfo() {
        System.out.println("ADMIN [" + id + "]: " + name + " (Security Code: " + adminCode + ")");
    }

    // Only Admin can add Events
    public void addNewEvent(String eventName) {
        System.out.println("Admin " + name + " sta aggiungendo l'evento: " + eventName);
    }
}
