package Prototype;

import java.util.Hashtable;

public class TVcache {
    private static Hashtable<String, TV> tvTable = new Hashtable<String, TV>();

    public void loadTV(){
        HaierTV haierTV = new HaierTV();
        haierTV.brand();;
        HisenseTV hisenseTV = new HisenseTV();
        hisenseTV.brand();

        tvTable.put(haierTV.getBrand(), haierTV);
        tvTable.put(hisenseTV.getBrand(), hisenseTV);
    }

    public TV getTV(String key){
        TV cacheTV = tvTable.get(key);
        return (TV)cacheTV.clone();
    }
}
