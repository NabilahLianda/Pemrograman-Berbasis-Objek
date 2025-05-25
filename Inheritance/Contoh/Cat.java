class Cat extends Animal{
    public Cat(){
        super();
        name = "cat";
        System.out.println("I am a "+name);
    }

    public void speak(){
        System.out.println("Meow");
    }
}