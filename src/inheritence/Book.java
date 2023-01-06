package inheritence;

public class Book {
    private String tittle;
    private int pages;
    
    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        TextBook textBook1 = new TextBook();

        book1.setTittle("The War of Art");
        book1.setPages(181);

        System.out.println("Tittle of book is: "+book1.getTittle());

        textBook1.setTittle("Lying by statistics");
        textBook1.setPages(315);
        textBook1.setGradeLevel(14);

        System.out.println("\nTittle of textbook1 is: "+textBook1.getTittle());
        System.out.println("Pages of textbook1 is: "+textBook1.getPages());
        System.out.println("Grade of textbook1 is: "+textBook1.getGradeLevel());

    }
}

class TextBook extends Book{
    private int gradeLevel;

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
}
 