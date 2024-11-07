package BehavioralPattern.StatePattern;

public class Enrollment {
    private EnrollmentState state;

    public Enrollment() {
        this.state = new PendingState();
    }

    public void setState(EnrollmentState state) {
        this.state = state;
    }

    public void proceed() {
        state.proceed(this);
    }
}
