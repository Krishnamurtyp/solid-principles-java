package solid_principles.principle.single_responsability.after;

public class FrontendDeveloper implements Developer,IFrontendDeveloper {

	@Override
	public void makeDesignWithFigma() {
		// TODO Auto-generated method stub
		System.out.println("I make designs with Figma");
	}

	@Override
	public void workOnCode() {
		// TODO Auto-generated method stub
		System.out.println("I am writing frontend code !");
	}	

}
