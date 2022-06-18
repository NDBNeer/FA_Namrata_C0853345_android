package com.lambton.fa_namrata_c0853345_android.date_converter;


import androidx.room.TypeConverter;

import java.util.Date;

public class DateTypeConverter {

    @TypeConverter
    public long convertDateToLong(Date date) {
        return date.getTime();
    }

    @TypeConverter
    public Date convertLongToDate(long time) {
        return new Date(time);
    }
}
