import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		//MyList ml = new MyList(); 
		//ml.addLast("tatu");
		//ml.add("toto"); 
		//ml.add("titi"); 
		//ml.addLast("tutu");
		//System.out.println(ml.toString());
		//System.out.println(ml.size());
		MyListTest1 jeu_tests = new MyListTest1();
		//jeu_tests.sizeList(); ok
		//jeu_tests.sizeList2(); ok
		//jeu_tests.printList(); ok
		//jeu_tests.addList(); ok
		//jeu_tests.addList2(); ok
		//jeu_tests.getList1(); // ok Warning : List va de 1 à n et non pas de 0 à n-1 pour moi première case est la case d'indice 1 !
		//jeu_tests.getList2(); ok
		//jeu_tests.getInvalid(); ok
		//jeu_tests.getInvalid2(); ok
		//jeu_tests.addNull(); ok
		//jeu_tests.addNull2(); ok
		//jeu_tests.toStringSpeed(); ok Run Time == 11392 
		//MyListGen for_test = new MyListGen(1); SumLetters n'a plus de sens car l'on peut avoir un Integer ou peut importe quelle type d'object /-> solution : on peut utliser un compteur static à la place.
		HashMap<Point, Circle> m = new HashMap<>(); // table de hachage key= point donne = circle
		Point p1 = new Point(100,150);
		Circle c1 = new Circle(100,p1);
		m.put(p1, c1);
		System.out.println(m.containsKey(p1));
		//System.out.println(m.containsKey(new point(1,2))); // Unresolved compilation problem: point cannot be resolved to a type
		Point p2 = new Point(100,150);
		System.out.println(m.containsKey(p2)); // False Pas le même object !! Solution : utiliser le circle c1 !
		System.out.println(m.containsKey(c1.getPoint())); // True :) ok
	}

}
