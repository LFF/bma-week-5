import java.sql.Date;


public class Assigment {

	/**
	 * 
	 *  
	 * @param args
	 */
	
		
	         static Task Task;
	         
	         
	         
	         
	         public static String values[] = {"task a", "task b", "task c", "task d", "task e"};
	         
	         
	         public static String status [] = {"planned", "dated", "current", "finished"};
	         
	        
	         
	         
	         
	         
	         
	public static void main(String[]  args) {
		
			
		   String  stringindex =  args[1];
		   
		   Integer indx = Integer.valueOf(stringindex);
			     			
		   
	        
	  	Task = new Task (getElement(values, indx));
	     		
	     		
	    System.out.println(Task.toString());	
	     		
	     		
	     Task aTask = new Task(getElement(values, indx), status[indx + 1]);
	     
	     			     			     		
	    System.out.println(aTask.toString());	     		
	     		
	     			     		
	     		
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
        		 

								Task ( )
 
                                {
                                	
									 taskDescription="";
									 taskStatus="";	
									
									
                                }
                                
								
							     Task (String taskDescription)  {
	                                	
	                                	this.taskDescription = taskDescription;
	                                	taskStatus="";	
										
	                                	
	                                }
							     
							     
							     Task (String taskDescription, String taskStatus)  {
	                                	
	                                	this.taskDescription = taskDescription;
	                                	this.taskStatus = taskStatus;
	                                	
	                                	
	                                	
	                                	
	                                }
							     
							     
					     
							     
	                    		
				public String toString() {
						
				return "Task - Description: " + taskDescription + "  " + taskStatus;
								
				}	
								
								
								
        	   
           }


