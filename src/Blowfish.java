public class Blowfish extends Fish{
    private String TypeTembe57169;
    public Blowfish(){
        super();
        TypeTembe57169="Tetraodontidae ";
    }
    public Blowfish(String name,int age , int weight , String order, String Type){
        super(name,age,weight,order);
        this.TypeTembe57169=Type;
    }
    public Blowfish(int age , String order, String Type){
        super(age,order);
        this.TypeTembe57169=Type;
    }
    public void travel(){System.out.println("Im going  _");}

    @Override
    public void Search_For_Food() {
        System.out.println("The Blowfish is looking for something to eat ");
    }

    @Override
    void getVoiceTembe57169() {
        System.out.println("Blu Blu BLu");
    }

    @Override
    public void eatTembe57169(String meal) {
        System.out.println("I am Eating "+meal);
    }
    public String getType(){return this.TypeTembe57169;};
    public void setType(String w){this.TypeTembe57169=w;};
    public String ToString(){
        return "BlowFish :\n "+"Type : "+TypeTembe57169;
    }
}
