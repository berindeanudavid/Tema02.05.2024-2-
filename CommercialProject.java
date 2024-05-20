import java.util.ArrayList;

public class CommercialProject extends Project{
    private int nrOfTeams;
    private long marketingFunds=this.sumOfFunds()/2;
    private String deadline;
    private int maxNumberOfParticipants=15;
    public CommercialProject(Programmer manager, ArrayList<Programmer> participants, String title, String objective, ArrayList<Long> funds, int nrOfTeams, String deadline) {
        super(manager, participants, title, objective, funds);
        this.nrOfTeams=nrOfTeams;
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
    public int getNrOfTeams(){
        return this.nrOfTeams;
    }
    public void setNrOfTeams(int nr){
        if(nr<this.getParticipants().size()){
            this.nrOfTeams=nr;
        }
    }
    public long getMarketingFunds(){
        return this.marketingFunds;
    }
    public double getRisk(){
        return this.nrOfTeams*3/this.getParticipants().size()/(this.sumOfFunds()/2);
    }
}
