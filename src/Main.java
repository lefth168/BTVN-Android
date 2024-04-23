import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        // Khởi tạo 10 nhân viên
        employeeList.add(new Employee(1, "John Doe", 30, "IT", "JD001", 50000));
        employeeList.add(new Employee(2, "Alice Smith", 28, "HR", "AS002", 45000));
        // Thêm các nhân viên khác tương tự

        // Hiển thị danh sách 10 nhân viên
        System.out.println("Danh sách 10 nhân viên:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm nhân viên mới");
            System.out.println("3. Xóa nhân viên");
            System.out.println("0. Thoát");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Hiển thị danh sách nhân viên
                    System.out.println("Danh sách nhân viên:");
                    for (Employee employee : employeeList) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    // Thêm nhân viên mới
                    System.out.print("Nhập thông tin nhân viên mới:\nID: ");
                    int newId = scanner.nextInt();
                    System.out.print("Tên: ");
                    String newName = scanner.next();
                    System.out.print("Tuổi: ");
                    int newAge = scanner.nextInt();
                    System.out.print("Phòng ban: ");
                    String newDepartment = scanner.next();
                    System.out.print("Mã nhân viên: ");
                    String newCode = scanner.next();
                    System.out.print("Lương cơ bản: ");
                    double newSalaryRate = scanner.nextDouble();

                    employeeList.add(new Employee(newId, newName, newAge, newDepartment, newCode, newSalaryRate));
                    System.out.println("Nhân viên mới đã được thêm vào danh sách.");
                    break;
                case 3:
                    // Xóa nhân viên
                    System.out.print("Nhập ID của nhân viên cần xóa: ");
                    int idToDelete = scanner.nextInt();
                    boolean removed = false;
                    for (Employee employee : employeeList) {
                        if (employee.getId() == idToDelete) {
                            employeeList.remove(employee);
                            removed = true;
                            break;
                        }
                    }
                    if (removed) {
                        System.out.println("Nhân viên có ID " + idToDelete + " đã được xóa khỏi danh sách.");
                    } else {
                        System.out.println("Không tìm thấy nhân viên có ID " + idToDelete);
                    }
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
