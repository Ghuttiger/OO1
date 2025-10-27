package tp1.punto12;
import java.util.List;
public class LIFO implements Strategy{
	public JobDescription selectNextJob(List <JobDescription> jobs) {
		return jobs.get(jobs.size()-1);
	}
}
