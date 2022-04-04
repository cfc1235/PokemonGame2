package Interfaces;

import java.util.ArrayList;
import java.util.Random;

public class WeightedEnteries<T extends Object> {

    private ArrayList<Entry> entries = new ArrayList<>();
    private int accumulatedWeight = 0;
    private Random rand = new Random();

    private class Entry{
        int accumulatedWeight;
        T weightedObject;
    }

    public Boolean isEmpty(){
        if(this.entries.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public void clearEntries(){
        this.entries.clear();
        this.accumulatedWeight = 0;
    }
    public void addEntry(int itemWeight, T weightedItem){
        this.accumulatedWeight += itemWeight;
        Entry newEntry = new Entry();
        newEntry.weightedObject = weightedItem;
        newEntry.accumulatedWeight = this.accumulatedWeight;
        this.entries.add(newEntry);
    }

    public T getRandomEntry(){
        int r = this.rand.nextInt(this.accumulatedWeight);
        for(Entry posEntries : this.entries){
            if(posEntries.accumulatedWeight >= r){
                return posEntries.weightedObject;
            }
        }
        return null;
    }
}
