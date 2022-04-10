class Fish extends Animal{
    private String General_typeTembe57169;
    public Fish(){
        super();
        General_typeTembe57169=" ";
    }
    public Fish(String name,int age , int weight , String General_type){
        super(name,age,weight);
        this.General_typeTembe57169=General_type;
    }
    public Fish(int age , String General_type){
        super(age);
        this.General_typeTembe57169=General_type;
    }

    public void Search_For_Food(){System.out.println("im looking for food ");}

    @Override
    void getVoiceTembe57169() {
        System.out.println("Blu Blu BLu");
    }
    @Override
    public void eatTembe57169(String meal) {
        System.out.println("Fish is eating a "+ meal);
    }
    public String getGTypeTembe57169(){return this.General_typeTembe57169;};
    public void setGTypeTembe57169(String w){this.General_typeTembe57169=w;};
    public String ToString(){
        return "Fish :\n "+"General Type of Fish : "+General_typeTembe57169;
    }
}

