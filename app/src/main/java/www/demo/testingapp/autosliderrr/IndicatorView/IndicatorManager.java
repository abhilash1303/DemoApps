package www.demo.testingapp.autosliderrr.IndicatorView;

import androidx.annotation.Nullable;

import www.demo.testingapp.autosliderrr.IndicatorView.animation.data.Value;
import www.demo.testingapp.autosliderrr.IndicatorView.draw.DrawManager;
import www.demo.testingapp.autosliderrr.IndicatorView.animation.data.type.DropAnimationValue;
import www.demo.testingapp.autosliderrr.IndicatorView.animation.AnimationManager;
import www.demo.testingapp.autosliderrr.IndicatorView.animation.controller.ValueController;
import www.demo.testingapp.autosliderrr.IndicatorView.draw.data.Indicator;

public class IndicatorManager implements ValueController.UpdateListener {

    private DrawManager drawManager;
    private AnimationManager animationManager;
    private Listener listener;



    @Override
    public void onValueUpdated(@Nullable Value value) {
        drawManager.updateValue(value);
        if (listener != null) {
            listener.onIndicatorUpdated();
        }
    }

    interface Listener {
        void onIndicatorUpdated();
    }

    IndicatorManager(@Nullable Listener listener) {
        this.listener = listener;
        this.drawManager = new DrawManager();
        this.animationManager = new AnimationManager(drawManager.indicator(), this);
    }

    public AnimationManager animate() {
        return animationManager;
    }

    public Indicator indicator() {
        return drawManager.indicator();
    }

    public DrawManager drawer() {
        return drawManager;
    }


}
