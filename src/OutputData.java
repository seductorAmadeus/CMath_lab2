public class OutputData {
    private double summary;
    private int numberOfPartitions;
    private double errorValue;

    OutputData(double summary, int numberOfPartitions, double errorValue) {
        this.summary = summary;
        this.numberOfPartitions = numberOfPartitions;
        this.errorValue = errorValue;
    }

    public double getSummary() {
        return summary;
    }

    public int getNumberOfPartitions() {
        return numberOfPartitions;
    }

}
