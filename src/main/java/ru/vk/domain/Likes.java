package ru.vk.domain;

public class Likes {
    private int count;
    private int userLikes; // наличие отметки «Мне нравится» от текущего пользователя
    private boolean canLike; //информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    private boolean canPublish; // информация о том, может ли текущий пользователь сделать репост записи

}
