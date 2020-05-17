import com.fdmgroup.model.Professor;
import com.fdmgroup.model.Student;
import com.fdmgroup.persistence.ProfessorDao;
import com.fdmgroup.persistence.StudentDao;

public class Client {

	public static void main(String[] args) {
		StudentDao sd = new StudentDao();
		ProfessorDao pd = new ProfessorDao();
		Student s = new Student("Mohd12", "Rajwani12", "11232");
		String x = "gdgdsg";
		Professor p = new Professor(x, "1321");
		boolean f = pd.delete(41);
		System.out.println(f);
	}

}
