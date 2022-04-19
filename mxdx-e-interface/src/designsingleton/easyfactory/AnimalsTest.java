package designsingleton.easyfactory;

public class AnimalsTest {
    public static void main(String[] args) {
        Dog d = (Dog) AnimalsFactory.createAnimal("dog");       //直接类名.调用AnimalsFactory里面的方法即可
        d.eat();
        Cat c = (Cat) AnimalsFactory.createAnimal("cat");
        c.eat();
    }
}
