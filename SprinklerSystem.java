public class SprinklerSystem {
    public static void main(String[] args) {
        WaterSprinklerSystem sprinklers = new WaterSprinklerSystem();  // Adjusted to new class name
        System.out.println(sprinklers);
    }
    static class WaterSource {
        private String s;

        WaterSource() {
            System.out.println("WaterSource()");
            s = "Constructed";
        }

        public String toString() { return s; }
    }

    public static class WaterSprinklerSystem {  // Renamed inner class
        private String valve1, valve2, valve3, valve4;
        private WaterSource source = new WaterSource();
        private int i;
        private float f;

        public String toString() {
            return
                    "valve1 = " + valve1 + " " +
                            "valve2 = " + valve2 + " " +
                            "valve3 = " + valve3 + " " +
                            "valve4 = " + valve4 + "\n" +
                            "i = " + i + " " + "f = " + f + " " +
                            "source = " + source;
        }

    }
}
