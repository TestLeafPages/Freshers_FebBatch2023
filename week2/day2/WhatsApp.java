package week2.day2;

public class WhatsApp {
	
	public void sendMessage() {
		System.out.println("Send the message in your group");
	}
	protected void shareLocation() {
		System.out.println("share the live location");
	}
	  void videoCall() {
		System.out.println("Make a video call");
	}
	private void sendMoney() {
		System.out.println("Send Money");
	}
	public static void main(String[] args) {
		WhatsApp myApp =new WhatsApp();
		myApp.sendMessage();
		myApp.shareLocation();
		myApp.videoCall();
		myApp.sendMoney();
	}
}
  