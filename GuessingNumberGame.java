import java.util.Scanner;
class GuessingNumberGame{
	public static void main(String[] args) {
		int random_Num=(int)(Math.random()*101); //Genareates Randam Number between 0 to 100
		System.out.print("Guess a Number Between 0 to 100:");
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		while(random_Num!=input){
			if(input<random_Num){
			System.out.println("Too Low,Guess again wisely");
			input=scan.nextInt();

			}

		    else{
		    	System.out.println("Too Big,Guess again wisely");
		    input=scan.nextInt();
		    }
		} 
		System.out.println("Congratulations,You Wonnn!!!!!");

	}
}