package designpattern.creationaldesignpattern.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.getDataBaseConnection();

    }
}
