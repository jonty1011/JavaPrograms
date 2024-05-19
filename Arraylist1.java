import java.util.*;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer>l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(18);
        l2.add(19);
       
        l1.addAll(0, l2) ;// isse l1 or l2 waale dono ho jaayenge;

       l1.add(6);
       l1.add(7);
       l1.add(4);
       l1.add(6);
       l1.add(5);
       l1.add(0,5);
       l1.add(0,1);
     System.out.println(l1.contains(9));
     System.out.println(l1.indexOf(7));
     l1.set(1,566 );
     System.out.println(l1.isEmpty());
    //    l1.clear();
        System.out.println(l1.clone());
       for(int i=0;i<l1.size();i++){
        System.out.print(l1.get(i));    // get func to print in arraylist;
       System.out.print(", ");
    }
        

    }
}
