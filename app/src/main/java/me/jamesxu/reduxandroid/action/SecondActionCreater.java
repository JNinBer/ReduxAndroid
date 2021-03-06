package me.jamesxu.reduxandroid.action;

import android.os.Handler;

import java.util.Random;

import me.jamesxu.reduxandroid.reduce.ChangeTextReduce;
import me.jamesxu.reduxandroid.reduce.SecondReduce;
import me.jamesxu.reduxandroid.state.SecondState;
import me.jamesxu.reduxlib.action.Action;
import me.jamesxu.reduxlib.action.ActionCreater;

/**
 * Created by mobilexu on 2/7/16.
 */
public class SecondActionCreater extends ActionCreater {


    public void changeText() {
        dispatch(new Action(SecondReduce.ACTION_SECOND_SHOWLOADING));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                showText();
            }
        }, 3000);
    }

    private void showText() {
        Action action = new Action(SecondReduce.ACTION_SECOND_SHOWTEXT);
        action.appendHashParam("text", new Random().nextInt(10) + "文本");
        dispatch(action);
    }


}
