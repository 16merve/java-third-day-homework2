package staticDemo;

public class ProductValidator {//bir ürünü kaydederken,güncellerken ürünün kurallara uygun olup olmadığını bulunmak için kullanırız.
	static {
		System.out.println("Static Yapıcı blok çalıştı");
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");//biseyde çalışması için gerekli.
	}
    public static boolean isValid(Product product) {
    	if(product.price>0 && !product.name.isEmpty()) {//! değilse anlamına gelir.
    		return true;
    	}else {
    		return false;
    	}
    	
    }
    public void bisey() {
    	
    }
    public static class BaskaBirClass{//inner class class içinde class olma durumu buradaki kodu çalıştırmak için sınıf static olabilir.
    	public static void Sil() {
    		
    	}
    }
}
