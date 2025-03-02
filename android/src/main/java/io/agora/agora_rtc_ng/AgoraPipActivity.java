package io.agora.agora_rtc_ng;

import android.app.PictureInPictureUiState;
import android.content.res.Configuration;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

public class AgoraPipActivity extends FlutterActivity {
    public interface AgoraPipActivityListener {
        void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig);
        void onPictureInPictureUiStateChanged(PictureInPictureUiState state);
        void onUserLeaveHint();
    }

    private AgoraPipActivityListener mListener;

    public void setAgoraPipActivityListener(AgoraPipActivityListener listener) {
        mListener = listener;
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
        if (mListener != null) {
            mListener.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
        }
    }

    @Override
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState state) {
        super.onPictureInPictureUiStateChanged(state);
        if (mListener != null) {
            mListener.onPictureInPictureUiStateChanged(state);
        }
    }

    @Override
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        if (mListener != null) {
            mListener.onUserLeaveHint();
        }
    }
}
