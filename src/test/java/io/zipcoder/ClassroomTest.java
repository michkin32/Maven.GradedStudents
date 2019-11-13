package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ClassroomTest {
    @Test
    public void getStudents() {
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(100.0,150.0));
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(225.0,25.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);
        Student[] expected = classroom.students;
        Student[] actual = classroom.getStudents();

        Assert.assertEquals(expected,actual);

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
        Double expected = 125.0;
        Double actual = classroom.getAverageExamScore();

        Assert.assertEquals(expected,actual);

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
        Assert.assertNotEquals(preEnrollment,postEnrollment);
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
        Assert.assertEquals(preEnrollment,postEnrollment);

    }

    @Test
    public void getStudentByScore() {
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(100.0,150.0));
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(225.0,25.0));
        ArrayList<Double> s3Scores = new ArrayList<Double>(Arrays.asList(200.0,150.0));
        ArrayList<Double> s4Scores = new ArrayList<Double>(Arrays.asList(75.0,125.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("estudent", "two", s2Scores);
        Student s3 = new Student("student", "three", s3Scores);
        Student s4 = new Student("student", "four", s4Scores);

        Student[] students = {s1, s2, s3, s4};
        Classroom classroom = new Classroom(students);

        Student[] preEnrollment = classroom.getStudents();
        Student[] postEnrollment = classroom.getStudentByScore();


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
    public void getGradeBook() {
        ArrayList<Double> s2Scores = new ArrayList<Double>(Arrays.asList(100.0,99.0,70.0,99.0));
        ArrayList<Double> s1Scores = new ArrayList<Double>(Arrays.asList(85.0,85.0,85.0,75.0));
        ArrayList<Double> s3Scores = new ArrayList<Double>(Arrays.asList(100.0,70.0,45.0,60.0));
        ArrayList<Double> s4Scores = new ArrayList<Double>(Arrays.asList(25.0,20.0, 45.0, 60.0));

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("estudent", "two", s2Scores);
        Student s3 = new Student("student", "three", s3Scores);
        Student s4 = new Student("student", "four", s4Scores);

        Student[] students = {s1, s2, s3, s4};
        Classroom classroom = new Classroom(students);


        Map postEnrollment = classroom.getGradeBook();
        String expected = "[A=Student Name: estudent two\n" +
                "> Average Score: 92.0\n" +
                "> Exam Scores:\n" +
                "\tExam 1 -> 100.0\n" +
                "\tExam 2 -> 99.0\n" +
                "\tExam 3 -> 70.0\n" +
                "\tExam 4 -> 99.0\n" +
                ", B=Student Name: student one\n" +
                "> Average Score: 82.5\n" +
                "> Exam Scores:\n" +
                "\tExam 1 -> 85.0\n" +
                "\tExam 2 -> 85.0\n" +
                "\tExam 3 -> 85.0\n" +
                "\tExam 4 -> 75.0\n" +
                ", D=Student Name: student three\n" +
                "> Average Score: 68.75\n" +
                "> Exam Scores:\n" +
                "\tExam 1 -> 100.0\n" +
                "\tExam 2 -> 70.0\n" +
                "\tExam 3 -> 45.0\n" +
                "\tExam 4 -> 60.0\n" +
                ", F=Student Name: student four\n" +
                "> Average Score: 37.5\n" +
                "> Exam Scores:\n" +
                "\tExam 1 -> 25.0\n" +
                "\tExam 2 -> 20.0\n" +
                "\tExam 3 -> 45.0\n" +
                "\tExam 4 -> 60.0\n" +
                "]";

        // Then

        String actual = String.valueOf(postEnrollment.entrySet());



        System.out.println(actual);
        Assert.assertEquals(expected,actual);

    }
}

