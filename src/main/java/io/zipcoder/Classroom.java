package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    Student[] students;
    int MaxNumberOfStudents;

    public Classroom(int MaxNumOfStudents){
        MaxNumberOfStudents = MaxNumOfStudents;

    }
    public Classroom(Student[] allStudents){

        this.students = allStudents;
    }
    public Classroom(){
        this.students = new Student[30];
    }
    public Student[] getStudents() {
        return students;
    }
    public Double getAverageExamScore(){
        Double average = 0.0;
        for (int i =0; i < students.length; i++){
            average += students[i].getAverageExamScore();
        }
            return average/students.length;
        }
        public void addStudent(Student student){
        students = new Student[MaxNumberOfStudents];
        for (int i = 0; i < students.length; i ++){
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }

        }
        public void removeStudent(){
            for(int i = 0; i ){}
        }


    }

