package treeset;

public class Car  {
  
    int Modelno;
    String name, city;
    int stock;
  
   
    public int getModelno() {
		return Modelno;
	}


	public void setModelno(int modelno) {
		Modelno = modelno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public Car(int Modelno, String name, String city,
               int stock)
    {
        this.Modelno = Modelno;
        this.name = name;
        this.city = city;
        this.stock = stock;
    }
  
    // Override the compareTo() method
	/*
	 * public int compareTo(Car c) { if (stock > c.stock) { return 1; } else if
	 * (stock < c.stock) { return -1; } else { return 0; } }
	 */
}
  
