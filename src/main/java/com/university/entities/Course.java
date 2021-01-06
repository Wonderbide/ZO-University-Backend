package com.university.entities;


public class Course {

    private String title;
    private int id;
    private int level;

    static int lastId;

    public Course() {
    }
    public Course(String title, int level) {
        this.title = title;
        this.id = (lastId+1);
        this.level = level;
        lastId = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}
