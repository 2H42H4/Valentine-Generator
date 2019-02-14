import java.lang.Math;
import java.util.Scanner;
class Main {
 enum Type{food, animal, plant, assorted}
    public static void main(String[] args) {
        System.out.println("Enter the category of valentine you would like: ");
        Scanner input = new Scanner(System.in);
        String str_category = input.nextLine();
        String[] str_type_array = {"food", "animal", "plant", "assorted"};
        String[] food = {"You're the apple of my eye", "You must be sugar because you're very sweet"};
        String[] animal = {"To my significant otter", "You're beary sweet"};
        String[] plant = {"Aloe you vera much", "We're peas in a pod"};
        String[] assorted = {"I pikachoose you", "Are you the imperial British navy? Because you really impress me"};
        int int_category = Type.valueOf(str_category);
        int random = (int)((Math.rand() *2));
        switch(int_category){
         case 0:
          System.out.println(food[random]);
         break;
         case 1:
         System.out.println(animal[random]);
         break;
         case 2:
         System.out.println(plant[random]);
          break;
         case 3:
          System.out.println(movie[random]);
          break;
         case 4:
          System.out.println(assorted[random]);
          break;
         default:
          System.out.println("Happy Valentine's Day!");
  
        
        }
        
        
    }
    
}
