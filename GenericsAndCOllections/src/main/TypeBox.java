package main;

public class TypeBox<T,E> {

	
	private T item;
	private E itemE;
	
	public TypeBox() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public TypeBox(T item) {
		super();
		this.item = item;
	}


	public String getInfo() {
		return item.getClass().toString();
	}
	

	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public E getItemE() {
		return itemE;
	}
	
	public void setItemE(E itemE) {
		this.itemE = itemE;
	}
}
