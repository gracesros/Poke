package model;

import java.util.List;

    public class MachineArray {
        private int count;
        private String next;
        private String previous;
        private List<PokeApiUrl> results;
        //el nombre va adentro de los piquitos, recibe clases
    public MachineArray() {
    }
    public MachineArray(int count, String next, String previous, List<PokeApiUrl> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String getNext() {
        return next;
    }
    public void setNext(String next) {
        this.next = next;
    }
    public String getPrevious() {
        return previous;
    }
    public void setPrevious(String previous) {
        this.previous = previous;
    }
    public List<PokeApiUrl> getResults() {
        return results;
    }
    public void setResults(List<PokeApiUrl> results) {
        this.results = results;
    }
}