package university.courses;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    private Course course;
    private List<String> schedule;

    public CourseSchedule(Course course) {
        this.course = course;
        this.schedule = new ArrayList<>();
    }

    public void addSchedule(String day, String time) {
        schedule.add(day + " " + time);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<String> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<String> schedule) {
        this.schedule = schedule;
    }
}

