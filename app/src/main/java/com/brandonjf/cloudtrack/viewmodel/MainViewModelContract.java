package com.brandonjf.cloudtrack.viewmodel;

import android.content.Context;

/**
 * Created by brandon on 11/1/16.
 */

public interface MainViewModelContract {
    interface View {
        Context getContext();
        void onLoadDataClicked();
    }

    interface ViewModel {
        void destroy();
    }

}
