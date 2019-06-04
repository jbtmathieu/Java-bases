public class Main {
    public static void main(String[] args) {

        // TP Java initiation 2
        // 1&2.
        Book book = new Book("Les Misérables","Victor Hugo", true,1900);
        System.out.println(book.toString());

        Movie movie = new Movie("Rencontre d'un troisième type", "Steven Spielberg", true, VidSupport.DVD);
        System.out.println(movie.toString());

        Periodic periodic  = new Periodic("Science et Vie", "Quotidien", false ,30);
        System.out.println(periodic.toString());

        //
        Document documents[] = {book, movie, movie, book,book, movie, periodic, movie,book, movie, periodic, periodic};
        Library library= new Library(documents);
        System.out.println(library.toString());
        library.addDocument(movie);
        System.out.println(library.toString());
        //6.
        System.out.println(library.getNumberOfMovies());

    }
}
