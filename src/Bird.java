class Bird extends Animal implements AnimalMove {
    private String Type_BirdTembe57169;
    public Bird(){
        super();
        Type_BirdTembe57169=" ";
    }
    public Bird(String name,int age , int weight , String Type_of_Bird){
        super(name,age,weight);
        this.Type_BirdTembe57169=Type_of_Bird;
    }
    public Bird(int age , String Type_of_Bird){
        super(age);
        this.Type_BirdTembe57169=Type_of_Bird;
    }

    public void Fly(){System.out.println("im flying ");}

    @Override
    void getVoiceTembe57169() {
        System.out.println("Quack Quack Quack");
    }
    @Override
    public void eatTembe57169(String meal) {
        System.out.println("Bird is eating a "+ meal);
    }
    public String getTypeTembe57169(){return this.Type_BirdTembe57169;};
    public void setTypeTembe57169(String w){this.Type_BirdTembe57169=w;};
    public String ToString(){
        return "Bird :\n "+"Type of Bird : "+Type_BirdTembe57169;
    }


    @Override
    public void move() {
        System.out.println("Bird move");
    }
}
