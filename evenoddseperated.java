//All the even numbers are placed before all the odd numbers.
import java.util.Scanner;
class evenoddseperated
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int left = 0;
    int right = n - 1;
    while(left < right)
    {
        while(arr[left]%2 == 0 && left < right)
        {
            left++;
        }
     
        while(arr[right]%2 == 1 && left < right)    
        {
            right--;
        } 
        if(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
          for(int i=0;i<n;i++)
    	  System.out.printf("%d ", arr[i] );
    
    }
}