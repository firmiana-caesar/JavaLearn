package Singleton;

public class SingletonHaierTV {

    private  static SingletonHaierTV singletonHaierTV = null;

    private SingletonHaierTV(){
        System.out.println("This is a singleton Haier TV");
    }


    public  static  SingletonHaierTV instance(){

        if (singletonHaierTV == null){
            singletonHaierTV = new SingletonHaierTV();
        }
        return  singletonHaierTV;
    }
}
