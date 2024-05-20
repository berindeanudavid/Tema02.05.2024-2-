import java.util.ArrayList;

public abstract class Project implements Risky{
    private Programmer manager;
    private ArrayList<Programmer> participants=new ArrayList<Programmer>();
    private String title;
    private String objective;
    private ArrayList<Long> funds;
    public Project(Programmer manager, ArrayList<Programmer> participants, String title, String objective, ArrayList<Long> funds){
        this.manager=manager;
        this.participants=participants;
        this.title=title;
        this.objective=objective;
        this.funds=funds;
    }
    public Programmer getManager(){
        return this.manager;
    }
    public ArrayList<Long> getFunds(){
        return this.funds;
    }
    public void addFund(long fund){
        this.funds.add(fund);
    }
    public void setManager(Programmer p){
        this.manager=p;
    }
    public String getObjective(){
        return this.objective;
    }
    public void setObjective(String objective){
        this.objective=objective;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public ArrayList<Programmer> getParticipants(){
        return this.participants;
    }
    public void addParticipant(Programmer p){
        this.participants.add(p);
    }
    public long sumOfFunds(){
        long sum=0;
        for(long fund:this.funds){
            sum=sum+fund;
        }
        return sum;
    }
}