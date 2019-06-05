public class Book extends Document{
    //members
    protected int pageNbr;
    protected boolean forRenting;

    //const

    public Book(String title, String author, boolean forRenting, int pageNbr) {
        super(title, author, forRenting);
        this.pageNbr = pageNbr;

        boolean  cond = setCost();
    }


    //set get

    public int getPageNbr() {
        return pageNbr;
    }

    public void setPageNbr(int pageNbr) {
        this.pageNbr = pageNbr;
    }

    public boolean isForRenting() {
        return forRenting;
    }

    public void setForRenting(boolean forRenting) {
        this.forRenting = forRenting;
    }
//
    public boolean setCost(float cost){
        if (pageNbr > 0) {
            this.cost = pageNbr * cost;
            return true;
        }else return false;
    }
    public boolean setCost(){
        if (pageNbr > 0) {
            this.cost = pageNbr * 0.5f;
            return true;
        }else return false;
    }

    //other


    @Override
    public String toString() {
        return super.toString()+ "Book{" +
                "pageNbr=" + pageNbr +
                ", forRenting=" + forRenting +
                '}';
    }
}

