package with_ide;

public class Q18 {
    String a="First";
    String b="Second";
}
class A extends Q18{
    String a1 = "First 1";
}
class AA extends A {
    public static void main(String[] args) {
        AA num2 = new AA();
        System.out.println(num2.a1);
        System.out.println(num2.a);
    }
}
class AAA extends A{
    public static void main(String[] args) {
        AAA num3= new AAA();
        System.out.println(num3.a1);
        System.out.println(num3.a);
    }
}
class B extends Q18{
    String b1="Second 1 ";
}
class BB extends B{
    public static void main(String[] args) {
        BB num5=new BB();
        System.out.println(num5.b1);
        System.out.println(num5.b);
    }

}
class BBB extends B{
    public static void main(String[] args) {
        BBB num6= new BBB();
        System.out.println(num6.b1);
        System.out.println(num6.b);
    }

}