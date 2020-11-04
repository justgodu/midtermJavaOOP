public class Train extends Vehicle{

    private int blockingCoefficient;

    public Train(int blockingCoefficient) {
        this.blockingCoefficient = blockingCoefficient;
    }

    public Train(int code, double distance, double averageSpeed, int blockingCoefficient) {
        super(code, distance, averageSpeed);
        this.blockingCoefficient = blockingCoefficient;
    }

    public int getBlockingCoefficient() {
        return blockingCoefficient;
    }

    public void setBlockingCoefficient(int blockingCoefficient) {
        this.blockingCoefficient = blockingCoefficient;
    }

    @Override
    public double vehicleTime() {
        return (getDistance() / getAverageSpeed()) + blockingCoefficient;
    }
}
