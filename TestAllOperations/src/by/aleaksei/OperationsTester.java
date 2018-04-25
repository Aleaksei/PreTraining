package by.aleaksei;

/**
 * This Class tests all operations on all primitives
 */
public class OperationsTester {

    public static void testByte(){

        byte a = 6, b = 4, c;

        //arithmetic operations
        System.out.print("\n***** arithmetic operations *****\n");

        //add
        c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);

        //subtraction
        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);

        //multiplication
        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        //division
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        //c = a/0; or c = a%0; --> ArithmeticException
        //no explicit arithmetic operation

        //bitwise operation
        System.out.print("\n***** bitwise operation *****\n");

        //bitwise and
        c = (byte) (a & b);
        System.out.printf("\n%d & %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise or
        c = (byte) (a | b);
        System.out.printf("\n%d | %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise exclusive or
        c = (byte) (a ^ b);
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise unary compliment
        c = (byte) ~a;
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        //shifts
        //left
        c = (byte) (a << 2);
        System.out.printf("\n%d << 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (byte) (-a << 2);
        System.out.printf("\n%d << 2 = %d\n", -a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));

        //right
        c = (byte) (a >> 2);
        System.out.printf("\n%d >> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (byte) (-a >> 2);
        System.out.printf("\n%d >> 2 = %d\n", -a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));

        //zero fill right shifts
        a = 5;
        c = (byte) (a >>> 2);
        System.out.printf("\n%d >>> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = (byte) (a >>> 2);
        System.out.printf("\n%d >>> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        //no explicit bitwise operation

        //combined operations
        System.out.print("\n***** combined operations *****\n");
        byte z = c = 6; a= 3;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        c *= a;
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c /= 0; or c %= 0; --> ArithmeticException
        c = z;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        c = z;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        c = z;
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = z;
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        c = z;
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        c = z;
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        //relations operations
        System.out.print("\n***** relations operations *****\n");

        //greater then
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        //logical operations
        System.out.print("\n***** logical operations *****\n");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, ((a > b)&&(a > 0)));

        //logical bitwise AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, ((a > b)&(a > 0)));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, ((a > b)||(a > 0)));

        //logical bitwise OR
        System.out.printf("(%d > %d) | (%d > 0) --> %b\n", a, b, a, ((a > b)|(a > 0)));

        //logical XOR
        System.out.printf("(%d > %d) ^ (%d > 0) --> %b\n", a, b, a, ((a > b)^(a > 0)));

        //logical NOT
        System.out.printf("!(%d > %d) --> %b\n", a, b, !(a > b));

        //unary operation
        System.out.print("\n***** unary operation *****\n");
        c = 6;

        //unary plus
        System.out.printf("+%d = %d\n", c, +c);

        //unary minus
        System.out.printf("-%d = %d\n", c, -c);

        //increment
        System.out.printf("++%d = %d\n", c, ++c);
        System.out.printf("%d++ = %d\n", c, c++);

        //decrement
        System.out.printf("--%d = %d\n", c, --c);
        System.out.printf("%d-- = %d\n", c, c--);

        //other operators
        System.out.print("\n    ***** other operators *****\n");

        //ternary operator
        System.out.print("\n    ***** ternary operator *****\n");
        System.out.printf("    %d < %d ? %d : %d --> %d\n",a, b, a, b, (a < b? a : b) );

        System.out.print("\n    ***** type cast operator *****\n");
        short sh = 30000;
        char ch = '\u1002';
        int it = 30000000;
        long lg = 100000000000000000L;
        float fl = 6.1f;
        double db = 4.2;
        boolean bool = true;

        c = (byte) sh;
        System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);

        c = (byte) ch;
        System.out.printf("byte= char: c = (byte)'%c' --> c = %d\n", ch, c);

        c = (byte) it;
        System.out.printf("byte = int: c = (byte)%d --> c = %d\n", it, c);

        c = (byte) lg;
        System.out.printf("byte = long: c = (byte))%d --> c = %d\n", lg, c);

        c = (byte) fl;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", fl, c);

        c = (byte) db;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", db, c);

        //c = (byte) bool;
        System.out.printf("byte = bool: c = (byte)%b --> Compile error\n", bool);
    }

    public static void testShort(){
        short a = 9, b = 4, c;

        //arithmetic operations
        System.out.print("\n***** arithmetic operations *****\n");

        //add
        c = (short)(a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);

        //subtraction
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);

        //multiplication
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        //division
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        //c = a/0; or c = a%0; --> ArithmeticException
        //no explicit arithmetic operation

        //bitwise operation
        System.out.print("\n***** bitwise operation *****\n");

        //bitwise and
        c = (short) (a & b);
        System.out.printf("\n%d & %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise or
        c = (short) (a | b);
        System.out.printf("\n%d | %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise exclusive or
        c = (short) (a ^ b);
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise unary compliment
        c = (short) ~a;
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        //shifts
        //left
        c = (short) (a << 2);
        System.out.printf("\n%d << 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (short) (-a << 2);
        System.out.printf("\n%d << 2 = %d\n", -a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));

        //right
        c = (short) (a >> 2);
        System.out.printf("\n%d >> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (short) (-a >> 2);
        System.out.printf("\n%d >> 2 = %d\n", -a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));

        //zero fill right shifts
        a = 5;
        c = (short) (a >>> 2);
        System.out.printf("\n%d >>> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = (short) (a >>> 2);
        System.out.printf("\n%d >>> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        //no explicit bitwise operation

        //combined operations
        System.out.print("\n***** combined operations *****\n");
        short z = c = 6; a= 3;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        c *= a;
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c /= 0; or c %= 0; --> ArithmeticException
        c = z;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        c = z;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        c = z;
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = z;
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        c = z;
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        c = z;
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        //relations operations
        System.out.print("\n***** relations operations *****\n");

        //greater then
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        //logical operations
        System.out.print("\n***** logical operations *****\n");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, ((a > b)&&(a > 0)));

        //logical bitwise AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, ((a > b)&(a > 0)));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, ((a > b)||(a > 0)));

        //logical bitwise OR
        System.out.printf("(%d > %d) | (%d > 0) --> %b\n", a, b, a, ((a > b)|(a > 0)));

        //logical XOR
        System.out.printf("(%d > %d) ^ (%d > 0) --> %b\n", a, b, a, ((a > b)^(a > 0)));

        //logical NOT
        System.out.printf("!(%d > %d) --> %b\n", a, b, !(a > b));

        //unary operation
        System.out.print("\n***** unary operation *****\n");
        c = 6;

        //unary plus
        System.out.printf("+%d = %d\n", c, +c);

        //unary minus
        System.out.printf("-%d = %d\n", c, -c);

        //increment
        System.out.printf("++%d = %d\n", c, ++c);
        System.out.printf("%d++ = %d\n", c, c++);

        //decrement
        System.out.printf("--%d = %d\n", c, --c);
        System.out.printf("%d-- = %d\n", c, c--);

        //other operators
        System.out.print("\n***** other operators *****\n");

        //ternary operator
        System.out.print("\n    ***** ternary operator *****\n");
        System.out.printf("    %d < %d ? %d : %d --> %d\n",a, b, a, b, (a < b? a : b) );

        System.out.print("\n    ***** type cast operator *****\n");
        byte bt = 1;
        char ch = '\u1002';
        int it = 30000000;
        long lg = 100000000000000000L;
        float fl = 6.1f;
        double db = 4.2;
        boolean bool = true;

        c = bt;
        System.out.printf("short = byte: c = %d --> c = %d\n", bt, c);

        c = (short) ch;
        System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);

        c = (short) it;
        System.out.printf("short = int: c = (short)%d --> c = %d\n", it, c);

        c = (short) lg;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", lg, c);

        c = (short) fl;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", fl, c);

        c = (short) db;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", db, c);

        //c = (short) bool;
        System.out.printf("short = bool: c = (short)%b --> Compile error\n", bool);
    }

    public static void testInt(){
        int a = 9, b = 4, c;

        //arithmetic operations
        System.out.print("\n***** arithmetic operations *****\n");

        //add
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        //division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        //c = a/0; or c = a%0; --> ArithmeticException

        //bitwise operation
        System.out.print("\n***** bitwise operation *****\n");

        //bitwise and
        c = a & b;
        System.out.printf("\n%d & %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise or
        c = a | b;
        System.out.printf("\n%d | %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise exclusive or
        c = a ^ b;
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise unary compliment
        c = ~a;
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        //shifts
        //left
        c = a << 2;
        System.out.printf("\n%d << 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = -a << 2;
        System.out.printf("\n%d << 2 = %d\n", -a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));

        //right
        c = a >> 2;
        System.out.printf("\n%d >> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = -a >> 2;
        System.out.printf("\n%d >> 2 = %d\n", -a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));

        //zero fill right shifts
        a = 5;
        c = a >>> 2;
        System.out.printf("\n%d >>> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = -5;
        c = a >>> 2;
        System.out.printf("\n%d >>> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        //combined operations
        System.out.print("\n***** combined operations *****\n");
        int z = c = 6; a= 3;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        c *= a;
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c /= 0; or c %= 0; --> ArithmeticException
        c = z;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        c = z;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        c = z;
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = z;
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        c = z;
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        c = z;
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        //relations operations
        System.out.print("\n***** relations operations *****\n");

        //greater then
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        //logical operations
        System.out.print("\n***** logical operations *****\n");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, ((a > b)&&(a > 0)));

        //logical bitwise AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, ((a > b)&(a > 0)));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, ((a > b)||(a > 0)));

        //logical bitwise OR
        System.out.printf("(%d > %d) | (%d > 0) --> %b\n", a, b, a, ((a > b)|(a > 0)));

        //logical XOR
        System.out.printf("(%d > %d) ^ (%d > 0) --> %b\n", a, b, a, ((a > b)^(a > 0)));

        //logical NOT
        System.out.printf("!(%d > %d) --> %b\n", a, b, !(a > b));

        //unary operation
        System.out.print("\n***** unary operation *****\n");
        c = 6;

        //unary plus
        System.out.printf("+%d = %d\n", c, +c);

        //unary minus
        System.out.printf("-%d = %d\n", c, -c);

        //increment
        System.out.printf("++%d = %d\n", c, ++c);
        System.out.printf("%d++ = %d\n", c, c++);

        //decrement
        System.out.printf("--%d = %d\n", c, --c);
        System.out.printf("%d-- = %d\n", c, c--);

        //other operators
        System.out.print("\n***** other operators *****\n");

        //ternary operator
        System.out.print("\n    ***** ternary operator *****\n");
        System.out.printf("    %d < %d ? %d : %d --> %d\n",a, b, a, b, (a < b? a : b) );

        System.out.print("\n    ***** type cast operator *****\n");
        byte bt = 1;
        short sh = 30000;
        char ch = '\u1002';
        long lg = 100000000000000000L;
        float fl = 6.1f;
        double db = 4.2;
        boolean bool = true;

        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);

        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);

        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);

        c = (int) lg;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", lg, c);

        c = (int) fl;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", fl, c);

        c = (int) db;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", db, c);

        //c = (int) bool;
        System.out.printf("int = bool: c = (int)%b --> Compile error\n", bool);

    }

    public static void testLong(){

        long a = 9, b = 4, c;

        //arithmetic operations
        System.out.print("\n***** arithmetic operations *****\n");

        //add
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        //division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        //c = a/0; or c = a%0; --> ArithmeticException

        //bitwise operation
        System.out.print("\n***** bitwise operation *****\n");

        //bitwise and
        c = a & b;
        System.out.printf("\n%d & %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        //bitwise or
        c = a | b;
        System.out.printf("\n%d | %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        //bitwise exclusive or
        c = a ^ b;
        System.out.printf("\n%d ^ %d = %d\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        //bitwise unary compliment
        c = ~a;
        System.out.printf("\n~%d = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        //shifts
        //left
        c = a << 2;
        System.out.printf("\n%d << 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s << 2 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        c = -a << 2;
        System.out.printf("\n%d << 2 = %d\n", -a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s << 2 = %s\n", Long.toBinaryString(-a), Long.toBinaryString(c));

        //right
        c = a >> 2;
        System.out.printf("\n%d >> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >> 2 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        c = -a >> 2;
        System.out.printf("\n%d >> 2 = %d\n", -a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >> 2 = %s\n", Long.toBinaryString(-a), Long.toBinaryString(c));

        //zero fill right shifts
        a = 5;
        c = a >>> 2;
        System.out.printf("\n%d >>> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >>> 2 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        a = -5;
        c = a >>> 2;
        System.out.printf("\n%d >>> 2 = %d\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >>> 2 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        //combined operations
        System.out.print("\n***** combined operations *****\n");
        long z = c = 6; a= 3;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        c *= a;
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c /= 0; or c %= 0; --> ArithmeticException
        c = z;
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        c = z;
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        c = z;
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        c = z;
        System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
        c = z;
        System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
        c = z;
        System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

        //relations operations
        System.out.print("\n***** relations operations *****\n");

        //greater then
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        //greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        //less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        //less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        //equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        //not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        //logical operations
        System.out.print("\n***** logical operations *****\n");

        //logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, ((a > b)&&(a > 0)));

        //logical bitwise AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, ((a > b)&(a > 0)));

        //logical OR
        System.out.printf("(%d > %d) || (%d > 0) --> %b\n", a, b, a, ((a > b)||(a > 0)));

        //logical bitwise OR
        System.out.printf("(%d > %d) | (%d > 0) --> %b\n", a, b, a, ((a > b)|(a > 0)));

        //logical XOR
        System.out.printf("(%d > %d) ^ (%d > 0) --> %b\n", a, b, a, ((a > b)^(a > 0)));

        //logical NOT
        System.out.printf("!(%d > %d) --> %b\n", a, b, !(a > b));

        //unary operation
        System.out.print("\n***** unary operation *****\n");
        c = 6;

        //unary plus
        System.out.printf("+%d = %d\n", c, +c);

        //unary minus
        System.out.printf("-%d = %d\n", c, -c);

        //increment
        System.out.printf("++%d = %d\n", c, ++c);
        System.out.printf("%d++ = %d\n", c, c++);

        //decrement
        System.out.printf("--%d = %d\n", c, --c);
        System.out.printf("%d-- = %d\n", c, c--);

        //other operators
        System.out.print("\n***** other operators *****\n");

        //ternary operator
        System.out.print("\n    ***** ternary operator *****\n");
        System.out.printf("    %d < %d ? %d : %d --> %d\n",a, b, a, b, (a < b? a : b) );

        System.out.print("\n    ***** type cast operator *****\n");
        byte bt = 1;
        short sh = 30000;
        char ch = '\u1002';
        int it = 3000000;
        float fl = 6.1f;
        double db = 4.2;
        boolean bool = true;

        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);

        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);

        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);

        c = it;
        System.out.printf("long = int: c = %d --> c = %d\n", it, c);

        c = (long) fl;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", fl, c);

        c = (long) db;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", db, c);

        //c = (long) bool;
        System.out.printf("long = bool: c = (long)%b --> Compile error\n", bool);
    }

    public static void testFloat(){
        float a = 9.3f, b = 4.4f, c;

        //arithmetic operations
        System.out.print("\n***** arithmetic operations *****\n");

        //add
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        //division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        //division on Zero
        c = a/0;
        System.out.printf("%f / 0 = %f\n", a, c);

        //modulus on Zero
        c = a%0;
        System.out.printf("%f %% 0 = %f\n", a, c);

        //bitwise operation
        System.out.print("\n***** bitwise operation *****\n");

        //bitwise and
        //c = a & b;

        //bitwise or
        //c = a | b;

        //bitwise exclusive or
        //c = a ^ b;

        //bitwise unary compliment
        //c = ~a;

        //shifts
        //left
        //c = a << 2;
        //c = -a << 2;

        //right
        //c = a >> 2;
        //c = -a >> 2;

        //zero fill right shifts
        //c = a >>> 2;
        //c = a >>> 2;
        System.out.print("\nnot exist bitwise operation \n");

        //combined operations
        System.out.print("\n***** combined operations *****\n");
        float z = c = 6.3f; a= 3.7f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        c *= a;
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
        c = z;
        System.out.printf("%f /= 0 --> c = %f\n", c, c /= a);
        c = z;
        System.out.printf("%f %%= 0 --> c = %f\n", c, c %= a);

        /* not exist following operations

        System.out.printf("%f &= %f --> c = %f\n", c, a, c &= a);
        System.out.printf("%f |= %f --> c = %f\n", c, a, c |= a);
        System.out.printf("%f ^= %f --> c = %f\n", c, a, c ^= a);
        System.out.printf("%f <<= %f --> c = %f\n", c, a, c <<= a);
        System.out.printf("%f >>= %f --> c = %f\n", c, a, c >>= a);
        System.out.printf("%f >>>= %f --> c = %f\n", c, a, c >>>= a);
        */
        System.out.print("\nnot exist following operations : &= , |=, ^=, <<, >>, >>>\n");

        //relations operations
        System.out.print("\n***** relations operations *****\n");

        //greater then
        System.out.printf("%f > %f --> %b\n", a, b, a > b);

        //greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);

        //less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);

        //less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);

        //equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);

        //not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        //logical operations
        System.out.print("\n***** logical operations *****\n");

        //logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, ((a > b)&&(a > 0)));

        //logical bitwise AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, ((a > b)&(a > 0)));

        //logical OR
        System.out.printf("(%f > %f) || (%f > 0) --> %b\n", a, b, a, ((a > b)||(a > 0)));

        //logical bitwise OR
        System.out.printf("(%f > %f) | (%f > 0) --> %b\n", a, b, a, ((a > b)|(a > 0)));

        //logical XOR
        System.out.printf("(%f > %f) ^ (%f > 0) --> %b\n", a, b, a, ((a > b)^(a > 0)));

        //logical NOT
        System.out.printf("!(%f > %f) --> %b\n", a, b, !(a > b));

        //unary operation
        System.out.print("\n***** unary operation *****\n");
        c = 6.7f;

        //unary plus
        System.out.printf("+%f = %f\n", c, +c);

        //unary minus
        System.out.printf("-%f = %f\n", c, -c);

        //increment
        System.out.printf("++%f = %f\n", c, ++c);
        System.out.printf("%f++ = %f\n", c, c++);

        //decrement
        System.out.printf("--%f = %f\n", c, --c);
        System.out.printf("%f-- = %f\n", c, c--);

        //other operators
        System.out.print("\n***** other operators *****\n");

        //ternary operator
        System.out.print("\n    ***** ternary operator *****\n");
        System.out.printf("    %f < %f ? %f : %f --> %f\n",a, b, a, b, (a < b? a : b) );

        System.out.print("\n    ***** type cast operator *****\n");
        byte bt = 1;
        short sh = 30000;
        char ch = '\u1002';
        long lg = 100000000000000000L;
        int it = 30000000;
        double db = 4.2;
        boolean bool = true;

        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);

        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);

        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);

        c = lg;
        System.out.printf("int = long: c = %d --> c = %f\n", lg, c);

        c = it;
        System.out.printf("float = int: c = %d --> c = %f\n", it, c);

        c = (float) db;
        System.out.printf("float= double: c = (float)%f --> c = %f\n", db, c);

        //c = (float) bool;
        System.out.printf("float= bool: c = (float)%b --> Compile error\n", bool);
    }

    public static void testDouble(){

        double a = 9.3d, b = 4.4d, c;

        //arithmetic operations
        System.out.print("\n***** arithmetic operations *****\n");

        //add
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);

        //subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);

        //multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        //division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);

        //modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        //division on Zero
        c = a/0;
        System.out.printf("%f / 0 = %f\n", a, c);

        //modulus on Zero
        c = a%0;
        System.out.printf("%f %% 0 = %f\n", a, c);

        //bitwise operation
        System.out.print("\n***** bitwise operation *****\n");

        //bitwise and
        //c = a & b;

        //bitwise or
        //c = a | b;

        //bitwise exclusive or
        //c = a ^ b;

        //bitwise unary compliment
        //c = ~a;

        //shifts
        //left
        //c = a << 2;
        //c = -a << 2;

        //right
        //c = a >> 2;
        //c = -a >> 2;

        //zero fill right shifts
        //c = a >>> 2;
        //c = a >>> 2;
        System.out.print("\nnot exist bitwise operation \n");

        //combined operations
        System.out.print("\n***** combined operations *****\n");
        double z = c = 6.3d; a= 3.7d;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        c *= a;
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
        c = z;
        System.out.printf("%f /= 0 --> c = %f\n", c, c /= a);
        c = z;
        System.out.printf("%f %%= 0 --> c = %f\n", c, c %= a);

        /* not exist following operations

        System.out.printf("%f &= %f --> c = %f\n", c, a, c &= a);
        System.out.printf("%f |= %f --> c = %f\n", c, a, c |= a);
        System.out.printf("%f ^= %f --> c = %f\n", c, a, c ^= a);
        System.out.printf("%f <<= %f --> c = %f\n", c, a, c <<= a);
        System.out.printf("%f >>= %f --> c = %f\n", c, a, c >>= a);
        System.out.printf("%f >>>= %f --> c = %f\n", c, a, c >>>= a);
        */
        System.out.print("\nnot exist following operations : &= , |=, ^=, <<, >>, >>>\n");

        //relations operations
        System.out.print("\n***** relations operations *****\n");

        //greater then
        System.out.printf("%f > %f --> %b\n", a, b, a > b);

        //greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);

        //less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);

        //less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);

        //equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);

        //not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        //logical operations
        System.out.print("\n***** logical operations *****\n");

        //logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, ((a > b)&&(a > 0)));

        //logical bitwise AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, ((a > b)&(a > 0)));

        //logical OR
        System.out.printf("(%f > %f) || (%f > 0) --> %b\n", a, b, a, ((a > b)||(a > 0)));

        //logical bitwise OR
        System.out.printf("(%f > %f) | (%f > 0) --> %b\n", a, b, a, ((a > b)|(a > 0)));

        //logical XOR
        System.out.printf("(%f > %f) ^ (%f > 0) --> %b\n", a, b, a, ((a > b)^(a > 0)));

        //logical NOT
        System.out.printf("!(%f > %f) --> %b\n", a, b, !(a > b));

        //unary operation
        System.out.print("\n***** unary operation *****\n");
        c = 6.7d;

        //unary plus
        System.out.printf("+%f = %f\n", c, +c);

        //unary minus
        System.out.printf("-%f = %f\n", c, -c);

        //increment
        System.out.printf("++%f = %f\n", c, ++c);
        System.out.printf("%f++ = %f\n", c, c++);

        //decrement
        System.out.printf("--%f = %f\n", c, --c);
        System.out.printf("%f-- = %f\n", c, c--);

        //other operators
        System.out.print("\n***** other operators *****\n");

        //ternary operator
        System.out.print("\n    ***** ternary operator *****\n");
        System.out.printf("    %f < %f ? %f : %f --> %f\n",a, b, a, b, (a < b? a : b) );

        System.out.print("\n    ***** type cast operator *****\n");
        byte bt = 1;
        short sh = 30000;
        char ch = '\u1002';
        long lg = 100000000000000000L;
        int it = 30000000;
        float fl = 4.2f;
        boolean bool = true;

        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);

        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);

        c = ch;
        System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);

        c = lg;
        System.out.printf("double = long: c = %d --> c = %f\n", lg, c);

        c = it;
        System.out.printf("double = int: c = %d --> c = %f\n", it, c);

        c = fl;
        System.out.printf("double = double: c = %f --> c = %f\n", fl, c);

        //c = (double) bool;
        System.out.printf("double = bool: c = (double)%b --> Compile error\n", bool);
    }

    public static void testBoolean(){
        boolean a = true;
        boolean b = false;
        boolean c;

        //arithmetic operations
        System.out.print("\n***** arithmetic operations *****\n");

        //add
        //c = a + b;

        //subtraction
        //c = a - b;

        //multiplication
        //c = a * b;

        //division
        //c = a / b;

        //modulus
        //c = a % b;
        System.out.print("\nnot exist arithmetic operations \n");


        //bitwise operation
        System.out.print("\n***** bitwise operation *****\n");

        //bitwise and
        c = a & b;
        System.out.printf("\n%b & %b = %b\n", a, b, c);

        //bitwise or
        c = a | b;
        System.out.printf("\n%b | %b = %b\n", a, b, c);

        //bitwise exclusive or
        c = a ^ b;
        System.out.printf("\n%b ^ %b = %b\n", a, b, c);


        //bitwise unary compliment
        //c = ~a;
        //shifts
        //left
        //c = a << 2;
        //c = -a << 2;
        //right
       // c = a >> 2;
        //c = -a >> 2;
        //zero fill right shifts
        //a = true;
        //c = a >>> 2;
        //a = false;
        //c = a >>> 2;
        System.out.print("\nnot exist shifts operations");

        //combined operations
        System.out.print("\n***** combined operations *****\n");
        boolean z = c = true; a= false;
        /*
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        */
        System.out.print("\n not exist following operations: +=, -=, *=, /=, %=;");


        c = z;
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        c = z;
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        c = z;
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
        /*
        System.out.printf("%b <<= %b --> c = %b\n", c, a, c <<= a);
        System.out.printf("%b >>= %b --> c = %b\n", c, a, c >>= a);
        System.out.printf("%b >>>= %b --> c = %b\n", c, a, c >>>= a);
        */
        System.out.print("\n not exist following operations: <<, >>, >>>\n");

        //relations operations
        System.out.print("\n***** relations operations *****\n");

        //greater then
        //System.out.printf("%d > %d --> %b\n", a, b, a > b);

        //greater than or equal to
        //System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        //less than
        //System.out.printf("%d < %d --> %b\n", a, b, a < b);

        //less than or equal to
        //System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        System.out.print("\n not exist greater(less) operations\n");

        //equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);

        //not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);

        //logical operations
        System.out.print("\n***** logical operations *****\n");

        //logical AND
        System.out.printf("(%b == %b) && (%b != %b) --> %b\n", a, b, a,b, ((a == b)&&(a != b)));

        //logical bitwise AND
        System.out.printf("(%b == %b) & (%b != %b) --> %b\n", a, b, a,b, ((a == b)&(a != b)));

        //logical OR
        System.out.printf("(%b == %b) || (%b != %b) --> %b\n", a, b, a,b, ((a == b)||(a != b)));

        //logical bitwise OR
        System.out.printf("(%b == %b) | (%b != %b) --> %b\n", a, b, a,b, ((a == b)|(a != b)));

        //logical XOR
        System.out.printf("(%b == %b) ^ (%b != %b) --> %b\n", a, b, a,b, ((a == b)^(a != b)));

        //logical NOT
        System.out.printf("!(%b == %b) --> %b\n", a, b, !(a == b));

        //unary operation
        System.out.print("\n***** unary operation *****\n");
        c = true;

        //unary plus
        //System.out.printf("+%d = %d\n", c, +c);

        //unary minus
        //System.out.printf("-%d = %d\n", c, -c);

        //increment
        //System.out.printf("++%d = %d\n", c, ++c);
        //System.out.printf("%d++ = %d\n", c, c++);

        //decrement
        //System.out.printf("--%d = %d\n", c, --c);
        //System.out.printf("%d-- = %d\n", c, c--);
        System.out.print("\n not exist unary operations\n");


        //other operators
        System.out.print("\n***** other operators *****\n");

        //ternary operator
        System.out.print("\n    ***** ternary operator *****\n");
        System.out.printf("    %b < %b ? %b : %b --> %b\n",a, b, a, b, (a == b? a : b) );

        System.out.print("\n    ***** type cast operator *****\n");
        byte bt = 1;
        short sh = 30000;
        char ch = '\u1002';
        int it = 30000000;
        long lg = 100000000000000000L;
        float fl = 6.1f;
        double db = 4.2;

/*
        c = (boolean)bt;
        System.out.printf("boolean = byte: c = %d --> c = %b\n", bt, c);

        c = (boolean)sh;
        System.out.printf("boolean = short: c = %d --> c = %b\n", sh, c);

        c = (boolean)ch;
        System.out.printf("boolean = char: c = '%c' --> c = %b\n", ch, c);

        c = (boolean) it;
        System.out.printf("boolean = bool: c = (int)%b -->  c = %b\n", it, c);

        c = (boolean) lg;
        System.out.printf("boolean = long: c = (int)%d --> c = %b\n", lg, c);

        c = (boolean) fl;
        System.out.printf("boolean = float: c = (int)%f --> c = %b\n", fl, c);

        c = (boolean) db;
        System.out.printf("boolean = double: c = (int)%f --> c = %b\n", db, c);
*/
        System.out.print("boolean  type cannot be converted to any other type, and therefore any other type cannot be converted to a boolean  type");

    }

    public static void testChar(){

        char a = '9', b = '5', c;

        //arithmetic operations
        System.out.print("\n***** arithmetic operations *****\n");

        //add
        c = (char) (a + b);
        System.out.printf("'%c' + '%c' = '%c'\n", a, b, c);

        //subtraction
        c = (char) (a - b);
        System.out.printf("'%c' - '%c' = '%c'\n", a, b, c);

        //multiplication
        c = (char) (a * b);
        System.out.printf("'%c' * '%c' = '%c'\n", a, b, c);

        //division
        c = (char) (a / b);
        System.out.printf("'%c' / '%c' = '%c'\n", a, b, c);

        //modulus
        c = (char) (a % b);
        System.out.printf("'%c' %% '%c' = '%c'\n", a, b, c);

        //c = a/0; or c = a%0; --> ArithmeticException

        //bitwise operation
        System.out.print("\n***** bitwise operation *****\n");

        //bitwise and
        c = (char) (a & b);
        System.out.printf("\n'%c' & '%c' = '%c'\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise or
        c = (char) (a | b);
        System.out.printf("\n'%c' | '%c' = '%c'\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise exclusive or
        c = (char) (a ^ b);
        System.out.printf("\n'%c' ^ '%c' = '%c'\n", a, b, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise unary compliment
        c = (char) ~a;
        System.out.printf("\n~'%c' = '%c'\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        //shifts
        //left
        c = (char) (a << 2);
        System.out.printf("\n'%c' << 2 = '%c'\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (char) (-a << 2);
        System.out.printf("\n'%c' << 2 = '%c'\n", (char)-a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s << 2 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));

        //right
        c = (char) (a >> 2);
        System.out.printf("\n'%c' >> 2 = '%c'\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        c = (char) (-a >> 2);
        System.out.printf("\n'%c' >> 2 = '%c'\n", (char)-a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >> 2 = %s\n", Integer.toBinaryString(-a), Integer.toBinaryString(c));

        //zero fill right shifts
        a = (char) 5;
        c = (char) (a >>> 2);
        System.out.printf("\n'%c' >>> 2 = '%c'\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = (char) -5;
        c = (char) (a >>> 2);
        System.out.printf("\n'%c' >>> 2 = '%c'\n", a, c);
        System.out.printf("in binary form\n");
        System.out.printf("%s >>> 2 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        //combined operations
        System.out.print("\n***** combined operations *****\n");
        char z = c = '\u1002'; a= '\u1006';
        System.out.printf("'%c' += '%c' --> c = '%c'\n", c, a, c += a);
        System.out.printf("'%c' -= '%c' --> c = '%c'\n", c, a, c -= a);
        System.out.printf("'%c' *= '%c' --> c = '%c'\n", c, a, c *= a);
        System.out.printf("'%c' /= '%c' --> c = '%c'\n", c, a, c /= a);
        c *= a;
        System.out.printf("'%c' %%= '%c' --> c = '%c'\n", c, a, c %= a);
        // c /= 0; or c %= 0; --> ArithmeticException
        c = z;
        System.out.printf("'%c' &= '%c' --> c = '%c'\n", c, a, c &= a);
        c = z;
        System.out.printf("'%c' |= '%c' --> c = '%c'\n", c, a, c |= a);
        c = z;
        System.out.printf("'%c' ^= '%c' --> c = '%c'\n", c, a, c ^= a);
        c = z;
        System.out.printf("'%c' <<= '%c' --> c = '%c'\n", c, a, c <<= a);
        c = z;
        System.out.printf("'%c' >>= '%c' --> c = '%c'\n", c, a, c >>= a);
        c = z;
        System.out.printf("'%c' >>>= '%c' --> c = '%c'\n", c, a, c >>>= a);

        //relations operations
        System.out.print("\n***** relations operations *****\n");

        //greater then
        System.out.printf("'%c' > '%c' --> %b\n", a, b, a > b);

        //greater than or equal to
        System.out.printf("'%c' >= '%c' --> %b\n", a, b, a >= b);

        //less than
        System.out.printf("'%c' < '%c' --> %b\n", a, b, a < b);

        //less than or equal to
        System.out.printf("'%c' <= '%c' --> %b\n", a, b, a <= b);

        //equal to
        System.out.printf("'%c' == '%c' --> %b\n", a, b, a == b);

        //not equal to
        System.out.printf("'%c' != '%c' --> %b\n", a, b, a != b);

        //logical operations
        System.out.print("\n***** logical operations *****\n");

        //logical AND
        System.out.printf("('%c' > '%c') && ('%c' > 0) --> %b\n", a, b, a, ((a > b)&&(a > 0)));

        //logical bitwise AND
        System.out.printf("('%c' > '%c') & ('%c' > 0) --> %b\n", a, b, a, ((a > b)&(a > 0)));

        //logical OR
        System.out.printf("('%c' > '%c') || ('%c' > 0) --> %b\n", a, b, a, ((a > b)||(a > 0)));

        //logical bitwise OR
        System.out.printf("('%c' > '%c') | ('%c' > 0) --> %b\n", a, b, a, ((a > b)|(a > 0)));

        //logical XOR
        System.out.printf("('%c' > '%c') ^ ('%c' > 0) --> %b\n", a, b, a, ((a > b)^(a > 0)));

        //logical NOT
        System.out.printf("!('%c' > '%c') --> %b\n", a, b, !(a > b));

        //unary operation
        System.out.print("\n***** unary operation *****\n");
        c = '6';

        //unary plus
        System.out.printf("+'%c' = '%c'\n", c, +c);

        //unary minus
        System.out.printf("-'%c' = '%c'\n", c, (char)-c);

        c = '6';
        //increment
        System.out.printf("++'%c' = '%c'\n", c, ++c);
        System.out.printf("'%c'++ = '%c'\n", c, c++);

        c = '6';
        //decrement
        System.out.printf("--'%c' = '%c'\n", c, --c);
        System.out.printf("'%c'-- = '%c'\n", c, c--);

        //other operators
        System.out.print("\n***** other operators *****\n");

        //ternary operator
        System.out.print("\n    ***** ternary operator *****\n");
        System.out.printf("     '%c' < '%c' ? '%c' : '%c' --> '%c'\n",a, b, a, b, (a < b? a : b) );

        System.out.print("\n    ***** type cast operator *****\n");
        byte bt = 1;
        short sh = 30000;
        int it = 3000000;
        long lg = 100000000000000000L;
        float fl = 6.1f;
        double db = 4.2;
        boolean bool = true;

        c = (char) bt;
        System.out.printf("char = byte: c = (char)%d --> c = '%c'\n", bt, c);

        c = (char) sh;
        System.out.printf("char = short: c = (char)%d --> c = '%c'\n", sh, c);

        c = (char) it;
        System.out.printf("char = int: c = (char)%d --> c = '%c'\n", it, c);

        c = (char) lg;
        System.out.printf("char = long: c = (char)%d --> c = '%c'\n", lg, c);

        c = (char) fl;
        System.out.printf("char = float: c = (char)%f --> c = '%c'\n", fl, c);

        c = (char) db;
        System.out.printf("char = double: c = (char)%f --> c = '%c'\n", db, c);

        //c = (char) bool;
        System.out.printf("char = bool: c = (char)%b --> Compile error\n", bool);
    }
}
