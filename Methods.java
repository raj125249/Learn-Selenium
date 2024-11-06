package week1.day1;

public class Methods {
	
	//methods and variables would be under/inside the class. outside the class we dont have any codes.
	
	
/*SYNTAX:  Access modifier	returnType  methodName(arg)	*/
	
	/* Access modifier= Public  ||  private  ||  package/no modifier  || protected */
	
// access modifier
		//	public int v=2;						/* can be access any where/ any one in the Project level->Learnselenium2024*/
		//	private String value ="Rajesh";  	/* can be access only within the class -> Learn methods*/
		//	char r='@';							/* can be access only within the same Package-> week1dayi*/
	
	
	
// returnType
			// 	For every action there will be a return.     --> 	Method with return		--> input = 5rs   output = bananas
			//	For certain actions that will not give you any return.     -->     Method without return		-->		close the door // no return type. 

			//VOID: the things without output/     /action without output/    /there is nothing to return.
				/*	public void printname() {
							System.out.println("test"); }	*/ 
			//Here the Return type is said to be VOID, so we are print the name 
			//Print is an action which is acting on the return type of VOID
			/* If you’re getting an output then we should be able to say what type of output that we are getting, 
 					if you’re not getting an output then we are going to say it is a VOID.
 					Return type should be the last code of the method. */
	//understanding
	/* 				method as get phone num							with the return type.
	 * 						return would be the long 	due to the num has 10 digits	(logically)
	 * 					void getmobilenum
	 * 								syso ("value");
	 */									
	
	
//methodName:  should start with lowercase and follow with the camel case.	should be in meaning full way.			
					//split the methodname should be2 parts
		/* Get: the 1st part is the action.
			Text: the 2nd part is on whom you’re performing the action.  */
			
					/*		getText()
							getCurrentUrl()
							getTitle()
							sendkeys()
							moveToElement()		*/
	/*if  only name is there then it is called a variable if it is followed by ()paranthesis then it is Methodname.
	 *  ex: printName()  == methodName          &&         totalSum == variable.
	 */
	
	
			
/* (arg) means INPUTS.
					
		ARGS means the inputs, or sometimes we may not give the inputs. 
					•	Input - Action  ||  Choco - eat.
					•	Action --> switch off the FAN.			
		Args can be multiple or one
						Depends on the requirements U may pass the args or may not pass the arg.
					the arg can be one or multiple.					





												OBJECTS
			
/* representative of class is known as class   	syntax: "classname obj = new classname()";
 * can be created in any class and can be accessed in any class.
 * 				how to acess methods via objects:
 * 				-->syntax: [datatype variablename	=	obj.methodName()]
 * 
 */




	public int getCarnumber(){
		int getCarnumber = 2345;
		return getCarnumber;
	}
	
	public static void main(String[] args) {
		
		//Methods obj= new Methods(); 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	