public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.add(10);
        list.add(100);
        list.add(100);
        list.add(20);
        list.add(10);

        list.remove(100);
        //list.printList();



        List list1 = new List();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        List list2 = new List();
        list2.add(3);
        list2.add(6);

        List list3 = new List();
        list3.jointList(list1, list2);


    }
}
