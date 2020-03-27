
import java.util.ArrayList;
import org.junit.Test;


public class TestSalaire {
	
	@Test
	public void TestSalaires () {
		
		
		ArrayList<Employe> allEmployees = new ArrayList<Employe>();
		
		Employe e1= new Employe(1996);
		Employe e2= new Employe(2004);
		Vendeur v1 = new Vendeur(2005, 40);
		Manager m1 = new Manager(2000);
		
		allEmployees.add(e1);
		allEmployees.add(e2);
		allEmployees.add(v1);
		allEmployees.add(m1);
		
		
		
		
	}

}
