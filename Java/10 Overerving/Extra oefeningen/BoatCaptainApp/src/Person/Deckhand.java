package Person;

public class Deckhand extends Person {

	public String nickName = "";
	
	public Deckhand(int age, String nickName) {
		this("", age, nickName);
	}
	
	public Deckhand(String name, int age, String nickName) {
		super(name, age);
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	

	
}
