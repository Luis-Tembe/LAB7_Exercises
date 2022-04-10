abstract class Animal {
    String NameTembe57169;
    int ageTembe57169,weightTembe57169;

    public Animal(int age) {
        this.ageTembe57169=age;
    }

    public void eatTembe57169(String meal){};
    abstract void getVoiceTembe57169();
    public Animal(){
        ageTembe57169 = weightTembe57169=0;
        NameTembe57169="None";
    }
    public Animal(String name,int age , int weight){
        this.NameTembe57169=name;
        this.ageTembe57169=age;
        this.weightTembe57169=weight;
    }
    public String getNameTembe57169(){return this.NameTembe57169;};
    public void setNameTembe57169(String w){this.NameTembe57169=w;};
    public int getAgeTembe57169(){return this.ageTembe57169;};
    public void setAgeTembe57169(int w){this.ageTembe57169=w;};
    public int getWeightTembe57169(){return this.weightTembe57169;};
    public void setWeightTembe57169(int w){this.weightTembe57169=w;};
}


