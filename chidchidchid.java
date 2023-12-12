//PATH test60999/Main60999.java ----------------------------------------
package test60999;

import lib999.Book60999;
import lib999.BookList60999;
import util60999.U60999;

public class Main60999 {

    /* 5.(20 points) */
    public static void main(String[] args) {
        testUnique999();//5.1
        testCheckDigit999();//5.2
        testBook999();//5.3
        testBookList999();//5.4
    }

    static void testUnique999() {
        /* 5.1 */
        System.out.println("### Test U60999.unique999 method ###");
        System.out.println(U60999.unique999());
        System.out.println(U60999.unique999());
        System.out.println(U60999.unique999());
    }

    static void testCheckDigit999() {
        /* 5.2 */
        System.out.println("### Test U60999.checkDigit999 method ###");
        long num;
        num = 60130500999L;
        System.out.format("check digit of %d = %d%n", num, U60999.checkDigit999(num));
        num = -123456;
        System.out.format("check digit of %d = %d%n", num, U60999.checkDigit999(num));
        num = 109030L;
        System.out.format("check digit of %d = %d%n", num, U60999.checkDigit999(num));
        num = 0L;
        System.out.format("check digit of %d = %d%n", num, U60999.checkDigit999(num));
    }

    static void testBook999() {
        /* 5.3 */
        System.out.println("### Test Book60999 class ###");
        Book60999 b1, b2, b3;
        b1 = new Book60999("First One", 123.45); // constructor
        b2 = new Book60999("First One", 123.45);
        b3 = b1;
        System.out.println("b1: " + b1); // toString
        System.out.println("b2: " + b2);
        System.out.println("b3: " + b3);
        System.out.println("b1.getIsbn999: " + b1.getIsbn999()); // getters
        System.out.println("b1.getTitle999: " + b1.getTitle999());
        System.out.println("b1.getPrice999: " + b1.getPrice999());
        System.out.println("b1.hashCode: " + b1.hashCode()); // hashCode
        System.out.println("b1==b2 ? " + (b1 == b2));
        System.out.println("b1.equals(b2) ? " + (b1.equals(b2))); // equals
        System.out.println("b1==b3 ? " + (b1 == b3));
        System.out.println("b1.equals(b3) ? " + (b1.equals(b3)));
        try {
            System.out.println("Try: " + new Book60999(null, 1.0)); // constructor
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            System.out.println("Try: " + new Book60999(" ", 1.0));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            System.out.println("Try: " + new Book60999("ok", 0.0));
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    static void testBookList999() {
        /* 5.4 */
        System.out.println("### Test BookList60999 class ###");
        BookList60999 books = BookList60999.newList(); // newList
        Book60999 b0, b1, b2;

        System.out.format("BookList books: %s%n", books); // toString
        System.out.println("BookList books.totalPrice(): " + books.totalPrice999()); // totalPrice
        b0 = new Book60999("BookOne", 100.50);
        System.out.format("books.add(%s): %b%n", b0, books.add(b0)); // add
        System.out.format("BookList books: %s%n", books);
        System.out.println("BookList books.totalPrice(): " + books.totalPrice999());
        b1 = new Book60999("BookTwo", 240.25);
        System.out.format("books.add(%s): %b%n", b1, books.add(b1));
        System.out.format("BookList books: %s%n", books);
        System.out.println("BookList books.totalPrice(): " + books.totalPrice999());
        b2 = new Book60999("BookThree", 1005.00);
        System.out.format("books.add(%s): %b%n", b2, books.add(b2));
        System.out.format("BookList books: %s%n", books);
        System.out.println("BookList books.totalPrice(): " + books.totalPrice999());
        System.out.format("books.add(%s) {duplicate}: %b%n", b1, books.add(b1));
        System.out.format("BookList books: %s%n", books);
        System.out.println("BookList books.totalPrice(): " + books.totalPrice999());
        System.out.format("books.remove999(%s): %b%n", b1, books.remove999(b1)); // remove
        System.out.format("BookList books: %s%n", books);
        System.out.println("BookList books.totalPrice(): " + books.totalPrice999());
        System.out.format("books.remove999(%s) (not found): %b%n", b1, books.remove999(b1));
        System.out.format("BookList books: %s%n", books);
        System.out.println("BookList books.totalPrice(): " + books.totalPrice999());
        System.out.format("books.remove999(%s): %b%n", b2, books.remove999(b2));
        System.out.format("BookList books: %s%n", books);
        System.out.println("BookList books.totalPrice(): " + books.totalPrice999());
        System.out.format("books.remove999(%s): %b%n", b0, books.remove999(b0));
        System.out.format("BookList books: %s%n", books);
        System.out.println("BookList books.totalPrice(): " + books.totalPrice999());
    }
}
























//PATH util60999/U60999.java ----------------------------------------
package util60999;
public class U60999 {

    /* 6.(30 points) */
    private static long seed999 = 60130500999L;

    /* 6.1 */
    private U60999() {
    }

    /* 6.2 */
    public static long unique999() {
        /* 6.3 */
        long result = seed999;
        seed999 += 1 + (int) (9 * Math.random());
        return result;
    }

    public static int checkDigit999(long number) {
        /* 6.4 */
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        for (int dir = 1; number > 0; dir *= -1) {
            sum += dir * (int) (number % 10);
            number /= 10;
        }
        if (sum < 0) {
            sum *= -1;
        }
        return sum % 10;
    }
}

























//PATH lib999/Book60999.java ----------------------------------------
package lib999;

import util60999.U60999;
public class Book60999 {

    /* 7.(50 points) */
    private final long isbn999;
    /* 7.1 */
    private final String title999;
    private final double price999;

    public Book60999(String title999, double price999) {
        /* 7.2 */
        if (title999 == null || title999.isBlank() || price999 <= 0.0) {
            throw new IllegalArgumentException("Invalid Initialization");
        }
        this.title999 = title999;
        this.price999 = price999;
        long temp = U60999.unique999();
        this.isbn999 = temp * 10 + U60999.checkDigit999(temp);
    }

    public long getIsbn999() {
        return isbn999;
    }

    /* 7.3 */
    public String getTitle999() {
        return title999;
    }

    public double getPrice999() {
        return price999;
    }

    @Override
    public String toString() {
        /* 7.4 */
        return String.format("Book(%02d-%05d-%04d-%1d,%s,%.2f)",
                isbn999 / 1_00000_0000_0L,
                isbn999 / 1_0000_0 % 1_00000,
                isbn999 / 1_0 % 1_0000,
                isbn999 % 1_0,
                title999, price999);
    }

    @Override
    public int hashCode() {
        return (int) isbn999;
    }

    /* 7.5 */
    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
    /* 7.6 */
}
































//PATH lib999/BookList60999.java ----------------------------------------


package lib999;
public class BookList60999 {

    /* 8.(20 points) */
    private final Book60999 book;
    private BookList60999 next;

    private BookList60999(Book60999 book) {
        this.book = book;
    }

    public static BookList60999 newList() {
        return new BookList60999(null);
    }

    public boolean add(Book60999 book) {
        if (book == null) {
            return false;
        }
        var current = this;
        while (current.next != null) {
            current = current.next;
            if (current.book.equals(book)) {
                return false;
            }
        }
        current.next = new BookList60999(book);
        return true;
    }

    @Override
    public String toString() {
        var current = this;
        var sb = new StringBuilder();
        sb.append("BookList{");
        while ((current = current.next) != null) {
            sb.append("\n ").append(current.book);
        }
        return sb.append("}").toString();
    }

    public double totalPrice999() {
        /* 8.1 */
        double sum = 0.0;
        var current = this;
        while (current.next != null) {
            current = current.next;
            sum += current.book.getPrice999();
        }
        return sum;
    }

    public boolean remove999(Book60999 book) {
        /* 8.2 */
        if (book == null) {
            return false;
        }
        var current = this;
        while (current.next != null) {
            if (current.next.book.equals(book)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
