package interfaces;

public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal,IRepository {//veritabanı ile ilgili operasyonlar Dal'a yazılır.

	@Override
	public void add() {
		System.out.println("My sql eklendi");
		
	}

}
