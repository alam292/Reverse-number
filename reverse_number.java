import java.util.*;
public class reverse_given_number {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an original number : ");
        int number = sc.nextInt();
        int reverse = 0;
        while(number>0){
            int lastdigit = number%10;
            reverse = (reverse*10) + lastdigit;
            number /=10;
        }
        System.out.println(reverse);
    }
}
