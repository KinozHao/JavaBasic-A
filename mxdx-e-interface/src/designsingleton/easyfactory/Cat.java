package designsingleton.easyfactory;

/**
 * @author kinoz
 * @date 2022/4/19 - 14:36
 * @apiNote
 */
class Cat extends Animals {

    @Override
    public void eat() {
        System.out.println("√®≥‘”„");
    }
}

class Dog extends Animals {
    @Override
    public void eat() {
        System.out.println("π∑≥‘»‚");
    }
}

