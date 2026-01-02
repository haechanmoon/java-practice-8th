package domain;

public enum BallStatus {
    STRIKE(true, true),
    BALL(true, false),
    MISS(false, false);

    private final boolean matchNum;
    private final boolean matchPosition;


    BallStatus(boolean matchNum, boolean matchPosition) {
        this.matchNum = matchNum;
        this.matchPosition = matchPosition;
    }

    public static BallStatus valueOf(boolean hasNum, boolean isPosition) {
        for (BallStatus status : BallStatus.values()) {
            status
        }
    }
}
