package Prototype;

public abstract class TV implements Cloneable{
    protected String brand;
    protected int price;

    public String getBrand(){
        return brand;
    }

    public int getPrice(){
        return price;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
