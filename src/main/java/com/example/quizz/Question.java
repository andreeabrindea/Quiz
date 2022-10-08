package com.example.quizz;
import java.util.ArrayList;

public class Question {
    private int id;
    private String text;
    private ArrayList<Answer> correctAnswers;

    public Question(int id, String text, ArrayList<Answer> correctAnswers) {
        this.id = id;
        this.text = text;
        this.correctAnswers = correctAnswers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Answer> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(ArrayList<Answer> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }
}
