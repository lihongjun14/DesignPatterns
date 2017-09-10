package builder;

public class BuilderTest {

	public static void main(String[] args) {
		//创建具体建造者对象
		Builder builder=new ConcreteBuilder();
		//创建导演者对象，并把具体建造者对象交给导演者对象操作
		BuildDirector dir=new BuildDirector(builder);
		dir.construct();
		//返回产品给客户
		Product product=builder.reResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());

	}

}
