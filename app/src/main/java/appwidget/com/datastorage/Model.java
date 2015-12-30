package appwidget.com.datastorage;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.security.PrivilegedAction;

/**
 * Created by krishna.khandagale on 12/30/2015.
 */
public class Model implements Parcelable {
    String l;
        Model (){

        }
    Model(Parcel p){
        this.l=p.readString();
        this.s=p.readString();
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(l);
                dest.writeString(s);

    }

    String s;

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public static Parcelable.Creator CREATOR = new Creator() {
        @Override
        public Model createFromParcel(Parcel source) {
            return new Model(source);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[0];
        }
    };
}
