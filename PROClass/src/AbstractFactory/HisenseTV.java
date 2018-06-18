package AbstractFactory;

public class HisenseTV extends AbstractHisenseTV{
    public HisenseTV(){
        TVbrand();
    }

    public void TVbrand(){
        System.out.println("TV brand is Hisense");
    }
}
