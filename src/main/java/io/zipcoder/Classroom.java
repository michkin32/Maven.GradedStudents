package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        students = new Student[MaxNumberOfStudents];
            for(int i = 0; i < students.length; i++){
                for(int j = 0; j < students.length - i; j++ ){
                    if (students[i].equals(students[i].getFirstName()) && students[i].equals(students[i].getLastNAme())){
                        students[i] = null;
                    }
                }
                }

            }
            public Student[] getStudentByScore(){
                Arrays.sort(students, Collections.reverseOrder());
                        return students;
                }



        }




