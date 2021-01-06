package com.university.dao;

import com.university.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseDAO {

    public static List<Course> listOfCourse = new ArrayList<>();

    static {
        listOfCourse.add(new Course("Analyze", 1));
        listOfCourse.add(new Course("Analyze", 2));
        listOfCourse.add(new Course("Mathematics", 1));
        listOfCourse.add(new Course("Mathematics", 2));
        listOfCourse.add(new Course("Java", 1));
    }

    public static Course getCourse(int id){

        for (Course c:listOfCourse) {
            if (c.getId() == id){
                return c;
            }
        }

        return null;
    }

    public static List<Course> getListOfCourse() {
        return listOfCourse;
    }

    public static void addCourse(Course course){
        listOfCourse.add(course);
    }

    public static void removeCourse(int id){

        for (int i = 0; i < listOfCourse.size(); i++){

            if (listOfCourse.get(i).getId() == id)
                listOfCourse.remove(i);

        }
    }

    public static void updateCourse(int id, Course course){
        for (int i = 0; i < listOfCourse.size(); i++){

            if (listOfCourse.get(i).getId() == id) {
                listOfCourse.remove(i);
                listOfCourse.add(course);
            }
        }
    }
}
