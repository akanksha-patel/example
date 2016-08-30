package main.java.com.bitwise.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by varunsh on 8/17/2016.
 */
public class Questions {

    private final List<Question> questionsList = new ArrayList<Question>();

    public Questions () {
        this.initQuestions();
    }

    private void initQuestions() {
        String [] questions = {
            "What is the name of the creator of this world?",
                "What is the name of this month?",
                "Who is the largest animal on land?",
                "Who is the fastest animal on land?",
                "Which club is the best in Pune?"
        };


        getQuestionsList().add(new Question(questions[0], new Answer("Anusha", "Varun", "Mark", "Almighty", 4)));
        getQuestionsList().add(new Question(questions[1], new Answer("January", "Febuary", "August", "July", 3)));
        getQuestionsList().add(new Question(questions[2], new Answer("Cheetah", "Elephant", "Giraffe", "Anusha", 2)));
        getQuestionsList().add(new Question(questions[3], new Answer("Cheetah", "Snail", "Ostrich", "Horse", 1)));
        getQuestionsList().add(new Question(questions[4], new Answer("ABC", "XYZ", "Miami", "Hoppipola", 3)));

    }

    public List<Question> getQuestionsList() {
        return questionsList;
    }


}
