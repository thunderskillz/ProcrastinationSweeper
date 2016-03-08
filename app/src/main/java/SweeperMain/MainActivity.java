package SweeperMain;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

import com.example.daniel.procastinationsweeper.R;

/**
 * Created by daniel on 3/8/2016.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("omgError", "i found you");
        View view = View.inflate(this, R.layout.activity_main,null);
        addContentView(view, new ActionBar.LayoutParams(100, 100));
    }
}
