package com.korovyansk.android.sample.slideout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;

import com.korovyansk.android.slideout.SlideoutActivity;

public class SampleActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sample);
		findViewById(R.id.sample_button).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						int width = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());
						SlideoutActivity.prepare(SampleActivity.this, R.id.inner_content, width);
						startActivity(new Intent(SampleActivity.this,
								MenuActivity.class));
						overridePendingTransition(0, 0);
					}
				});
	}


}
