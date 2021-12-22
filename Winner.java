class Program {
    // * use two variables String winner and integer to have max score and a hashmap
    // * to have team's score, at the end of the array, return the result. O(N)
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String bestTeam = "";
        int maxScore = 0;
        Map<String, Integer> _records = new HashMap<String, Integer>();
        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> competition = competitions.get(i);
            int result = results.get(i);
            String winningTeamName = "";
            if (result == 1) {
                winningTeamName = competition.get(0);
            } else {
                winningTeamName = competition.get(1);
            }

            int teamCurrentScore = 0;
            if (_records.containsKey(winningTeamName)) {
                teamCurrentScore = _records.get(winningTeamName);
            }
            teamCurrentScore += 3;
            _records.put(winningTeamName, teamCurrentScore);
            if (teamCurrentScore > maxScore) {
                maxScore = teamCurrentScore;
                bestTeam = winningTeamName;
            }
        }
        return bestTeam;
    }
}
