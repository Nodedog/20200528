class Cat{
    private String name;

    public Cat() {
        this.name = "小猫";
    }

    public Cat(String name) {
        this.name = name;
    }
    public void eat(String food){
        System.out.println(this.name + "正在吃" + food);
    }
}


public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.如何获取类对象
        //(1)通过字符串来获取到类,参数是类的全限定类名
        //catClass就是Cat类的图纸,里头描述了Cat类的内部构造
        Class catClass = Class.forName("20200528.Cat");

        //(2) 通过实例来获取,实例的getClass方法获取到类对象
        Cat cat = new Cat("小黑");
        Class catClass2 = cat.getClass();

        System.out.println(catClass == catClass2);

        //通过类获取
        Class catClass3 = Cat.class;
        System.out.println(catClass == catClass3);
    }
}
