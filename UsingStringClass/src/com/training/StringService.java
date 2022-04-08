package com.training;

public class StringService {
	
	public void stringEquals(String str1,String str2) {
		
		
		System.out.println("Is Value Same="+str1.equals(str2));
		System.out.println("Are they Pointing to same location ="+ (str1==str2));
		//System.out.println("Are they Pointing to same location ="+ str1==str2);
		//Are they Pointing to same location = ram ==ram
		
	}
	
	
		public void stringObjectEquals() {
			String ram=new String ("Ram");
			String ramudu=new String ("Ram");
		
			
			System.out.println("Is Value Same :="+ram.equals(ramudu));
			System.out.println("Are they Pointing to same location ="+(ram==ramudu));
			
	}
		
	/*	public void usingTrim(String name) {
			
			System.out.println("Without trim="+name);
			System.out.println("trim="+name.trim());
			
		}
		
		public void lengthOfString(String name) {
			//in this we cannot use variable to store the method because the usingTrim() is void
			//String resp=usingTrim(name);
			System.out.println("String Length:="+name.length());
		}
		*/
		
		
        public String usingTrim(String name) {
			
			System.out.println("Without trim="+name);
			System.out.println("trim="+name.trim());
			return name.trim();
		}
		
		public void lengthOfString(String name) {
			
			//String resp=usingTrim(name);
			
			System.out.println("String Length:="+name.trim().length());
		}
		
		public void  usingSubString(String name) {
			
			System.out.println(name.substring(0,3));//beginindex and endindex=rame;
			System.out.println(name.substring(3));//esh is a boy
			
		}
		
		
		public void  usingCharAtIndexof(String name) {
			
			System.out.println("Index position of @"+ name.indexOf('@'));
			System.out.println("Index position of 3"+ name.charAt(3));
		}
		
		
		public void usingReplace(String str1,String str2) {
			
			
			System.out.println(str1.replace(".com",".org"));
			//System.out.println(str2.replace("ramesh","harish"));
			System.out.println(str2.replace('r','k'));
			
			
		}
		
		public void usingConcat(String str1,String str2) {
			// String is immutable-Cnnot change
			System.out.println(str1.concat(str2));
			
			//String Builder isImmutable can change
			StringBuilder builder=new StringBuilder(str1);
			
			builder.append(str2);
			
			System.out.println("Welcome to builder="+builder.toString());
			
		}
		
		
		public void usingCompareTo(String str1,String str2) {
			
			System.out.println(str1.compareTo(str2));
			
		}
		
		
		public void usingStringFormat(String str1,double mark) {
			
			String frmString=String.format("Name = %S", str1);
			System.out.println(frmString);
			
			System.out.println(String.format("Mark =  %.2f", mark));
		}
		
		
		public void usingStringFormat(int mark) {
			
			System.out.println(String.format("Octal %o", mark));
			System.out.println(String.format("HexaDecimal %x", mark));
		}
		
		
		
		
		public void usingStringFormat(int mark1,int mark2) {
			System.out.println(String.format("Octal %1$o ,Hex %2$x",mark1,mark2));
		}
		
		
		public void usingStringFormat(String str1,String str2) {
			
			System.out.println(String.format("%2$s,%1$S",str1,str2));
			
		}
		
		
		public void usingStringFormat(long value) {
			System.out.println(String.format("%+d", value));
			
		}
		
		
}
