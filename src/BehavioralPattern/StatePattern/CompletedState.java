package BehavioralPattern.StatePattern;

public class CompletedState implements EnrollmentState {
    @Override
    public void proceed(Enrollment enrollment) {
        System.out.println("Enrollment is already completed.");
    }
}
