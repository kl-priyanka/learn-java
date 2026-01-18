public class Literals {
    public static void main(String[] args){
        int a = 0b101; //binary 5
        int b = 0x7E; //hexa 126
        System.out.println(a);
        System.out.println(b);

        int amount = 10_00_000;
        System.out.println(amount);

        double exponent = 11e15;
        System.out.println(exponent);

        char c = 'a';
        System.out.println(c);
        c++;
        System.out.println(c);

        //all these values after '=' are called literals
    }
}
