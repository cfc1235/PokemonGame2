package PlayerMechanics;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Items;
import Items.NoItem;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemInventory {

    private ArrayList<Items> itemInventory = new ArrayList<>();

    public ItemInventory(){}

    public ArrayList<Items> getItemInventory(){return this.itemInventory;}

    public void giveItemToInventory(Items items){
        this.itemInventory.add(items);
    }

    public Items giveItemFromInventory(){
        ArrayList<CreateOrderedMap<Integer, String>> itemNames = new ArrayList<>();
        ArrayList<String> itemName = new ArrayList<>();
        for(Items item : this.itemInventory){
            for(CreateOrderedMap<Integer, String> name : itemNames){
                if(item.showName().equals(name.getValue())){
                    name.setKey(name.getKey() + 1);
                }
                else {
                    itemNames.add(new CreateOrderedMap<>(1, item.showName()));
                    itemName.add(item.showName());
                }
            }
        }
        String getItem = "n/a";
        Scanner scanner = new Scanner(System.in);
        while(!itemName.contains(getItem)){
            for(CreateOrderedMap<Integer, String> getNames : itemNames){
                System.out.println(getNames.getValue() + ": "
                        + getNames.getKey());
            }
            System.out.println("Not in your hand");
            getItem = scanner.nextLine();
        }
        Boolean remove = false;
        int i = 0;
        Items returnItem = new NoItem();
        for(Items items : this.itemInventory){
            i += 1;
            if(getItem.equals(items.showName()) && remove){
                returnItem = this.itemInventory.get(i);
                this.itemInventory.remove(i);
                remove = true;
            }
        }
        return returnItem;
    }
}
