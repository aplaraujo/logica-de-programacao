public class PredecessorSuccessorResult {
    private final int predecessor;
    private final int successor;

    public PredecessorSuccessorResult(int predecessor, int successor) {
        this.predecessor = predecessor;
        this.successor = successor;
    }

    public int getPredecessor() {
        return predecessor;
    }

    public int getSuccessor() {
        return successor;
    }
}
