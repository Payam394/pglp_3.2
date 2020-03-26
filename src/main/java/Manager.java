
public class Manager extends Employe{

	public Manager(int année) {
		super(année);
		this.année = année;
	}
	
	

	@Override
	public double calculSalaire() {
		return (salaireMensuel + (2020-année)*100) ;
	}

	

}
