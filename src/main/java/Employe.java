
public class Employe extends CalculeSalaire{


	final protected int salaireMensuel= 1500;
	protected int année;
	
	
	
	public Employe(int année) {
		super();
		this.année = année;
	}



	@Override
	public double calculSalaire() {
		return salaireMensuel + (2020-année)*20;
	}
	

}
