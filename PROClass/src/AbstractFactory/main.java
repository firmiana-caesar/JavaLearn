package AbstractFactory;

public class main {
    public static void main(String[] args) {
        GetTV getTV = new GetTV();

        TV haierTV = getTV.createTV("Haier");
        TV hisenseTV = getTV.createTV("Hisense");
    }
}
