
public class TreeStore {
	private Tree nameTree;
	
	public TreeStore(Tree in) {
		this.nameTree = in;
	}
	
	public void prepare() {
		Star addStar = new Star(nameTree);
		RedBall addRedBall = new RedBall(addStar);
	}
}
