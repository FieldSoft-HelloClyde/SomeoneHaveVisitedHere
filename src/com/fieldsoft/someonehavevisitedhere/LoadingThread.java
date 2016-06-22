package com.fieldsoft.someonehavevisitedhere;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fieldsoft.someonehavevisitedhere.tool.HttpHostConnection;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

public interface LoadingThread extends Runnable,Serializable{

	//���ڸ��߰�׿ִ�����
	public Handler getHandler();
	public void setHandler(Handler handler);
	
	//�������н��
	public String getResult();
}
