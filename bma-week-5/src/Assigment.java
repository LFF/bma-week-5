import java.sql.Date;


public class Assigment {

	/**
	 * 
	 *  add task class and constructor, parmed and not parmed
	 *  get element test value of index
	 *  
	 * @param args
	 */
	public static void main(String[]  args) {
		
			
		 
		   int  index  =   0;
		      
			
			  String  values []  = {"a", "b", "c", "d", "e"};
			       		
 			
	         getElement(values, index);
			
		
		
	}
	
	
	
	 static String getElement(String values[]  , int  index) {
		 
		 
		  if  ( index < 0  ||  index  > values.length ) 
			  
			  
			  
		  {		System.out.println("bad index" + index);
			  
		 
		           return null;  }
		  
		  
		  else
			  
		  {
		  
		           
		       	System.out.println("valid index"  + index);
		           
		
		    return values[index];
		 
		 
				
			}
			
	 }
			
	

}




       class Task { 
        	   
        	     String taskDescription;
        		 Date taskDueDate;
        		 String taskStatus;

        	  
                                Task (String taskDescription)  {
                                	
                                	this.taskDescription = taskDescription;
                                	
                                	
                                	
                                }
                                
                                Task ( )
 
                                {
                                	
                                	this.taskDescription = taskDescription;
                                	
                                }
                                
                                
        	   
           }


