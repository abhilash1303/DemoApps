package www.demo.testingapp.IndicatorView.animation;

import androidx.annotation.NonNull;

import www.demo.testingapp.IndicatorView.animation.controller.AnimationController;
import www.demo.testingapp.IndicatorView.animation.controller.ValueController;
import www.demo.testingapp.IndicatorView.draw.data.Indicator;


public class AnimationManager {

    private AnimationController animationController;

    public AnimationManager(@NonNull Indicator indicator, @NonNull ValueController.UpdateListener listener) {
        this.animationController = new AnimationController(indicator, listener);
    }

    public void basic() {
        if (animationController != null) {
            animationController.end();
            animationController.basic();
        }
    }

    public void interactive(float progress) {
        if (animationController != null) {
            animationController.interactive(progress);
        }
    }

    public void end() {
        if (animationController != null) {
            animationController.end();
        }
    }
}
