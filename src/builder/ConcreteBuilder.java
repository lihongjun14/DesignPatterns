package builder;

public class ConcreteBuilder implements Builder {
	private Product product=new Product();

	@Override
	public void buildPart1() {
		product.setPart1("����1");

	}

	@Override
	public void buildPart2() {
		product.setPart2("����2");

	}

	@Override
	public Product reResult() {
		// TODO �Զ����ɵķ������
		return product;
	}

}
