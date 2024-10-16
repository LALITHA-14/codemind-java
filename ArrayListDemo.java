public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        for(Integer i: arr1)  System.out.println(i);
        ArrayList<Item> arr= new ArrayList<>();
        arr.add(new Item("Laptop",7));
        arr.add(new Item("Mouse",1));
        System.out.println(arr.size());
        for(Item i:arr)
        {
            System.out.println(i);
        }
    }
}
