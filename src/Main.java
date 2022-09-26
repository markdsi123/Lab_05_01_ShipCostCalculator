public class Main {
    public static void main(String[] args)
    {
        double price;
        price = 84;
        double total = price * 0.02;

        System.out.println("enter the price of the item - " + price);


        System.out.println();

        if (price>=100)
            System.out.println("your shipping cost is free");


        if (price<100)
            System.out.println("You have a tax of - " + total);








    }
}