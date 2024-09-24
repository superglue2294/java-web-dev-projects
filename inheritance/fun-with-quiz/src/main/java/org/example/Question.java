package org.example;

public abstract class Question {
    private String question;

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return this.question;
    }

    public abstract boolean compareAnswer(String answer);

    public abstract String toString();
}
