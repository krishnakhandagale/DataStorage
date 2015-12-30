package appwidget.com.datastorage;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by krishna.khandagale on 12/30/2015.
 */
public class MyModel implements Parcelable {
    String Data;
    MyModel(String data){
    this.Data=data;

    }
    MyModel(Parcel p){
        this.Data=p.readString();
    }
    public String getData() {
        return Data;
    }

    public void setData(String data) {
        this.Data = data;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(Data);
    }
    public static  Parcelable.Creator CREATOR = new Creator() {
        @Override
        public MyModel createFromParcel(Parcel source) {
            return new MyModel(source);
        }

        @Override
        public MyModel[] newArray(int size) {
            return new MyModel[0];
        }
    };
}
