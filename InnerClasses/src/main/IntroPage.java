package main;

public class IntroPage implements Page {

	
	private int pageNo;
	private String bottomText;
	
	
	
	public IntroPage(int pageNo, String bottomText) {
		super();
		this.pageNo = pageNo;
		this.bottomText = bottomText;
	}



	@Override
	public String getContent() {
		return "Intro page, pageNo:" + pageNo +
				" bottom text:" + bottomText;
	}

}
