package com.mathematics.marthasaka.mathematics;


/**
 * Created by Student on 3/11/2016.
 */
public class MathsOperations {

    public static void addition() {
        int a = 15;
        int b = 5;

        int answer = a + b;

        PrintAnswer answerReference=new PrintAnswer();
        answerReference.PrintAnswer(answer);
    }

    public static void subtraction() {
        int a = 15;
        int b = 5;
        int answer = a - b;

        PrintAnswer answerReference=new PrintAnswer();
        answerReference.PrintAnswer(answer);
    }

    public static void multiplication() {
        int a = 5;
        int b = 7;
        int answer = a * b;

        PrintAnswer answerReference=new PrintAnswer();
        answerReference.PrintAnswer(answer);

    }

}


