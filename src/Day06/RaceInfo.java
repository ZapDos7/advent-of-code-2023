package Day06;

public class RaceInfo {
    int id;
    int duration;
    int distance;

    public RaceInfo(int id, int duration, int distance) {
        this.id = id;
        this.duration = duration;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "RaceInfo{" +
                "id=" + id +
                ", duration=" + duration +
                ", distance=" + distance +
                '}';
    }
}
