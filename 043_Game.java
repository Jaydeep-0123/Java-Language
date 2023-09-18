import java.util.Scanner;

class TicTacToe{
     int winPos[][];
	char user='X';
	int value[];
	boolean gameIsLive = true;
	TicTacToe(){
		winPos = new int [8][3];
     winPos[0]= new int []{0,1,2};
	 winPos[1]= new int []{3,4,5};
	 winPos[2]= new int []{6,7,8};
	 winPos[3]= new int []{0,3,6};
	 winPos[4]= new int []{1,4,7};
	 winPos[5]= new int []{2,5,8};
	 winPos[6]= new int []{0,4,8};
   	 winPos[7]= new int []{2,4,6};

	 value=new int[] {2,2,2,2,2,2,2,2,2};
	} 

	public void draw(){
	  for(int i=0;i<value.length;i+=3)
	  {
	  	String s= " |"+getChar(value[i])+" |"+getChar(value[i+1])+
	  		" |"+getChar(value[i+2]);
	   	System.out.println(' '+s);
	  	System.out.println(" ----------");
	  }
	}

	public char getChar(int val){
	  if(val==2)
	  	return ' ';
	  else if(val==1)
	  	return 'X';
	  else 
	  	return 'O';
	} 
        
     
    public void start()
    {
      while(gameIsLive)
      {
      	draw();
      	readInput();
      	checkGameAlive();
      }

    }


    public void checkGameAlive()
    {
      for(int i=0;i<value.length;i++)
      {
      	if(value[i]==2)
      		return;
      }
      System.out.println("Game over!");
      gameIsLive=false;
    }

	public void readInput()
	{
      System.out.println("Now "+user+" it's your turn! Plz enter your pos(1-9) ");
      Scanner sc= new Scanner(System.in);
      int userInput=sc.nextInt();    
      if(userInput >=1 && userInput <=9 && value[userInput-1]==2)
      {
      	value[userInput-1]=user=='X'?1:0;
      	checkWinner();
      	user=user=='X'?'0':'X';
      }
      else 
      	System.out.println("Invalid Input!");
	}
	public void checkWinner(){
	 for(int i=0;i<winPos.length;i++)
	 {
	 	int t[] = winPos[i];
	 	int first=t[0];
	 	int second=t[1];
	 	int third=t[2];
	 	if (value[first]!=2 && value[first] == value[second] && value[second]==value[third])
	 	{
	 		draw();
	 		System.out.println(user + "You are winner");
	 		System.exit(0);
	 	} 
	 }
	}
}


public class Game
{
  public static void main(String[] args){
  	TicTacToe t=new TicTacToe();
  	t.start();
  }
}
