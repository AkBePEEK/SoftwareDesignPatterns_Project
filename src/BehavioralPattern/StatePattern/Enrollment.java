package BehavioralPattern.StatePattern;

public class Enrollment {
    private EnrollmentState state;

    public Enrollment() {
        this.state = new PendingState();
    }

    public void proceed() {
        if (state != null) {
            state = state.proceed();
        }
    }
}
