public class Periodic {
    //members
    private int pageNbr;
    private int cost;

    //const

    //set get

    public int getPageNbr() {
        return pageNbr;
    }

    public void setPageNbr(int pageNbr) {
        this.pageNbr = pageNbr;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    //other

    @Override
    public String toString() {
        return super.toString()+" Periodic{" +
                "pageNbr=" + pageNbr +
                ", cost=" + cost +
                '}';
    }
}
