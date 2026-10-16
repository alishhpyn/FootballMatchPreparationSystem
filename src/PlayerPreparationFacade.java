public class PlayerPreparationFacade  {
    HealthCheckManager healthCheckManager = new HealthCheckManager();
    FitnessManager fitnessManager = new FitnessManager();
    NutritionManager nutritionManager = new NutritionManager();

    public void preparePlayer(){
        System.out.println("=== PLAYER PREPARATION ===");
        healthCheckManager.prepare();
        fitnessManager.prepare();
        nutritionManager.prepare();

        System.out.println("Player preparation complected.");
    }
}
