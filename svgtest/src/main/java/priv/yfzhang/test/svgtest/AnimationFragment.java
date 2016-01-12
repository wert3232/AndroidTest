package priv.yfzhang.test.svgtest;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.transition.Scene;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Administrator on 2016/1/11.
 */
public class AnimationFragment extends Fragment implements OnClickListener{
    private String TAG = "MyTest";
    private static TransitionManager mCustomTransitionManager;
    private Button button;
    private static Scene scene1;
    private static Scene scene2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.animation_fragment, container, false);
        TransitionInflater transitionInflater = TransitionInflater.from(getActivity());
        mCustomTransitionManager = transitionInflater.inflateTransitionManager(
                R.transition.transition_manager, container);
        scene1  = Scene.getSceneForLayout(container, R.layout.animation_fragment,getActivity());
        scene2  = Scene.getSceneForLayout(container, R.layout.animation_fragment_2,getActivity());
        //button = (Button) view.findViewById(R.id.goButton);
        //button.setOnClickListener(this);
        return view;
    }
    public static void goToScene1(View view) {
        mCustomTransitionManager.transitionTo(scene1);
    }
    public static void  goToScene2(View view) {
        mCustomTransitionManager.transitionTo(scene2);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.goButton:
//                    Log.d(TAG, "AnimationFragment");
//                   //TransitionManager.go(scene2);
//                break;
            default:break;
        };
    }
}
