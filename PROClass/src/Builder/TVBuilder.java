package Builder;

public class TVBuilder {
    public static TVItem tvBuilder(){
        TVItem tvItem = new TVItem();
        tvItem.addTVItem(new HaierTV(), 500);
        tvItem.addTVItem(new HisenseTV(), 600);
        return tvItem;
    }

    public static void main(String[] args){
        TVItem getTVItem = tvBuilder();
        tvBuilder().showTVItem();
    }
}
