
public class Vendeur extends Employe{
	
	double commission;
	
	public Vendeur(int année, double commission) {
		super(année);
		this.année = année;
		this.commission = commission;
	}

	
	@Override
	public double calculSalaire() {
		return (salaireMensuel + (2020-année)*20) + commission;
	}

}
