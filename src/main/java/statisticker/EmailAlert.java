package statisticker;

public class EmailAlert implements IAlerter{
    private boolean emailSent;

    @Override
    public void signalAlert() {
        emailSent = true;
    }

    @Override
    public boolean getAlert() {
        return emailSent;
    }
}
