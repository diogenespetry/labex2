package br.feevale.projeto.labex2.webtools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.content.Context;

public class Webservice {

	Context mContext;

	protected List<NameValuePair> getParametersForRequest(String objJson) {
		List<NameValuePair> nameValuePair = new ArrayList<NameValuePair>(1);
		nameValuePair.add(new BasicNameValuePair("json", objJson));
		return nameValuePair;
	}

	public BufferedReader executeRequest(HttpPost httpPost) {

		// Creating HTTP client
		HttpClient httpClient = new DefaultHttpClient();

		// Variables
		HttpResponse response;
		InputStream is;

		try {
			response = httpClient.execute(httpPost);
			is = response.getEntity().getContent();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader rd = new BufferedReader(isr, 5000000);

			return rd;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public String readBufferedReader(BufferedReader rd) {

		// Variables
		StringBuilder total = new StringBuilder();
		String line;

		try {
			while ((line = rd.readLine()) != null) {
				total.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return total.toString();
	}

}
