import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskDataReceivedText {

    @Test
    public void verifyNonEmptyString() {
        new EndpointsAsyncTask(new EndpointsAsyncTask.Listener() {
            @Override
            public void onEndpointsDataReceived(String data) {
                assertNotNull(data);
            }
        }).execute();
    }
}
