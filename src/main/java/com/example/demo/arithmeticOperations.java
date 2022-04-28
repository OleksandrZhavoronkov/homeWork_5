package com.example.demo;

public class arithmeticOperations {
    //initializing variable a with type of data int and assigning a value 10
    public static int a = 10;
    //initializing variable b with type of data int and assigning a value 12
    public static int b = 12;
    //initializing variable c with type of data int and assigning a value 5
    public static int c = 5;
    //initializing variable d with type of data int and assigning a value 6
    public static int d = 6;
    //initializing variable d1 with type of data int and assigning a value 7
    public static int d1 = 7;
    //initializing variable d2 with type of data int and assigning a value 8
    public static int d2 = 8;
    //initializing variable d3 with type of data int and assigning a value 9
    public static int d3 = 9;
    //initializing variable d4 with type of data int and assigning a value 10
    public static int d4 = 10;
    //initializing variable e with type of data float and assigning a value 6.99
    public static float e = 6.99f;
    //initializing variable x with type of data double and assigning a value 28.5
    public static double x = 28.5;
    //initializing variable z with type of data double and assigning a value 11.5
    public static double z = 11.5;
    //initializing variable ffx  with type of data double and assigning a value 11.533
    public static double ffz = 11.533;
    //initializing variable ffx  with type of data double and assigning a value 11.532
    public static double ffx = 11.532;

    //Sum examples
    //initializing variable f with type of data int and assigning a value - sum of variables a and b
    public static int f = a + b;
    //initializing variable g with type of data int and assigning a value - sum of digit 4 and variable b
    public static int g = 4 + b;
    //initializing variable h with type of data int and assigning a value - sum of variables a and digit 4
    public static int h = a + 4;
    //initializing variable q with type of data int and assigning a value - sum of variables a, b, and c
    public static int q = a + b + c;
    //initializing variable p with type of data int and assigning a value - sum of variables d, a, b, and digit 1
    public static int p = d + a + b + 1;
    //initializing variable r with type of data float and assigning a value - sum of variables e, e, and digit -1
    public static float r = e + e + (- 1);

    //Numbers` subtraction
    //initializing variable ff with type of data int and assigning a value - subtraction of variables a and b
    public static int ff = a - b;
    //initializing variable gg with type of data int and assigning a value - subtraction of digit 4 and variable b
    public static int gg = 4 - b;
    //initializing variable hh with type of data int and assigning a value - subtraction of variables a and digit 4
    public static int hh = a - 4;
    //initializing variable qq with type of data int and assigning a value - subtraction of variables a, b, and c
    public static int qq = a - b - c;
    //initializing variable pp with type of data int and assigning a value - subtraction of variables d, a, b, and digit 1
    public static int pp = d - a - b - 1;
    //initializing variable rr with type of data float and assigning a value - subtraction of variables e, e, and digit 1
    public static float rr = e - e - 1;

    //Numbers` multiplication
    //initializing variable fff with type of data int and assigning a value - multiplication of variables a and b
    public static int fff = a * b;
    //initializing variable ggg with type of data int and assigning a value - multiplication of digit 4 and variable b
    public static int ggg = 4 * b;
    //initializing variable hhh with type of data int and assigning a value - multiplication of variables a and digit 4
    public static int hhh = a * 4;
    //initializing variable qqq with type of data int and assigning a value - multiplication of variables a, b, and c
    public static int qqq = a * b * c;
    //initializing variable ppp with type of data int and assigning a value - multiplication of variables d, a, b
    public static int ppp = d * a * b;
    //initializing variable rrr with type of data float and assigning a value - multiplication of variables e, e, and digit -1
    public static float rrr = e * e * -1;

    //Numbers` division
    //initializing variable fff with type of data int and assigning a value - division of variables a and b
    public static int ffff = a / b;
    //initializing variable ggg with type of data int and assigning a value - division of digit 4 and variable b
    public static int gggg = 4 / b;
    //initializing variable hhh with type of data int and assigning a value - division of variables a and digit 4
    public static int hhhh = a / 4;
    //initializing variable qqq with type of data int and assigning a value - division of variables a, b, and c
    public static int qqqq = a / b / c;
    //initializing variable ppp with type of data int and assigning a value - division of variables d, a, b
    public static int pppp = d / a / b;
    //initializing variable rrr with type of data float and assigning a value - division of variables e, e, and digit -1
    public static float rrrr = e / e / (-1);
    //initializing variable xx with type of data double and assigning a value - division of variables x and z
    public static double xx = x / z;
    //initializing variable kk with type of data double and assigning a value - division of variables x and d
    public static double kk = x / d;

    //remainder of dividing two numbers
    //initializing variable xxx  with type of data int and assigning a value 36
    public static int xxx = 36;
    //initializing variable zzz with type of data int and assigning a value 7
    public static int zzz = 7;
    //initializing variable xxxzzz with type of data int and assigning a value - remainder of dividing two numbers xxx and zzz
    public static int xxxzzz = xxx % zzz;

    //initializing variable prefinc with type of data int and assigning a value - prefix increment
    public static int prefinc = ++d1;

    //initializing variable sufinc with type of data int and assigning a value - postfix increment
    public static int sufinc = d2++;

    //initializing variable prefdec with type of data int and assigning a value - prefix decrement
    public static int prefdec = --d3;

    //initializing variable sufdec with type of data int and assigning a value - postfix decrement
    public static int sufdec = d4--;

    //Priority of arithmetic operations
    //initializing variable prio with type of data int and assigning a value - sum calculations on digits and variables
    public static int prio = a + b + c + d1--;
    //initializing variable prio1 with type of data int and assigning a value - sum calculations on digits and variables
    public static int prio1 = (a + b) * c + d1--;

    //Operations with floating point numbers
    //initializing variable flopoinum with type of data double and assigning a value - subtraction of variables ffx and ffz
    public static double flopoinum = ffx - ffz;

    public static void main(String[] args) {
        //Displaying calculated results
        //initial fields
        System.out.println("The 1st initial field is - " + a);
        System.out.println("The 2nd initial field is - " + b);
        System.out.println("The 3rd initial field is - " + c);
        System.out.println("The 4th initial field is - " + d);
        System.out.println("The 5th initial field is - " + e);
        //Displaying sum
        System.out.println("The sum of variables a and b where a is " + a + " and b is " + b + " the sum is " + f);
        System.out.println("The sum of digit 4 and variable b where b is " + b + " the sum is " + g);
        System.out.println("The sum of variables a and digit 4 where a is " + a + " the sum is " + h);
        System.out.println("The sum of variables a, b, and c where a is " + a + " ,b is " + b + " ,and c is " + c + " the sum is "+ q);
        System.out.println("The sum of variables d, a, b, and digit 1 where d is "+ d + ", a is " + a + ", and b is " + b + " the sum is " + p);
        System.out.println("The sum of variables e, e, and digit -1 where e is " + e + " the sum is " + r);
        //Displaying subtraction
        System.out.println("The subtraction of variables a and b where a is " + a + " and b is " + b + " the subtraction is " + ff);
        System.out.println("The subtraction of digit 4 and variable b where b is " + b + " the subtraction is " + gg);
        System.out.println("The subtraction of variables a and digit 4 where a is " + a + " the subtraction is " + hh);
        System.out.println("The subtraction of variables a, b, and c where a is " + a + ", b is " + b + ", and c is " + c + " the subtraction is "+ qq);
        System.out.println("The subtraction of variables d, a, b, and digit 1 where d is "+ d + ", a is " + a + ", and b is " + b + " the subtraction is " + pp);
        System.out.println("The subtraction of variables e, e, and digit -1 where e is " + e + " the subtraction is " + rr);
        //Displaying multiplication
        System.out.println("The multiplication of variables a and b where a is " + a + " and b is " + b + " the multiplication is " + fff);
        System.out.println("The multiplication of digit 4 and variable b where b is " + b + " the multiplication is " + ggg);
        System.out.println("The multiplication of variables a and digit 4 where a is " + a + " the multiplication is " + hhh);
        System.out.println("The multiplication of variables a, b, and c where a is " + a + " ,b is " + b + ", and c is " + c + " the multiplication is "+ qqq);
        System.out.println("The multiplication of variables d, a, b, and digit 1 where d is "+ d + ", a is " + a + ", and b is " + b + " the multiplication is " + ppp);
        System.out.println("The multiplication of variables e, e, and digit -1 where e is " + e + " the multiplication is " + rrr);
        //Displaying division
        System.out.println("The division of variables a and b where a is " + a + " and b is " + b + " the division is " + ffff);
        System.out.println("The division of digit 4 and variable b where b is " + b + " the division is " + gggg);
        System.out.println("The division of variables a and digit 4 where a is " + a + " the division is " + hhhh);
        System.out.println("The division of variables a, b, and c where a is " + a + ", b is " + b + " ,and c is " + c + " the division is "+ qqqq);
        System.out.println("The division of variables d, a, b, and digit 1 where d is "+ d + ", a is " + a + ", and b is " + b + " the division is " + pppp);
        System.out.println("The division of variables e, e, and digit -1 where e is " + e + " the division is " + rrrr);
        System.out.println("The division of variables x and z where x is " + x + " and z is " + z + " the division is " + xx);
        System.out.println("The division of variables x and d where x is " + x + " and d is " + d + " the division is " + kk);
        //Displaying remainder of dividing two numbers
        System.out.println("The division of variables xxx and zzz where xxx is " + xxx + " and zzz is " + zzz + " the remainder of dividing is " + xxxzzz);
        //prefix increment displaying
        System.out.println("The prefix increment from starting digit 7, new values is " + d1 + " The prefix increment is " + prefinc);
        //postfix increment displaying
        System.out.println("The postfix increment from starting digit 8, new values is " + d2 + " The postfix increment is " + sufinc);
        //prefix decrement displaying
        System.out.println("The prefix decrement from starting digit 9, new values is " + d3 + " The prefix decrement is " + prefdec);
        //postfix decrement displaying
        System.out.println("The postfix decrement from starting digit 10, new values is " + d4 + " The postfix decrement is " + sufdec);
        //Priority of arithmetic operations displaying
        System.out.println("Calculations of the example a + b + c + d1-- where a is " + a + ", b is " + b + ", c is " + c + ", and d-- is " + d1 + " is equal to " + prio);
        System.out.println("Calculations of the example a + b + c + d1-- where a is " + a + ", b is " + b + ", c is " + c + ", and d-- is " + d1 + " is equal to " + prio1);
        //Operations with floating point numbers displaying
        System.out.println("Calculations of the example " + ffx + " and " + ffz + " is equal to"  + flopoinum);
    }
}