package com.epam.basics.branching;

import java.util.Arrays;

public class BrickService {
    public boolean checkIsInFrame(Brick brick, int frameHeight, int frameWidth) {
        int[] dimensions = {brick.getHeight(), brick.getLength(), brick.getWidth()};
        Arrays.sort(dimensions);
        int minSide1 = dimensions[0];
        int minSide2 = dimensions[1];
        boolean isInFrameVertical = minSide1 <= frameHeight && minSide2 <= frameWidth;
        boolean isInFrameHorizontal = minSide1 <= frameWidth && minSide2 <= frameHeight;
        return isInFrameHorizontal || isInFrameVertical;
    }
}
