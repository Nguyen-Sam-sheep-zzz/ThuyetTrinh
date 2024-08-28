package Abstract;

import java.util.Scanner;

public class CalculatorCustomer {

    public static void main(String[] args) {
        // vì ví dụ mẫu chạy trên NetBeans IDE nên em đã sửa nó để nó chạy theo Intellij

        Shape objShape; // Khai báo đối tượng Shape
        String shape; // Biến để lưu trữ loại hình
        float value; // Biến để lưu trữ giá trị (ví dụ: bán kính hoặc chiều rộng)

        // Tạo đối tượng Scanner để nhận đầu vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập loại hình
        System.out.print("Enter the shape (circle or rectangle): ");
        shape = scanner.nextLine().toLowerCase(); // Đọc loại hình từ bàn phím và chuyển thành chữ thường

        // Yêu cầu người dùng nhập giá trị
        System.out.print("Enter the value (radius for circle or width for rectangle): ");
        value = scanner.nextFloat(); // Đọc giá trị từ bàn phím

        // Sử dụng switch-case để chọn loại hình và thực hiện tính toán
        switch (shape) {
            case "circle":
                objShape = new Circle();
                objShape.calculate(value);
                break;

            case "rectangle":
                objShape = new Rectangle();
                objShape.calculate(value);
                break;

            default:
                // Thông báo lỗi nếu người dùng nhập loại hình không hợp lệ
                System.out.println("Invalid shape entered. Please enter 'circle' or 'rectangle'.");
                break;
        }

        // Đóng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}
