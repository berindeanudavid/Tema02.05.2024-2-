import java.util.ArrayList;

public class MilitaryProject extends Project{
    private String deadline;
    private int maxNumberOfParticipants=15;
    private String password;
    public MilitaryProject(Programmer manager, ArrayList<Programmer> participants, String title, String objective, ArrayList<Long> funds, String password, String deadline) {
        super(manager, participants, title, objective, funds);
        this.password=password;
        this.deadline=deadline;
    }
    public String getDeadline(){
        return this.deadline;
    }
    public void setDeadline(String d){
        this.deadline=d;
    }
    public int getMaxNumberOfParticipants(){
        return this.maxNumberOfParticipants;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String p){
        this.password=p;
    }
    public double getRisk(){
        return this.getParticipants().size()/this.password.length()/this.sumOfFunds();
    }
}
