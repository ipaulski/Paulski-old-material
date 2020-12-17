//Izabella Paulski
public class MyIntegerDriver
{
    public static void main(String[] args){
        MyInteger a = new MyInteger(100);
        System.out.println("The number is " + a.getValue());
        System.out.println("Even? "+ a.isEven());
        System.out.println("Odd? "+ a.isOdd());
        System.out.println("Prime? "+ a.isPrime());
        System.out.println("Equal? "+ a.equals(100));
        System.out.println("Equal? "+ a.equals(180));

        MyInteger b = new MyInteger(0);
        System.out.println("The number is " + b.getValue());
        System.out.println("Even? "+ b.isEven());
        System.out.println("Odd? "+ b.isOdd());
        System.out.println("Prime? "+ b.isPrime());

        MyInteger c = new MyInteger(13);
        System.out.println("The number is " + c.getValue());
        System.out.println("Even? " + c.isEven());
        System.out.println("Odd? " + c.isOdd());
        System.out.println("Prime? " + c.isPrime());

        System.out.println("Even? " + MyInteger.isEven(10));
        System.out.println("Odd? "+ MyInteger.isOdd(10));
        System.out.println("Prime? " + MyInteger.isPrime(10));

        MyInteger d = new MyInteger(0);
        System.out.println("The number is " + d.getValue());
        System.out.println("Even? " + MyInteger.isEven(d));
        System.out.println("Odd? " + MyInteger.isOdd(d));
        System.out.println("Prime? " + MyInteger.isPrime(d));

        System.out.println(MyInteger.parseInt("100"));
        System.out.println(MyInteger.parseInt("abc100d"));

        System.out.println(MyInteger.parseInt(new char[]{'1','2','3'}));
        System.out.println(MyInteger.parseInt(new char[]{'1','a','3'}));
    }
}
