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
    }
}
