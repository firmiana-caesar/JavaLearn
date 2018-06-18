package Prototype;

public class HaierTV extends TV{
    public HaierTV(){
        price = 500;
    }

    public void brand(){
        brand = "Haier";
    }

    public String getBrand(){
        return this.brand;
    }
}
