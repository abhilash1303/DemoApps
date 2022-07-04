package www.demo.testingapp.autosliderrr.IndicatorView.animation.controller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import www.demo.testingapp.autosliderrr.IndicatorView.animation.data.Value;
import www.demo.testingapp.autosliderrr.IndicatorView.animation.data.type.DropAnimationValue;
import www.demo.testingapp.autosliderrr.IndicatorView.animation.type.ScaleAnimation;


public class ValueController {

    private www.demo.testingapp.autosliderrr.IndicatorView.animation.type.ColorAnimation colorAnimation;
    private www.demo.testingapp.autosliderrr.IndicatorView.animation.type.ScaleAnimation scaleAnimation;
    private www.demo.testingapp.autosliderrr.IndicatorView.animation.type.WormAnimation wormAnimation;
    private www.demo.testingapp.autosliderrr.IndicatorView.animation.type.SlideAnimation slideAnimation;
    private www.demo.testingapp.autosliderrr.IndicatorView.animation.type.FillAnimation fillAnimation;
    private www.demo.testingapp.autosliderrr.IndicatorView.animation.type.ThinWormAnimation thinWormAnimation;
    private www.demo.testingapp.autosliderrr.IndicatorView.animation.type.DropAnimation dropAnimation;
    private www.demo.testingapp.autosliderrr.IndicatorView.animation.type.SwapAnimation swapAnimation;
    private www.demo.testingapp.autosliderrr.IndicatorView.animation.type.ScaleDownAnimation scaleDownAnimation;

    private UpdateListener updateListener;

    public interface UpdateListener {
        void onValueUpdated(@Nullable Value value);
    }

    public ValueController(@Nullable UpdateListener listener) {
        updateListener = listener;
    }

    @NonNull
    public www.demo.testingapp.autosliderrr.IndicatorView.animation.type.ColorAnimation color() {
        if (colorAnimation == null) {
            colorAnimation = new www.demo.testingapp.autosliderrr.IndicatorView.animation.type.ColorAnimation(updateListener);
        }

        return colorAnimation;
    }

    @NonNull
    public ScaleAnimation scale() {
        if (scaleAnimation == null) {
            scaleAnimation = new ScaleAnimation(updateListener);
        }

        return scaleAnimation;
    }

    @NonNull
    public www.demo.testingapp.autosliderrr.IndicatorView.animation.type.WormAnimation worm() {
        if (wormAnimation == null) {
            wormAnimation = new www.demo.testingapp.autosliderrr.IndicatorView.animation.type.WormAnimation(updateListener);
        }

        return wormAnimation;
    }

    @NonNull
    public www.demo.testingapp.autosliderrr.IndicatorView.animation.type.SlideAnimation slide() {
        if (slideAnimation == null) {
            slideAnimation = new www.demo.testingapp.autosliderrr.IndicatorView.animation.type.SlideAnimation(updateListener);
        }

        return slideAnimation;
    }

    @NonNull
    public www.demo.testingapp.autosliderrr.IndicatorView.animation.type.FillAnimation fill() {
        if (fillAnimation == null) {
            fillAnimation = new www.demo.testingapp.autosliderrr.IndicatorView.animation.type.FillAnimation(updateListener);
        }

        return fillAnimation;
    }

    @NonNull
    public www.demo.testingapp.autosliderrr.IndicatorView.animation.type.ThinWormAnimation thinWorm() {
        if (thinWormAnimation == null) {
            thinWormAnimation = new www.demo.testingapp.autosliderrr.IndicatorView.animation.type.ThinWormAnimation(updateListener);
        }

        return thinWormAnimation;
    }

    @NonNull
    public www.demo.testingapp.autosliderrr.IndicatorView.animation.type.DropAnimation drop() {
        if (dropAnimation == null) {
            dropAnimation = new www.demo.testingapp.autosliderrr.IndicatorView.animation.type.DropAnimation(updateListener);
        }

        return dropAnimation;
    }

    @NonNull
    public www.demo.testingapp.autosliderrr.IndicatorView.animation.type.SwapAnimation swap() {
        if (swapAnimation == null) {
            swapAnimation = new www.demo.testingapp.autosliderrr.IndicatorView.animation.type.SwapAnimation(updateListener);
        }

        return swapAnimation;
    }

    @NonNull
    public www.demo.testingapp.autosliderrr.IndicatorView.animation.type.ScaleDownAnimation scaleDown() {
        if (scaleDownAnimation == null) {
            scaleDownAnimation = new www.demo.testingapp.autosliderrr.IndicatorView.animation.type.ScaleDownAnimation(updateListener);
        }

        return scaleDownAnimation;
    }
}
