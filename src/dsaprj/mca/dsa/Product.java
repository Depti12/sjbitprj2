package dsaprj.mca.dsa;
import dsaprj.mca.dsa.Product;

public class Product{
	int prdId;
	String prdName;
	double prdPrice;
	public Product(int prdId, String prdName, double prdPrice) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	
	}

	

	

