public class ElectionService {
    public ElectionResult calculate(int candA, int candB, int candC, int nullVotes, int blankVotes) {
        int totalElectors = candA + candB + candC + nullVotes + blankVotes;
        int totalValidVotes = candA + candB + candC;
        double totalValidPercentage = ((double) totalValidVotes / totalElectors) * 100;
        double totalAPercentage = ((double) candA / totalElectors) * 100;
        double totalBPercentage = ((double) candB / totalElectors) * 100;
        double totalCPercentage = ((double) candC / totalElectors) * 100;
        double totalNullPercentage = ((double) nullVotes / totalElectors) * 100;
        double totalBlankPercentage = ((double) blankVotes / totalElectors) * 100;

        return new ElectionResult(totalElectors, totalValidPercentage, totalAPercentage, totalBPercentage, totalCPercentage, totalNullPercentage, totalBlankPercentage);
    }
}
