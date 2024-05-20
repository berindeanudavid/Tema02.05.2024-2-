import java.util.ArrayList;

public class OpenSourceProject extends Project{
    private ArrayList<String> mailingList;
    public OpenSourceProject(Programmer manager, ArrayList<Programmer> participants, String title, String objective, ArrayList<Long> funds) {
        super(manager, participants, title, objective, funds);
    }
    public ArrayList<String> getMailingList(){
        return this.mailingList;
    }
    public void setMailingList(ArrayList<String> mailingList){
        this.mailingList=mailingList;
    }
    public double getRisk(){
        return (double)this.getParticipants().size()/this.sumOfFunds();
    }
}
