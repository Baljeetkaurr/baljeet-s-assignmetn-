
//Name: Baljeet Kaur 
//Student ID:201906713
//Date Submitted:03/19/2021
//Class IN2203 Section Number G1
//Name of work: Assignment 1: The gambling Game
package javacode;
import java.util.*;
import java.lang.Math;


public class MainApplicaton {
    public static void main(String[] args){
    Casino c= new Casino();
    c.OrganizeNewGame();
    }
}
class Casino{
    Player p1= new Player();
    Game g1= new Game();
    String userAnswer;
        Scanner s= new Scanner(System.in);
        public void OrganizeNewGame(){
            System.out.println("Welcome to the Casino: Would you like to play a game? (y/n)");
        userAnswer= s.nextLine();
        if(userAnswer.equals("y")){
            System.out.println("let's get started");
                    g1.PlayGame();
                    p1.user_interaction();
                    p1.Game_design();
}
else
{System.out.println("Good bye");}
}
}
class Game{
    Random r= new Random();
    int ComputerGuess= r.nextInt(100) ;
    
    public void PlayGame(){
        System.out.println("Guess a number from 1 to 100");
        System.out.println("I'll guess a game ");
        System.out.println("If your guess is within 20 of my guess: then you win . Else i will win  ");
        ComputerGuess= ComputerGuess();
    }
     public int ComputerGuess(){
      int programGuess;
       programGuess = r.nextInt(100);
      return programGuess;
     }
}
class Player extends Game{// class pplayer inherits class game
    String player_name;
    int player_age;
    Scanner sc= new Scanner(System.in);
    Game o= new Game();// o is obj for game class
    public void user_interaction()
    {
         System.out.println("Enter Name");
        player_name= sc.nextLine();
        System.out.println("Enter Age");
        player_age= sc.nextInt();
        if(player_age< 18)
        {
            System.out.println("Sorry , you are not allowed to gamble");
        }
        else 
            System.out.println("Lets begin the GAME!");
    }
    
    public void Game_design()
    {
        int r= 5;// no. of rounds
        int num_guess;// the number user guess
        
        for(int i=1; i<= r;i++)
        {
            System.out.println("guess your number");
            num_guess= sc.nextInt();
            
            if(Math.abs(num_guess - o.ComputerGuess)< 20 )
            {System.out.println("Jackpot! you won the Game");
                System.out.println("The Number is within 20 of the number to be guessed, try again" );
            break;}
            
            else 
            {
                System.out.println(" oh! no , the number is not within 20 of " + o.ComputerGuess);
            }
            if(i==r)
            {
                System.out.println("you are out of trials");
                System.out.println("The number is"+ ComputerGuess);
            }
            
        }
        
        
    }
    
}
        

