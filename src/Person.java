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

    interface Salary{
    int rateTembe57169 = 0;
    int ExtraHoursTembe57169=0;

    void SalaryToPayTembe57169(int hours, int rate);

    default int SalaryOverTimeTembe57169(int ExtraHoursTembe57169, int rateTembe57169){
        int salaryOverTimeTembe57169= ExtraHoursTembe57169*rateTembe57169;
        return salaryOverTimeTembe57169;
    }

    static void CheckBonusTembe57169(int YearsOfExperienceTembe67169){
        if (YearsOfExperienceTembe67169>=5){
            System.out.println("Yes employee should receive bonus");
        } else {
            System.out.println("Employee doesn't deserve bonus");
        }

    }

}


   class Staff extends Person implements Salary{
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


       @Override
       public void SalaryToPayTembe57169(int hours, int rate) {
           System.out.println("The salary to pay is "+ hours*rate);
       }

       @Override
        public int SalaryOverTimeTembe57169(int ExtraHoursTembe57169, int rateTembe57169){
           return 10*30;
       }




   }
