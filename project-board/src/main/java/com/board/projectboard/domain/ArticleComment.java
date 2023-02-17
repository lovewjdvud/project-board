package com.board.projectboard.domain;

public class ArticleComment  {
    private Long id;
    private Article article;
    private String title;
    private String hashtag;

    private LocaleDateTime createdAt; // 생성일시
    private String createdBy;       // 생성자
    private LocaleDateTIme modifiedAt; // 수정 일시
    private String modifiedBy;  // 수정자
}
