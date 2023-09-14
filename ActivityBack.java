import java.util.*;

public class ActivityBack{

      Scanner scan = new Scanner(System.in);
   
   public ActivityBack(int size){
   
      int array [] = new int [size];
   
   }
   
//Populate   
   
   public void Populate(int array [], int size){
   
      System.out.print("Enter the elements:  ");   
   
            for(int i = 0; i < size; i++ ){
      
               array[i] = scan.nextInt();
      
            } 
   
   }

   
//Selections
  
  
  public void Selections(int array [], int size){
  
       int selections;
       
          for(int i = 0; i < 7; i++){
   
            System.out.print("Select Operations: ");
               selections = scan.nextInt();
               
                 if(selections == 1){
               
                     Print(array,size);
               
                 }   
               
                 else if(selections == 2){
               
                    Insert(array,size);
               
                 }
               
                 else if(selections == 3){
               
                    Delete(array,size);
               
                 }
               
                 else if(selections == 4){
               
                    Search(array,size);
               
                 }
               
                 else if(selections == 5){
               
                    Sort(array,size);
               
                 }
               
                 else if(selections == 6){
               
                    System.exit(0);
               
                 }
               
   
         }
         
         System.out.println("");
      
  
  }  
   
//Print   
   
   public void Print(int array [], int size){
  
      System.out.print("The Printed Elements: ");
   
         for(int i = 0; i < size; i++){
      
            System.out.print(array[i] + " ");
      
         }
      
      System.out.println("");
   
   }

// Insert

   public void Insert(int array [], int size){
   
      int n;
      int num;
      int position;
      int arr [] = new int[size + 1 ];
         
         System.out.print("Enter the size " + size +  " for Inserting:  ");
         
            for(int i = 0; i < size; i++){
            
               arr[i] = scan.nextInt();
            
            }   
            
         System.out.print("Type a number of index: ");  
             num =  scan.nextInt();    
       
         System.out.print("Enter an element to be inserted: ");
            position = scan.nextInt();
            
            for(int i = size - 1; i >= (position - 1); i-- ){
            
               array[i +1] = array[i];
            
            }    
            
               array [position - 1] = num;
             
            for(int i = 0; i <= size; i++){
            
               System.out.print(array[i] + " ");
            
            }
            
         System.out.println("");
         
   }  
   
   //Delete

      public void Delete(int array [], int size){
      
         int delete;
         
            System.out.print("The Elements of the array:  ");
         
         for(int i = 0; i < size; i++){
         
            System.out.print(array [i] + " ");
         
         }
         
            System.out.println("");
         
               System.out.print("Choose an Element to delete: ");
                  delete  = scan.nextInt();
         
         for(int i = 0; i < array.length; i++){
         
            if(array[i] == delete){
            
               for(int j = i; j < array.length - 1; j++){
               
                  array[j] = array[j + 1];
               
               }
               
               break;
            
            } 
         
         }
         
               System.out.print("Delete an array after selecting the element: ");
         
         for(int i = 0; i < array.length; i++){
         
            System.out.print(array[i] + " ");
         
         }
         
               System.out.println("");
      
      
      }
      
//Searching Elements

   public void Search(int array [], int size){
   
           System.out.print("The Elements of the array:  ");
      
      for(int i = 0; i < size; i++){
      
           System.out.print(array[i] + " ");
      
      }
      
            System.out.println(" ");
      
      int search;
      
         System.out.print("Choose an element to search: ");
           search = scan.nextInt();
         
         System.out.println("");
     
      for(int i = 0; i < array.length; i++){
      
         if(array[i] == search){
         
            Selections(array,size);
         
         }
         
         else{
         
            System.out.print("Element not found!");
         
         }
      
      } 
      
      System.out.println("");
          
           
   
   }      

// Sort Elements

   public void Sort(int array [], int size){
   
      int temp = 0; 
      
         for(int i = 0; i < size; i++){
            
            for(int  j = i + 1; j < size; j++){
               
               if(array[i] > array[j]){
               
                  temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
               
               }
            
            }
         
         }
       
       System.out.print("Sorted Array: ");
       
         for(int i = 0; i < size - 1; i++){
            
               System.out.print(array[i] + " ");
            
         }  
         
         System.out.print(array[size - 1]);

      System.out.println("");  
   
   }


// Ending Bracket

}