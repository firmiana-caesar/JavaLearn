package Singleton;

public class SingletonHisenseTV {

    private  static SingletonHisenseTV singletonHisenseTV = null;

    private SingletonHisenseTV(){
        System.out.println("This is a singleton Hisense TV");
    }


    public  static  SingletonHisenseTV instance(){

        if (singletonHisenseTV == null){
            singletonHisenseTV = new SingletonHisenseTV();
        }
        return  singletonHisenseTV;
    }
}
