package ExceptionHandling;

public class ExceptionHandlingEx2 {
    public static void main(String[] args) {
        int a=10,b=0;
        int c=0;
        try {
             c=a/b;
        }
        catch (Exception e){
            System.out.println("error handling");
        }
        System.out.println(c);
        System.out.println("hello world");
    }
}
