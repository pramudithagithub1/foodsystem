//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class FoodSystem {
    public static void main(String[] args) {
        String[] items = new String[10];
        double[] prices = new double[10];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("___Wellcome___\n1.View 2.Add 3.Exit\n Enter the number : ");
            int op = sc.nextInt();
            sc.nextLine();
            if (op == 1) {
                for(int i = 0; i < count; ++i) {
                    System.out.println(items[i] + ": $" + prices[i]);
                }
            } else if (op == 2 && count < 10) {
                System.out.print("Name: ");
                items[count] = sc.nextLine();
                System.out.print("Price: ");
                prices[count] = sc.nextDouble();
                ++count;
            } else if (op == 3) {
                return;
            }
        }
    }
}
