public class Pigeon extends Bird implements AnimalName,AnimalBehavior,AnimalMove{
    private int NO_Species;
    Pigeon(){
        super();
        NO_Species=351;
    }
    public Pigeon(String name,int age , int weight , String order, int NO_Species){
        super(name,age,weight,order);
        this.NO_Species=NO_Species;
    }
    public Pigeon(int age , String order, int NO_Species){
        super(age,order);
        this.NO_Species=NO_Species;
    }
    public void dance(){System.out.println("Im dacing  _");}

    @Override
    public void Fly(){System.out.println("The Pigeon is flying ");}

    @Override
    void getVoiceTembe57169() {
        System.out.println("PAC PAC PAC");
    }

    @Override
    public void eatTembe57169(String meal) {
        System.out.println("I am Eating "+meal);
    }
    public int getNoSpecies(){return this.NO_Species;};
    public void setNoSpecies(int w){this.NO_Species=w;};
    public String ToString(){
        return "Pigeon :\n "+"Number of Species : "+NO_Species;
    }

    @Override
    public void Sleep(String Sound) {
        Sound="Zzzzz";
        System.out.println(Sound);

    }

    @Override
    public void move() {
        System.out.println("Pigeon Fly");
    }
}
