package Map;

public class Main {
    public static void main(String[] args) {
        MyMap<String, Integer> myMap = new MyMap<>();

        myMap.put("KEY1", 10);
        myMap.put("KEY2", 20);
        myMap.put("KEY3", 30);

        System.out.println("Value of KEY1: " + myMap.get("KEY1"));
        System.out.println("Value of KEY2: " + myMap.get("KEY3"));
        System.out.println("Value of KEY4: " + myMap.get("KEY4"));

        System.out.println("Removed value of KEY1: " + myMap.remove("KEY1"));
        System.out.println("Removed value of KEY3: " + myMap.remove("KEY3"));
        System.out.println("Removed value of KEY4: " + myMap.remove("KEY4"));

        System.out.println();

        MyMap<String, Double> myMap2 = new MyMap<>();

        myMap2.put("KEY1", 20.51);
        myMap2.put("KEY2", 30.15);
        myMap2.put("KEY3", 100.12);

        System.out.println("Value of KEY1: " + myMap2.get("KEY1"));
        System.out.println("Value of KEY2: " + myMap2.get("KEY3"));
        System.out.println("Value of KEY4: " + myMap2.get("KEY4"));

        System.out.println("Removed value of KEY1: " + myMap2.remove("KEY1"));
        System.out.println("Removed value of KEY3: " + myMap2.remove("KEY3"));
        System.out.println("Removed value of KEY4: " + myMap2.remove("KEY4"));
    }
}
