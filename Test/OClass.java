//Player 2
//Ability: hits all squares in one-square radius

public class OClass {

    String name;
    int health;

    public OClass(){
        this.name = "O";
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
