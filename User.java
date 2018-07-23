import java.util.List;

public class User {
    private String name;
    private String id;
    private String Username;
    private List<Articles> article;
    public User(String name, String id, String username ) {
        this.name = name;
        this.id = id;
        Username = username;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public List<Articles> getArticle() {
        return article;
    }

    public void setArticle(List<Articles> article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", Username='" + Username + '\'' +
                ", article=" + article+
                '}';
    }
}
