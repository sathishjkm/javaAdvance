package ExceptionHandling;

public class ExceptionHandlingEx1 {
    public static void main(String args[]) {
        try {
            int[] num = {1, 2, 3, 4, 5, 6};
            System.out.println(num[2]);
            System.out.println(num[7]);
            System.out.println(num[5]);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("helo world");
    }
}
