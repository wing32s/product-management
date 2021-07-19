/**
 * 
 */
package labs.pm.app;

import java.math.BigDecimal;

import labs.pm.model.Product;

/**
 * @author Ken
 *
 */
public class Shop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product p = new Product();
		
		p.setId(101);
		p.setName("Tea");
		p.setPrice(new BigDecimal("1.99"));
		
		System.out.println("Product Details:"); 
		System.out.printf("%d %s %.2f %.2f %n", 
				p.getId(), p.getName(), p.getPrice(), p.getDiscount());
	}

}
