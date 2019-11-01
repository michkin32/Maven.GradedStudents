package io.zipcoder;

import java.util.ArrayList;

public class Student implements Comparable<Student>{


    String firstName;
    String lastNAme;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastNname, ArrayList<Double> testScores){
        this.firstName = firstName;
        this.lastNAme = lastNname;
        this.examScores = testScores;

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }
    public Integer getNumberOfExamsTaken(){
        return examScores.size();

    }
    public String getExamScores(){
        String scores = "> Exam Scores:\n";
        Integer count = 1;
        for (int i = 0; i<= examScores.size() -1; i++){
            scores += "\tExam " + count + " -> " + examScores.get(i) + "\n";
            count++;
        }
        return scores;
    }

    public void addExamScore(Double score) {
        examScores.add(score);

    }
    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
    }

    public Double getAverageExamScore(){
        Double sum = 0.0;
        for (int i = 0; i <= examScores.size() -1; i++){
            sum += examScores.get(i);
        }
        return sum/examScores.size();
    }
    @Override
    public String toString(){
        return "Student Name: " + getFirstName() + " " + getLastNAme() + "\n" + "> Average Score: " +
                getAverageExamScore() + "\n" + getExamScores();
    }

    @Override
    public int compareTo(Student compStu) {
        if(this.getAverageExamScore().equals(compStu.getAverageExamScore())){
            return (this.firstName).compareTo(compStu.firstName);
        }

        else if(this.getAverageExamScore() > compStu.getAverageExamScore()){
            return 1;
        }
        return 0;
    }
}
