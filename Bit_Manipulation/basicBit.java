package Bit_Manipulation;

public class basicBit {
    public static void main(String[] args) {
//        System.out.println(91>>2);
//        System.out.println(11>>3);
//        System.out.println(91<<2);
//
//        byte x = 102 ,y=3;
//        System.out.println(x<<y);
//        System.out.println();
//
//        System.out.println(1<<12); // gives 2 ki power 12

        //swap two numbers
        int a =  6, b = 10;
        System.out.println( "Before swapping(1): a: "+a+" b:  "+ b );

//         Method-1(using extra variable)
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println( "After swapping(M-1): a: "+a+" b:  "+ b );

//        Method-2(using maths)
//         a = a+b;
//         b = a-b;
//         a = a-b;
//        System.out.println( "After swapping(M-2): a: "+a+" b:  "+ b );

//        Method -3 (Using zor[^] operator)
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
        System.out.println( "After swapping(M-3): a: "+a+" b:  "+ b );

    }
}
