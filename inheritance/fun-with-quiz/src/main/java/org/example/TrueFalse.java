package org.example;

public class TrueFalse extends Question {
    private boolean answer;

    public TrueFalse(String question, boolean answer) {
        super(question);
        this.answer = answer;
    }

    public boolean getAnswer() {
        return this.answer;
    }

    @Override
    public boolean compareAnswer(String answer) {
        return (answer.equals("true") && this.answer || answer.equals("false") && !this.answer);
    }

    @Override
    public String toString() {
        return this.getQuestion();
    }
}
