public class Game {

//runs main game
    public static void main(String[] args) {

        char grid[][] = new char[3][3];

        grid = step('u', 0, 0);

        for(int i = 2; i >= 0; i--){
            for(int j = 2; j >= 0; j--)
                System.out.print("Char at: " + j + " " + i + " - " + grid[j][i] + " ");
            System.err.println();
        }

        
    }

//move one square in a lateral direction
    public static char[][] step(char d, int x, int y){

        char [][] f = new char[3][3];

        switch (d){
        case 'l':
            if(x != 0)
                f[x-1][y] = 'X';
        case 'r':
            if(x != 2)
                f[x+1][y] = 'X';
        case 'u':
            if(y != 0)
                f[x][y-1] = 'X';
        case 'd':
            if(y != 2)
                f[x][y+1] = 'X';
        }

        return f;

    }

//'jumps' in a lateral direction a distance from 1-3
    public static char [][] leap(char d, int m, int x, int y){

        char [][] f = new char[3][3];

        switch (d){
            case 'l':
                if(x != 0){
                    if(x - (m-1) >= 0)
                        f[x-(m-1)][y] = 'X';
                    else
                        f[0][y] = 'X';
                }
            case 'r':
                if(x != 2){
                    if(x + (m-1) <= 2)
                        f[x+(m-1)][y] = 'X';
                    else
                        f[2][y] = 'X';
                }
            case 'u':
                if(y != 0){
                    if(y + (m-1) <= 2)
                        f[x][y+(m-1)] = 'X';
                    else
                        f[x][2] = 'X';
                }
            case 'd':
                if(y != 2){
                    if(y - (m-1) >= 0)
                        f[x][y-(m-1)] = 'X';
                    else
                        f[x][0] = 'X';
                }
            }


        return f;

    }

//attacks a square in a lateral direction by one square
//diagonal added later
    public static char [][] fire(char d, int x, int y){

        char [][] f = new char[3][3];

        return f;

    }

//activates special ability dependant on player
//references object types to be created later
    public static char [][] act(int x, int y){

        char [][] f = new char[3][3];

        return f;

    }

}
