package labs.pm.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ProductTests {

	@Test 
	void testDefault() {
		Product p = new Product();
		
		assertEquals(0, p.getId());
		assertEquals(null, p.getName());
		assertEquals(BigDecimal.ZERO, p.getPrice());
		assertEquals(new BigDecimal("0.00"), p.getDiscount());
	}
	
	@Test
	void testSetId() {
		Product p = new Product();
		p.setId(101);
		
		assertEquals(101, p.getId());
	}

	@Test
	void testSetName() { 
		Product p = new Product();
		p.setName("Tea");
		
		assertEquals("Tea", p.getName());
	}

	@Test
	void testSetPrice() {
		Product p = new Product();
		p.setPrice(new BigDecimal("1.99"));
		
		assertEquals(1.99, p.getPrice().doubleValue());
		assertEquals(0.2, p.getDiscount().doubleValue());		
	}

	@ParameterizedTest
	@CsvSource({
		"0, 0.00",
		"2.00, 0.20",
		"1.99, 0.20",
		"1.45, 0.15",
		"1.44, 0.14"
	})
	void testDiscount(String priceString, String discountString) {
		Product p = new Product();
		p.setPrice(new BigDecimal(priceString));

		assertEquals(discountString, p.getDiscount().toString());
	}

}
