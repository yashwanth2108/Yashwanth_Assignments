package com.Resourseannotation.Resourse;

public class Company {
	private String name;
    private String location;
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
 
    @Override
    public String toString() {
        return "Company [name=" + name + ", location=" + location + "]";
    }

}
