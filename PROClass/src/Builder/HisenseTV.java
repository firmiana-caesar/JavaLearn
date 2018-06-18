package Builder;

public class HisenseTV extends AbstractHisenseTV{
    @Override
    public int price(int pric){
        this.pri = pric;
        return pri;
    }

    @Override
    public int getprice(){
        return this.pri;
    }
}