package Builder;

import java.util.ArrayList;

public class TVItem {
    private ArrayList<TV> tvItem = new ArrayList<TV>();

    public void addTVItem(TV item, int price){
        item.price(price);
        tvItem.add(item);
    }

    public void showTVItem(){
        for (TV item : tvItem){
            System.out.println(item.getprice() + " " + item.name());
        }
    }
}
