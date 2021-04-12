
import java.util.*;

public class RandomDrawing<T> implements RandomDrawingInterface<T> {

    private boolean allowDuplicateEntries;
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

    public  <T> boolean isDuplicate(T entry) {
        if(entryList.contains(entry)) {
            return true;
        }
        return false;
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
        // Select index of winner randomly
        Random rand = new Random();
        int upperbound = entryList.size();
        int indexRemove = rand.nextInt(upperbound);
        T entry = entryList.get(indexRemove);
        if(removeWinner){
            //remove from list
            entryList.remove(indexRemove);
        }
        // Otherwise do nothing

        return entry;
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


