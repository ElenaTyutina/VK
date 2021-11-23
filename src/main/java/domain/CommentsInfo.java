package domain;

public class CommentsInfo {

    private boolean canPost;
    private int groupsCanPost;
    private boolean canClose;
    private boolean canOpen;
    private int count;

    public int getCount() { return count; }

    public boolean isCanOpen() {
        return canPost;
    }

    public void setCanOpen(boolean can_open) {
        this.canOpen = can_open;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean can_close) {
        this.canClose = can_close;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groups_can_post) {
        this.groupsCanPost = groups_can_post;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
