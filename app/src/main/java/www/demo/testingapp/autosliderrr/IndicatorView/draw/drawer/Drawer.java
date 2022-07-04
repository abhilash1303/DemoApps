package www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.NonNull;

import www.demo.testingapp.autosliderrr.IndicatorView.animation.data.Value;
import www.demo.testingapp.autosliderrr.IndicatorView.draw.data.Indicator;

public class Drawer {

    private www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.BasicDrawer basicDrawer;
    private www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.ColorDrawer colorDrawer;
    private www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.ScaleDrawer scaleDrawer;
    private www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.WormDrawer wormDrawer;
    private www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.SlideDrawer slideDrawer;
    private www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.FillDrawer fillDrawer;
    private www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.ThinWormDrawer thinWormDrawer;
    private www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.DropDrawer dropDrawer;
    private www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.SwapDrawer swapDrawer;
    private www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.ScaleDownDrawer scaleDownDrawer;

    private int position;
    private int coordinateX;
    private int coordinateY;

    public Drawer(@NonNull Indicator indicator) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);

        basicDrawer = new www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.BasicDrawer(paint, indicator);
        colorDrawer = new www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.ColorDrawer(paint, indicator);
        scaleDrawer = new www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.ScaleDrawer(paint, indicator);
        wormDrawer = new www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.WormDrawer(paint, indicator);
        slideDrawer = new www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.SlideDrawer(paint, indicator);
        fillDrawer = new www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.FillDrawer(paint, indicator);
        thinWormDrawer = new www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.ThinWormDrawer(paint, indicator);
        dropDrawer = new www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.DropDrawer(paint, indicator);
        swapDrawer = new www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.SwapDrawer(paint, indicator);
        scaleDownDrawer = new www.demo.testingapp.autosliderrr.IndicatorView.draw.drawer.type.ScaleDownDrawer(paint, indicator);
    }

    public void setup(int position, int coordinateX, int coordinateY) {
        this.position = position;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public void drawBasic(@NonNull Canvas canvas, boolean isSelectedItem) {
        if (colorDrawer != null) {
            basicDrawer.draw(canvas, position, isSelectedItem, coordinateX, coordinateY);
        }
    }

    public void drawColor(@NonNull Canvas canvas, @NonNull Value value) {
        if (colorDrawer != null) {
            colorDrawer.draw(canvas, value, position, coordinateX, coordinateY);
        }
    }

    public void drawScale(@NonNull Canvas canvas, @NonNull Value value) {
        if (scaleDrawer != null) {
            scaleDrawer.draw(canvas, value, position, coordinateX, coordinateY);
        }
    }

    public void drawWorm(@NonNull Canvas canvas, @NonNull Value value) {
        if (wormDrawer != null) {
            wormDrawer.draw(canvas, value, coordinateX, coordinateY);
        }
    }

    public void drawSlide(@NonNull Canvas canvas, @NonNull Value value) {
        if (slideDrawer != null) {
            slideDrawer.draw(canvas, value, coordinateX, coordinateY);
        }
    }

    public void drawFill(@NonNull Canvas canvas, @NonNull Value value) {
        if (fillDrawer != null) {
            fillDrawer.draw(canvas, value, position, coordinateX, coordinateY);
        }
    }

    public void drawThinWorm(@NonNull Canvas canvas, @NonNull Value value) {
        if (thinWormDrawer != null) {
            thinWormDrawer.draw(canvas, value, coordinateX, coordinateY);
        }
    }

    public void drawDrop(@NonNull Canvas canvas, @NonNull Value value) {
        if (dropDrawer != null) {
            dropDrawer.draw(canvas, value, coordinateX, coordinateY);
        }
    }

    public void drawSwap(@NonNull Canvas canvas, @NonNull Value value) {
        if (swapDrawer != null) {
            swapDrawer.draw(canvas, value, position, coordinateX, coordinateY);
        }
    }

    public void drawScaleDown(@NonNull Canvas canvas, @NonNull Value value) {
        if (scaleDownDrawer != null) {
            scaleDownDrawer.draw(canvas, value, position, coordinateX, coordinateY);
        }
    }
}
