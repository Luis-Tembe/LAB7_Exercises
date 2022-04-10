import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Person {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String surnameTembe57169,FirstnameLuis57169,street57168,cityLuis57169;
        int zipCode57169;

         void initialize() throws IOException{
            System.out.println("Please enter you First Name: ");
          FirstnameLuis57169 = br.readLine();
            System.out.println("Please enter your Surname: ");
          surnameTembe57169  = br.readLine();
            System.out.println("Please enter your street name: ");
           street57168 = br.readLine();
            System.out.println("Please enter your City: ");
            cityLuis57169=br.readLine();
            System.out.println("Please enter your zipCode: ");
            zipCode57169= Integer.parseInt(br.readLine());
        }

         void PrintData() {
             System.out.println("================================");
            System.out.println("First Name: "+ FirstnameLuis57169 );
            System.out.println("Surname: "+ surnameTembe57169);
            System.out.println("Street: "+ street57168);
            System.out.println("City: "+ cityLuis57169);
            System.out.println("zipCode: "+ zipCode57169);
        }

    }


   class Staff extends Person{
       String educationLuis57169, PositionLuis57169;
       void Initialize1() throws IOException{
           initialize();
           System.out.println("Please enter education: ");
           educationLuis57169= br.readLine();
           System.out.println("Please enter Position: ");
           PositionLuis57169=br.readLine();

       }

       void Print1(){
           PrintData();
           System.out.println("Education: "+educationLuis57169);
           System.out.println("Position: "+ PositionLuis57169);
       }
   }
