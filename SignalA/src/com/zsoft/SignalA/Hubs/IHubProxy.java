package com.zsoft.SignalA.Hubs;

import org.json.JSONObject;

/// <summary>
///  A client side proxy for a server side hub.
/// </summary>
public interface IHubProxy {
	
	//void On(String eventName, OnDataCallback callback);
	void Invoke(String method, JSONObject args, HubInvokeCallback callback);
	
        //JToken this[String name] { get; set; }
}
