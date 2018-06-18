package AbstractFactory;

public class GetTV implements TVFactory{
    public TV createTV(String name){
        switch (name){
            case "Haier":
                return new HaierTV();
            case "Hisense":
                return new HisenseTV();
        }
        return null;
    }
}
