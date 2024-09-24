package org.example;

public class MultipleChoice extends Question {
    private String answer;

    public MultipleChoice(String question, String answer) {
        super(question);
        this.answer = answer;
    }

    public String getAnswer() {
        return this.answer;
    }

    @Override
    public boolean compareAnswer(String answer) {
        return this.answer.equals(answer);
    }

    @Override
    public String toString() {
        return this.getQuestion();
    }
}
