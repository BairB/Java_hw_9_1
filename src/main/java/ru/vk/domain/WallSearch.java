package ru.vk.domain;

public class WallSearch {

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    private int ownerId;
    private String domain;
    private String query;
    private int count;
}
