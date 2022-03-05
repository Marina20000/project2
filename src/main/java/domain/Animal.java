package domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract public class Animal {
    private String name;
    private int age;

    @Override
    abstract public String toString();

    abstract public void voice();
}
