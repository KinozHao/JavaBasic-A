package designsingleton.easyfactory;

public class AnimalsTest {
    public static void main(String[] args) {
        //直接类名.调用AnimalsFactory里面的方法即可
        Dog d = (Dog) AnimalsFactory.createAnimal("dog");
        d.eat();
        Cat c = (Cat) AnimalsFactory.createAnimal("cat");
        c.eat();
    }
}
