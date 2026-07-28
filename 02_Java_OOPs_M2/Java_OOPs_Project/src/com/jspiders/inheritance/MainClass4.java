package com.jspiders.inheritance;
class InstagramOld{
	void post() {
		System.out.println("Post in Instagram");
	}
}

class InstagramNew extends InstagramOld{
	void messanger() {
		System.out.println("Message in Instagram");
	}
}
public class MainClass4 {
	public static void main(String[] args) {
		InstagramOld igOld = new InstagramOld();
		igOld.post();
		System.out.println("-------------------------");
		InstagramNew igNew = new InstagramNew();
		igNew.post();
		igNew.messanger();
	}
}

//Output
//Post in Instagram
//-------------------------
//Post in Instagram
//Message in Instagram