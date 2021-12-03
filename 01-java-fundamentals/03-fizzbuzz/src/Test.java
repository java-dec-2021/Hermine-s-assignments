import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    myArray.add(10);
        System.out.println(myArray.get(0));
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add(11);
        myList.add("Hello");
        myList.add(11.00);
        myList.add(new ArrayList<Integer>());
        myList.add(new Double(11.00));
        System.out.println(myList);
ArrayList<String> myString = new ArrayList<String>();
myString.add("Hello");
        myString.add("World");
        myString.add("etc");
        for (int i = 0; i < myString.size(); i ++){
            System.out.print(myString.get(i) + " ");
        }

}}
