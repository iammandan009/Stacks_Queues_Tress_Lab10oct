package com.greatLearning.main;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;



//import java.util.*;

public class BalancingBrackets 
{
	 // function to check if brackets are balanced
   private static boolean checkingBalancedBrackets(String expression)
   {
	// Using ArrayDeque is a better approach than using Stack class
	   Deque<Character> stack = new ArrayDeque<Character>();
	   
	   for(int i=0; i<expression.length(); i++)
		   {
			   char x = expression.charAt(i);
			   if(x=='(' || x== '{' || x== '[')
			   {
				// Push the element in the stack
				   stack.push(x);
				   continue;
			   }
			   
			   // If current character is not opening
	            // bracket, then it must be closing. So stack
	            // cannot be empty at this point.
			   if(stack.isEmpty())
				   return false;
			   char check;
			   switch(x)
				   {
			         case ')':
			             check = stack.pop();
			        	 if(check == '}'|| check==']')
			        	    return false;  
			        			 break;
			         case '}':
			             check = stack.pop();
			        	 if(check == ')'|| check==']')
			        	    return false;  
			        			 break;	
			         case ']':
			             check = stack.pop();
			        	 if(check == '}'|| check==')')
			        	    return false;  
			        			 break;			 
			         
				   
				   }
			   
		   }
	       return(stack.isEmpty());  
	   
	 
   }
   
   public static void main(String args[])
   
   {
	   Scanner usrInput = new Scanner(System.in);
	   System.out.println("Please enter the expression to check");
	   String expression = usrInput.next();
	   if(checkingBalancedBrackets(expression))
			   System.out.println("Brackets are Balanced");
	   else System.out.println("Brackets are not Balanced");
	   usrInput.close();
	   
	   
   }
   
         
}
