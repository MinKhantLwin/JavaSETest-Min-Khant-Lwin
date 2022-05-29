package with_ide;

public class Q3 {
    public static void main(String[] args) {
        int x[] = {7, 74, 784, 634, 64, 78};
        int y = x[0];
        for (int i=1;i<5;i++)
        {
            if(y<x[i])
            {
                y=x[i];
            }
        }
        System.out.println(y);
    }
}
