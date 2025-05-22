package QueuePackage;
import java.util.*;
public class Job_Sequencing_Problem {
	static class Job {
        char job_id;
        int deadline;
        int profit;
        Job(char job_id, int deadline, int profit)
        {
            this.deadline = deadline;
            this.job_id = job_id;
            this.profit = profit;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Job> arr = new ArrayList<Job>();
		 
	     arr.add(new Job('a', 2, 100));
	     arr.add(new Job('b', 1, 19));
	     arr.add(new Job('c', 2, 27));
	     arr.add(new Job('d', 1, 25));
	     arr.add(new Job('e', 3, 15));
	     
	     Collections.sort(arr, (a, b) -> {
	            return a.deadline - b.deadline;
	     });
	     
	     for(int i=0; i<arr.size(); i++) {
	    	 System.out.println(arr.remove(i));
	     }
	}

}
