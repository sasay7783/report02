package report02_1;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		String productName1 = p1.getProductName();
		String prodcutname2 = p2.getProductName();
		//��ҹ��� ���� ����
		return productName1.compareToIgnoreCase(prodcutname2);
	}

}
