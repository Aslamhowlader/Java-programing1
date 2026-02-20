
/*2. Write a Java program to create a class named Book that represents basic information about
 a book in a library. The class should have three attributes: title (String), author (String), and
yearPublished (int). Include a constructor to initialize these fields and a method called
displayInfo() that prints the book's details. In the main method, create at least two objects
of the Book class with different data and call the displayInfo() method for each to display
their information.*/

class Book
{

    String title;
     String  author;
     int yearPublished;.

     Book(String title,String author,int yearPublished)
     {
         this.title=title;
         this.author=author;
         this.yearPublished=yearPublished;
     }
     void displayInfo()
     {
         System.out.println(title);
         System.out.println(author);
         System.out.println(yearPublished);
     }
}

public class pronlem2 {
    public static void main(String[] args) {
        Book A=new Book("ASlam","wwwww",20003);
        A.displayInfo();
        Book B =new Book("xxxxx","fffff",200077);
        B.displayInfo();
    }
}
