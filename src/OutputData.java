public class OutputData {
    private double summary;
    private int numberOfPartitions;
    private double observationalError;

    OutputData(double summary, int numberOfPartitions, double observationalError) {
        this.summary = summary;
        this.numberOfPartitions = numberOfPartitions;
        this.observationalError = observationalError;
    }

    public double getSummary() {
        return summary;
    }

    public int getNumberOfPartitions() {
        return numberOfPartitions;
    }

    public double getObservationalError() {
        return observationalError;
    }

}
