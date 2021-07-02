public class AppConfig {
    private AppConfig() {
    } // now u can't create instance of this class outside

    private static AppConfig appConfig=null;//if we create instatace here it take memory even if we don't use it 

    public static AppConfig getInstance() {
        if (appConfig == null) {
            appConfig = new AppConfig();
        }
        return appConfig;
    }
}
