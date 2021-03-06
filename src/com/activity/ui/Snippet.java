package com.activity.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.activity.R;
import com.activity.custom.CustomActivity;

// TODO: Auto-generated Javadoc
/**
 * The Class Snippet is a Fragment that is displayed in the Main activity when
 * the user taps on Workouts tab or when user swipes to third page in ViewPager.
 * You can customize this fragment's contents as per your need.
 */
public class Snippet extends Fragment implements OnClickListener
{

	/* (non-Javadoc)
	 * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState)
	{
		View v = inflater.inflate(R.layout.snippets, null);

		setupView(v);
		return v;
	}

	/**
	 * Setup the view components for this fragment. You can write your code for
	 * initializing the views, setting the adapters, touch and click listeners
	 * etc.
	 * 
	 * @param v
	 *            the base view of fragment
	 */
	private void setupView(View v)
	{
		View b = v.findViewById(R.id.pause);
		b.setOnClickListener(this);
		b.setOnTouchListener(CustomActivity.TOUCH);

		b = v.findViewById(R.id.finish);
		b.setOnClickListener(this);
		b.setOnTouchListener(CustomActivity.TOUCH);
	}

	/* (non-Javadoc)
	 * @see android.view.View.OnClickListener#onClick(android.view.View)
	 */
	@Override
	public void onClick(View v)
	{

	}
}
