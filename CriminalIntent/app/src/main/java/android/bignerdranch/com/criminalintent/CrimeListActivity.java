package android.bignerdranch.com.criminalintent;

import android.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {
  @Override
  protected Fragment createFragment() {
    return new CrimeListFragment();
  }
}
