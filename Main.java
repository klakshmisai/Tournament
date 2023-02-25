import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static void main(String args[])throws Exception{
        List<Team>teams=new ArrayList<>();
        teams.add(newTeam("India"));
        teams.add(newTeam("Australia"));
        teams.add(newTeam("England"));
        teams.add(newTeam("Pakistan"));
        teams.add(newTeam("NZ"));
        List<Match> Matches=Scheduler.createSchedule(teams);
        System.out.println(matches);
        simulator.play Matches(matches);
        simulator.showpointsTable(table,matches);
    }
}
public class match{
    private Team team1;
    private Team team2;
    private Team Winner;
    private Team loser;
    Match(Team team,Team team3){
        this.team1=team;
        this.team2=team3;
    }
    public Team getTeam1(){
        return team1;
    }
    public Team get Team2(){
        retur team2;
    }
    public Team get Winner(){
        return winner;
    } 
    public void set Winner(Team Winner){
        this winner=Winner;
    }
    public Team get loser(){
        return loser;
    }
    public void setLoser(Team loser){
        this loser=loser;
    }
    @Override
    public String to String(){
        String matchDescription =team1+"vs"+team2;
        if(Winner !=null){
            String result="\n Winner="+this.winner.toString()+"Loser="+this.loser.toString()+\n";
            matchDescription = matchDescription + result;
        }
        return matchDescription;
    }
}
class Scheduler{
    public static List<Match>createSchedule(List<team>teams){
        List<Match>matches=new ArrayList<>();
        for(int i=0;i<teams.size();i++);
        for(int j=i+1;j<teams.size();j++){
         Match match=new Match(teams.get(i)),teams.get(j));
         matches.add(match);
        }
    }
    return matches;
}
public class Simulator{
    /**
     * @param matches
     */    
      public static void play matches(List<Match>matches){
        for(Match match:matches){
            int random = (int)((Math.random()*10)+1);
            //my random logic=this could be antthing
            if(random %2 == 0){
                match.setWinner(match.getTeam1());
                match.setLoser(match.getTeam2());
            }
            else{
              match.setLoser(match.getTeam2());
              match.setLoser(match.getTeam1());
            }
         }
    }
}

static void showpointsTable(List<Team>teams,List<Match> matches){
    for(Teamteam teams){
        int WonGames = matches.stream().filter(m->m.getWinner().equals team)).collect(Collectors.toList()).size();                                              
        int lostGames = matches.stream().filter(m->m.getLoser().equals team)).collect(Collectors.toList()).size();   
        System.out.println(team);
        System.out.println(String valueOf(wonGames));
        System.out.println(String valueOf(lostGames));
    }

}
public class Team{
    private String name;
    Team(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        //TODO Auto-generated method stub
        return this.name.equals(((Team)obj).name);
    }
}
        
        
     
        
        
        
        
        
      
