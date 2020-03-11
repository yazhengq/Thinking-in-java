//: control/CommaOperator.java
package control; /* Added by Eclipse.py */


public class CommaOperator {
    public static void main(String[] args) {
        // i = 2 时 j先=12 后面 j=i*2=4
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
} /* Output:
i = 1 j = 11
i = 2 j = 4
i = 3 j = 6
i = 4 j = 8
*///:~
