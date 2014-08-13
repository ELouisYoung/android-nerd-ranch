package android.bignerdranch.com.criminalintent;

import android.app.Activity;
import android.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {
  @Override
   protected Fragment createFragment() {
    return new CrimeFragment();
  }
}
