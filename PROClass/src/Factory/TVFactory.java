package Factory;

public class TVFactory{

    public TV produceTV(String name){

        switch (name){
        case "Haier":
            return new HaierTV();

        case "Hisense":
            return new HisenseTV();
        }

        return null;
    }
}


