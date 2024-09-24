package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> quiz;
    private int points;

    public Quiz() {
        this.quiz = new ArrayList<>();
        this.points = 0;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return this.points;
    }

    public void addQuestions(Question question) {
        quiz.add(question);
    }

    private double gradeQuiz() {
        return (1.0 * this.points / this.quiz.size()) * 100;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (quiz.isEmpty()) {
                System.out.println("Add questions before running the quiz.");
                break;
            }

            for (Question question : this.quiz) {
                System.out.println(question);
                String answer = scanner.nextLine();
                if (question.compareAnswer(answer)) {
                    System.out.println("Correct!");
                    setPoints(getPoints() + 1);
                } else {
                    System.out.println("Incorrect!");
                }
            }

            break;
        }

        System.out.println("You got " + getPoints() + " points out of " + this.quiz.size() + " points: " + this.gradeQuiz() + "%");
    }
}
