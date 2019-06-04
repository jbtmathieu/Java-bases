public abstract class Document {
    //members
    protected String title;
    protected String  author;
    protected boolean forRenting;
    protected float cost;

    //constr
    public Document(String title, String author, boolean forRenting) {
        this.title = title;
        this.author = author;
        this.forRenting = forRenting;
        this.cost = 0;

    }

    //set get
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isForRenting() {
        return forRenting;
    }

    public void setForRenting(boolean forRenting) {
        this.forRenting = forRenting;
    }

    public float getCost() {
        return cost;
    }

    public abstract boolean setCost(float cost);
        //ABSTRACT



    //other


    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", forRenting=" + forRenting +
                ", cost=" + cost +
                '}';
    }
}
