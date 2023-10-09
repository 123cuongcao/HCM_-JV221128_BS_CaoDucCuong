package ra.bussinessImp;

import ra.bussiness.IBook;

import java.util.Scanner;

public class Book implements IBook, Comparable<Book> {
    public static Scanner sc = new Scanner(System.in);
    @Override
    public void inputData() {
        System.out.println("hãy nhập mã sách: ");
        this.bookId = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập tên sách:  ");
        this.bookName = sc.nextLine();
        System.out.println("Hãy nhập tiêu đề sách: ");
        this.title = sc.nextLine();
        System.out.println("Hãy nhập số trang sách: ");
        this.numberOfPages = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập giá nhập của sách: ");
        this.importPrice = Float.parseFloat(sc.nextLine());
        System.out.println("Hãy nhập giá bán của sách: ");
        this.exportPrice = Float.parseFloat(sc.nextLine());
        System.out.println("Lợi nhuận của sách là"+(this.interest = this.exportPrice-this.importPrice));
        System.out.println("Hãy điền trạng thái của sách: ");
        this.bookStatus = Boolean.parseBoolean(sc.nextLine());


    }

    @Override
    public void displayData() {
        System.out.println(this);

    }
    @Override
    public int compareTo(Book o) {
        return (int)(this.interest-o.interest);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", interest=" + interest +
                ", bookStatus=" + (bookStatus?"Còn sach":"Hết sách") +
                '}';
    }

    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;



    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }



}
