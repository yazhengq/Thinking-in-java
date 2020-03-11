package containers;

import net.mindview.util.Countries;

import java.util.*;
import static net.mindview.util.Print.print;

/**
 * Name: Exercise7
 * 练习7
 * User: Standard
 * Time: 2017/10/4 15:16
 * Created by IntelliJ IDEA.
 */
public class Exercise7 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(Countries.names(10));
        LinkedList<String> collectionLinkedList = new LinkedList<String>(Countries.names(30));
        //names方法是静态方法 根本不用new 也不能new
        arrayList.addAll(Countries.names(30));
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println("**************************************");
        ListIterator<String> listIterator = collectionLinkedList.listIterator();

        ArrayList<String> arrayList1 = new ArrayList<String>(30);

        int i = 2;
        while (listIterator.hasNext()) {
            String next =  listIterator.next();
            arrayList1.add(i, next);
            i += 2;
        }
        print(arrayList1);

    }


}



//package containers;
//
//        import net.mindview.util.Countries;
//
//        import java.util.ArrayList;
//        import java.util.Iterator;
//        import java.util.LinkedList;
//        import java.util.ListIterator;
//
//        import static net.mindview.util.Print.print;
//
///**
// * Name: Exercise7
// * 练习7
// * User: Standard
// * Time: 2017/10/4 15:16
// * Created by IntelliJ IDEA.
// */
//public class Exercise7 {
//
//    public static void main(String args[]) {
//        ArrayList<String> al = new ArrayList<String>(Countries.names(10));
//        LinkedList<String> ll = new LinkedList<String>(Countries.names(20).subList(10, 20));
//        for (Iterator<String> it = al.iterator(); it.hasNext(); )
//            print(it.next());
//        print("********");
//        for (Iterator<String> it = ll.iterator(); it.hasNext(); )
//            print(it.next());
//        print("********");
//        int alindex = 0;
//        for (ListIterator<String> lit2 = ll.listIterator(); lit2.hasNext(); ) {
//            al.add(alindex, lit2.next());
//            alindex += 2;
//        }
//        print("al = " + al);
//        print("********");
//        alindex = 0;
//// Start at the end:
//        for (ListIterator<String> lit2 = ll.listIterator(ll.size()); lit2.hasPrevious(); ) {
//            al.add(alindex, lit2.previous());
//            alindex += 2;
//        }
//        print("al = " + al);
//    }
//}


