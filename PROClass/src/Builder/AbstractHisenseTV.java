package Builder;

public abstract class AbstractHisenseTV implements TV{
    int pri;
    @Override
    public String name(){
        return "Hisense TV";
    }

    @Override
    public int getprice(){
        return pri;
    }
}
