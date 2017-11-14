
public class FactoryPhilips implements AbstractFac{

	@Override
	public Remote makeRemote() {
		// TODO Auto-generated method stub
		return new PhilipsRemote();
	}

	@Override
	public TV makeTV() {
		// TODO Auto-generated method stub
		return new PhilipsTV();
	}

}
