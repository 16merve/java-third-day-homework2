package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager; //miras aldığımız sınıfı tanımladık
	
    public void getCustomers() {
    	databaseManager.getData();//buradaki kodu tanımlamak için miras sınıfı yukarıda tanımladık.Çünkü ana sınıf o.
    }
}
