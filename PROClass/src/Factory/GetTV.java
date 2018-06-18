package Factory;

public class GetTV {

    public static void main(String[] args){
        TVFactory tvFactory = new TVFactory();
        TV HaierTV = tvFactory.produceTV("Haier");
        TV HisenseTV = tvFactory.produceTV("Hisense");
    }

}
