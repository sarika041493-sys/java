package lab4;

//Abstract class
abstract class Vaccine {

 int age;
 String nationality;
 boolean firstDoseTaken = false;

 // Constructor
 Vaccine(int age, String nationality) {
     this.age = age;
     this.nationality = nationality;
 }

 // Concrete method for first dose
 void firstDose() {

     if (nationality.equalsIgnoreCase("Indian") && age >= 18) {

         System.out.println(
             "Your First dose Successfully Done. Now you have to pay 250 Rs"
         );

         firstDoseTaken = true;

     } else {

         System.out.println(
             "You are not eligible for the first dose."
         );
     }
 }

 // Concrete method for second dose
 void secondDose() {

     if (firstDoseTaken) {

         System.out.println(
             "Your Second dose Successfully Done"
         );

     } else {

         System.out.println(
             "Please complete the first dose first."
         );
     }
 }

 // Abstract method
 abstract void boosterDose();
}

//Implementation class
class VaccinationSuccessful extends Vaccine {

 // Constructor
 VaccinationSuccessful(int age, String nationality) {
     super(age, nationality);
 }

 // Implementing abstract method
 @Override
 void boosterDose() {

     System.out.println(
         "Your Booster dose Successfully Done"
     );
 }
}

//Main class
public class Vaccination {

 public static void main(String[] args) {

     // Creating object
     VaccinationSuccessful person =
         new VaccinationSuccessful(18, "Indian");

     // Calling methods
     person.firstDose();
     person.secondDose();
     person.boosterDose();
 }
}