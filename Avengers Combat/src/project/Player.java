package project;



public class Player {
    
private int score;
private String name;
private static Player [] HighestScores = new Player [10];
private static int topPlayers = 0;
private Champion championSelected;
private Champion opponentSelected;
private boolean hitNow;
        private numOfPlayers n;
        private level L;

public Player(int score, String name, Champion championSelected, Champion opponentSelected, numOfPlayers n, level l) {
this.score = score;
this.name = name;
this.championSelected = championSelected;
this.opponentSelected = opponentSelected;
                this.n = n;
                this.L = l;
                
                if(this.n == numOfPlayers.one){
                    
                    ComputerPlayerMain c1 = new ComputerPlayerMain(this.L, opponentSelected);
                }
}

        public Champion getChampionSelected() {
        return championSelected;
    }

public boolean getHit(){
return this.hitNow;
}
        
public void setHit (boolean hit){
this.hitNow = hit;
}

private void InsertionSort (Player [] players, int n) {
for (int i = 1 ; i < n ; i++) {
Player key =  players[i];
        int j = i-1;

        while (players[j].score < key.score && j > -1) { // sorting
            players[j+1] = players[j];
            j = j-1;
        }
        players[j+1] = key;
    } 
}

public void addIfHighScore(Player player) {
if (topPlayers < 10) { //checking for empty positions in the score sheet
HighestScores[topPlayers++] = player;
//Insertion Sort
InsertionSort(HighestScores, topPlayers);
} else {
if (player.score > HighestScores[9].score) {
HighestScores[9] = player;
//Insertion Sort
InsertionSort(HighestScores, topPlayers);
} 
} 
}

public void updateData (String name, int score){
this.name = name;
this.score += score;
}
        
public void updateData(int score) {
this.score += score;
}    

}





