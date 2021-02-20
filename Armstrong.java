import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {

        int  number, temp, count = 0;
        Scanner in = new Scanner(System.in);
       int n= in.nextInt();
        number = n;
        while (number != 0)
        {
            temp = number % 10;
            count = count + temp*temp*temp;
            number =number/ 10;
        }

        if(count == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}