import java.util.Scanner;
class Pallindrome{  
    public static void main(String args[]){  
     int r,count=0,number;    
    // int n=454;//It is the number variable to be checked for palindrome  
     Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
     number=n;    
     while(n>0){    
      r=n%10;  //getting remainder  
      count=(count*10)+r;    
      n=n/10;    
     }    
     if(number==count)    
      System.out.println("palindrome number ");    
     else    
      System.out.println("not palindrome");    
   }  
   }  