package domain;

import java.util.Date;

public class Post {

    private String text;
    private Comment[] comments;

    private Date date;
    private Like[] likes;

    private User author;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Like[] getLikes() {
        return likes;
    }

    public void setLikes(Like[] likes) {
        this.likes = likes;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
