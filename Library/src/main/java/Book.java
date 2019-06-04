public class Book {
    //members
    private int pageNbr;
    private boolean forRenting;

    //const

    public Book(int pageNbr, boolean forRenting) {
        this.pageNbr = pageNbr;
        this.forRenting = forRenting;

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

    //other


    @Override
    public String toString() {
        return super.toString()+ "Book{" +
                "pageNbr=" + pageNbr +
                ", forRenting=" + forRenting +
                '}';
    }
}
}
