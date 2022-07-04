package www.demo.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import www.demo.testingapp.autosliderrr.IndicatorView.draw.controller.DrawController;


public class ImageSliderrActivity extends AppCompatActivity {

    www.demo.testingapp.autosliderrr.SliderView sliderView;
    private SliderAdapterExample adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_sliderr);

        sliderView = findViewById(R.id.imageSlider);


        adapter = new SliderAdapterExample(this);
        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(www.demo.testingapp.autosliderrr.IndicatorView.animation.type.IndicatorAnimationType.DROP); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(www.demo.testingapp.autosliderrr.SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(www.demo.testingapp.autosliderrr.SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();

        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                Log.i("GGG", "onIndicatorClicked: " + sliderView.getCurrentPagePosition());
            }
        });


        List<SliderItem> sliderItemList = new ArrayList<>();

        sliderItemList.add(new SliderItem(R.drawable.y1));
        sliderItemList.add(new SliderItem(R.drawable.y2));
        sliderItemList.add(new SliderItem(R.drawable.y3));


        //dummy data
//        for (int i = 0; i < 3; i++) {
//            SliderItem sliderItem = new SliderItem(R.drawable.y1);

////            sliderItem.setDescription("Slider Item " + i);
//            if (i % 3 == 0) {
//                sliderItem.setImageUrl("https://www.nationlearns.com/images/slider/1641903124Connect (1).png");
////                sliderItem.setImageUrl("https://www.nationlearns.com/images/slider/1641898878Earn.png");
//            } else if (i % 2 == 0) {
//                sliderItem.setImageUrl("https://www.nationlearns.com/images/slider/1641898737Learn.png");
////                sliderItem.setImageUrl("https://www.nationlearns.com/images/slider/1641903124Connect (1).png");
//            } else {
//                sliderItem.setImageUrl("https://www.nationlearns.com/images/slider/1641903124Connect (1).png");
//            }


//            https://www.nationlearns.com/images/slider/1641898737Learn.png

//            sliderItemList.add(sliderItem);
//        }
        adapter.renewItems(sliderItemList);


    }


}