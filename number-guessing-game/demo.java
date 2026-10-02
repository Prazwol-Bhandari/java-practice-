import java.util.Scanner;

public class demo {


    public static void numberGuess(){

        // NUMBER GUESSING GAME UPTO 100

        Scanner sc = new Scanner(System.in);
        
        // Number of tries
        int n = 5;
        System.out.printf("YOU HAVE %d ATTEMPTS TO GUESS THE NUMBER ! \n",n);

        // Computer guess 
        int guess = 1+ ( int )( Math.random() * 100) ;
        System.out.println(guess);


        for(int i = 0; i<n; i++){

            System.out.print("Enter your guess  :");
            int humanGuess = sc.nextInt();



            if(humanGuess == guess){
                System.out.println("Congrats ! You Guessed The Correct Number ");

                return ;

            }


            else if(humanGuess < guess) {
                System.out.printf("Your guess %d is lower then the computer's guess\n",humanGuess);
            }

            else{
                System.out.printf("Your guess %d is higher then the computer's guess\n",humanGuess);
            }


        }

        System.out.println("Sorry , You have run out of attempts ");

    }



    public static void main(String[] args) {
        numberGuess();
    }
}


