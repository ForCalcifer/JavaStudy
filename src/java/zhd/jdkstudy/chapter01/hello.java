package zhd.jdkstudy.chapter01;

/**
 * @author Zhuanghongde
 * @email Zhuanghongde@gf.com.cn
 * @create 2018-05-15 15:17
 **/
public class hello {
    public static void main(String[] args){
        System.out.println("fuck hello");
        /*pringf() is a format API after JDK5*/
        System.out.printf("%d~%d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%d~%d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%d~%d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%d~%d%n", Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("%d~%d%n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("%d~%d%n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
        System.out.printf("%h~%h%n", Character.MIN_VALUE, Character.MAX_VALUE);

        System.out.println(10/3);
        /*for test*/
        int a, b, c;
        for (a=1; a<=9; a++){
            for (b=0; b<=9; b++){
                for(c=0; c<=9; c++){
                    if((Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3))==a*100+b*10+c)
                    { System.out.print(a*100+b*10+c + "\t");}
                }
            }
        }
    }
}
