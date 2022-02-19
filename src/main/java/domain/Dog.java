package domain;

public class Dog extends Animal{
    @Override
    public void voice(){
        System.out.println("гав");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }
}
