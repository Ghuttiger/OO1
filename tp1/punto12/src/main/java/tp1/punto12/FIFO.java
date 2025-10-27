package tp1.punto12;
import java.util.List;
public class FIFO implements Strategy{
	
	public JobDescription selectNextJob(List<JobDescription>jobs){
		return jobs.get(0);
	}
}
