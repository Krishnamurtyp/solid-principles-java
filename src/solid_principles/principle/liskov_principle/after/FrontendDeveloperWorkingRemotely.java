package solid_principles.principle.liskov_principle.after;

public class FrontendDeveloperWorkingRemotely extends Developer implements RemotelyWorkingDevelopers {

	@Override
	public void doNotGoToOffice() {
		// TODO Auto-generated method stub
		System.out.println("I work from home ! ");
	}

}
