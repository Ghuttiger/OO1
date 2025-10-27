package tp1.punto12;
import java.util.List;
public class HighestPriority implements Strategy{
	public JobDescription selectNextJob(List <JobDescription>jobs) {
		return jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
	}
}
