/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anfri
 */
public class MainClass 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        MenuItem[] menuItems = new MenuItem[] {
            new MenuItem("Würstel mit Sauerkraut", 5.00),
            new MenuItem("Francesinha", 10.00),
            new MenuItem("Rosty tower double", 7.50),            
            new MenuItem("Pizza", 3.50),
            new MenuItem("Bacon burger", 5.00),           
            new MenuItem("Bun cha", 8.00),
            new MenuItem("French fries", 2.50),
            new MenuItem("Water", 1.50),
            new MenuItem("Diet coke", 2.50)
        };
        List<IObserver> observers = new ArrayList<IObserver>();
        observers.add(new Chef());
        observers.add(new Cashier());
        
        Order order = startNewOrder(observers);
        
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("International restaurant of Design Patterns");
            System.out.println("-------------------------------------------");
            
            for (int i = 0; i < menuItems.length; i++)              // print the menu for choosing
                System.out.println("[" + i + "] " + menuItems[i].getName() + " (€ " + menuItems[i].getPrice()  + ")");
                
                
            System.out.println("[P] Place order");
            System.out.println("\nPlease enter a choice");
            
            String choice = scanner.next();                         // take the input from the user
            int intChoice;
            try
            {
                intChoice = Integer.parseInt(choice);
                order.addItem(menuItems[intChoice]);
                System.out.println("Current order:");
                for (MenuItem item : order.getItems())
                    System.out.println("\t" + item.getName() + " (€ " + item.getPrice() + ")");
                System.out.println("Subtotal: " + order.getTotalAmount());
            }
            catch (NumberFormatException e)
            {
                if (choice.equals("P"))
                {
                    order.placeOrder();
                    order = startNewOrder(observers);
                }
                else
                {
                    System.out.println("Please enter a valid choice.");
                }                 
            }
        }
    }
    
    public static Order startNewOrder(List<IObserver> observers)
    {
        Order newOrder = new Order();
        for (IObserver obs : observers)
            newOrder.addObserver(obs);
        return newOrder;
    }
}
