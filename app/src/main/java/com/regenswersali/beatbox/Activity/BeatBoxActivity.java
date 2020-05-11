package com.regenswersali.beatbox.Activity;

import androidx.fragment.app.Fragment;

import com.regenswersali.beatbox.Fragment.BeatBoxFragment;

public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
