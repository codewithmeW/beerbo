public class Operator {
    public static void main(String []args){
        int a= 10, b=12 ,c=15;
        boolean booleanResult1 = (c<b)&&(0<a)&&(0<b);
        boolean booleanResult2 = (a+b < b+c)|| (a+c >a+b);
        boolean booleanResult3 = !(a>c);
        System.out.println("addition is a + b :"+(a+b));
        System.out.println("submition c - a is :"+(c-a));
        System.out.println("multiplication is a * b :"+(a*b));
        System.out.println("divition a / b is :"+ (c/a));
        System.out.println("Modulas c % a :"+(c%a));
        System.out.println((a==b));
        System.out.println((a!=b));
        System.out.println((a>c));
        System.out.println((c>a));
        System.out.println((c>=b));
        System.out.println(booleanResult1);
        System.out.println(booleanResult2);
        System.out.println(booleanResult3);

    }
    
}
