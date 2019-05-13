package createapi;

//import java.awt.PageAttributes.MediaType;

//import com.squareup.okhttp.OkHttpClient;

import java.lang.Object;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;

import static spark.Spark.*;

import javax.xml.ws.Response;

import spark.Request;

public class ApiForFiles {

	public static void main(String[] args) {
		 exception(Exception.class, (e, req, res) -> e.printStackTrace()); // print all exceptions
		    staticFiles.location("/public");
		    port(9999);
		get("/listfiles", (req, res) -> listFiles(req));
	    get("/downloadfiles", (req, res) -> downloadFiles(req));
	    post("/uploadfiles", (req, res) -> uploadFiles(req));

	}

	private static Object uploadFiles(Request req) {
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
		RequestBody body = RequestBody.create(mediaType, "------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"formData\"; filename=\"Cloud_Elemtns_Image.png\"\r\nContent-Type: image/png\r\n\r\n\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--");
		okhttp3.Request request = new Request.Builder()
		  .url("https://staging.cloud-elements.com/elements/api-v2/files?path=%2FCloudElements%2FFolder_1&overwrite=true")
		  .get()
		  .addHeader("Authorization", "User toLrlzwyj1DCHzNbG4cIQVHXJH8Ncm5io0p18IhHMuA=, Organization 100695904e9caa0d54937627a382ddae, Element s2xoR2LAPrhjHlL06u745fmfFevtiEoggekyzQNb1ns=")
		  .addHeader("User-Agent", "PostmanRuntime/7.11.0")
		  .addHeader("Accept", "*/*")
		  .addHeader("Cache-Control", "no-cache")
		  .addHeader("Postman-Token", "6d20400c-4689-40a0-aa4a-741def644be6,b2e0e2e1-4aa9-48bf-a827-7259ff268931")
		  .addHeader("Host", "staging.cloud-elements.com")
		  .addHeader("accept-encoding", "gzip, deflate")
		  .addHeader("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
		  .addHeader("content-length", "25814")
		  .addHeader("Connection", "keep-alive")
		  .addHeader("cache-control", "no-cache")
		  .build();

		okhttp3.Response response = client.newCall(request).execute();
	
	}

	private static Object downloadFiles(Request req) {
	
		OkHttpClient client = new OkHttpClient();

		okhttp3.Request request = new Request.Builder()
		  .url("https://staging.cloud-elements.com/elements/api-v2/files?path=%2FCloudElements%2FLifeUniverseEverything.java")
		  .get()
		  .addHeader("Authorization", "User toLrlzwyj1DCHzNbG4cIQVHXJH8Ncm5io0p18IhHMuA=, Organization 100695904e9caa0d54937627a382ddae, Element s2xoR2LAPrhjHlL06u745fmfFevtiEoggekyzQNb1ns=")
		  .addHeader("User-Agent", "PostmanRuntime/7.11.0")
		  .addHeader("Accept", "*/*")
		  .addHeader("Cache-Control", "no-cache")
		  .addHeader("Postman-Token", "7735b6b6-7bdf-48ca-af46-9740dcf22d39,30f6de6a-879c-4638-85bf-dd05b2faa24f")
		  .addHeader("Host", "staging.cloud-elements.com")
		  .addHeader("accept-encoding", "gzip, deflate")
		  .addHeader("Connection", "keep-alive")
		  .addHeader("cache-control", "no-cache")
		  .build();

		okhttp3.Response response = client.newCall(request).execute();
	
	}

	private static Object listFiles(Request req) {
		
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("https://staging.cloud-elements.com/elements/api-v2/folders/contents?path=%2FCloudElements")
		  .get()
		  .addHeader("Authorization", "User toLrlzwyj1DCHzNbG4cIQVHXJH8Ncm5io0p18IhHMuA=, Organization 100695904e9caa0d54937627a382ddae, Element s2xoR2LAPrhjHlL06u745fmfFevtiEoggekyzQNb1ns=")
		  .addHeader("User-Agent", "PostmanRuntime/7.11.0")
		  .addHeader("Accept", "*/*")
		  .addHeader("Cache-Control", "no-cache")
		  .addHeader("Postman-Token", "e6ac3cd9-af40-4d59-b768-5fb983203f74,62e52038-2c9e-44bc-ad52-13bd2599c08a")
		  .addHeader("Host", "staging.cloud-elements.com")
		  .addHeader("accept-encoding", "gzip, deflate")
		  .addHeader("Connection", "keep-alive")
		  .addHeader("cache-control", "no-cache")
		  .build();

		Response response = client.newCall(request).execute();		
	}

}


