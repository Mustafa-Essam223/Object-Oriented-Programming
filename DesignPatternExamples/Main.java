import Behavioral_DesignPatterns.Interpreter_DesignPattern.AndExpression;
import Behavioral_DesignPatterns.Interpreter_DesignPattern.Expression;
import Behavioral_DesignPatterns.Interpreter_DesignPattern.OrExpression;
import Behavioral_DesignPatterns.Interpreter_DesignPattern.*;
import Behavioral_DesignPatterns.Iterator_DesignPattern.Iterator;
import Behavioral_DesignPatterns.Iterator_DesignPattern.NameRepository;

public class Main {
    public static void main(String[] args)
    {
        NameRepository nameRepository=new NameRepository();
        Iterator itt=nameRepository.getIterator();
        while (itt.hasNext()) { // next != null
            String name=(String) itt.next();
            System.out.println("Name: "+name);
        }
    }

//    public static Expression getMaleExpression() {
//        Expression robert = new TerminalExpression("Robert");
//        Expression john = new TerminalExpression("John");
//        return new OrExpression(robert, john);
//
//    }
//
//    public static Expression getMarriedWomanExpression() {
//        Expression julie = new TerminalExpression("Julia");
//        Expression married = new TerminalExpression("Married");
//        return new AndExpression(julie, married);
//    }
//
//    public static void main(String[] args) {
//        Expression isMale = getMaleExpression();
//        Expression isMarried = getMarriedWomanExpression();
//        System.out.println("John is male ? " + isMale.interpret("John"));
//        System.out.println("Julie is a married woman ? " + isMarried.interpret("Married Julia"));
//
//
//    }

//    public static void main(String[] args) {
//        // Command Pattern
//        Stock stock=new Stock();
//        BuyStock buyStock=new BuyStock(stock) ;
//        SellStock sellStock=new SellStock(stock) ;
//        Broker broker=new Broker();
//        broker.addOrder(buyStock);
//        broker.addOrder(sellStock);
//        broker.placeOrder();
//
//
//
//    }


//private static GeneralLogger getChainLogger() {
//    GeneralLogger error_logger = new ErrorLogger(GeneralLogger.ERROR);
//    GeneralLogger file_logger = new FileLogger(GeneralLogger.DEBUG);
//    GeneralLogger console_logger = new ConsoleLogger(GeneralLogger.INFO);
//    error_logger.setNextLogger(file_logger);
//    file_logger.setNextLogger(console_logger);
////    console_logger.setNextLogger(null);
//    return error_logger;
//}
//
//    public static void main(String[] args)
//    {
//        GeneralLogger LoggerChain=getChainLogger();
//        LoggerChain.LogMessage(GeneralLogger.INFO,"This is an information");
//        LoggerChain.LogMessage(GeneralLogger.ERROR,"This is an error message");
//        LoggerChain.LogMessage(GeneralLogger.DEBUG,"This is a debugging message");
//
//
//
//    }
//    private static String getRandomColor() {
//        return colors[(int) (Math.random() * colors.length)];
//    }
//    public static void main(String[] args) {
//        Shape circle = new Circle();
//        circle.display();
//        Shape redCircle = new RedShapeDecorator(new Circle());
//        Shape redRectangle = new RedShapeDecorator(new Rectangle());
//        circle.display();
//        redCircle.display();
//        redRectangle.display();
//
//    }
//    public static void main(String[] args) {
//        Employee CEO = new Employee("John", "CEO", 30000);
//
//        Employee headSales = new Employee("Robert", "Head Sales", 20000);
//
//        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
//
//        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
//        Employee clerk2 = new Employee("Bob", "Marketing", 10000);
//
//        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
//        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
//
//        CEO.AddEmployee(headSales);
//        CEO.AddEmployee(headMarketing);
//
//        headSales.AddEmployee(salesExecutive1);
//        headSales.AddEmployee(salesExecutive2);
//
//        headMarketing.AddEmployee(clerk1);
//        headMarketing.AddEmployee(clerk2);
//
//        System.out.println(CEO);
//        for (Employee headEmployee : CEO.getEmployeeList()) {
//            System.out.println(headEmployee);
//
//            for (Employee employee : headEmployee.getEmployeeList()) {
//                System.out.println(employee);
//            }
//        }
//    }
//
////    public static void main(String[] args) {
////        StructuralDesignPatterns.Decorator_DesignPattern.Shape redCircle=new StructuralDesignPatterns.Decorator_DesignPattern.Circle(100,100,15,new RedCircle());
////        redCircle.Draw();
////        StructuralDesignPatterns.Decorator_DesignPattern.Shape greenCircle=new StructuralDesignPatterns.Decorator_DesignPattern.Circle(150,120,10,new GreenCircle());
////        greenCircle.Draw();
////
////
////    }
//
////    public static void main(String[] args) {
////
////        AudioPlayer audioPlayer = new AudioPlayer();
////        audioPlayer.play("mp3", "beyond the horizon.mp3");
////        audioPlayer.play("mp4", "alone.mp4");
////        audioPlayer.play("vlc", "far far away.vlc");
////        audioPlayer.play("avi", "mind me.avi");
////
////
////    }
////    public static void main(String[] args) {
////        Singleton obj1 = Singleton.getInstance();
////        Singleton obj2 = Singleton.getInstance();
////        Singleton obj3 = Singleton.getInstance();
////
////        obj1.setSingle_phrase(obj1.getSingle_phrase().toUpperCase());
////        System.out.println("String from obj1 is " + obj1.getSingle_phrase());
////        System.out.println("String from obj2 is " + obj2.getSingle_phrase());
////        System.out.println("String from obj3 is " + obj3.getSingle_phrase());
////        System.out.println();
////
////
//////        obj1.setSingle_phrase("hello obj-x");
//////        obj2.setSingle_phrase("hello obj-y");
//////        obj3.setSingle_phrase("hello obj-z");
////
////
////    }
////    public static void main(String[] args) {
////        MealBuilder mealBuilder = new MealBuilder();
////
////        Meal vegMeal = mealBuilder.PrepareVegMeal();
////        System.out.println("Veg Meal");
////        vegMeal.ShowItems();
////        System.out.println("Total Cost: " + vegMeal.getCost());
////
////        Meal nonVegMeal = mealBuilder.PrepareNonVegMeal();
////        System.out.println("\n\nNon-Veg Meal");
////        nonVegMeal.ShowItems();
////        System.out.println("Total Cost: " + nonVegMeal.getCost());
////    }
////    public static void main(String[] args) {
//////        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
////        Scanner scanner = new Scanner(System.in);
////
////        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
////        String bankName = scanner.next();
////
////
////        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");
////
////        String loanName = scanner.next();
////        AbstractFatory bankFactory = FactoryCreator.getFactory("Bank");
////        Bank b = bankFactory.getBank(bankName);
////
////        System.out.print("\n");
////        System.out.print("Enter the interest rate for " + b.getBankName() + ": ");
////
////        double rate = scanner.nextDouble();
////        System.out.print("\n");
////        System.out.print("Enter the loan amount you want to take: ");
////
////        double loanAmount = scanner.nextDouble();
////        System.out.print("\n");
////        System.out.print("Enter the number of years to pay your entire loan amount: ");
////        int years = scanner.nextInt();
////
////        System.out.print("\n");
////        System.out.println("you are taking the loan from " + b.getBankName());
////
////        AbstractFatory loanFactory = FactoryCreator.getFactory("Loan");
////        Loan l = loanFactory.getLoan(loanName);
////        l.getInterestRate(rate);
////
////        l.ShowLoanPayment(loanAmount, years);
////    }

}