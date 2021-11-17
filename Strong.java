//
STRONG NUMBER
    145
    1! + 4! + 5! = 145
//

public class Strong {
 
    public static void main(String[] args) {
 
        int no = 145;
        int temp_no = no;
        int modulus = 0;
        int fact = 1;
        int sum = 0;
 
        while (no > 0) 
        {
            modulus = no % 10;
 
            while (modulus > 0) 
            {
                fact = fact * modulus;
                modulus--;
            }
 
            sum = sum + fact;
            fact = 1;
            no = no / 10;
        }
         
        if (temp_no == sum) 
        {
            System.out.println("145 is a Strong Number");
        } 
        else
        {
            System.out.println("145 is not a Strong Number");
        }
    }
}

//--------------

public class Strong {
 
    public static void main(String[] args) {
 
        int no = 145;       
        int modulus = 0;
        int fact = 1;
        int sum = 0;
 
        for (int no1 = no; no1 > 0; no1 = no1 / 10) 
        {
            for (modulus = no1 % 10; modulus > 0; modulus--) 
            {
                fact = fact * modulus;              
            }
            sum = sum + fact;
            fact = 1;           
        }
         
        if (no == sum) 
        {
            System.out.println("145 is a Strong Number");
        } 
        else
        {
            System.out.println("145 is not a Strong Number");
        }
    }
}

//-------------------

//OUTPUT
145 is a Strong Number
