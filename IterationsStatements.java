package week1.day1;

import java.util.HashMap;

import java.util.Map;

public class IterationsStatements {

	//(iterations means doing a repetitive job)
	 //For loop(repetitive) || For .. Each  || While || Do while
//*for loop*//
	
	public static void main(String[] args) {
		// for(initializing; condition; incre/decre)
		
		System.out.println("Test leaf");
			
		for( int i=1; i<=30  ; i=i+2) {   //i++ post incremental arithmatic operator.
			
			System.out.println((i));
		}
		
					// double initializing the value//
	for(int a=1; a<=20; a=a+1) {		
			if(a%2==1)
	System.out.println(a+ " is an odd number");
	else 	if(a%2==0) 
		System.out.println(a+ " is an even number");
		}				
	
	//incre/decre  format is not usable must used with an condition format. +2
	
	int k=1;					
	for (int k1=1; k1<=20; k1=k1+2) {
		System.out.println(k1+ "is odd number"); 	
		}	
	}
	
//public class ClaimsWorkflow 
{

    // Define roles and their approval limits
    private static final Map<String, Double> approvalLimits = new HashMap<>();

    static {
        approvalLimits.put("Senior Manager", Double.MAX_VALUE); // Unlimited
        approvalLimits.put("Manager", 75000.00);
        approvalLimits.put("Assistant Manager", 50000.00);
        approvalLimits.put("Senior Supervisor", 25000.00);
        approvalLimits.put("Claims Officer", 12500.00);
    }

    public static void main(String[] args) {
        // Example amount initiated by a lower-level user
        double initiatedAmount = 70000.00; // Replace with actual initiated amount
        String currentUserRole = "Claims Officer"; // Replace with actual user role

        // Process the workflow
        processWorkflow(initiatedAmount, currentUserRole);
    }

    private static void processWorkflow(double amount, String userRole) {
        // Check if the current user's role can approve the amount
        Double limit = approvalLimits.get(userRole);
        
        if (limit == null) {
            System.out.println("User role not recognized.");
            return;
        }

        if (amount <= limit) {
            System.out.println("Amount approved by " + userRole + ": €" + amount);
        } else {
            // Trigger the workflow to the next higher role
            String nextRole = getNextHigherRole(userRole);
            if (nextRole != null) {
                System.out.println("Amount €" + amount + " requires approval from " + nextRole);
            } else {
                System.out.println("No higher role available for approval.");
            }
        }
    
    }
    private static String getNextHigherRole(String currentRole) {
        // Logic to find the next higher role
        if (currentRole.equals("Claims Officer")) {
            return "Senior Supervisor";
        } else if (currentRole.equals("Senior Supervisor")) {
            return "Assistant Manager";
        } else if (currentRole.equals("Assistant Manager")) {
            return "Manager";
        } else if (currentRole.equals("Manager")) {
            return "Senior Manager";
        }
        return null; // No higher role
    	}
	}
}