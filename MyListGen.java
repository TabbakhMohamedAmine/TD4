
public class MyListGen {
	private Cell_object tete;
	
	public boolean contains(Object obj) {
		if(this.tete==null)return false;
		Cell_object temp = this.tete;
		while(temp!=null) {
			if(temp.getObj()==obj) {
				return true;
			}
			temp=temp.getsuivant();
		}
		return false;
	}
	public MyListGen(Object obj) {
		Cell_object nouveau = new Cell_object(obj,null);
		this.tete = nouveau;
	}
}
