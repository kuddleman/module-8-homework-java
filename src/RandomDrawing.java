public class RandomDrawing<T> implements RandomDrawingInterface<T> {

    private boolean allowDuplicateEntries;



    public RandomDrawing(boolean allowDuplicateEntries) {
        this.allowDuplicateEntries = allowDuplicateEntries;

    }

    public boolean doesAllowDuplicateEntries() {
        return allowDuplicateEntries;
    }

    public void setAllowDuplicateEntries(boolean allowDuplicateEntries) {
        this.allowDuplicateEntries = allowDuplicateEntries;
    }

    @Override
    public boolean addEntry(T entry) {
        return false;
    }

    @Override
    public T selectWinner(boolean removeWinner) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void displayEntries() {

    }
}
