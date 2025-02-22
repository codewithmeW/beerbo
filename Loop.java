public class Loop {
    public static void main (String []args){
        System.out.println("This is before loop");
        int x=1;
        while(x<5){
            System.out.println("This is inner loop");
            x=x+1;
            System.out.println("The value of x after eatch loop is :"+x);
        }
        System.out.println("This is after loop");


    }
    
}
