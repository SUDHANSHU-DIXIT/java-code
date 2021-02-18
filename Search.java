import java.util.Scanner;
class Search
{
   public static void main(String args[])
   {
      int count, num, item, array[];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of elements:");
   num = sc.nextInt(); 
      array = new int[num]; 
    System.out.println("Enter " + num + " integers");
      for (count = 0; count < num; count++)
        array[count] = sc.nextInt();
      System.out.println("Enter the search value:");
      item = sc.nextInt();
      for (count = 0; count < num; count++)
      {
         if (array[count] == item) 
         {
           System.out.println(item+" is present at location "+(count+1));
           break;
         }
      }
      if (count == num)
        System.out.println(item + " doesn't exist.");
   }
}