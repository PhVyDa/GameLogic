//Player 1
//Ability: hit all squares along diagonals to ends of board

public class XClass {

    String name;
    int health;

    public XClass(){
        this.name = "X";
        this.health = 100;
    }

    public boolean isAlive(){
        if(this.health == 0)
            return false;
        return true;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public void damage(int d){
        this.health -= d;
    }

}
