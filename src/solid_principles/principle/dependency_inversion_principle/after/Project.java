package solid_principles.principle.dependency_inversion_principle.after;

import java.util.List;

public class Project  {
	private List<Developer> developers;

    public Project(List<Developer> developers) {

        this.developers = developers;
    }

    public void implement() {
        developers.forEach(d->d.doMyJob());
    }
}
