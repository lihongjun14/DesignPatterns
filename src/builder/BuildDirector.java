package builder;

public class BuildDirector {
//�����߳��н����ߵ�����
private Builder builder;
public BuildDirector(Builder builder){
	this.builder=builder;
}
public void construct(){
	builder.buildPart1();
	builder.buildPart2();
}
}
