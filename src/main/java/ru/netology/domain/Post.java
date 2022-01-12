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
}
