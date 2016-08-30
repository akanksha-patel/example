package main.java.com.bitwise.views;

import main.java.com.bitwise.controllers.Quiz;

import java.util.Scanner;

/**
 * Created by akankshap on 8/17/2016.
 */
public class Menu {
    private Integer ch;
    Quiz quiz = new Quiz();

    public Menu () {
        initMenu();
    }

    public void initMenu(){
        do{
            this.categories();
            this.getUserInput();
            this.doAction(this.ch);
        }while(ch!=0);
    }

    private void categories() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("1. Start Quiz");
        System.out.println("2. Show Answers");
        System.out.println("3. Exit");
        System.out.println("---------------------------------------------------------------------------");
    }

    public int getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("Enter a choice : ");
        try {

            this.ch = Integer.parseInt(in.nextLine());
            if (this.ch < 0) {
                System.out.println("Negetive number !!!!Please enter a valid choice !!  ");
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid choice ..............   ");
            this.getUserInput();
        }

        System.out.println(" \n ---------------------------------------------------------------------------");
        return this.ch;
    }

    public void doAction(int ch) {
        switch (ch) {
            case 1:
                quiz.startQuiz();
                break;
            case 2:
                quiz.showAnswers();
                break;

            case 3:
                System.exit(0);

            default:
                System.out.println("Please enter a valid choice !!!!!!!!!!!!");


        }
    }
}
