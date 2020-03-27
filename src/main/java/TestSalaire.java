

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestSalaire {
	
	@Test
	public void TestEmploye () {
	
		Employe e= new Employe(1996);

		
		//System.out.println(e1.calculSalaire());
		assertEquals(e.calculSalaire(), 1980, 0);
		
	}
	
	@Test
	public void TestVendeur () {
	
		Vendeur v= new Vendeur(2000, 20);

		
		//System.out.println(v.calculSalaire());
		assertEquals(v.calculSalaire(), 1920, 0);
		
	}
	
	@Test
	public void TestManager () {
	
		Manager m= new Manager(2001);

		
		//System.out.println(m.calculSalaire());
		assertEquals(m.calculSalaire(), 3400, 0);
		
	}

}
