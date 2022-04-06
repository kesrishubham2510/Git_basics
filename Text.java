public class Text {
	
private String token;

	Text(String token){
        this.token = token;
		getString();
	}

	public void getString(){
       System.out.println(token);
	}
}
