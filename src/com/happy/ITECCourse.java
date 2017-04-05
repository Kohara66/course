package com.happy;
import java.util.ArrayList;
/**
 * Created by Happy on 3/30/2017.
 */
public class ITECCourse {
    //Data for an ITECCourse object to store
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    public String getCourseName(){
        return this.name;
    }


    public void setCourseName(String newName) {
        this.name = newName;
    }


    //Constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents) {
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
    }


    public void writeCourseInfo() {
        System.out.println("Course Name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Students enrolled:");
        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is  " + this.maxStudents);
    }


    int getNumberOfStudents() {
        return this.students.size();
    }



    public void addStudent(String studentName) {
        //don't need to check if students ArrayList is null –
        //we know that the constructor set it up
        students.add(studentName);
    }


    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);


        }




    }}



