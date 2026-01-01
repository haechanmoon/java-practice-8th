package domain;

public class Result {

    private int strikeNum;
    private int ballNum;

    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String NOTHING = "낫싱";

    public Result(int strikeNum, int ballNum){
        this.strikeNum = strikeNum;
        this.ballNum = ballNum;
    }

    public String convertResult(){
        if(strikeNum >=1&& strikeNum <=2){
            if(ballNum >=1){
                return ballNum +BALL+ strikeNum +STRIKE;
            }
            return strikeNum +STRIKE;
        }
        if(strikeNum ==0){
            if(ballNum ==0){
                return NOTHING;
            }
            return ballNum +BALL;
        }
        return strikeNum +STRIKE;
    }

    public void retry(String input){
        if(strikeNum==3){
            //아 이건 좀 나중에 짜야할 거 같은데.
        }
    }




}
