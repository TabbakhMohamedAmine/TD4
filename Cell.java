
public class Cell {
	private String element;
	private Cell suivant;
	
	public Cell(String str, Cell suiv) {
		this.element = str;
		this.suivant = suiv;
	}
	public Cell get_suivant() {
		return this.suivant;
	}
	public String get_str() {
		return this.element;
	}
	public void change_next(Cell next) {
		this.suivant = next;
	}
	public String toString() {
		return this.element;
	}
}
