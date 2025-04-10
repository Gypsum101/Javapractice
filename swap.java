public class swap {
    public static void main (String [] args)
    {
        /*5 ways of swaping two numbers */
        int a = 5;
        int b = 3;
        System.out.println("Orginal value of a & b :"+a+" & "+b);
        /*1. third variable
        int c = a;
        a = b;
        b = c; 
        */
        /* 2. + and -
        a = a + b;
        b = a - b;
        a = a - b;
        */
        /* 3. multiply and divison
        a = a * b;
        b = a / b;
        a = a / b;
         */
        /*4.Xor
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
         */
        /* 5.Single statment
        b = a+b - (a=b);
         */
       
        System.out.println("swapped value of a & b :"+a+" & "+b); 
    }
}