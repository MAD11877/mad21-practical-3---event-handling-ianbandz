package sg.edu.np.testpractical3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView img = findViewById(R.id.imageView);
        img.setOnClickListener(v -> {
            Log.d("Debug", "Image clicked");

            new AlertDialog.Builder(ListActivity.this)
                    .setTitle("Profile")
                    .setMessage("MADness")
                    .setPositiveButton("View", (dialog, which) -> {
                        Intent viewProfile = new Intent(ListActivity.this, MainActivity.class);
                        viewProfile.putExtra("id", new Random().nextInt());
                        startActivity(viewProfile);
                    })
                    .setNegativeButton("Close", null)
                    .show();

        });
    }
}