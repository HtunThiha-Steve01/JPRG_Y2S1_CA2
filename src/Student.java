public class Student {
    private String name;
    private String adminNumber;
    
    public Student(String name, String adminNumber) {
        this.name = name;
        this.adminNumber = adminNumber;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAdminNumber() {
        return this.adminNumber;
    }
    
    public void setAdminNumber(String adminNumber) {
        this.adminNumber = adminNumber;
    }
}
