public class Bus extends Vehicle{

    private int busStops;
    private int stopTime;


    public Bus(){}

    public Bus(int busStops, int stopTime) {
        this.busStops = busStops;
        this.stopTime = stopTime;
    }

    public Bus(int code, double distance, double averageSpeed, int busStops, int stopTime) {
        super(code, distance, averageSpeed);
        this.busStops = busStops;
        this.stopTime = stopTime;
    }

    public int getBusStops() {
        return busStops;
    }

    public void setBusStops(int busStops) {
        this.busStops = busStops;
    }

    public int getStopTime() {
        return stopTime;
    }

    public void setStopTime(int stopTime) {
        this.stopTime = stopTime;
    }

    @Override
    public double vehicleTime() {
        return (getDistance()/ getAverageSpeed()) + (busStops*stopTime);
    }
}
