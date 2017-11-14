
public class FactorySamSung implements AbstractFac{

	@Override
	public Remote makeRemote() {
		// TODO Auto-generated method stub
		return new SamsungRemote();
	}

	@Override
	public TV makeTV() {
		// TODO Auto-generated method stub
		return new SamsungTV();
	}
	

}
