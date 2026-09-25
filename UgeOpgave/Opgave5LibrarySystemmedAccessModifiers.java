import java.util.ArrayList;

public class Opgave5LibrarySystemmedAccessModifiers {
    /*
    // Book.java
    public static class Book {
        private String title;
        private String author;
        private boolean available;

        public Book(String title, String author) {
            // Validering (ekstra udfordring)
            if (title == null || title.isEmpty()) {
                this.title = "Unknown";
            } else {
                this.title = title;
            }

            if (author == null || author.isEmpty()) {
                this.author = "Unknown";
            } else {
                this.author = author;
            }

            this.available = true;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isAvailable() {
            return available;
        }

        public void borrow() {
            if (available) {
                available = false;
                System.out.println("Du har lånt: " + title);
            } else {
                System.out.println(title + " er ikke tilgængelig");
            }
        }

        public void returnBook() {
            available = true;
            System.out.println("Returneret: " + title);
        }

        public String toString() {
            String status = available ? "Tilgængelig" : "Udlånt";
            return title + " af " + author + " - " + status;
        }
    }

    // Library.java
    public static class Library {
        private String libraryName;
        private ArrayList<Book> books;

        public Library(String libraryName) {
            this.libraryName = libraryName;
            this.books = new ArrayList<>();
        }

        public void addBook(Book book) {
            if (book != null) {
                books.add(book);
                System.out.println("Tilføjet bog: " + book.getTitle());
            }
        }

        public ArrayList<Book> findAvailableBooks() {
            ArrayList<Book> available = new ArrayList<>();
            for (Book book : books) {
                if (book.isAvailable()) {
                    available.add(book);
                }
            }
            return available;
        }

        public Book findBookByTitle(String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    return book;
                }
            }
            return null;
        }

        public void printAllBooks() {
            System.out.println("\n=== " + libraryName + " ===");
            System.out.println("Alle bøger:");
            for (Book book : books) {
                System.out.println("- " + book);
            }
        }
    }

    // Main.java
    public static class Main {
        public static void main(String[] args) {
            Library library = new Library("Københavns Bibliotek");

            // Tilføj bøger
            library.addBook(new Book("1984", "George Orwell"));
            library.addBook(new Book("Harry Potter", "J.K. Rowling"));
            library.addBook(new Book("Ringenes Herre", "J.R.R. Tolkien"));
            library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
            library.addBook(new Book("Pride and Prejudice", "Jane Austen"));

            // Lån nogle bøger
            System.out.println("\n--- Lån bøger ---");
            Book book1 = library.findBookByTitle("1984");
            if (book1 != null) {
                book1.borrow();
            }

            Book book2 = library.findBookByTitle("Harry Potter");
            if (book2 != null) {
                book2.borrow();
            }

            // Find tilgængelige bøger
            System.out.println("\n--- Tilgængelige bøger ---");
            ArrayList<Book> available = library.findAvailableBooks();
            for (Book book : available) {
                System.out.println("- " + book);
            }

            // Return bog
            System.out.println("\n--- Return bog ---");
            if (book1 != null) {
                book1.returnBook();
            }

            // Print alle bøger
            library.printAllBooks();
        }
    }
    // Output: Tilføjet bog: 1984
    //Tilføjet bog: Harry Potter
    //Tilføjet bog: Ringenes Herre
    //Tilføjet bog: To Kill a Mockingbird
    //Tilføjet bog: Pride and Prejudice
    //
    //--- Lån bøger ---
    //Du har lånt: 1984
    //Du har lånt: Harry Potter
    //
    //--- Tilgængelige bøger ---
    //- Ringenes Herre af J.R.R. Tolkien - Tilgængelig
    //- To Kill a Mockingbird af Harper Lee - Tilgængelig
    //- Pride and Prejudice af Jane Austen - Tilgængelig
    //
    //--- Return bog ---
    //Returneret: 1984
    //
    //=== Københavns Bibliotek ===
    //Alle bøger:
    //- 1984 af George Orwell - Tilgængelig
    //- Harry Potter af J.K. Rowling - Udlånt
    //- Ringenes Herre af J.R.R. Tolkien - Tilgængelig
    //- To Kill a Mockingbird af Harper Lee - Tilgængelig
    //- Pride and Prejudice af Jane Austen - Tilgængelig

     */
}
