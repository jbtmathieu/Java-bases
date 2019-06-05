public class Periodic extends Book{
    //members
    private int numero;

    //const
    public Periodic(String title, String author, boolean forRenting, int pageNbr, int numero) {
        super(title, author, forRenting, pageNbr);
        this.numero=numero;
    }


    //set get


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

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
        return super.toString()+"Numéro "+numero;
    }
    //other




}
