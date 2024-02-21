package kingdom;
import java.util.Scanner;
public class AnimalKingdom {
    public static void main(String[] args){

//creating Object for Animal 1
            Animal a1=new Animal();
            System.out.println("Name of animal 1 : "+a1.name+"\nType : "+a1.type);
            System.out.println("Venomous : "+(a1.venomous?"Yes":"No"));
            System.out.println("Food : "+a1.food);
            System.out.println();
            //creating object for animal 2
            Animal a2=new Animal("Snake","Reptilia",true);
            System.out.println("Name of animal 2 : "+a2.name+"\nType : "+a2.type);
            System.out.println("Venomous : "+(a2.venomous?"Yes":"No"));
            System.out.println();

//object for animal 3
            Animal a3=new Animal();
            System.out.println("Give infornamtion of animal 3 : ");

//taking user input for animal 3
            Scanner sc=new Scanner(System.in);
            a3.name=sc.nextLine();
            a3.type=sc.nextLine();
            a3.food=sc.nextLine();

            System.out.println("Name of animal 3 : "+a3.name+"\nType : "+a3.type);
            System.out.println("Food : "+a3.food);
            System.out.println();

            //calling method (Eat)  with object 1 & 2.
            a1.eat(a1.name);
            a2.eat(a2.venomous,a2.name);

            //method calling with object 1 & 3
            a1.bite(a1.venomous,a1.name);

            a3.bite(a3.name);




    }
}
