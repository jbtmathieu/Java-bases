public class Movie extends Document{
    //members
    static float cost;

    private VidSupport support;

    //const
    public Movie(String title, String author, VidSupport support) {
        super(title, author, true);
        this.support = support;
        this.cost=70f;
    }


    //set get
    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    @Override
    public boolean isForRenting() {
        return super.isForRenting();
    }

    @Override
    public void setForRenting(boolean forRenting) {
        super.setForRenting(forRenting);
    }
    //set get


    public String getSupport() {
        return "DVD";
    }

    public void setSupport(VidSupport support) {
        this.support = support;
    }

    public float getCost() {
        return cost;
    }

    public boolean setCost(float cost) {
        if (cost>0){
        this.cost = cost;
        return true;
        }
        return false;
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
