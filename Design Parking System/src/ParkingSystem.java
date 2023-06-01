public class ParkingSystem {
    public int bigspace;
    public int mediumspace;
    public int smallspace;

    public ParkingSystem(int big, int medium, int small) {
        this.bigspace = big;
        this.mediumspace = medium;
        this.smallspace = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 & bigspace > 0) {
            bigspace--;
            return true;
        } else if (carType == 2 & mediumspace > 0) {
            mediumspace--;
            return true;
        } else if (carType == 3 & smallspace > 0) {
            smallspace--;
            return true;
        } else {
            return false;
        }
    }
}