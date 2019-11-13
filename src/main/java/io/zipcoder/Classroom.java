package io.zipcoder;

import java.util.*;

public class Classroom {

    Student[] students;
    int maxNumberOfStudents;

    public Classroom(int maxNumOfStudents) {
        maxNumberOfStudents = maxNumOfStudents;

    }

    public Classroom(Student[] allStudents) {

        this.students = allStudents;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double average = 0.0;
        for (int i = 0; i < students.length; i++) {
            average += students[i].getAverageExamScore();
        }
        return average / students.length;
    }

    public void addStudent(Student student) {
        students = new Student[maxNumberOfStudents];
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }

    }

    public void removeStudent(String firstName, String lastName) {

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i; j++) {
                if (students[i].firstName.equals(firstName) && students[i].lastNAme.equals(lastName)) {
                    students[i] = null;
                }
            }

        }

    }

    public Student[] getStudentByScore() {
        Arrays.sort(students, Collections.reverseOrder());
        return students;
    }

    public Map getGradeBook() {
        Map<String, Student> gradeBook = new TreeMap();


        for (Student e : students) {
            if (e.getAverageExamScore() / 100 > .90) {
                gradeBook.put("A", e);
            } else if (e.getAverageExamScore() / 100 > .80) {
                gradeBook.put("B", e);
            } else if (e.getAverageExamScore() / 100 > .70) {
                gradeBook.put("C", e);
            } else if (e.getAverageExamScore() / 100 > .60) {
                gradeBook.put("D", e);
            } else {
                gradeBook.put("F", e);
            }

        }
        return gradeBook;

    }
}




