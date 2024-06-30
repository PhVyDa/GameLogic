public class Game {

private static int p1x;
private static int p1y;
private static int p2x;
private static int p2y;

private static String[][] grid;

//runs main game
//very basic logic for now
//want to go over and improve resource usage
//note to self: experiement with tuples and use the coordinates to plan positions
//note to self: see about changing grid to Generic Type to make work with all player class objects

//Game rules: Right now two players (to add more player classes later to be chosen from)
//Each player gets a turn to move on the grid
//if a step, then can fire or act
//if a leap, can only act
//take out the other player by depleting their health
//last player standing wins

//Todo: place print-loop logic into own class
//      switch char[][] to tuples for coordinates
//      flesh out object classes to create 'player classes'
//      flesh out player classes with unique abilities
//      experiment with inputting different grid sizes
//      finish logic and handling for return for fire()
//      finish implmenting logic for act()

    public static void main(String[] args) {

        OClass player1 = new OClass();
        XClass player2 = new XClass();

        while(player1.isAlive() && player2.isAlive()){
            //turn logic goes here
            //needs to be expanded upon
            grid = step('u', 1, 1, player1.getName());
            grid = step('u', 1, 1, player2.getName());

            printGrid();
        }

        
    }

//move one square in a lateral direction
    public static String[][] step(char d, int x, int y, String n){

        String [][] f = new String[3][3];

        switch (d){
            case 'u':
                if(x != 0){
                    f[x-1][y] = "X";
                    break;
                }
            case 'd':
                if(x != 2){
                    f[x+1][y] = "X";
                    break;
                }
            case 'l':
                if(y != 0){
                    f[x][y-1] = "X";
                    break;
                }
            case 'r':
                if(y != 2){
                    f[x][y+1] = "X";
                    break;
                }
        }

        return f;

    }

//'jumps' in a lateral direction a distance from 1-3
    public static String [][] leap(char d, int m, int x, int y){

        String [][] f = new String[3][3];

        switch (d){
            case 'l':
                if(y != 0){
                    if(y - m >= 0)
                        f[x][y-m] = "X";
                    else
                        f[x][0] = "X";
                }
                break;
            case 'r':
                if(y != 2){
                    if(y + m <= 2)
                        f[x][y+m] = "X";
                    else
                        f[x][2] = "X";
                }
                break;
            case 'u':
                if(x != 0){
                    if(x - m >= 0)
                        f[x-m][y] = "X";
                    else
                        f[0][y] = "X";
                }
                break;
            case 'd':
                if(x != 2){
                    if(x + m <= 2)
                        f[x+m][y] = "X";
                    else
                        f[2][y] = "X";
                }
                break;
            }


        return f;

    }

//attacks a square in a lateral direction by one square
//if a player is hit, loses (for now) 10 health
//diagonals logic to be added later
    public static boolean fire(char d, int x, int y){

        String [][] f = new String[3][3];

        switch (d){
            case 'u':
                if(x == 0)
                    return false;
                break;
            case 'd':
                if(x == 2)
                    return false;
                break;
            case 'l':
                if(y == 0)
                    return false;
                break;
            case 'r':
                if(y == 2)
                    return false;
                break;
        }

        f[x][y] = "X";


        return true;

    }

//activates special ability dependent on player
//references object types to be created later
//return a list of tuples, perhaps?
//maybe take in a parameter of the enemy player and return true or false if hit
//could I implement this in the object classes themselves somehow?
    public static char [][] act(int x, int y){

        char [][] f = new char[3][3];

        return f;

    }

//possible replacement for above
//could put this into object class
    public static boolean checkIfHit(){

        return false;
    }

    public static void printGrid(){

        for(int i  = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print("|" + grid[i][j] +"|");
            System.out.println("\n\n");
        }
    }
}
