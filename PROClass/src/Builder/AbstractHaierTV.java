package Builder;

public abstract class AbstractHaierTV implements TV{
    int pri;
    @Override
    public String name(){
        return "Haier TV";
    }

    @Override
    public int getprice(){
        return pri;
    }
}
