package appwidget.com.datastorage;

import android.graphics.AvoidXfermode;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna.khandagale on 12/30/2015.
 */
public class MyDAta implements Parcelable{
    String fName;
    String lName;
    ArrayList<MyModel> list;
    MyDAta(){

    }
    MyDAta(Parcel in){

        this.fName=in.readString();
        this.lName=in.readString();
        this.list=in.readArrayList(MyModel.CREATOR.getClass().getClassLoader());

    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(fName);
        dest.writeString(lName);
        dest.writeList(list);


    }



    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public ArrayList<MyModel> getList() {
        return list;
    }

    public void setList(ArrayList<MyModel> list) {
        this.list = list;
    }

    public static Creator getCREATOR() {
        return CREATOR;
    }

    public static void setCREATOR(Creator CREATOR) {
        MyDAta.CREATOR = CREATOR;
    }

    public   static    Parcelable.Creator CREATOR = new Creator() {
        @Override
        public MyDAta createFromParcel(Parcel source) {
            return new MyDAta(source);
        }

        @Override
        public MyDAta[] newArray(int size) {
            return new MyDAta[size];
        }

    };
}
