
public class Assigment {

	/**
	 * 
	 * test assigment file after .gitignore add
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




           class Task {  }




