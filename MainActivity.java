package com.routeorderalert.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b) {
  super.onCreate(b);
  LinearLayout root = new LinearLayout(this); root.setOrientation(LinearLayout.VERTICAL); root.setPadding(32,48,32,32); root.setGravity(Gravity.CENTER_HORIZONTAL);
  TextView title = new TextView(this); title.setText("🛵 Route Order Alert"); title.setTextSize(26); title.setGravity(Gravity.CENTER); root.addView(title);
  TextView info = new TextView(this); info.setText("Samsung M12 • Android 13\n\nஇந்த ஆரம்ப Android prototype, அனுமதி கொடுத்தால் app notifications-ஐப் படிக்கத் தேவையான அடிப்படை வசதியை அமைக்கிறது.\n\nஇது இன்னும் Swiggy / Ek Bharat ஆர்டர்களை route-உடன் ஒப்பிட்டு alert கொடுக்காது. முதலில் notification-ல் எந்த விவரங்கள் வருகின்றன என்பதைச் சோதிக்க வேண்டும்."); info.setTextSize(17); info.setPadding(0,32,0,24); root.addView(info);
  Button settings = new Button(this); settings.setText("Notification Access அமைப்பைத் திற"); settings.setOnClickListener(v -> startActivity(new Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS))); root.addView(settings);
  TextView status = new TextView(this); status.setText("கவனம்: அனுமதி கொடுத்தால் notification title/text வாசிக்கப்படலாம். OTP, payment, personal messages போன்ற தகவல்களும் notification-ல் இருந்தால் அவற்றைத் தவிர்க்கவும்; சோதனைக்காக மட்டும் பயன்படுத்தவும்."); status.setTextSize(13); status.setPadding(0,24,0,0); root.addView(status);
  setContentView(root);
 }
}
