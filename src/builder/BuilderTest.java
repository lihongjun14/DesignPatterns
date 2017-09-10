package builder;

public class BuilderTest {

	public static void main(String[] args) {
		//�������彨���߶���
		Builder builder=new ConcreteBuilder();
		//���������߶��󣬲��Ѿ��彨���߶��󽻸������߶������
		BuildDirector dir=new BuildDirector(builder);
		dir.construct();
		//���ز�Ʒ���ͻ�
		Product product=builder.reResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());

	}

}
