import java.util.Arrays;

//3.
public class Library {
    //members
    protected Document[] documents;
    protected int index;

    //const

    public Library(Document[] documents) {
        this.documents = documents;
        index=documents.length-1;

    }

    //set get

    public Document getDocuments(int index) {
        return documents[index];
    }

    public void setDocuments(Document[] documents, int index) {
        this.documents = documents;
    }

    public void setDocuments(Document document, int index) {
        this.documents[index] = document;
    }

    public void addDocument(Document document) {
        if (index >= documents.length-1) {
            Document[] documents2 = new Document[index+100];
            documents2[documents2.length-100]= document;
            for (int i=0;i<documents.length;i++) {
                documents2[i] = documents[i];
                System.out.println(i+" "+documents[i].title);
            }
            documents = documents2;
            index++;
            }else {
            documents[index+1] = document;
            index++;
        }
    }
public int getNumberOfMovies(){
        int Nbr=0;
        for (int i=0;i<index;i++) {
            if (documents[i].getClass().getName() == "Movie") Nbr++;
        }
        return Nbr;
    }
    //other

    @Override
    public String toString() {
        return "Library{" +
                "documents=" + Arrays.toString(documents) +
                ", index=" + index +
                '}';
    }
}
