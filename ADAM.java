//
Adam Number:

    Consider a number = 12.
    Reverse of a number = 21.
    Square of a number (12) = 144.
    Square of Reverse of number (21) = 441.
    Square of 12 & the square of its reverse 21 are reverse of each other.
    Therefore 12 is an adam number.

STEPS:

    Initialize number(12)
    Find reverse of number(12->21)
    Find square of number(12*12->144)
    Find square of reversed number(21*21->441)
    Find reverse of squared number(144->441)
    Compare reverse of squared number = square of reversed number
        If true, adam number
        else, Not adam number
//

//EX 1:

public class ADAM {
    static int number1 = 12;
 
    public static void main(String[] args) 
    {
        ADAM obj = new ADAM();
         
        int number2 = obj.reverse(number1);
         
        int sqr_number_1 = number1 * number1;
        System.out.println("Square value of " + number1 + ": " + sqr_number_1);
         
        int sqr_number_2 = number2 * number2;
        System.out.println("Square value of " + number2 + ": " + sqr_number_2);
         
        int rev_sqr_number_1 = obj.reverse(sqr_number_1);
        obj.compare(sqr_number_2, rev_sqr_number_1);
 
    }
 
    public int reverse(int no) 
    {
        int rev_no = 0;
        for (int number = no; number > 0; number = number / 10) {
            int reminder = number % 10;
            rev_no = (rev_no * 10) + reminder;
        }
        System.out.println("Reverse value of " + no + ": " + rev_no);
        return rev_no;
    }
 
    public void compare(int a, int b) 
    {
        if (a == b) 
        {
            System.out.println(number1 + " is adam number");
        } else 
        {
            System.out.println(number1 + " is not adam number");
        }
    }
}

//--------------OUTPUT--------------
Reverse value of 12: 21
Square value of 12: 144
Square value of 21: 441
Reverse value of 144: 441
12 is adam number
-------------------------------------------//

//EX:2
public class ADAM {
    static int number = 15;
 
    public static void main(String[] args) 
    {
        ADAM obj = new ADAM();
 
        int sqr_number_1 = number * number;
 
        int got_no = obj.reverse(number);
        int sqr_number_2 = obj.square(got_no);
        int rev_sqr_number_2 = obj.reverse(sqr_number_2);
        obj.compare(sqr_number_1, rev_sqr_number_2);
 
    }
 
    public int square(int no) 
    {
        int sqr_number_2 = no * no;
        System.out.println("Square value of " + no + ": " + sqr_number_2);
        return sqr_number_2;
    }
 
    public int reverse(int no) 
    {
        int rev_no = 0;
        for (int number = no; number > 0; number = number / 10) {
            int reminder = number % 10;
            rev_no = (rev_no * 10) + reminder;
        }
        System.out.println("Reverse value of " + no + ": " + rev_no);
        return rev_no;
    }
 
    public void compare(int a, int b) 
    {
        if (a == b) 
        {
            System.out.println(number + " is adam number");
        } else 
        {
            System.out.println(number + " is not adam number");
        }
    }
}

//------------OUTPUT--------------
Reverse value of 15: 51
Square value of 51: 2601
Reverse value of 2601: 1062
15 is not adam number
---------------------------------//


//EX:3
public class ADAM {
    static int number1 = 103;
 
    public static void main(String[] args) 
    {
        ADAM obj = new ADAM();
         
        int number2 = obj.reverse(number1);
         
        int sqr_number_1 = number1 * number1;
        System.out.println("Square value of " + number1 + ": " + sqr_number_1);
         
        int sqr_number_2 = number2 * number2;
        System.out.println("Square value of " + number2 + ": " + sqr_number_2);
         
        int rev_sqr_number_1 = obj.reverse(sqr_number_1);
        obj.compare(sqr_number_2, rev_sqr_number_1);
 
    }
 
    public int reverse(int no) 
    {
        int rev_no = 0;
        for (int number = no; number > 0; number = number / 10) {
            int reminder = number % 10;
            rev_no = (rev_no * 10) + reminder;
        }
        System.out.println("Reverse value of " + no + ": " + rev_no);
        return rev_no;
    }
 
    public void compare(int a, int b) 
    {
        if (a == b) 
        {
            System.out.println(number1 + " is adam number");
        } else 
        {
            System.out.println(number1 + " is not adam number");
        }
    }
}

//-------------OUTPUT--------------
Reverse value of 103: 301
Square value of 103: 10609
Square value of 301: 90601
Reverse value of 10609: 90601
103 is adam number
---------------------------------------//


