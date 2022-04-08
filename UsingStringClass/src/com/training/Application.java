package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringService service=new StringService();
		
		
		int key=13;
		switch (key) {
		case 1:
			service.stringEquals("ram", "ram");
			break;
		case 2:
			service.stringObjectEquals();
			break;
		case 3:
			service.usingTrim("   Ramesh   ");
			break;
		case 4:
			service.lengthOfString("   Ramesh   ");
			break;
		case 5:
			service.usingSubString("Ramesh is a boy");
			break;
		case 6:
			service.usingCharAtIndexof("ramesh@gmail");
			break;
		case 7:
			service.usingReplace("ramesh@gmail.com", "ramesh@gmail.com");
		case 8:
			service.usingConcat("Hello", " Chennai");
			break;
		case 9:
			service.usingCompareTo("Ram", "Ram");
			break;
		case 10:
			service.usingStringFormat("Ramesh", 43.5432);
			break;
		case 11:
			service.usingStringFormat(17);
			break;
		case 12:
			service.usingStringFormat(16, 16);
			break;
		case 13:
			service.usingStringFormat("ram", "Ramesh");
			break;
		case 14:
			service.usingStringFormat(-53156L);
			break;
		default:
			break;
		}
	}

}
