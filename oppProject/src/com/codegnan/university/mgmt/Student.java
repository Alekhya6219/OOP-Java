package com.codegnan.university.mgmt;

import java.util.ArrayList;
import java.util.List;

//Represents a student in the university
public class Student {
 private String name; // Name of the student
 private List<course> enrolledcourses; // List to hold courses the student is enrolled in

 // Constructor to initialize the student with a name and an empty list of enrolled courses
 public Student(String name) {
     this.name = name; // Set the student's name
     this.enrolledcourses = new ArrayList<>(); // Initialize the list of enrolled courses
 }

 // Getter method to retrieve the student's name
 public String getName() {
     return name; // Return the student's name
 }

 // Method to enroll the student in a course
 public void enrollInCourse(course course) {
     // Check if the course is not already in the list of enrolled courses
     if (!enrolledcourses.contains(course)) {
         enrolledcourses.add(course); // Add the course to the list
     }
 }

 // Getter method to retrieve the list of courses the student is enrolled in
 public List<course> getEnrolledCourses() {
     return enrolledcourses; // Return the list of enrolled courses
 }

 // Override toString method to provide a string representation of the student
 @Override
 public String toString() {
     return name; // Return the student's name as the string representation
 }
}


