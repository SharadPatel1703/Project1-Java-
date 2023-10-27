public class MethodsCurrency {

    public void rupee(double amount){
        System.out.println("1 rupee in dollars is equal to" + "0.012$" );
        System.out.println("1 ruppe in euro is equal to " + "0.011€");
        System.out.println(amount+ " ruppes in dollar is " + amount*0.012 +"$");
        System.out.println(amount+ " ruppes in euros is " + amount*0.011 + "€");
    }
    public void Dollar(double amount){
        System.out.println("1 Dollar in ruppes is equal to" + "83.23INR" );
        System.out.println("1 Dollar in euro is equal to " + "0.95€");
        System.out.println(amount+ " Dollar in ruppes is " + amount*83.23 +"INR");
        System.out.println(amount+ " Dollar in euro is " + amount*0.95 + "€");
    }
    public void euro(double amount){
        System.out.println("1 euro in dollars is equal to" + "1.06$" );
        System.out.println("1 euro in ruppes is equal to " + "87.90INR");
        System.out.println(amount+ " euro in dollars is " + amount*1.06 +"$");
        System.out.println(amount+ " euro in ruppes is " + amount*87.90 + "INR");
    }

}

