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
        list1.add(2);
        list1.add(3);
        list1.add(7);

        List list2 = new List();
        list2.add(1);
        list2.add(4);
        list2.add(6);

        List list3 = new List();
        list3.jointList(list1, list2);
        //list3.printList();

        List list4 = new List();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.add(5);
        list4.add(6);
        list4.add(7);
        list4.printList();
        System.out.println();
        list4.removeKElementFromTail(3);
        list4.printList();



    }
}
