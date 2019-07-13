public class Main {

    public static void main(String[] args) {
        League<Team<BaseballPlayer>> baseballLeague = new League<>("MLB");
        Team<BaseballPlayer> cinncinatiReds = new Team<>("Cinncinati Reds");
        Team<BaseballPlayer> bostonRedSox = new Team<>("Boston Red Sox");
        Team<BaseballPlayer> clevelandIndians = new Team<>("Cleveland Indians");

        baseballLeague.add(cinncinatiReds);
        baseballLeague.add(bostonRedSox);
        baseballLeague.add(clevelandIndians);

        baseballLeague.showLeagueTable();

    }
}
