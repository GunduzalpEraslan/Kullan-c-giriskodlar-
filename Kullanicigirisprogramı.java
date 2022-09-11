import java.util.Scanner;

public class Kullanicigirisprogramı {
 public static void main(String[] args) {
     // Create variable
   String username,password, answer, newPassword;
   
   // Take the value of user
     Scanner inp = new Scanner(System.in);
     
     System.out.println("Enter your username :");
     username= inp.nextLine();
     System.out.println("Enter your password : ");
     password= inp.nextLine();
     
     if (username.equals("patika") && password.equals("java123")) {
         System.out.println("Login is Succesful! ");
     } else if (!username.equals("patika") || password.equals("java123")) {
         System.out.println("Your user name is not valid. Please re-enter valid user name");
         System.out.println("Dou you want to create new password --> yes/no");
         Scanner scan = new Scanner(System.in);
         answer= scan.nextLine();
         if (answer.equals("no")|| answer.equals("No")) {
             System.out.println("The system is closing/n...........");
         } else if (answer.equals("yes") || answer.equals("Yes")) {
             System.out.println("Type your new password: ");
             newPassword= scan.nextLine();
             {
                 if (newPassword.equals("java123")) {
                     System.out.println("New password can not be the same previous password");
                 } else password= newPassword;{
                 System.out.println("Succesfull changing!");}
             }
         }
     }
 }
 }


