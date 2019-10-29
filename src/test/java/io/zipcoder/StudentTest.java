package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void getFirstName() {
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void getLastNAme() {
    }

    @Test
    public void setLastNAme() {
    }

    @Test
    public void getNumberOfExamsTaken() {
    }

    @Test
    public void getExamScores() {
        // : Given
        String firstName = "Donatello";
        String lastName = "Turtle";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList( 100.0, 95.0, 123.0, 96.0 ));
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n\tExam 1 -> 100\n" +
                "\tExam 2 -> 95\n" +
                "\tExam 3 -> 123\n" +
                "\tExam 4 -> 96\n";

        // When
        String actual = student.getExamScores();

        // Then

        Assert.assertEquals(expected,actual);
        System.out.println(actual);
    }

    @Test
    public void addExamScore() {
        // Given
        String firstName = "Donatello";
        String lastName = "Turtle";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList( 100.0, 95.0, 123.0, 96.0 ));
        Student student = new Student(firstName, lastName, examScores);

        String expected = "Exam Scores:\n\tExam 1 -> 100\n" +
                "\tExam 2 -> 95\n" +
                "\tExam 3 -> 123\n" +
                "\tExam 4 -> 96\n" +
                "\tExam 5 -> 100\n";
        //when
        student.addExamScore(100.0);
        String actual = student.getExamScores();
        Assert.assertEquals(expected,actual);
        System.out.println(actual);
    }

    @Test
    public void setExamScore() {
        // Given
        String firstName = "Donatello";
        String lastName = "Turtle";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList( 100.0, 95.0, 123.0, 96.0 ));
        Student student = new Student(firstName, lastName, examScores);

        String expected = ">Exam Scores:\n\tExam 1 -> 150\n" +
                "\tExam 2 -> 95\n" +
                "\tExam 3 -> 123\n" +
                "\tExam 4 -> 96\n";

        //when
        student.setExamScore(0, 150.0);
        String actual = student.getExamScores();
        Assert.assertEquals(expected,actual);
        System.out.println(actual);
    }

    @Test
    public void getAverageExamScore() {
        // Given
        String firstName = "Donatello";
        String lastName = "Turtle";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList( 100.0, 95.0, 123.0, 96.0 ));
        Student student = new Student(firstName, lastName, examScores);

        Integer expected = 103;
        //when
        Integer actual = student.getAverageExamScore();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        // Given
        String firstName = "Donatello";
        String lastName = "Turtle";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList( 100.0, 95.0, 123.0, 96.0 ));
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Student Name: Donatello Turtle\n" +
                "> Average Score: 103\n" +
                "> Exam Scores:\n" +
                "\tExam 1 -> 100\n" +
                "\tExam 2 -> 95\n" +
                "\tExam 3 -> 123\n" +
                "\tExam 4 -> 96\n";
        String actual = student.toString();
        System.out.print(student.toString());
        Assert.assertEquals(expected,actual);
    }
}