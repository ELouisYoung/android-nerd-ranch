package android.bignerdranch.com.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
  private UUID mId;
  private String mTitle;
  private Date mDate;
  private Boolean mSolved;

  public UUID getmId() {
    return mId;
  }

  public String getmTitle() {

    return mTitle;
  }

  @Override
   public String toString() {
    return mTitle;
  }

  public void setmTitle(String mTitle) {
    this.mTitle = mTitle;
  }

  public Boolean isSolved() {
    return mSolved;
  }

  public void setmSolved(Boolean mSolved) {
    this.mSolved = mSolved;
  }

  public Date getmDate() {

    return mDate;
  }

  public void setmDate(Date mDate) {
    this.mDate = mDate;
  }

  public Crime() {
    mId = UUID.randomUUID();
    mDate = new Date();

  }
}