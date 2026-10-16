public class FootballMatchFacade {
    PlayerManager playerManager = new PlayerManager();
    TacticsManager tacticsManager = new TacticsManager();
    EquipmentManager equipmentManager = new EquipmentManager();
    WarmUpManager warmUpManager = new WarmUpManager();

    public void prepareForMatch(){
        System.out.println("=== FOOTBALL MATCH PREPARATION ===");
        playerManager.prepare();
        tacticsManager.prepare();
        equipmentManager.prepare();
        warmUpManager.prepare();

        System.out.println("Math preparation complected.");
    }
}
