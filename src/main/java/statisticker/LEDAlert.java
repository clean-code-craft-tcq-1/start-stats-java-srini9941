package statisticker;

public class LEDAlert implements IAlerter{
    private boolean ledGlows;

    @Override
    public void signalAlert() {
        ledGlows = true;
    }

    @Override
    public boolean getAlert() {
        return ledGlows;
    }
}
