package ru.vk.domain;

public class Post {
    private int id;
    private int authorId;
    private String authorName;
    private int date;
    private String text;
    private CommentsInfo commentsInfo;
    private PostInfo postInfo;

    private int ownerId; //идентификатор владельца стены
}
