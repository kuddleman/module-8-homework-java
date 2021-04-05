import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class RandomDrawing<T> implements RandomDrawingInterface<T> {
    private T entry;
    private boolean allowDuplicateEntries;
    private int drawingSize = 0;
    private ArrayList<T> entryList;



    public RandomDrawing(boolean allowDuplicateEntries) {
        this.entry = null;
        this.allowDuplicateEntries = allowDuplicateEntries;
        this.entryList = new ArrayList<T>();

    }

    public boolean doesAllowDuplicateEntries() {
        return allowDuplicateEntries;
    }

    public void setAllowDuplicateEntries(boolean allowDuplicateEntries) {
        this.allowDuplicateEntries = allowDuplicateEntries;
    }

    public  <T extends Comparable<T>> boolean isDuplicate(T entry) {

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
            }
        }
        return false;


    }

    @Override
    public T selectWinner(boolean removeWinner) {
        return null;
    }

    @Override
    public int size() {
        return entryList.size();
    }

    @Override
    public void displayEntries() {
        for(T entry : array) {
            System.out.println(entry);
        }


    }
}
