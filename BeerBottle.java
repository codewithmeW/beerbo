public class BeerBottle {
    public static void main(String[]args){
        int bottlenum = 20;
        String name = "Bottles";
        while(bottlenum > 0){
            if(bottlenum ==1){
                name="bottle";
            }
            System.out.println(bottlenum+""+name+"of beer");
            System.out.println("one bottle is down");
            bottlenum = bottlenum - 1;
            if(bottlenum >0){
                System.out.println(bottlenum+""+name+"of beer left");

            }
            else{
                System.out.println("No bottle are left");
            }
        }

    }
}
