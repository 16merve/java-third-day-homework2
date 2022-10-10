package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager(); //Hangi sınıftaki print kodunu kullanacaksak onu tanımladık.
        customerManager.getCustomers();
	}

}
