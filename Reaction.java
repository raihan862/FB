public class Reaction {
    private User reuser;
    private int retype;

    public Reaction(User reuser, int retype) {
        this.reuser = reuser;
        this.retype = retype;
    }

    public User getReuser() {
        return reuser;
    }

    public void setReuser(User reuser) {
        this.reuser = reuser;
    }

    public int getRetype() {
        return retype;
    }
    public void setRetype(int retype) {
        this.retype = retype;
    }
    @Override
    public String toString() {
        return "Reaction{" +
                "reuser=" + reuser +
                ", retype=" + retype +
                '}';
    }


}


