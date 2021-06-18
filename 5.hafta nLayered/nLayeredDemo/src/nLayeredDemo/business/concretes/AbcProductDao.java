package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class AbcProductDao  implements ProductDao{

	@Override
	public void Add(Product product) {
		System.out.println("Abc ile eklendi " + product.getName());
		
	}

	@Override
	public void Delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
