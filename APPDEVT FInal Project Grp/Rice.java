package csb.appdevt.finalproject;

public class Rice {
	String Fname;
	String Lname;
	int Ricetype;
	double Kilos;
	int Price;
	double AmountPaid;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getRicetype() {
		return Ricetype;
	}
	public void setRicetype(int ricetype) {
		Ricetype = ricetype;
	}
	public double getKilos() {
		return Kilos;
	}
	public void setKilos(double kilos) {
		Kilos = kilos;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public double getAmountPaid() {
		return AmountPaid;
	}
	public void setAmountPaid(double amountPaid) {
		AmountPaid = amountPaid;
	}
	public String getFullname() {
		return Fname + " " + Lname;
	}
	
	public double getTotal() {
		double total = 0;
		if (Ricetype == 1)
		{
			double Price = 20;
			total = (Price * Kilos);

			
		}
		else if (Ricetype == 2)
		{
			double Price = 25;
			total = (Price * Kilos);

			
		}
		else if (Ricetype == 3)
		{
			double Price = 22;
			total = (Price * Kilos);

			
		}
		else if (Ricetype == 4)
		{
			double Price = 24;
			total = (Price * Kilos);
			
		}
		return total;

	}
	public double getchange() {
		return (AmountPaid - getTotal());
	}
	}

