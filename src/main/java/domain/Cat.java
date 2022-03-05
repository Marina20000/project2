package domain;

import org.apache.log4j.Logger;

public class Cat extends Animal{

private Logger logger = Logger.getLogger(Cat.class);

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    @Override
    public void voice() {
        logger.debug("мяу");
    }
}
