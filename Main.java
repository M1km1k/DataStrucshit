import java.util.*;

public class Main{

   public static void main(String [] args){
   
      Scanner scan = new Scanner(System.in);
      
         final int MaxSize = 5;
         int array [] = new int [MaxSize];
         int size;
   
      
            
            
                   System.out.print("Input the size of the array: ");
                      size  = scan.nextInt(); 
                              
                   ActivityBack b = new ActivityBack(size);
                   
                   b.Populate(array,size);       
                   b.Selections(array,size);              
                 
             
   
   
   }






}