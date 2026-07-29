import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int LastDigit = n %10;
        if(LastDigit<0){
            System.out.print(-LastDigit);
        }else{
        System.out.print(LastDigit);
        }
    }
}