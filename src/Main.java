import java.io.IOException;

public class Main  {
    public static void main(String[] args) throws IOException {
        //Staff obj= new Staff();
        // obj.Initialize1();
         //  obj.Print1();
        //Salary.CheckBonusTembe57169(7);
        // obj.SalaryOverTimeTembe57169(2,100);
        // obj.SalaryToPayTembe57169(250,30);



        Animal animal[]= new Animal[6];
        animal[0]= new Mammal("Trembolinha",9,15,"Security");
        animal[1]= new Dog("Bob",12,10,"Poland","Black");
        animal[2]= new Bird("Julio",5,4,"Parrots");
        animal[3]= new Fish("Zuzana",3,2,"Jawless");
        animal[4]= new Blowfish("Carlos",7,11,"GRECCE","Blow");
        animal[5]= new Pigeon("Joseph",60,30,"Atlantic",351);

        // Bird
        //animal[1].getVoiceTembe57169();
        //animal[2].getVoiceTembe57169();


      AnimalBehavior animalBehavior[]= new AnimalBehavior[3];
      animalBehavior[0]= new Dog("Bob",3,10,"Moz","Yellow");
      animalBehavior[1]= new Pigeon("Joseph",2,4,"Brazil",351);
      animalBehavior[2]= new Blowfish("Carlos",1,2,"South Africa","Yellow");


      for(Animal a:animal){
            a.move();
      }

      for (Animal a: animal){
          AnimalName.name(a.getNameTembe57169());

      }




    }
}
