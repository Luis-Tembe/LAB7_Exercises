import java.io.IOException;

public class Main  {
    public static void main(String[] args) throws IOException {
        //Staff obj= new Staff();
        //obj.Initialize1();
       // obj.Print1();

        //Task 2
        Animal animal[]= new Animal[6];
        animal[0]= new Mammal("Mammmal",9,15,"Security");
        animal[1]= new Dog("Bob",12,10,"Poland","Black");
        animal[2]= new Bird("Julio",5,4,"Parrots");
        animal[3]= new Fish("Gold Fish",3,2,"Jawless");
        animal[4]= new Blowfish("Blow Fish",7,11,"GRECCE","Blow");
        animal[5]= new Pigeon("MyPigeon",60,30,"Atlantic",351);


        // Bird
        animal[1].getVoiceTembe57169();
        animal[2].getVoiceTembe57169();



    }
}
