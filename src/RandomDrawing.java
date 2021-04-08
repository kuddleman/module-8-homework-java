import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;


public class RandomDrawing<T> implements RandomDrawingInterface<T> {

    private boolean allowDuplicateEntries;
    private int size = 0;
    private ArrayList<T> entryList;



    public RandomDrawing(boolean allowDuplicateEntries) {

        this.allowDuplicateEntries = allowDuplicateEntries;
        this.entryList = new ArrayList<T>();

    }

    public boolean doesAllowDuplicateEntries() {
        return allowDuplicateEntries;
    }

    public void setAllowDuplicateEntries(boolean allowDuplicateEntries) {
        this.allowDuplicateEntries = allowDuplicateEntries;
    }

    // TO DO
    public  <T> extends Comparable<T> boolean isDuplicate(T entry) {

        Set<T> arrayValuesSet = new HashSet<T>();

        for(int i = 0; i < array.length; i++) {
            T value = array[i];
            if(arrayValuesSet.add(value)) { //if we can add entry to the Set, then isDuplicate == false
                return false;
            } else {
                return true;
            }
        }

    }



    @Override
    public boolean addEntry(T entry) {
        if(allowDuplicateEntries) {
            entryList.add(entry);
            return true;
        } else {
            if(!isDuplicate(entry)) {  // if isDuplicate method returns false
                entryList.add(entry );
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public T selectWinner(boolean removeWinner) {
        // Select winner randomly

        //If(removeWinner) remove from list
        // Otherwise do nothing

        return null;
    }

    @Override
    public int size() {
        return entryList.size();
    }

    @Override
    public void displayEntries() {
        for (T entry : entryList) {
            System.out.println(entry);
        }
    }
}


