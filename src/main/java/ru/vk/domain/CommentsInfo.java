package ru.vk.domain;

public class CommentsInfo {
    private int likesCount;
    private int commentId;
    private int commentAuthorId;
    private int commentDate;
    private String commentText;
    private int sharingCount;

    private int canPost; // инф-ция о том, может ли пользователь комментировать запись
    private int canLike; // инф-ция о том, может ли пользователь поставить отметку "Мне нравится"
    private int count; // количество комментариев


}
