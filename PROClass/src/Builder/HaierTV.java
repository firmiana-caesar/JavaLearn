package Builder;

public class HaierTV extends AbstractHaierTV{
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
