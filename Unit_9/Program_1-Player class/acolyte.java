class acolyte extends Player{
 
    public String toString(){
        return "one who attends or assists a leader; follower";
    }     
        
    public void playerGreet(){
        super.playerGreet();
        System.out.print("or is it?");
    }    
}