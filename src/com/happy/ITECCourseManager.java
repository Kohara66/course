package com.happy;

public class ITECCourseManager {

    public static void main(String[] args) {

        ITECCourse maintenanceCourse =
                new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);


        //Add some students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");


        maintenanceCourse.removeStudent("Carl");


        maintenanceCourse.writeCourseInfo();
        //tuyty
        ITECCourse datacomCourse =
                new ITECCourse("Data Communications", 1425, 30);




        //Add some students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        datacomCourse.addStudent("Happy");


        datacomCourse.writeCourseInfo();


        ITECCourse JavacomCourse =
                new ITECCourse("Java Programming", 2545, 24);


        //enrolling students in Java class


        JavacomCourse.addStudent("Gus");
        JavacomCourse.addStudent("Harry");
        JavacomCourse.addStudent("Izzy");


        JavacomCourse.writeCourseInfo();


        ////Test the add students method with a sample class
        //This class has a max of 3 students
        ITECCourse smallCourse = new ITECCourse("Small Course", 1111, 3);
        smallCourse.addStudent("Jake");
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        //We can't add this student – what happens?
        smallCourse.addStudent("Marigold");
        //Try to fetch smallCourse's name


        String smallCourseName = smallCourse.getCourseName();  //no error


        System.out.println(smallCourseName);
        //Can also use the setCourseName method to change
        //this ITECCourse's name


        smallCourse.setCourseName("Very Small Course");




        smallCourse.writeCourseInfo();








    }


}







