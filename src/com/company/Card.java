package com.company;

public class Card
{
    private final int  QUESTION_SIZE = 256;
    private final int ANSWER_SIZE = 512;

    private char[] question = new char[QUESTION_SIZE];
    private char[] answer = new char[ANSWER_SIZE];

    public Card(String question, String answer)
    {
        this.question = question.toCharArray();
        this.answer = answer.toCharArray();
    }

    public void setAnswer(String answer)
    {
        this.answer = answer.toCharArray();
    }

    public void setQuestion(String question)
    {
        this.question = question.toCharArray();
    }

    public String getQuestion()
    {
        String ret = this.question.toString();
        return ret;
    }

    public String getAnswer()
    {
        String ret = this.answer.toString();
        return ret;
    }

}
