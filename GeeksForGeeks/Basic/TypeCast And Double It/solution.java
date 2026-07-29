import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        // TypeCast to int double it and print
        int value = Integer.parseInt(num);
        int Final = 2*value;
        
        System.out.print(Final);
    }
}