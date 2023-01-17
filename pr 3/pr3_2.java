import java.util.Scanner;

class pr
{
    public static void main(String[] args) {
 
        String s1[]={"75","83","43","32","33","24"};
        String s2[]={"75","83","43","32","33","24"};
        int sum;
        int size=s1.length;

        System.out.print("Fist Array =   ");
        for (String i : s1)  
        {
            System.out.print(" "+i);    
        }

        System.out.println("  ");
        System.out.print("Second Array = ");
        for (String i : s2)
        {
            System.out.print(" "+i);    
        }

        System.out.println();
        System.out.println("Sum =");
        for (int i = 0; i <= size; i++) {

            sum = Integer.parseInt(s1[i]) + Integer.parseInt(s2[i]);
            System.out.println(" "+sum);
        }

  
        
    }
}