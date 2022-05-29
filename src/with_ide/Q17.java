package with_ide;

public class Q17 {
    int a = 10+10;

}
class xx extends Q17{
    int b = a+ 10;
}
class oxx extends xx{
    public static void main(String[] args) {
        oxx y= new oxx();
        System.out.println(y.a);
        System.out.println(y.b);
    }
}