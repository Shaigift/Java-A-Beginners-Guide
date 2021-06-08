package PackagesAndMemberAccess.bookpackext;
// This class is in package bookpackext.
// Use the Book Class from bookpack.
public class UseBook {
    public static void main(String args[]) {
        PackagesAndMemberAccess.bookpack.Book books[] = new PackagesAndMemberAccess.bookpack.Book[5];

        books[0] = new PackagesAndMemberAccess.bookpack.Book("Java: A Beginner's Guide",
                "Schildt", 2019);
        books[1] = new PackagesAndMemberAccess.bookpack.Book("Java: The Complete Reference",
                "Schildt", 2019);
        books[2] = new PackagesAndMemberAccess.bookpack.Book("Introducing JavaFX 8 Programming",
                "Schildt", 2015);
        books[3] = new PackagesAndMemberAccess.bookpack.Book("Red Storm Rising",
                "Clancy", 1986);
        books[4] = new PackagesAndMemberAccess.bookpack.Book("On the Road",
                "Kerouac", 1955);

        for(int i=0; i < books.length; i++) books[i].show();
    }
}
