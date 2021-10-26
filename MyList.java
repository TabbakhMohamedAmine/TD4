
public class MyList {
	private Cell tete;
	
	public MyList() {
		this.tete = null;
	}
	public void add(String str) {
		if(str==null) {
			System.out.println("Error NullPointerException.class !");
			return;
		}
		Cell new_element = new Cell(str,this.tete);
		this.tete = new_element;
	}
	public int size() {
		if(this.tete==null) {
			return 0;
		}
		int compteur = 1;
		Cell cell_temp = this.tete;
		cell_temp = cell_temp.get_suivant();
		while(cell_temp!=null) {
			compteur++;
			cell_temp = cell_temp.get_suivant();
		}
		return compteur;
	}
	public String toString() {
		String to_print="";
		if(this.tete==null)return "Liste Vide";
		Cell cell_temp = this.tete;
		to_print=to_print+cell_temp.get_str();
		cell_temp=cell_temp.get_suivant();
		while(cell_temp!=null) {
			to_print=to_print+", "+cell_temp.get_str();
			cell_temp = cell_temp.get_suivant();
		}
		return to_print;
	}
	public void addLast(String str) {
		if(str==null) {
			System.out.println("Error NullPointerException.class !");
			return;
		}
		if(this.tete==null) {
			Cell new_cell = new Cell(str,null);
			this.tete = new_cell;
			return;
		}
		Cell cell_temp = this.tete;
		while(cell_temp.get_suivant()!=null) {
			cell_temp = cell_temp.get_suivant();
		}
		Cell new_cell = new Cell(str,null);
		cell_temp.change_next(new_cell);
	}
	public void add(String str, int i) {
		int number_elements = this.size();
		if(number_elements < i) {
			return; //problem size 
		}
		if(this.tete==null && i==0) { //trivial
			Cell new_cell = new Cell(str,null);
			this.tete = new_cell;
			return;
		}
		int compteur = 1;
		Cell cell_temp = this.tete;
		while(cell_temp.get_suivant()!=null) {
			cell_temp = cell_temp.get_suivant();
			compteur ++;
			if(compteur >= i)break;
		}
		Cell temporaire = cell_temp.get_suivant();
		Cell new_case = new Cell(str,temporaire);
		cell_temp.change_next(new_case);
	}
	public Cell lastElement() {
		if(this.tete==null)return null;
		if(this.size()==1)return this.tete;
		Cell cell_temp = this.tete;
		while(cell_temp.get_suivant()!=null) {
			cell_temp = cell_temp.get_suivant();
		}
		return cell_temp;
	}
	public String get(int index) {
		if(this.tete==null || index<=0 || index > this.size()) {
			return "ERROR";
		}
		Cell cell_temp = this.tete;
		int compteur = 1;
		while(compteur < index) {
			cell_temp = cell_temp.get_suivant();
			compteur++;
		}
		if(cell_temp==null) { //last element is the one we're looking for.
			return this.lastElement().toString();
		}
		return cell_temp.toString();
	}
	public int sumLetters() {
		if(this.tete==null)return 0;
		Cell temp = this.tete;
		int sum = this.tete.get_str().length();
		while(temp!=null) {
			temp=temp.get_suivant();
			sum=sum+temp.get_str().length();
		}
		return sum;
	}
}

