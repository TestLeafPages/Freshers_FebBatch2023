package week2.day1;

public class Mobile {
	public void switchOn() {
		System.out.println("switchOn");
	}
	public void sendText() {
		System.out.println("sendText");
	}
	
	public void watchMovie() {
		System.out.println("watchMovie");
	}
	public void playMusic() {
		System.out.println("playMusic");
	}
	public void switchOff() {
		System.out.println("switchOff");
	}
	
	public static void main(String[] args) {
		Mobile myMob=new Mobile();
		myMob.switchOn();
		myMob.sendText();
		myMob.watchMovie();
		myMob.playMusic();
		myMob.switchOff();
		
		
	}

}
