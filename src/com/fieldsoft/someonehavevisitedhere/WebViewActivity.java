package com.fieldsoft.someonehavevisitedhere;

import com.example.someonehavevisitedhere.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class WebViewActivity extends Activity {
	
	WebView WebView;

	/* ���� Javadoc��
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.web_layout);
		this.WebView = (WebView) this.findViewById(R.id.WebView);
		String webUrl = this.getIntent().getStringExtra("WebUri");
		this.WebView.loadUrl(webUrl);
	}
	
	public void Return(View view) {
		this.finish();
	}
}
