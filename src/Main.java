class Main{
    public static void main(String[] args){
        FootballMatchFacade footballMatchFacade = new FootballMatchFacade();
        PlayerPreparationFacade playerPreparationFacade = new PlayerPreparationFacade();

        playerPreparationFacade.preparePlayer();
        footballMatchFacade.prepareForMatch();


    }
}