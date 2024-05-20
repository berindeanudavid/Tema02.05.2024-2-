import java.util.ArrayList;

public class InvestmentCompany {
    private ArrayList<Project> projects;
    public ArrayList<Project> getProjects(){
        return this.projects;
    }
    public void addProject(Project p){
        this.projects.add(p);
    }
    public Project getBestInvestment(){
        Project best=projects.get(0);
        for(int i=1;i<projects.size();i++){
            if(projects.get(i).getRisk()<best.getRisk()){
                best=projects.get(i);
            }
        }
        return best;
    }
    public static void main(String[] args) {
        Programmer p1=new Programmer(19, "David");
        Programmer p2=new Programmer(21,"Marius");
        Programmer p3=new Programmer(50,"Vasile");
        Programmer p4=new Programmer(80, "Constantin");
        ArrayList<Long> smallFunds=new ArrayList<Long>();
        ArrayList<Programmer> programmers=new ArrayList<Programmer>();
        programmers.add(p1);
        programmers.add(p2);
        programmers.add(p3);
        programmers.add(p4);
        smallFunds.add((long)2000);
        Project project1=new MilitaryProject(p4, programmers, "Tempest", "To protect equipment against compromising emanations", smallFunds, "Jsuhda289u2Jsuh9219sJSHuhf", "2026");
        Project project2=new CommercialProject(p4, programmers, "Aplicatie Fitness", "Sa facem o aplicatie fitness", smallFunds, 3, "2025");
        InvestmentCompany company=new InvestmentCompany();
        company.addProject(project1);
        company.addProject(project2);
        System.out.println(company.getBestInvestment());
    }
}
