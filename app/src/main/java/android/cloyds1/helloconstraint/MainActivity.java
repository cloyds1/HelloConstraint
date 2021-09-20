package android.cloyds1.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        if(mCount % 2 ==0)
            view.setBackgroundColor(0xFFFF0000);
        else
            view.setBackgroundColor(0xFF0000FF);

        View btn = findViewById(R.id.button_zero);
        btn.setBackgroundColor(0xFF00FF00);

        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void zeroCount(View view) {
        view.setBackgroundColor(0xFFAAAAAA);
        mCount = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}