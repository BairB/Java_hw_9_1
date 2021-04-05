package ru.vk.domain;

public class CommentsInfo {
    private int commentId;
    private int commentAuthorId;
    private int commentDate;
    private String commentText;
    private int sharingCount;

    private int canPost; // инф-ция о том, может ли пользователь комментировать запись
    private int canLike; // инф-ция о том, может ли пользователь поставить отметку "Мне нравится"
    private int count; // количество комментариев
    private int groupsCanPost; // информация о том, могут ли сообщества комментировать запись
    private boolean canClose; // может ли текущий пользователь закрыть комментарии к записи
    private boolean canOpen; // может ли текущий пользователь открыть комментарии к записи

}
