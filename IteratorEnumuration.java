import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorEnumuration {

    public static void main(String[] args) {
        Vector v = new Vector();
        Object elements;

        Enumeration enumeration;
        Iterator iterator;

        long start;


        for(int i=0 ;i<1000000;i++){
            v.add("New elements");
        }

        enumeration = v.elements();
        iterator = v.iterator();

        //*****CODE BLOCK FOR ITERATOR**********************
        start=System.currentTimeMillis();
        while (iterator.hasNext()){
            elements = iterator.next();
        }
        System.out.println("Iterator took " + (System.currentTimeMillis()-start));
        //*************END OF ITERATOR BLOCK************************

        System.gc();   //request to GC to free up some memory
        //*************CODE BLOCK FOR ENUMERATION*******************
        start=System.currentTimeMillis();

        while (enumeration.hasMoreElements()){
            elements = enumeration.nextElement();
        }
        System.out.println("Enumeration took " + (System.currentTimeMillis()-start));
        //************END OF ENUMERATION BLOCK**********************
    }
}
