package com.kbms.kb.flipper.expandgroup;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.kbms.kb.R;


public class Text4_2 {
	private Context mContext;
	private View mWikiMsg;
	public Text4_2(Context context) {
		mContext = context;
		mWikiMsg = LayoutInflater.from(context).inflate(R.layout.chat, null);
		TextView textView = (TextView)mWikiMsg.findViewById(R.id.text);
		textView.setText("测试4_2");
		TextView content = (TextView)mWikiMsg.findViewById(R.id.tv_content);
		content.setBackgroundColor(Color.BLUE);
	}
	public View getView() {
		return mWikiMsg;
	}
}
