package solid_principles.principle.single_responsability.after;

public class BackendDeveloper implements Developer,IBackendDeveloper {

	@Override
	public void dbConception() {
		// TODO Auto-generated method stub
		System.out.println("I work  on DB Conception !");
	}

	@Override
	public void workOnRestAPI() {
		// TODO Auto-generated method stub
		System.out.println("I work  on REST API !");
		
	}

	@Override
	public void workOnCode() {
		// TODO Auto-generated method stub
		System.out.println("I work  on backend code !");
		
	}

}
