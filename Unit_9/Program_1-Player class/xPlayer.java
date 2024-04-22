class xPlayer extends HumanPlayer{
    Player opposite;

    public xPlayer(){
        askPlayer();
        opposite = super.second;
        HumanPlayer enemie = new oPlayer(opposite);  
        
    }
    
    public xPlayer(Player opposite){
        this.opposite = opposite; 
    }
    public String toString(){
        return "x, extremely good";
        }     
}