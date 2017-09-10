package observer;

public class ConcreteObserver implements Observer{
	private String observername;
	private String content;
	private String actionthing;
	public String getObservername() {
		return observername;
	}
	public void setObservername(String observername) {
		this.observername = observername;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getActionthing() {
		return actionthing;
	}
	public void setActionthing(String actionthing) {
		this.actionthing = actionthing;
	}
	@Override
	public void update(Subject subject) {
		content=((ConcreteSubject)subject).getNewstate();
		System.out.println(observername+" ’µΩ¡À"+content+","+actionthing);
		
	}

}
