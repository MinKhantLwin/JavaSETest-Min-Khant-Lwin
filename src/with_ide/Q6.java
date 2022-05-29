package with_ide;

public class Q6 {
    public static void main(String[] args) {
        String a = "Monday";
        switch (a){
             case "Tuesday":
                 System.out.println("wrong");
                break;
        }
        switch (a){
            case "Monday":
                System.out.println("Right");
                break;
        }
    }
}
