public class Commend {
    private User commuser;

    private String Combody;

    public Commend(User commuser, String combody) {
        this.commuser = commuser;
        Combody = combody;
    }

    public User getCommuser() {
        return commuser;
    }

    public void setCommuser(User commuser) {
        this.commuser = commuser;
    }

    public String getCombody() {
        return Combody;
    }

    public void setCombody(String combody) {
        Combody = combody;
    }

    @Override
    public String toString() {
        return "Commend{" +
                "commuser=" + commuser +
                ", Combody='" + Combody + '\'' +
                '}';
    }
}