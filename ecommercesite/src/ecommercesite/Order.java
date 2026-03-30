
package ecommercesite;

import java.util.Scanner;

public class Order {
    User user;
    Product product;
    CreditCard creditCard;
    
    public Order(User user, Product product, int quantity, CreditCard creditCard, String address){
        this.product = product;
        this.user = user;
        this.creditCard = creditCard;
        System.out.println("Do you want to complete ordering?");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if(answer.equalsIgnoreCase("YES")){
            user.productOrdering(product, quantity, creditCard, address);
            product.reduceStocks(user);
        }
        else{
            System.out.println("Your order has been cancelled.\n");
        }
    }
    
}