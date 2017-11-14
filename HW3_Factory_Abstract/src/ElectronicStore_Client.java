
public class ElectronicStore_Client {
	protected AbstractFac nameFac;
	Remote newRemote;
	TV newTV;
	
	public ElectronicStore_Client(AbstractFac name) {
		this.nameFac = name;
	}
	
	void askProducts() {
		nameFac.makeRemote();
		nameFac.makeTV();
	}
	
}
