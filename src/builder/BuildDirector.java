package builder;

public class BuildDirector {
//导演者持有建造者的引用
private Builder builder;
public BuildDirector(Builder builder){
	this.builder=builder;
}
public void construct(){
	builder.buildPart1();
	builder.buildPart2();
}
}
