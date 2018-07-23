import java.util.List;

public class Articles {
    private String title;
    private String body;
    private String date;
    private List<User> viewer;
    private List<Reaction> reaction;
    private List<Commend> commend;

    public Articles(String title, String body, String date) {
        this.title = title;
        this.body = body;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<User> getViewer() {
        return viewer;
    }

    public void setViewer(List<User> viewer) {
        this.viewer = viewer;
    }

    public List<Reaction> getReaction() {
        return reaction;
    }

    public void setReaction(List<Reaction> reaction) {
        this.reaction = reaction;
    }

    public List<Commend> getCommend() {
        return commend;
    }

    public void setCommend(List<Commend> commend) {
        this.commend = commend;
    }

    @Override
    public String toString() {
        return "Articles{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", date='" + date + '\'' +
                ", viewer=" + viewer +
                ", reaction=" + reaction +
                ", commend=" + commend +
                '}';
    }
}
