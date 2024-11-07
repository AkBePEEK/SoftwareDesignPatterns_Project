package BehavioralPattern.StatePattern;

public class ActiveState implements EnrollmentState {
    @Override
    public void proceed(Enrollment enrollment) {
        enrollment.setState(new CompletedState());
        System.out.println("Enrollment is now completed.");
    }
}
