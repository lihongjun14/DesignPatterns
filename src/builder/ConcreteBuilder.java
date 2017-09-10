package builder;

public class ConcreteBuilder implements Builder {
	private Product product=new Product();

	@Override
	public void buildPart1() {
		product.setPart1("部分1");

	}

	@Override
	public void buildPart2() {
		product.setPart2("部分2");

	}

	@Override
	public Product reResult() {
		// TODO 自动生成的方法存根
		return product;
	}

}
