package BehavioralPattern.StatePattern;

public class CompletedState implements EnrollmentState {
    @Override
    public EnrollmentState proceed() {
        return null; // End of lifecycle
    }
}
