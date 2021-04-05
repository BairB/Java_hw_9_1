package ru.vk.domain;

public class Post {
    private int id;
    private int ownerId; //идентификатор владельца стены
    private int authorId;
    private int createdBy; // идентификатор администратора
    private String authorName;
    private int date;
    private String text;
    public int replyOwnerId; // идентификатор владельца записи, в ответ на которую была оставлена текущая
    public int replyPostId; // идентификатор записи, в ответ на которую была оставлена текущая
    public int friendsOnly; // если запись была создана с опцией «Только для друзей».


    private CommentsInfo commentsInfo;
    private PostInfo postInfo;
    private Copyright copyright;
    private Likes likes;
    private Reposts reposts;
    private int postType; // тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    private Geo geo;

    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavourite;
    private int postponedId;

}

