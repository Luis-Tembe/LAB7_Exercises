 class Mammal extends Animal implements AnimalMove,AnimalBehavior,AnimalName{
    private String orderTembe57169;
     public Mammal(){
         super();
         orderTembe57169=" ";
     }
     public Mammal(String name,int age , int weight , String order){
         super(name,age,weight);
         this.orderTembe57169=order;
     }
     public Mammal(int age , String order){
         super(age);
         this.orderTembe57169=order;
     }

     public void SleepTembe57169(){System.out.println("zzz");}

     @Override
     void getVoiceTembe57169() {
         System.out.println("I am Making Sound !@#%$$#@#");
     }
     @Override
     public void eatTembe57169(String meal) {
         System.out.println("Mamal is eating a "+ meal);
     }
     public String getOrderTembe57169(){return this.orderTembe57169;};
     public void setOrderTembe57169(String w){this.orderTembe57169=w;};
     public String ToStringTembe57169(){
         return "Mammal :\n "+"Order : "+orderTembe57169;
     }


     @Override
     public void Sleep(String Sound) {
         Sound="Zzzzz";
     }

 }
