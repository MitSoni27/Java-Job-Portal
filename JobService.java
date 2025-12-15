package job_portal;

import java.util.*;

public class JobService {
    private List<Job> jobList = new ArrayList<>();
    private int jobIdCounter = 1;

    public void addJob(String title, String company, String location) {
        Job job = new Job(jobIdCounter++, title, company, location);
        jobList.add(job);
        System.out.println("✅ Job added successfully!");
    }

    public void listJobs() {
        if (jobList.isEmpty()) {
            System.out.println("❌ No jobs available.");
            return;
        }
        for (Job job : jobList) {
            System.out.println(job);
        }
    }

    public void searchJob(String title) {
        boolean found = false;
        for (Job job : jobList) {
            if (job.getTitle().equalsIgnoreCase(title)) {
                System.out.println("🔍 Found: " + job);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ No job found with title: " + title);
        }
    }
}
