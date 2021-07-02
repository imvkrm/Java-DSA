public class MainClassSingletone {
    
    public static void main(String[] args) {
        
       // AppConfig obj=new AppConfig(); //can't create instance becoz constructor of AppConfig is private
        AppConfig obj=AppConfig.getInstance();
    }
}
