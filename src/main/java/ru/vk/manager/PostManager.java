package ru.vk.manager;

import ru.vk.domain.Post;
import ru.vk.domain.WallDelete;
import ru.vk.domain.WallSearch;


public class PostManager {
    WallSearch wallSearch = new WallSearch();
    public int findOwnersID(int ownerId) {
        return ownerId;
    }

    WallDelete wallDelete = new WallDelete();
    public int delete(int postId) {
        return postId;
    }

}
