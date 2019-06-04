public class Movie {
    //members
    private VidSupport support;
    private int cost;

    //const
    public Movie(VidSupport support, int cost) {
        this.support = support;
        this.cost = cost;
    }

    //set get


    public VidSupport getSupport() {
        return support;
    }

    public void setSupport(VidSupport support) {
        this.support = support;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    // other

    @Override
    public String toString() {
        return super.toString()+" Movie{" +
                "support=" + support +
                ", cost=" + cost +
                '}';
    }
}
