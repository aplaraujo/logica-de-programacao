public class PredecessorSuccessorService {
    public PredecessorSuccessorResult calculate(int a) {
        int predecessor = a - 1;
        int successor = a + 1;
        return new PredecessorSuccessorResult(predecessor, successor);
    }
}
