public abstract class Trip {
    private String tripNumber;
    private double distance;
    private  double speed;
    private  String startTime;

    public String getTripNumber() {
        return tripNumber;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public abstract int calculateDuration();

    public abstract double priceTrip(double km);
    public  double convertMinToHoure(int min){
        return  min/60.0;
    }

    public String calculateArriveTime(){
        String [] times=startTime.split(":");
        int hToM=Integer.parseInt(times[0]);
        int Mins=Integer.parseInt(times[1]);
        int totalMin=hToM+Mins;
        double hour=calculateDuration()+totalMin;

       // double time=Integer.parseInt(startTime)/calculateDuration(totalMin);
        return  ""+(hour-12);
    }
}
