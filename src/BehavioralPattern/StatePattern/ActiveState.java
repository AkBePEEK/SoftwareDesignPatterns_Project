package BehavioralPattern.StatePattern;

public class ActiveState implements EnrollmentState {
    @Override
    public EnrollmentState proceed() {
        return new CompletedState();
    }
}
