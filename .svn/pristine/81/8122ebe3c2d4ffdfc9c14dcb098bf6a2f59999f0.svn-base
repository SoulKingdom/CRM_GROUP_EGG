package net.wanho.service.product;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import net.wanho.factory.ObjectFactory;
import net.wanho.po.product.ProductType;

public class ProductTypeServiceITest {
	private static final Logger log = Logger.getLogger(ProductTypeServiceITest.class);  
	private ProductTypeServiceI productTypeServiceI = (ProductTypeServiceI) ObjectFactory.getObject("ProductTypeServiceI");
	@Test
	public void testQueryAllThreeNode() {
		List<ProductType> productTypeList = productTypeServiceI.queryAllThreeNode();
		for (ProductType productType : productTypeList) {
			log.debug(productType);
		}
	}

}
