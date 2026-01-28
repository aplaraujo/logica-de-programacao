public class ElectionResult {
    private final int totalQuantity;
    private final double validVotesPercentage;
    private final double votesAPercentage;
    private final double votesBPercentage;
    private final double votesCPercentage;
    private final double nullVotesPercentage;
    private final double blankVotesPercentage;

    public ElectionResult(int totalQuantity, double validVotesPercentage, double votesAPercentage, double votesBPercentage, double votesCPercentage, double nullVotesPercentage, double blankVotesPercentage) {
        this.totalQuantity = totalQuantity;
        this.validVotesPercentage = validVotesPercentage;
        this.votesAPercentage = votesAPercentage;
        this.votesBPercentage = votesBPercentage;
        this.votesCPercentage = votesCPercentage;
        this.nullVotesPercentage = nullVotesPercentage;
        this.blankVotesPercentage = blankVotesPercentage;
    }

    public double getValidVotesPercentage() {
        return validVotesPercentage;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public double getVotesAPercentage() {
        return votesAPercentage;
    }

    public double getVotesBPercentage() {
        return votesBPercentage;
    }

    public double getVotesCPercentage() {
        return votesCPercentage;
    }

    public double getNullVotesPercentage() {
        return nullVotesPercentage;
    }

    public double getBlankVotesPercentage() {
        return blankVotesPercentage;
    }
}
