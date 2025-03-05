package GlobalConfigManager;

class ConfigurationManager {
    private static ConfigurationManager instance;
    private final java.util.Map<String, String> configSettings;

    private ConfigurationManager() {
        configSettings = new java.util.HashMap<>();
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return configSettings.getOrDefault(key, "Not Found");
    }

    public void printAllConfigs() {
        for (var entry : configSettings.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}