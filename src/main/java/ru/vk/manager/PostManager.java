package ru.vk.manager;

import ru.vk.domain.Post;
import ru.vk.domain.WallDelete;
import ru.vk.domain.WallSearch;


public class PostManager {
    private Post[] posts;
    Post post = new Post();

    public Post[] search(int ownerId, String domain, String query, int count) {
        return null;
    }

    public void delete(int postId, int ownerId) {
        return;
    }

}


