public class Role {
    private String name;
    private String level;
    private String department;

    public Role() {
    }

    public Role(String name, String level, String department)
{
    this.name = name;
    this.level = level;
    this.department = department;
}
public String getName() {
    return name;
}
public String getLevel() {
    return level;
}
public String getDepartment() {
    return department;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}