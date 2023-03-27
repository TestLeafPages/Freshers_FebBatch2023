package week6.day1;

import java.util.ArrayList;
import java.util.List;

import week4.day3.sample;

public class Samsung implements AndroidDesign,  SamsungDesign{

	@Override
	public void makeCall() {
		System.out.println("Make call");
		
	}

	@Override
	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println("Send  Sms");
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("Switch On");
	}

	public void samsungNote() {
		System.out.println("Samsung note");
	}
	public static void main(String[] args) {
		Samsung  samsung=new Samsung();
		samsung.makeCall();
		samsung.switchOn();
		samsung.sendSms();
		samsung.samsungNote();
		List<String> obj=new ArrayList<>();
		AndroidDesign design=new Samsung();
		
		design.makeCall();
		design.switchOn();
		design.sendSms();
		design.samsungNote();
		
		SamsungDesign design2=new Samsung();
		design2.voiceRecognization();
		design2.faceAuthendication();
		design2.samsungNote();
		design2.makeCall();
		design2.switchOn();
		design2.sendSms();
		
	}

	@Override
	public void takePhoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void faceAuthendication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voiceRecognization() {
		// TODO Auto-generated method stub
		
	}


	

}
