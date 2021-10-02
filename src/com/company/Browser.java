package com.company;

public abstract class Browser {
    String description = "Unknown Browser";

    public String getDescription() {
        return description;
    }

    public abstract double size();
}
