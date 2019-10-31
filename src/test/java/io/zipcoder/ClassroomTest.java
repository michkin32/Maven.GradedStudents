package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getStudents() {
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(100.0,150.0));
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(225.0,25.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);


    }

    @Test
    public void getAverageExamScore() {

        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(100.0,150.0));
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(225.0,25.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);
        // When
        Double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);

    }

    @Test
    public void addStudent() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(100.0,150.0, 250.0,0.0));
        Student s2 = new Student("student", "two", s2Scores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(s2);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
        System.out.println();
    }

    @Test
    public void removeStudent() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(100.0,150.0, 250.0,0.0));
        Student s2 = new Student("student", "two", s2Scores);

        // When
        classroom.addStudent(s2);
        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        classroom.removeStudent("student", "two");
        Student[] postEnrollment = classroom.getStudents();

        // Then

        String postEnrollmentAsString = Arrays.toString(postEnrollment);


        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
        System.out.println();
    }

    @Test
    public void getStudentByScore() {
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(100.0,150.0));
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(225.0,25.0));
        ArrayList<Double> s3Scores = new ArrayList<Double>(Arrays.asList(90.0,150.0));
        ArrayList<Double> s4Scores = new ArrayList<Double>(Arrays.asList(75.0,125.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("student", "one", s3Scores);
        Student s4 = new Student("student", "two", s4Scores);

        Student[] students = {s1, s2, s3, s4};
        Classroom classroom = new Classroom(students);

        Student[] preEnrollment = classroom.getStudents();
        classroom.getStudentByScore();
        Student[] postEnrollment = classroom.getStudents();

    // Then
    String preEnrollmentAsString = Arrays.toString(preEnrollment);
    String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
        System.out.println();
    }
}

