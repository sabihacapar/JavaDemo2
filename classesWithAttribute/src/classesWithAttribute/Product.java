package classesWithAttribute;

public class Product {
	//her iki şekilde de product olması aşırı yükleme yani overriding olur
	public Product(int _id,String _name,String _description,double _price,int _stockAmount) {
		System.out.println("Yapıcı Blok Çalıştı");
		this._id=_id;
		this._name=_name;
		this._price=_price;
		this._description=_description;
		this._stockAmount=_stockAmount;
	}
	
	public Product() {
		
	}
	
	//attribute or field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	
	private String kod;
	
	

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		this._id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String getKod() {
		return this._name.substring(0,1)+_id;
	}

	
	
	
	

}
