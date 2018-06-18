package Prototype;

public class main {
    public static void main(String[] args){
        TVcache tvCache = new TVcache();
        tvCache.loadTV();

        TV haierTV = tvCache.getTV("Haier");
        System.out.println(haierTV.price);

        TV hisenseTV = tvCache.getTV("Hisense");
        System.out.println(hisenseTV.price);
    }
}
