import java.util.*;
public class reverse_number {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter an original number : ");
        int number = sc.nextInt();
        while(number>0){
            int lastdigit = number%10;
            System.out.print(lastdigit);
            number/=10;
        }
    }
}
