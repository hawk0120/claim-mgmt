package com.example.claimmgmt;

public class Claim {
    private int id; 
    private String description;
    private boolean resolved;

    public Claim(int id, String description){
        this.id = id;
        this.description = description;
        this.resolved = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription(){
        return description;
    }

    public boolean isResolved(){
        return resolved;
    }

    public void resolveClaim() {
        resolved = true;
    }
 }
