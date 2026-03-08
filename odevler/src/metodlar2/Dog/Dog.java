package metodlar2.Dog;

public class Dog {
    public int age;
    public String breed;
    public String name;
    public String color;


    public void bark(){
        System.out.println(name+" is barking");
    }public void eat(){
        System.out.println(name+" is eating");
    }public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public void dogInfo(){
        System.out.println(toString());
    }


}

