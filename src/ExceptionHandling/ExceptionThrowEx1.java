package ExceptionHandling;

public class ExceptionThrowEx1 {
    public static void main(String[] args)throws Exception{
        try {
            int mariageDate =18;
            if(mariageDate>=21){
                throw new  Exception("girl eligible mariage");
            }
            else {
                System.out.println("girls not eligible mariage");
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}


