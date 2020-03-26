
public class Employe extends CalculeSalaire{

	final private int salaireMensuel= 1500;
	private int annéeAnciennete;
	
	

	@Override
	public double calculSalaire() {
		return salaireMensuel + annéeAnciennete*20;
	}
	

}
