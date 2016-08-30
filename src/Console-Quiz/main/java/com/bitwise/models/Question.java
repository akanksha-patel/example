package main.java.com.bitwise.models;

/**
 * Created by varunsh on 8/17/2016.
 */
public class Question {

    private Answer answer;
    private String question;

    public Question(){

    }

    public Question(String question, Answer answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(400);
        sb.append(this.getQuestion())
                .append("\n")
                .append(this.getAnswer());
        return sb.toString();
    }
}
