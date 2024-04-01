package university.faculty;

public class FacultyOffice {

    private FacultyMember facultyMember;
    private String location;

    public FacultyOffice(FacultyMember facultyMember, String location) {
        this.facultyMember = facultyMember;
        this.location = location;
    }
    public FacultyMember getFacultyMember() {
        return facultyMember;
    }

    public void setFacultyMember(FacultyMember facultyMember) {
        this.facultyMember = facultyMember;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
