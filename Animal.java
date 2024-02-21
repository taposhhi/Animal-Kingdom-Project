package kingdom;
import java.util.*;
public class Animal {
        String name;
        String type;
        String food;
        boolean venomous;
        Animal(){
            this.name="Cow";
            this.type="Mammalia";
            this.venomous=false;
            this.food="Grass";
        }
        Animal(String name,String type,boolean x){
            this.name=name;
            this.type=type;
            this.venomous=x;
        }
        Animal(String name,String type,String food){
            this.name=name;
            this.type=type;
            this.food=food;
        }
        void eat(String name){
            switch(name){
                case "Cow":{
                    System.out.println("Cow eats grass\n");
                    break;
                }
                case "Mosquito":{
                    System.out.println("Mosquito eats blood\n");
                    break;
                }
                case "Saap":{
                    System.out.println("Saap eats frog\n");
                    break;
                }
                default :{
                    System.out.println(name+" eats habijabi onek kichu");
                }
            }

        }
        //Overloading method eat
        void eat(boolean type,String name){
            if(type){
                System.out.println(name+" eats poisonous insects and they are venomous\n");
            }
            else{
                System.out.println(name+" takes general meal\n");
            }
        }
        void bite(boolean bite,String name){
            if(bite){
                System.out.println(name+" is venomous and it bites\n");
            }
            else{
                System.out.println(name+" is not venomous and it is not harmful\n");
            }

        }
        //overloading method bite
        void bite(String name){
            switch(name){
                case "Mosquito":{
                    System.out.println(name+" bites but not venomous.\n");
                    break;
                }
                case "saap":{
                    System.out.println(name+" bites & venomous.\n");
                    break;
                }
                case "Cow":{
                    System.out.println(name+" not bites and not venomous.\n");
                    break;
                }
            }
        }
}

