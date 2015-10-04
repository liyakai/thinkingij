
class Dog {
    String name;
    String says;
    Dog(String name, String says){
        this.name = name;
        this.says = says;
    }
    String getName(){
        return name;
    }
    String getSays(){
        return says;
    }
}

class exercise6 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff");
        Dog dog2 = new Dog("scruffy"," Wurf");
        System.out.println("dog1's name: " + dog1.getName() + "     dog1's says: " + dog2.getSays());
        System.out.println("dog2's name: " + dog2.getName() + "  dog2's says: " + dog2.getSays());

        Dog dog3 = dog1;
        System.out.print("dog3 == dog1 : ");
        System.out.println(dog3 == dog1);
        System.out.println("dog3.equals(dog1) : " + dog3.equals(dog1));
    }
 
}
