public class Periodic extends Book{
    //members

    //const
    public Periodic(String title, String author, boolean forRenting, int pageNbr) {
        super(title, author, forRenting, pageNbr);
    }


    //set get
    @Override
    public int getPageNbr() {
        return super.getPageNbr();
    }

    @Override
    public void setPageNbr(int pageNbr) {
        super.setPageNbr(pageNbr);
    }

    @Override
    public boolean isForRenting() {
        return super.isForRenting();
    }

    @Override
    public void setForRenting(boolean forRenting) {
        super.setForRenting(forRenting);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    //other




}
