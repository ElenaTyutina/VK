package domain;

public class GeoInfo {

    private String type;
    private String coordinates;
    private User place;

    public User getPlace() {
        return place;
    }

    public void setPlace(User place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public void setType(String type) {
        this.type = type;
    }
}




