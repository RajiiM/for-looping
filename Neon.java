//
NEON NUMBER:
    9
    Square of given number = 9*9=81
    8+1=9
    given number = sum of digits (digits – square of given number)
//

public class Neon {
 
    public static void main(String[] args) {
  
        int no = 9;
        int square = no * no;
        int sum = 0;
                 
        while(square > 0)
        {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }
         
        if (sum==no)
        {
            System.out.println("9 is neon number");
        }
        else
        {
            System.out.println("9 is not neon number");
        }
    }
}

//-------------------

public class Neon {
 
    public static void main(String[] args) {
  
        int no = 9;
        int sum = 0;
                 
        for(int square = no * no; square > 0;square = square / 10)
        {
            int digit = square % 10;
            sum = sum + digit;
        }
         
        if (sum==no)
        {
            System.out.println("9 is neon number");
        }
        else
        {
            System.out.println("9 is not neon number");
        }
    }
}

//----------------

//OUTPUT
9 is neon number