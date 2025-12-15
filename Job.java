package job_portal;

public class Job {
    private int id;
    private String title;
    private String company;
    private String location;

    public Job(int id, String title, String company, String location) {
        this.id = id;
        this.title = title;
        this.company = company;
        this.location = location;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCompany() { return company; }
    public String getLocation() { return location; }

    @Override
    public String toString() {
        return "Job ID: " + id + ", Title: " + title + ", Company: " + company + ", Location: " + location;
    }
}
