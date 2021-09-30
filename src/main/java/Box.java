import java.util.ArrayList;

public class Box <B extends Fruit>{
    private ArrayList<B> fruits;

    public Box(ArrayList <B> fruits) {
        this.fruits = new ArrayList<>(fruits);
    }
    public void add (B fruit){
        this.fruits.add(fruit);
    }
    public float getWeight() {
        float sum = fruits.size() == 0 ? 0 : fruits.size() * fruits.get(0).getWeight();
        return sum;
    }
    public boolean compare(Box<?> anotherBox) {
        return getWeight() == anotherBox.getWeight();
    }
    public void fromOneBoxToAnother(Box<B> anotherBox) {
        anotherBox.fruits.addAll(fruits);
        fruits.clear();
    }

}