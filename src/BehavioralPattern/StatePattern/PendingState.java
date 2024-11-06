package BehavioralPattern.StatePattern;

public class PendingState implements EnrollmentState {
    @Override
    public EnrollmentState proceed() {
        return new ActiveState();
    }
}
