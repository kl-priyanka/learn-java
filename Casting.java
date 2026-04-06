public class Casting {
    public static void main(String args[]){
        byte b = 127;
        int a = 256;

        System.out.println("b (byte) = "+b);
        System.out.println("a (int) = "+a);

        //casting is done to convert integer to byte

        b = (byte)a; //In binary, the value 256 is 1 00000000. A byte can only store the lowest 8 bits (00000000), which represents the decimal value 0.
        
        System.out.println("b (byte) = "+b);
        System.out.println("a (int) = "+a);
        
        

    }
}
