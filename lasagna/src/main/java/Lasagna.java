public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int elapsed) {
        return (new Lasagna().expectedMinutesInOven() - elapsed);
    }

    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }

    public int totalTimeInMinutes(int layers, int elapsed) {
        return (new Lasagna().preparationTimeInMinutes(layers) + elapsed);
    }
}
