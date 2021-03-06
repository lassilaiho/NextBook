package nextbook.domain;

public class Video extends Clue {

    private String name;
    private String link;
    private int time;

    public Video(String name, String link, int time) {
        this.name = name;
        this.link = link;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "name=" + name + ", link=" + link + ", time=" + time;
    }

}

