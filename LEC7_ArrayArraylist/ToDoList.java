    package LEC7_ArrayArraylist;

import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> chores = new ArrayList<>();

        while (true) {
            System.out.println("Chon hanh dong:");
            System.out.println("1: Them task");
            System.out.println("2: Xem tat ca task");
            System.out.println("3: Xoa task");
            System.out.println("4: Thoat");

            int n = s.nextInt();
            s.nextLine();

            switch (n) {
                case 1:
                    System.out.print("Them 1 task: ");
                    String task = s.nextLine();
                    chores.add(task);
                    break;
                case 2:
                    if (chores.isEmpty()) {
                        System.out.println("Danh sach task trong!!");
                    } else {
                        System.out.println("Danh sach task:");
                        for (int i = 0; i < chores.size(); i++) {
                            System.out.println((i + 1) + ". " + chores.get(i));
                        }
                    }
                    break;
                case 3:
                    if (chores.isEmpty()) {
                        System.out.println("Danh sach task trong!!");
                    } else {
                        System.out.println("Danh sach task:");
                        for (int i = 0; i < chores.size(); i++) {
                            System.out.println((i + 1) + ". " + chores.get(i));
                        }
                        System.out.print("Nhap thu tu task muon xoa: ");
                        int index = s.nextInt() - 1;
                        if (index >= 0 && index < chores.size()) {
                            chores.remove(index);
                            System.out.println("Xoa task thanh cong!");
                        } else {
                            System.out.println("So task khong hop le!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh!");
                    return;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}