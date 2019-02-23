package com.hangzhou.myspeech;

import android.content.Context;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

/**
 * @author 作者：hugo
 * @date 时间：2019/1/28.
 * 版本：v1.0
 * 描述：
 */
public class SpeechUtils {
        private Context context;


        private static final String TAG = "SpeechUtils";
        private static SpeechUtils singleton;

        private TextToSpeech textToSpeech; // TTS对象

        public static SpeechUtils getInstance(Context context) {
        if (singleton == null) {
            synchronized (SpeechUtils.class) {
                if (singleton == null) {
                    singleton = new SpeechUtils(context);
                }
            }
        }
        return singleton;
    }

    public SpeechUtils(Context context) {
        this.context = context;
        textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                LogUtil.e("hugo","onInit");
                if (i == TextToSpeech.SUCCESS) {
                    //默认设定语言为中文，原生的android貌似不支持中文。
                    int result = textToSpeech.setLanguage(Locale.TRADITIONAL_CHINESE);
                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                        LogUtil.e("hugo","不支持中文");
                        //不支持中文就将语言设置为英文
                        textToSpeech.setLanguage(Locale.US);
                    }
                    textToSpeech.setPitch(1.0f);// 设置音调，值越大声音越尖（女生），值越小则变成男声,1.0是常规
                    textToSpeech.setSpeechRate(1.0f);
                }
            }
        });
    }

        public void speakText(String text) {
        if (textToSpeech != null) {
            textToSpeech.speak(text,
                    TextToSpeech.QUEUE_FLUSH, null);
        }

    }

    }
