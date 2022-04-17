abstract class Animal implements AnimalMove {
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
    public String getNameTembe57169(){return NameTembe57169;};
    public void setNameTembe57169(String name){this.NameTembe57169=name;};
    public int getAgeTembe57169(){return this.ageTembe57169;};
    public void setAgeTembe57169(int w){this.ageTembe57169=w;};
    public int getWeightTembe57169(){return this.weightTembe57169;};
    public void setWeightTembe57169(int w){this.weightTembe57169=w;};


}


    interface AnimalBehavior{
        void Sleep(String Sound);
    }


    interface AnimalName {
        static void name(String name) {
            System.out.println("Animal name is: " + name);
        }
    }


        interface AnimalMove {
            default void move() {
                System.out.println("Animal move: ");

            }
        }
