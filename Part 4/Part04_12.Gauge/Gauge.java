public class Gauge {

    private int value;

    public Gauge() {
        //Empty by default
    }

    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        return value == 5;
    }
}
