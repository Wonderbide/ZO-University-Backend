package com.university.controllers;

import com.university.dao.CourseDAO;
import com.university.entities.Course;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/course")
public class CourseController {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public static List<Course> getAllCourse() {
        return CourseDAO.getListOfCourse();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public static Course read(@PathParam("id") int id) {
        return CourseDAO.getCourse(id);
    }

    @DELETE
    @Path("/{id}")
    public static void remove (@PathParam("id") int id){
        CourseDAO.removeCourse(id);
    }

    @POST
    public static void create (@QueryParam("title")String title,
                              @QueryParam("level")int level){
        CourseDAO.addCourse(new Course(title,level));
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public static void update (@QueryParam("title") String title,
                                   @QueryParam("level") int level,
                                   @QueryParam("id")int id){
        CourseDAO.updateCourse(id,new Course(title,level));

    }

}
