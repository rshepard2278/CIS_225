/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Richard Shepard
 * @version 1.25.15
 */
class Book {
    private String author;
    private String title;
    private String refNumber;
    private int pages;
    private int borrowed;
    private final boolean IS_COURSE_TEXT;
    
    public Book(String bookAuthor, String bookTitle, int pages, boolean isCourseText) {
        this.pages = pages;
        author = bookAuthor;
        title = bookTitle;
        refNumber = "";
        IS_COURSE_TEXT = isCourseText;
    }

    public String getAuthor() {
        return author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public String getRefNumber() {
        return refNumber;
    }
    
    public int getBorrowed() {
        return borrowed;
    }
    
    public boolean isCourseText() {
        return IS_COURSE_TEXT;
    }
    
    public void borrowBook() {
        borrowed++;
    }
        
    public void setRefNumber(String ref) {
        if (ref.length() > 2) {
            refNumber = ref;
        } else {
            System.out.println("Reference Number must be atleast 3 characters.");
        }
    }
    
    public void printAuthor() {
        System.out.println(getAuthor());
    }
    
    public void printTitle() {
        System.out.println(getTitle());
    }
    
    public void printDetails() {
        System.out.println("Author:         " + author);
        System.out.println("Title:          " + title);
        System.out.println("Pages:          " + pages);
        if (refNumber.length() < 1) {
            refNumber = "ZZZ";
        }
        System.out.println("Ref#:           " + refNumber);
        System.out.println("Borrowed:       " + borrowed);
        System.out.println("Course Text:    " + IS_COURSE_TEXT);
    }
}
