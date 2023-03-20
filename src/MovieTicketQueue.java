import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class MovieTicketQueue {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập tên khách hàng chờ mua vé xem phim\n" +
                    "2. Khách tiếp theo\n" +
                    "3. Thoát");
            System.out.println("****************************************************************");
            System.out.print("Mời chọn chức năng (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhập tên khách hàng: ");
                    String Name = scanner.nextLine();
                    customerQueue.add(Name);
                    System.out.println("__Khách hàng: '" + Name + "' đã được thêm __");
                    break;
                case 2:
                    if (customerQueue.isEmpty()) {
                        System.err.println("__Hàng đợi mua vé xem phim hiện tại đang trống__");
                    } else {
                        String nextCustomer = customerQueue.poll();
                        System.out.println("__Khách hàng tiếp theo mua vé xem phim là: " + nextCustomer);
                    }
                    break;
                case 3:
                    System.out.println("Bạn đã kết thúc chương trình !");
                    break;
                default:
                    System.err.println("Chức năng không hợp lệ, vui lòng chọn lại (1-3).");
                    break;
            }
        }
        scanner.close();
    }
}