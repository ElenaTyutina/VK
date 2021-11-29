package domain;

public class LikeInfo {

    private int count;
    private int userLikes;
    private boolean canLike;
    private boolean canPublish;

    public boolean getCanLike() {
        return canLike;
    }

    public boolean getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}