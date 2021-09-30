import java.util.Arrays;
import java.util.List;

public class HW {

    public static void reverseElements (int[] arr, int q, int w){
        int temp = arr[q];
        arr[q] = arr[w];
        arr[w] = temp;
    }

    public static void arrToArr() {
        Integer[] array = {1, 2};
        List<Integer> list = Arrays.asList(array);
    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple()); // ???
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange(), new Orange(), new Orange());

        System.out.println(appleBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));

    }
}