package model;

//Comparable and Comparator
public class Product implements Comparable<Product>{

	private int id;
	private String name;
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Product) {
			if(this.id == ((Product)obj).getId()) {
				return true;
			}
		}

		return false;
			
		
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


	// -1 -> this object less than o
	// 1 -> this object greater than o
	// 0-> this is same as o
	@Override
	public int compareTo(Product o) {
		
		/*
		if(this.id<o.getId()) {
			return 1;
		}else if(this.id>o.getId()) {
			return -1;
		}
		
		return 0;
		
		*/
		
		return -1*Integer.valueOf(id).compareTo(o.getId());
	}
	
	
}