package AbstractFactory;

public class HaierTV extends AbstractHaierTV {
    public HaierTV(){
        TVbrand();
    }

    public void TVbrand(){
        System.out.println("TV brand is Haier");
    }
}
