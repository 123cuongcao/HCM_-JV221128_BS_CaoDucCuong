package ra.run;

import ra.bussinessImp.Book;

import java.util.*;
import java.util.stream.Collectors;

public class BookManagement {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Book> listBook = new ArrayList<>();
        int choice ;
        do {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                    "1. Nhập số sách và nhập thông tin sách \n" +
                    "2. Hiển thị thông tin các sách \n" +
                    "3. Sắp xếp sách theo lợi nhuận giảm dần \n" +
                    "4. Xóa sách theo mã sách \n" +
                    "5. Tìm kiếm sách theo tên sách \n" +
                    "6. Thay đổi trạng thái của sách theo mã sách \n" +
                    "7. Thoát");
            System.out.println("Hãy nhập lựa chọn của bạn");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    System.out.println("Hãy nhập số lượng sách cần thêm ");
                    int n= Integer.parseInt(sc.nextLine());
                    for (int i = 0; i<n ; i++){
                        Book book = new Book();
                        book.inputData();
                        listBook.add(book);
                    }
                    break;

                case 2:
                    System.out.println("Tất cả thông tin của sách");
                    listBook.forEach(Book::displayData);
                    break;
                case 3:
                    System.out.println("Danh sách sản phầm đã giảm dần theo lợi nhuận");
                    listBook.sort(Comparator.comparing(Book::getInterest).reversed());
                    break;
                case 4:
                    System.out.println("Hãy nhập mã sách cần xóa");
                    int want = Integer.parseInt(sc.nextLine());
                    List<Book> wantDelete = listBook.stream().filter(a->a.getBookId()==want).toList();
                    listBook.remove(wantDelete.get(0));
                    break;
                case 5:
                    System.out.println("Hãy nhập tên sách :");
                    String wantBook = sc.nextLine();
                    listBook.stream().filter(a-> a.getBookName().equals(wantBook)).forEach(Book::displayData);
                    break;
                case 6:
                    System.out.println("Hãy nhập mã sách cần thay đổi trạng thái:");
                    int wantIdBook = Integer.parseInt(sc.nextLine());
                    listBook.stream().filter(a-> a.getBookId() == wantIdBook).forEach(a->a.setBookStatus(!a.isBookStatus()));
                    break;
                case 7:
                default:
                    sc.close();
                    System.exit(0);
            }
        }while(choice!=7);
    }
}
