package com.mapzen.android.core;

import android.os.Build;

import java.util.Map;

/**
 * Generic SDK interface for service-specific handlers to implement.
 */
public interface GenericHttpHandler {

  String HEADER_USER_AGENT = "User-Agent";
  String USER_AGENT = "android-sdk;" + MapzenManager.getSdkVersion() + ";" + Build.VERSION.RELEASE;

  /**
   * Return query parameters to be appended to every request.
   * @return
   */
  Map<String, String> queryParamsForRequest();

  /**
   * Return headers to be added to every request.
   * @return
   */
  Map<String, String> headersForRequest();
}
