import java.util.Scanner;


class Guess{
int GuessNum;

int GuessTheNum()
{
Scanner s=new Scanner(System.in);
System.out.println("Guesser Pls enter the number");
GuessNum=s.nextInt();
return GuessNum;
}
}

class Player{

    int PlayerNum;
    int PlayerNumber(){
        Scanner a=new Scanner(System.in);
        System.out.println("Player pls enter the number");
        PlayerNum=a.nextInt();
        return PlayerNum;

    }
}

class Umpire{
    int G;
    int P1;
    int P2;
    int P3;

    void GuesserNum(){
             Guess g=new Guess();
             G=g.GuessTheNum();
    }
    void Play(){
              Player p= new Player();
                P1=p.PlayerNumber();
                P2=p.PlayerNumber();
                P3=p.PlayerNumber();
    }

    void compare(){
        if(G==P1){
            System.out.println("P1 won the game");
        }

        else if(G==P2){
            System.out.println("P2 won the game");
        }

        else if(G==P3){
            System.out.println("P3 won the game");
        }
        else{
            System.out.println("All are lost .Let's Play Again");
        }
    }
}



public class Guesser
{
public static void main(String[] args)

{
Umpire u=new Umpire();
u.GuesserNum();
u.Play();
u.compare();
}
}