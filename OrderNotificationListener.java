package com.routeorderalert.app;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

/** Prototype only: logs notification metadata for development; it does not infer or match routes. */
public class OrderNotificationListener extends NotificationListenerService {
 private static final String TAG = "RouteOrderAlert";
 @Override public void onNotificationPosted(StatusBarNotification sbn) {
  if (sbn == null || sbn.getNotification() == null || sbn.getNotification().extras == null) return;
  String pkg = sbn.getPackageName();
  CharSequence title = sbn.getNotification().extras.getCharSequence("android.title");
  CharSequence text = sbn.getNotification().extras.getCharSequence("android.text");
  // Do not save notification content. Development log only; remove before any public release.
  Log.d(TAG, "Notification received from package=" + pkg + "; title=" + title + "; text=" + text);
 }
}
