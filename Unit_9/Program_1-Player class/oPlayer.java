class oPlayer extends HumanPlayer{
    Player opposite;
    
    public oPlayer(){
        askPlayer();
        opposite = super.second;
        HumanPlayer enemie = new xPlayer(opposite);  
        
    }
    
    public oPlayer(Player opposite){
        this.opposite = opposite; 
    }
    
    public Player opposite(){
        return opposite;
    }
    
    public String toString(){
                return "o, the only best one";
        }     
    
}