package designsingleton.easyfactory;

public class AnimalsFactory {
    public static Dog createDog(){
        return new Dog();
    }
    public static Cat createCat(){
        return new Cat();
    }
    //方法要定义很多,复用性太差

    //改进
    public static Animals createAnimal(String name) {
        if ("dog".equals(name)) {       //判断条件 满足条件时候 返回对应参数
            return new Dog();
        }else if ("cat".equals(name)){
            return new Cat();
        }else{
            return null;
        }
    }
}
