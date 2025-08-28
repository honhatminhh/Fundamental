package LEC7_ArrayArraylist;

import java.util.*;

public class ConvertArrayArraylist {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap lua chon cua ban (1:arrayToArrayList, 2:arrayListToArray): ");
            int n = s.nextInt();
            s.nextLine(); // đọc hết dòng nhập

            switch (n) {
                case 1:
                    System.out.print("Nhap so luong phan tu: ");
                    int size = s.nextInt();
                    s.nextLine(); // đọc hết dòng nhập
                    String[] arr = new String[size];
                    for (int i = 0; i < size; i++) {
                        System.out.print("Nhap chuoi ki tu #" + (i + 1) + ": ");
                        arr[i] = s.nextLine();
                    }
                    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
                    System.out.println("ArrayList: " + arrayList);
                    break;
                case 2:
                    ArrayList<String> list = new ArrayList<>();
                    System.out.print("Nhap so luong phan tu: ");
                    int listSize = s.nextInt();
                    s.nextLine(); // đọc hết dòng nhập
                    for (int i = 0; i < listSize; i++) {
                        System.out.print("Nhap chuoi ki tu #" + (i + 1) + ": ");
                        list.add(s.nextLine());
                    }
                    String[] array = list.toArray(new String[0]);
                    System.out.println("Array: " + Arrays.toString(array));
                    break;
                default: 
                    System.out.println("Da chay xong chuong trinh!!");
                    return;
            }
        }
    }
}
