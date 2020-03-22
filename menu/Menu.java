package learnoop2.bai2.manager_book.menu;

import java.util.Scanner;

import learnoop2.bai2.manager_book.model_and_controller.Author;
import learnoop2.bai2.manager_book.model_and_controller.Book;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameBook, butDanhAuthor;
        int publicationDate;
        String nameAuthor, homeTown;
        int age, bornDay;
        int choi;
        do {
            System.out.println("1. Nhập thông tin sách");
            System.out.println("2. Hiển thị tất cả sách ra màn hình");
            System.out.println("3. Nhập thông tin tác giả");
            System.out.println("4. Tìm kiếm tất cả sách được viết bởi tác giả");
            System.out.println("5. Thoát");
            System.out.println("Enter choice : ");

            choi = scanner.nextInt();
            scanner.nextLine();
            
            
                switch (choi) {
                case 1:

                    System.out.println("Enter name book : ");

                    nameBook = scanner.nextLine();
                    System.out.println("Enter publication Date : ");
                    publicationDate = scanner.nextInt();
                    System.out.println("Enter but danh : ");
                    scanner.nextLine();
                    butDanhAuthor = scanner.nextLine();
                    if (!Author.checkButDanh(butDanhAuthor)) {
                        System.out.println("More indentity of author book ");
                        System.out.println("____________________________");
                        System.out.println("Enter NAME author : ");
                        nameAuthor = scanner.nextLine();
                        System.out.println("Enter age author : ");
                        age = scanner.nextInt();
                        System.out.println("Enter born day :");
                        bornDay = scanner.nextInt();
                        System.out.println("Enter que quan :");
                        scanner.nextLine();
                        homeTown = scanner.nextLine();
                        System.out.println("______________________________");
                        Author author = new Author(nameAuthor, age, bornDay, butDanhAuthor, homeTown);
                        Author.add(author);
                        
                        System.out.println("nhap thanh cong");
                        break;
                    } else {
                        System.out.println("nhap thanh cong");
                        Book book = new Book(nameBook, publicationDate, butDanhAuthor);
                        Book.add(book);
                        break;
                    }
                case 2:
                    if (Book.checkListBook()) {
                        Book.showInfoBook();
                        break;
                    } else
                        System.out.println("List book empty");

                case 3:
                    System.out.println("____________________________");
                    System.out.println("Enter NAME author : ");
                    nameAuthor = scanner.nextLine();
                    System.out.println("Enter age author : ");
                    age = scanner.nextInt();
                    System.out.println("Enter born day :");
                    bornDay = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter but danh author :");
                    butDanhAuthor = scanner.nextLine();
                    System.out.println("Enter que quan :");
                    homeTown = scanner.nextLine();
                    System.out.println("______________________________");
                    Author author = new Author(nameAuthor, age, bornDay, butDanhAuthor, homeTown);
                    Author.add(author);
                   
                    System.out.println("Enter success");
                    break;
                case 4:
                    String pen;
                    System.out.println("Enter but danh author need find : ");
                    pen = scanner.nextLine();
                    if (Book.checkPen(pen)) {
                        Book.showInfoBook(pen);
                        break;
                    } else {
                        System.out.println("Not find in list book");
                        break;
                    }
                case 5:
                    System.out.println("Thank kiu !");
                    break;
                default:
                    System.out.println("loi roi");
            
            }
            
        } while (choi != 5);
        scanner.close();
    }
}