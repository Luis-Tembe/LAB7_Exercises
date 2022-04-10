public class Dog extends Mammal{
    private String FavColorTembe57169;
    Dog(){
        super();
        FavColorTembe57169="Black";
    }
    public Dog(String name,int age , int weight , String order, String favColor){
        super(name,age,weight,order);
        this.FavColorTembe57169=favColor;
    }
    public Dog(int age , String order, String favColor){
        super(age,order);
        this.FavColorTembe57169=favColor;
    }
    public void WakeUp(){System.out.println("I Just Woke Up _");}

    @Override
    public void SleepTembe57169() {
        System.out.println("The Dog Is Slepping");
    }

    @Override
    void getVoiceTembe57169() {
        System.out.println("Haw Haw");
    }

    @Override
    public void eatTembe57169(String meal) {
        System.out.println("I am Eating my Crochets");
    }
    public String getFavColorTembe57169(){return this.FavColorTembe57169;};
    public void setFavColorTembe57169(String w){this.FavColorTembe57169=w;};
    public String ToString(){
        return "Dog :\n "+"Favorite Color : "+FavColorTembe57169;
    }
}
