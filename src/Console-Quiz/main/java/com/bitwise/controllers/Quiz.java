package main.java.com.bitwise.controllers;


import main.java.com.bitwise.models.Question;
import main.java.com.bitwise.models.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by varunsh on 8/17/2016.
 */
public class Quiz {
    private Questions questions = new Questions();
    private List<Question> questionsList = questions.getQuestionsList();
    public List<Integer> userAnswers = new ArrayList<Integer>();
    private Scanner in;

    public void startQuiz() {
        userAnswers.clear();
        Integer userChoice;
        in = new Scanner(System.in);
        Collections.shuffle(questionsList);
        for (Question question: questionsList) {
            System.out.println(question);
            userChoice = Integer.parseInt(in.nextLine());
            userAnswers.add(userChoice);
        }
    }

    public void showAnswers() {
        int i = 0;
        for (Question q: questionsList) {
            if (q.getAnswer().getCorrectOption() == userAnswers.get(i)) {
                System.out.println(i + 1 + ". Right");
                System.out.println("Correct Answer: " + q.getAnswer().getCorrectOption());
            } else {
                System.out.println(i + 1 + ". Wrong");
                System.out.println("Correct Answer: " + q.getAnswer().getCorrectOption());
            }
            System.out.println();
            i++;
        }
    }
}
