package com.movie.gestional;

public class Customer implements User{

    private final int id;
    private final String name;
    private final String email;
    
    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public int getId() { return id; }

    @Override
    public String getName() { return name; }

    @Override
    public String getEmail() { return email; }

    @Override
    public void displayInfo() {
        System.out.println("Customer [" + id + "]: " + name + " - Email: " + email);
    }

}
