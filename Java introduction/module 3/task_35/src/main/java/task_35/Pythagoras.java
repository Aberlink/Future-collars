package task_35;

import java.util.Arrays;

public class Pythagoras {

    private static double[] framesCheck (double firstArg, double secondArg, double thirdArg) {

        if (firstArg <=0 || secondArg <=0 || thirdArg <=0) {
            throw new RuntimeException();
        }
        else {
            double frames[] = {firstArg, secondArg, thirdArg};
            Arrays.sort(frames);
            if (frames[0] + frames[1] <= frames[2]){
                throw new RuntimeException();
            }
            else {
                return frames;
            }
        }
    }

    static boolean pythagorasCheck (double first, double second, double third) {

        double[] frames = framesCheck(first,second,third);

        if(frames[0] * frames[0] + frames[1] * frames[1] == frames[2] * frames[2]) {
            return true;
        }
        else {
            return false;
        }
    }

}
