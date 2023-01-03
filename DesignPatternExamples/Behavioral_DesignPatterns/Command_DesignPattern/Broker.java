package Behavioral_DesignPatterns.Command_DesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders=new ArrayList<>() ;
    public void addOrder(Order new_order)
    {
        orders.add(new_order) ;
    }
    public void placeOrder()
    {
        for (Order order:orders)
        {
            order.Execute();
        }
        orders.clear();
    }

}
