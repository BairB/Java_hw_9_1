package ru.vk.manager;

import ru.vk.domain.Post;
import ru.vk.domain.WallDelete;
import ru.vk.domain.WallSearch;


public class PostManager {
    WallSearch wallSearch = new WallSearch();
    int id = wallSearch.getOwnerId();
    int count = wallSearch.getCount();
    String domain = wallSearch.getDomain();
    String query = wallSearch.getQuery();

    private WallSearch[] wallSearches(){
        return null;
    }

    WallDelete wallDelete = new WallDelete();
    int ownerId = wallDelete.getOwnerId();
    int postId = wallDelete.getOwnerId();

    public WallDelete[] getWallDeletes(){
        return null;
    }
}


