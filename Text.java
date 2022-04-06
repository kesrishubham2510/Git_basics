public class Text {
	
private String token;

	Text(String token){
        setString(token);
		getString();
	}

    public void setString(String token){
       this.token = token;
	   System.out.println("This is second terminal");
	}


	public void getString(){
       System.out.println(token);
	}
}
