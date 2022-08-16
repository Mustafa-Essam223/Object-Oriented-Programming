package foodcatering_package;
import java.util.*;
public class FoodCatering {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);


        Customers[] customers = new Customers[6];
        customers[0] = new LoyaltyCustomer("john", 1515155);
        customers[1] = new LoyaltyCustomer("Mark", 2626262);
        customers[2] = new Guest("Sara", 151511);
        customers[3] = new Guest("michael", 15184895);

        //*********************************************************************
        Vector<Vector<Item>> arrays_of_foodItems = new Vector<>();
        Vector<Item> items0 = new Vector<>();
        items0.add(new Item("sxaklm", "appetizers", 15.5f));
        items0.add(new Item("hvsaklm", "drinks", 15.5f));
        Vector<Item> items1 = new Vector<>();
        items1.add(new Item("shklma", "main dishes", 25.5f));
        items1.add(new Item("ksacl", "deserts", 15.5f));
        arrays_of_foodItems.add(items1);
        arrays_of_foodItems.add(items0);

        //**********************************************************************
        Order[] orders = new Order[2];
        orders[0] = new Order(25, "obour city", 28, items0);
        orders[0].SET_Code(155);
        orders[0].meal = items0;


        orders[1] = new Order(252, "abasia", 25, items1);
        orders[1].SET_Code(555);
        orders[0].meal = items1;

        customers[0].setCustomer_order(orders[0]);
        customers[1].setCustomer_order(orders[0]);
        customers[2].setCustomer_order(orders[1]);
        customers[3].setCustomer_order(orders[1]);
        //***********************************************************************
        while (true) {
            System.out.println("[1] Create an Order ");
            System.out.println("[2] Cancel an Order ");
            System.out.println("[3] Update an Order ");
            System.out.println("[4] Create a meal and add it to watch list ");
            System.out.println("[5] Report quality issues ");
            System.out.println("[6] Display Customer Data ");
            int choice = input.nextInt();

            make_order order = make_order.getOrder(choice);
            make_order.getOrder(choice);
            order.Action(order, customers[2]);
            make_order.finish_order();
            if (choice == 4)
                ((Customers) customers[0]).Create_meal();
            if (choice == 5)
                ((Customers) customers[0]).Report();
            if (choice == 6) {
                for (int i = 0; i < 4; i++) {
                    if (i < 2)
                        ((Customers) customers[i]).Display(true);
                    else
                        ((Customers) customers[i]).Display(false);

                }
            }
            System.out.println("============================================================================");


        }


    }
}
/**
 * Class Order is used to group all data of orders
 */
 class Order {
    Vector<Item>meal ;
    int code ;
    int orderTime, deliveryTime;
    String address;
    public static int[] order_codes = new int[50];
    public static int contr =0 ;


    /**
     * @param orderTime    the order date created
     * @param address      the delivery address
     * @param deliveryTime the order date to be delivered
     */
    public Order(int orderTime, String address, int deliveryTime, Vector<Item>meal) {
        this.address = address;
        this.orderTime = orderTime;
        this.deliveryTime = deliveryTime;
        this.meal=new Vector<>() ;
        this.meal=meal ;

    }

    /**
     * @param time used as a new date when user wanna extend delivery date of an order
     */
    public void setNew_DeliveryTime(int time) {
        this.deliveryTime = time;
    }

    /**
     * @param newCode the new order code entered
     * @throws InvalidException throws an invalid exception if the new code had been entered to meet the uniqueness
     */
    public void SET_Code(int newCode) throws InvalidException {
        boolean found = false;
        for (int i = 0; i < contr; i++) {
            if (Order.order_codes[i] == newCode){
                found = true;
                break;
            }
        }
        if (found)
            throw new InvalidException("Repeated code");
        else {
            this.code = newCode;
            Order.order_codes[Order.contr]=newCode;
            Order.contr++;
        }
    }

}
/**
 * class item is used to group all data of each food item
 */
 class Item{
    String name ,category ;
    int num_of_calories;
    float price ,portion;
    /**
     * @param name is the name of item
     * @param category which are appetizers, deserts, main dishes, drinks.. etc
     * @param portion is the portion size
     */
    public Item(String name , String category ,float portion) {
        this.category = category;
        this.name = name;
        this.portion = portion;

        if (category.equals("appetizers")) {
            this.num_of_calories = 20;
            this.price = 50.0f;
        }
        if (category.equals("deserts")) {
            this.num_of_calories = 10;
            this.price = 25.0f;
        }
        if (category.equals("main dishes")) {
            this.num_of_calories = 100;
            this.price = 55.5f;
        }
        if (category.equals("drinks")) {
            this.num_of_calories = 5;
            this.price = 15.5f;
        }
    }

    /**
     *  Function Display is used to show all the data of each item
     */
    public void Display() {
        System.out.println("item name : " + this.name);
        System.out.println("item category" + this.category);
        System.out.println("Number of Calories = " + this.num_of_calories);
        System.out.println("item price = " + this.price);
        System.out.println("item portion =" + this.portion);
    }
}
/**
 * make order is SINGLETON STRUCTURE DESIGN PATTERN
 */
 class make_order {
    private final int order_number; // final data member
    private static make_order order; // static data member
    Scanner input = new Scanner(System.in);
    /**
     *
     * @param order_number the choice entered by the user
     */
    private make_order(int order_number) {
        this.order_number = order_number;
    }
    /**
     *
     * @param order_number the choice number entered by user
     * @return an object points to the the current order
     */
    public static make_order getOrder(int order_number) { // static method
        if (order == null) {
            order = new make_order(order_number);
        }
        return order;
    }
    //static method
    public static void finish_order() {
        order = null;
    }
    /**
     *
     * @param order1 the current object of user choice
     * @param customer the customer who are used by user choices
     * @throws Exception throws an exception if the order id was found before
     */
    public void Action(make_order order1, Customers customer) throws Exception {
        if (order1.order_number == 1) customer.Create_Order();
        if (order1.order_number == 2) customer.Cancel_Order();
        if (order1.order_number == 3) {
            System.out.println("Do you wanna extend date or add an item [1|2]");
            int c = input.nextInt();
            if (c == 1) {
                System.out.print("Enter the new date (number of day in the current month ) : ");
                int date = input.nextInt();
                customer.Update_Order(customer.Customer_order, date);
            } else if (c == 2) {
                System.out.println("Enter data of new  item --> ");
                System.out.print("Enter name of item :");
                String name = input.next();
                System.out.print("Enter Category of item : ");
                String cat = input.next();
                System.out.print("Enter portion of item : ");
                float port = input.nextFloat();
                customer.Update_Order(customer.Customer_order, new Item(name, cat, port));
            }
        }
    }
}// design pattern
 /**
 * Interface Functions is used to group functions that are used by the customers of the two types
 */
  interface Functions {
    /**
     * Create a meal is used for if the user wanna group his/her favourite collection
     */
    // Overriding method (Runtime Polymorphism)
    public abstract void Create_meal();
    /**
     * Report is the feedback from the user after finishing his/her time with the application
     */
    // Overriding method (Runtime Polymorphism)
    public abstract void Report();

} // Interfaces
/**
 * Class Customers responsible for collection customers data and implement their orders
 */
 abstract class Customers implements Functions {
    protected String name;
    protected int phone;
    protected float cost; // calculated data member
    protected Order Customer_order;
    protected Vector<Vector<Item>> meals;
    protected Vector<Item> wish_list;
    Scanner input = new Scanner(System.in);
    /**
     * @param order the Customer order
     */
    //final method
    public final void setCustomer_order(Order order) {
        this.Customer_order = order;
    }
    /**
     * Function Display is used to show all things related to all customers
     *
     * @param loyalty is a boolean variable used to differentiate between loyalty and gust customers
     */
    public void Display(boolean loyalty) {
        if (loyalty)
            System.out.println("Customer type : Loyalty");
        else System.out.println("Customer type : Guest");
        System.out.println("Customer name : " + name);
        System.out.println("Customer phone : " + phone);
        System.out.println("Customer wish list : ");
        for (int i = 0; i < wish_list.size(); i++) {
            System.out.println("Item " + i + "---------------------------------------------------");
            System.out.println("Item name :" + wish_list.elementAt(i).name);
            System.out.println("Item Number of Calories " + wish_list.elementAt(i).num_of_calories);
            System.out.println("Item price = " + wish_list.elementAt(i).price);
            System.out.println("Item Portion = " + wish_list.elementAt(i).portion);
            System.out.println("Item Category : " + wish_list.elementAt(i).category);
        }


        System.out.println("Customer meals : ");
        for (int i = 0; i < meals.size(); i++) {
            for (int ii = 0; ii < i; ii++) {
                System.out.println("Item " + ii + " of meal " + i + " name " + meals.elementAt(i).elementAt(ii));
            }
        }
        for (int ii = 0; ii < Customer_order.meal.size(); ii++) {
            System.out.println("Item " + ii + " name : " + Customer_order.meal.elementAt(ii).name);
            System.out.println("Item " + ii + " portion : " + Customer_order.meal.elementAt(ii).portion);

        }
        if (loyalty) {
            for (int i = 1; i < meals.size(); i++) {
                for (int ii = 0; ii < i; ii++) {
                    cost += meals.elementAt(i).elementAt(ii).price;
                }
                for (int ii = 0; ii < Customer_order.meal.size(); i++) {
                    for (int j = 0; j < Customer_order.meal.size(); j++)
                        cost += Customer_order.meal.elementAt(j).price;
                }
            }
        } else {
            for (int i = 0; i < meals.size(); i++) {
                for (int ii = 0; ii < i; ii++) {
                    cost += meals.elementAt(i).elementAt(ii).price;
                }
            }
            for (int ii = 0; ii < Customer_order.meal.size(); ii++) {
                for (int j = 0; j < Customer_order.meal.size(); j++)
                    cost += Customer_order.meal.elementAt(j).price;
            }
        }
        System.out.println("TOTAL COST : " + cost);


    }
    /**
     * @throws InvalidException to throw exception if the order code is repeated
     */
    public void Create_Order() throws InvalidException {

        System.out.print("Enter Order Date :");
        int date = input.nextInt();
        System.out.print("Enter Delivery address : ");
        String address = input.next();
        System.out.print("Enter Delivery Date");
        int final_date = input.nextInt();
        System.out.print("Enter Order Code :");
        int code = input.nextInt();


        Vector<Item> meal_items = new Vector<>();
        System.out.print("Enter Category of item :");
        String cat = input.next();
        System.out.print("Enter item name : ");
        String name = input.next();
        System.out.print("Enter item portion : ");
        float port = input.nextFloat();
        Item item = new Item(name, cat, port);
        meal_items.add(item);
        cost += item.price;
        Customer_order = new Order(date, address, final_date, meal_items);
        Customer_order.SET_Code(code);
        meals.add(meal_items);
    }
    /**
     * used to cancel the order by the user if and only if there is at least 24 hours before the delivery date
     *
     * @throws InvalidException if the user wanna cancel the order and there is less than 24 hour to delivery date
     */
    public void Cancel_Order() throws InvalidException {
        if (Customer_order.deliveryTime > 24) {
            this.Customer_order = null;
            System.out.println("Canceled");
        } else {
            throw new InvalidException("Cannot canceled after at least or equal to 24 hour");
        }
    }
    /**
     * @param order the order which are updated by the user
     * @param date  if the user wanna extend the date of the order
     */
    //Overloading method (Compile time polymorphism)
    public void Update_Order(Order order, int date) {
        order.setNew_DeliveryTime(date);

    }
    /**
     * @param order   the order which are updated by the user
     * @param newItem if the user wanna add a new item to his order
     */
    //Overloading method (Compile time polymorphism)
    public void Update_Order(Order order, Item newItem) {
        order.meal.add(newItem);

    }
} //abstract class
/**
 * Class LoyaltyCustomer is a type of Customers
 */
 class LoyaltyCustomer extends Customers implements  Functions {
    /**
     *
     * @param name the name of the customer
     * @param phone the phone of the customer
     */
    public LoyaltyCustomer(String name,int phone) {
        super.name = name;
        super.phone = phone;
        meals = new Vector<>();
        wish_list = new Vector<>();
        Vector<Item> free_items = new Vector<>();
        free_items.add(new Item("APPET1", "appetizers", 15.5f));
        free_items.add(new Item("APPET2", "appetizers", 25.5f));
        free_items.add(new Item("DRINK", "drinks", 15.5f));
        meals.add(free_items);
        cost=0.0f ;
    }
    Scanner input = new Scanner(System.in);

    /**
     * Create meal is used if the user wanna group some categories
     */
    @Override
    public void Create_meal() {
        System.out.print("How many appetizers do you want :");
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter name of appetizer :");
            String name = input.next();
            //String name , String category, float price ,float portion) {
            System.out.print("Enter Portion of appetizer :");
            float por = input.nextFloat();
            Item item1 = new Item(name, "appetizers", por);
            wish_list.add(item1);
        }
        System.out.print("How many deserts do you want :");
        a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter name of desert :");
            String name = input.next();
            System.out.print("Enter Portion of dessert :");
            float por = input.nextFloat();
            Item item1 = new Item(name, "deserts", por);
            wish_list.add(item1);
        }
        System.out.print("How many main dishes do you want :");
        a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter name of dish :");
            String name = input.next();
            System.out.print("Enter Portion of dish :");
            float por = input.nextFloat();
            Item item1 = new Item(name, "main dishes", por);
            wish_list.add(item1);
        }
        System.out.print("How many drinks do you want :");
        a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter name of drink :");
            String name = input.next();
            System.out.print("Enter Portion of drink :");
            float por = input.nextFloat();
            Item item1 = new Item(name, "drinks", por);
            wish_list.add(item1);
        }
    }
    /**
     * Report or review by the user about the system
     */
    @Override
    public void Report() {
        System.out.println("Do you like our System [y|n]");
        char c = input.next().charAt(0);
        System.out.println("Thanks for your opinion , hope to see you again");
    }


} //Inheritance tree
/**
 * Class Guest is a type of Customers
 */
 class Guest extends Customers implements  Functions {
    Scanner input = new Scanner(System.in);

    /**
     * @param name  the name of the customer
     * @param phone the phone of the customer
     */
    public Guest(String name,int phone) {
        super.name = name;
        super.phone = phone;
        meals = new Vector<>();
        wish_list = new Vector<>();
        cost = 0.0f;
    }

    /**
     * Create meal is used if the user wanna group some categories
     */
    @Override
    public void Create_meal() {
        System.out.print("How many appetizers do you want :");
        int a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter name of appetizer :");
            String name = input.next();
            //String name , String category, float price ,float portion) {
            System.out.print("Enter Portion of appetizer :");
            float por = input.nextFloat();
            Item item1 = new Item(name, "appetizers", por);
            wish_list.add(item1);
        }
        System.out.print("How many deserts do you want :");
        a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter name of desert :");
            String name = input.next();
            System.out.print("Enter Portion of dessert :");
            float por = input.nextFloat();
            Item item1 = new Item(name, "deserts", por);
            wish_list.add(item1);
        }
        System.out.print("How many main dishes do you want :");
        a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter name of dish :");
            String name = input.next();
            System.out.print("Enter Portion of dish :");
            float por = input.nextFloat();
            Item item1 = new Item(name, "main dishes", por);
            wish_list.add(item1);
        }
        System.out.print("How many drinks do you want :");
        a = input.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter name of drink :");
            String name = input.next();
            System.out.print("Enter Portion of drink :");
            float por = input.nextFloat();
            Item item1 = new Item(name, "drinks", por);
            wish_list.add(item1);
        }
    }
    /**
     * Report or review by the user about the system
     */
    @Override
    public void Report() {
        System.out.println("Do you like our System [y|n]");
        char c = input.next().charAt(0);
        System.out.println("Thanks for your opinion , hope to see you again");
    }

} //Inheritance tree
 class InvalidException extends Exception {
    public InvalidException(String msg) { super(msg); }
}// User defined exceptions




