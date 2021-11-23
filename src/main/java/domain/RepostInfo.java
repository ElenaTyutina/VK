package domain;

public class RepostInfo {
    private int count;
    private int userReposted;

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int user_reposted) {
        this.userReposted = user_reposted;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
