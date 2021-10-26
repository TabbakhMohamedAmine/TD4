
public class Cell_object {
	private Object obj;
	private Cell_object suivant;
	
	public Cell_object(Object obj, Cell_object next) {
		this.obj=obj;
		this.suivant = next;
	}
	public Object getObj() {
		return this.obj;
	}

	public Cell_object getsuivant() {
		return this.suivant;
	}
}
