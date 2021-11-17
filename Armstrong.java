//
ARMSTRONG NUMBER

153 = 1*1*1 + 5*5*5 + 3*3*3  
153 have 3 digits. so multiple each digit for three times
153 = 1     + 125   + 27
153 = 153
153 is an Armstrong number.  
//

public class Armstrong {
 
    public static void main(String[] args) {
        int no1=153;
        int arm = 0;
         
        for (int no=no1; no > 0; no = no / 10) 
        {           
            int rem = no%10;
            arm = arm + (rem*rem*rem);
        }
        if(no1==arm)
        {
        System.out.println("This is armstrong number");
        }
        else
        {
        System.out.println("This is not armstrong number");
        }
    }
}

//OUTPUT
This is armstrong number