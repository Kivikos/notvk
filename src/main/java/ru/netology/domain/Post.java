package ru.netology.domain;

public class Post {
    private int ID;
    private int ownerID;
    private int fromID;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerID;
    private int replyPostID;
    private int friendsOnly;
    private Comments comments;
    private Copyright copyright;
    private Likes likes;
    private Reposts reposts;
    private Views views;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerID;
    private int canPin;
    private int canEdit;
    private int canDelete;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedID;

    public int getID() {
        return ID;
    }

    public int setID(int ID) {
        return this.ID = ID;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public int setOwnerID(int ownerID) {
        return this.ownerID = ownerID;
    }

    public int getFromID() {
        return fromID;
    }

    public int setFromID(int fromID) {
        return this.fromID = fromID;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

}
