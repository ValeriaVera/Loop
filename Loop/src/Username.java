import java.util.Scanner;
public class Username {
	public static void main(String[] args){
		 
        String password = "Test";
        String inputPass;
        Scanner  input = new Scanner(System.in);
         
        System.out.println("Enter Your Username:");
        inputPass = input.nextLine();
 
        if (inputPass.equals(password)) {
            System.out.println("Welcome User!");
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter Your Password:");
                inputPass = input.nextLine();
                if (inputPass.equals(password)) {
                    System.out.println("Welcome User!");
                } 
                   else{System.out.println("Please contact your adminstrator to unlock your account!");
                  }        
         }
        }
    }
}