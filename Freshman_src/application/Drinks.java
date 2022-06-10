package application;

public class Drinks {
	
	private String ID;
	private String name;
	private String px_price,sv_price,fm_price,calories;
	
	public Drinks(String ID,String name,String px_price,String sv_price,String fm_price,String calories) {
		this.ID=ID;
		this.name=name;
		this.px_price=px_price;
		this.sv_price=sv_price;
		this.fm_price=fm_price;
		this.calories=calories;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPX_price() {
		return px_price;
	}
	
	public String getSV_price() {
		return sv_price;
	}
	
	public String getFM_price() {
		return fm_price;
	}
	
	public String getCalories() {
		return calories;
	}

}
