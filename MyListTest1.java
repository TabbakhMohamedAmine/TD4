
public class MyListTest1 {

	public void sizeList() {
		MyList l = new MyList();
		l.add("toto");
		l.add("toto");
		System.out.println(2==l.size());
	}
	
	public void sizeList2() {
		MyList l = new MyList();
		l.addLast("z");
		l.add("toto");
		l.add("toto");
		l.addLast("ez");
		System.out.println(4==l.size());
	}
	
	public void printList() {
		MyList l = new MyList();
		l.add("toto");
		l.add("toto");
		l.add("titi");
		System.out.println("titi, toto, toto".equals(l.toString()));
	}
	
	public void addList() {
		MyList l = new MyList();
		l.add("toto");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
		System.out.println("doh, titi, toto, toto, bla, bli".equals(l.toString()));
	}
	
	public void addList2() {
		MyList l = new MyList();
		l.addLast("toto2");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
		System.out.println("doh, titi, toto, toto2, bla, bli".equals(l.toString()));
	}
	
	public void getList1() { // Liste allant de 1 à n et pas de 0 ... !
		MyList l = new MyList();
		l.addLast("toto2");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
		System.out.println("doh".equals(l.get(1)));
	}
	
	public void getList2() {
		MyList l = new MyList();
		l.addLast("toto2");
		l.add("toto");
		l.add("titi");
		l.addLast("bla");
		l.addLast("bli");
		l.add("doh");
		System.out.println("toto".equals(l.get(3)));
	}
	public void getInvalid() {
		MyList l = new MyList();
		l.addLast("toto2");
		System.out.println(l.get(-1)); //Error 
	}
	
	public void getInvalid2() {
		MyList l = new MyList();
		l.addLast("toto2");
		System.out.println(l.get(10)); //Error 
	}

	public void addNull() {
		MyList l = new MyList();
		l.addLast("totoo");
		l.add(null);
	}
	
	public void addNull2() {
		MyList l = new MyList();
		l.addLast("totoo");
		l.addLast(null);
	}
	
	public void toStringSpeed() {
		long start = System.currentTimeMillis();
		MyList l = new MyList();
		for(int i=0;i<100000;i++) {
			l.add(Integer.toString(i));
		}
		l.toString();	
		System.out.println("Run time : " + (System.currentTimeMillis() - start));
	}
}