import java.io.*;
import java.util.ArrayList;
 
class i {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
      
        //FOR STORING CHARACTER WE MUST KEEP THE DATATYPE AS CHARACTER NOT STRING,THAN IT WILL GIVE YOU A ERROR;
          //adding elements in the list of array;
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);
          list.add(6);
          list.add(7);
          list.add(8);
          list.add(9);
         

          
            System.out.println(list);//printing all the elemnts in the array before 5;
            //updating the element in the index 1 with 10; 
        
list.add(1,10);
System.out.println(list);
list1.add(1000);//must use " double inverted comma as it is strings".
System.out.println(list1);
list.addAll(list1);//adding one list with other list;
System.out.println(list);
list.remove(0);
System.out.println(list);//removing element from a list using index;
list.remove(Integer.valueOf(1000));//removing the desired elemnts without using the index;
System.out.println(list);

// updating the list with a new number at the index 4;
list.set(4,122);
System.out.println(list.contains(122));// check if the desired given number is present or not;
System.out.println(list);
          }
         
       
         
           
            //adding elements in the list of array;
           
            
            

        }
 
        // add method for integer ArrayList
        
        
       
   
            
       
