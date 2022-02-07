import java.util.Scanner;

class Palindrome{
    public static void main(String args[]){

Scanner scan= new Scanner(System.in);

String userWord=scan.nextLine();



String reverse = "";
int checker = userWord.length()-1;
userWord = userWord.toLowerCase();
while (checker>=0)
{
    reverse+=(userWord.charAt(checker));
    checker--;
}   
 System.out.println(reverse);
  if (userWord.equals(reverse)){
    System.out.println(userWord + " is a palindrome.");
  }
  else{  
    System.out.println(userWord + " is not a palindrome.");
  }
   
    }
}