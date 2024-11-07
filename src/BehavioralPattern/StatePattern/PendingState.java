package BehavioralPattern.StatePattern;

public class PendingState implements EnrollmentState {
    @Override
    public void proceed(Enrollment enrollment) {
        enrollment.setState(new ActiveState());
        System.out.println("Enrollment is now active.");
    }
}
