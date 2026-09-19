package dsifacelearn;


interface playable {
    void play();
}
class guitar implements playable{
	public void play() {
		System.out.println("instrument gitar");
	}
}
class piano implements playable{
	public void play() {
		System.out.println("instrument piano");
	}
}
public class main{
	public static void main(String[] args) {
		guitar g=new guitar();
		g.play();
		piano p=new piano();
		p.play();
	}
}
