package frame.bh.com.broadcasttestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MoonlightSW on 2015/11/17.
 */
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void allFinish(){
        for(Activity activity : activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
