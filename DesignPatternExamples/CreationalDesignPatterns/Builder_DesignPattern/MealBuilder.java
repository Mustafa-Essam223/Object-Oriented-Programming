package CreationalDesignPatterns.Builder_DesignPattern;

public class MealBuilder {
    public Meal PrepareVegMeal() {
        Meal newMeal = new Meal();
        newMeal.addItem(new VegBurger());
        newMeal.addItem(new Pepsi());
        return newMeal;
    }

    public Meal PrepareNonVegMeal() {
        Meal newMeal = new Meal();
        newMeal.addItem(new ChickenBurger());
        newMeal.addItem(new Coke());
        return newMeal;
    }


}
