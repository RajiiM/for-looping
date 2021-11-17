//
PERFECT NUMBER
    28
    28 can divided by 1, 2, 4, 7, 14, 28. ( we don’t take given number as divisor).
    28 divisor : 1, 2, 4, 7, 14.
    Add the divisor : 1 + 2 + 4 + 7 + 14 =>28
    given number = sum of divisor for given number ===> perfect number
    28 is perfect number
//

public class Perfect {
 
    public static void main(String[] args) 
    {
        int no1 = 28;
        int temp_no1 = no1;
        int divisor = 1;
        int sum_divisor = 0;
 
        while (divisor <= temp_no1 / 2) 
// divisor must be placed between given number's half value.
        {
            if (temp_no1 % divisor == 0) 
            {
                sum_divisor = sum_divisor + divisor;
            }
            divisor = divisor + 1;
        }
         
        if (no1 == sum_divisor) 
        {
            System.out.println("28 is perfect number");
        } 
        else 
        {
            System.out.println("28 is not perfect number");
        }
    }
}

//--------------------

public class Perfect {
 
    public static void main(String[] args) {
        int no1 = 28;
        int temp_no1 = no1;
        int divisor = 1;
        int sum_divisor = 0;
 
        for (divisor = 1; divisor <= temp_no1 / 2; divisor = divisor + 1)
        // divisor must be placed between given number's half value.
        {
            if (temp_no1 % divisor == 0) 
            {
                sum_divisor = sum_divisor + divisor;
            }
 
        }
 
        if (no1 == sum_divisor) 
        {
            System.out.println("28 is perfect number");
        } 
        else 
        {
            System.out.println("28 is not perfect number");
        }
    }
}

//------------------------------------

//Output:
28 is perfect number