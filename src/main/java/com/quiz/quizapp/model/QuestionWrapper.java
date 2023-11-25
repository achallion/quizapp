package com.quiz.quizapp.model;

import lombok.Data;

@Data
public class QuestionWrapper {
    private Integer Id;
    private String questionTitle, Option1, Option2, Option3, Option4 ;

    public QuestionWrapper(Integer Id, String questionTitle, String Option1, String Option2, String Option3, String Option4) {
        this.Id = Id;
        this.questionTitle = questionTitle;
        this.Option1 = Option1;
        this.Option2 = Option2;
        this.Option3 = Option3;
        this.Option4 = Option4;
    }

}
