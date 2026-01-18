public class Conversion {
    public static void main(String args[]){
        byte b = 127;
        int a = 256;

        System.out.println(b);
        System.out.println(a);

        //b = a; //this generates error - can't convert from int to byte

        a = b; //works because int is bigger than byte i.e. you can assign smaller datatype to a bigger datatype

        System.out.println(a);

        byte b1 = 55;
        int a1 = 5;

        System.out.println("a1 = "+a1);
        System.out.println("b1 = "+b1);
        
        //b1 = a1; //still doesn't work because compiler won't allow int to byte conversion

        a1 = b1; //allows byte to int conversion

        System.out.println("a1 = "+a1);
        System.out.println("b1 = "+b1);

    }
}
