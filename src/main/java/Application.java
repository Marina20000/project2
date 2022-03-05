import domain.Cat;

public class Application {

    public static void  main(String ... args){
        Cat marusja = new Cat();
        marusja.setName("Marusja");
        marusja.setAge(5);
        marusja.voice();
    }
}
