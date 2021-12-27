package designpattern.creationaldesignpattern.singleton;

public class Singleton {
    public static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public void getDataBaseConnection(){
        System.out.println("Getting Oracle database license");
    }

}
