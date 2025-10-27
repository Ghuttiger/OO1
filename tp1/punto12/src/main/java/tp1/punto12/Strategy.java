package tp1.punto12;

import java.util.List;

public interface Strategy {
	JobDescription selectNextJob (List <JobDescription> jobs);
}
