import java.util.*;
class Book
{
 int bookid;
 String booktitle;
int no_of_pages;
int year_of_pub;
String author;
String publisher;
float price;
Book()
{}
void Accept(){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Book ID:\n");
bookid=s.nextInt();
System.out.println("Enter the book title:\n");
booktitle=s.next();
System.out.println("Enter the number of pages:\n");
no_of_pages=s.nextInt();
System.out.println("Enter the year of publishing:\n");
year_of_pub=s.nextInt();
System.out.println("Enter the author name:\n");
author=s.next();
System.out.println("Enter the publisher:\n");
publisher=s.next();
System.out.println("Enter the price:\n");
price=s.nextFloat();
}
void Display(){
System.out.println("Book ID:"+bookid+"\nBook Title"+booktitle+"\nNumber of pages:"+no_of_pages+"\nYear of Publishing:"+year_of_pub+"\nAuthor:"+author+"\nPublisher:"+publisher+"\nPrice:"+price);
}
}
class TestBook{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter the number of books:\n");
int n=in.nextInt();
Book b[]=new Book[n];
for(int i=0;i<n;i++){
b[i]=new Book();
System.out.println("Enter details of book "+(i+1));
b[i].Accept();
}
for(int i=0;i<n;i++)
{
System.out.println("Details of book "+(i+1));
b[i].Display();
}
String comauthor;
System.out.println("Enter the author name to be searched:\n");
comauthor=in.next();
for(int i=0;i<n;i++){
if(b[i].author==comauthor)
b[i].Display();
}
int expensive=0;
for(int i=0;i<n;i++){
if(b[i].price>expensive){
expensive=i;
}
}
System.out.println("Details of the most expensive book:\n");
b[expensive].Display();
int year2020=0;
for(int i=0;i<n;i++){
if(b[i].year_of_pub==2020)
year2020++;
}
System.out.println("Number of books published in the year 2020: "+year2020);
int min_pages=b[0].no_of_pages;
int min_pages_book=0;
for(int i=0;i<n;i++){
if(b[i].no_of_pages<min_pages){
min_pages=b[i].no_of_pages;
min_pages_book=i;
}
}
System.out.println("Minimum number of pages:"+min_pages+"\nDetails of the book:\n");
b[min_pages_book].Display();
}
}


