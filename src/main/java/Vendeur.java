
public class Vendeur extends Employe{
	
	double commission;
	
	public Vendeur(int année) {
		super(année);
		this.année = année;
	}

	
	@Override
	public double calculSalaire() {
		return (salaireMensuel + (2020-année)*20) + commission;
	}

}
