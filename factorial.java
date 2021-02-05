import java.util.Scanner;
class factorial76

{
  public static void main(String args[])
  {
    int n, c; 
    long f = 1;
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
   for (c = 1; c <= n; c++)
        f = f*c;
      System.out.println("Factorial of "+n+" is = "+f);
    
  }
}