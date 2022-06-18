package com.lambton.fa_namrata_c0853345_android.db;


import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.lambton.fa_namrata_c0853345_android.date_converter.DateTypeConverter;
import com.lambton.fa_namrata_c0853345_android.db.dao.AddExpenseDao;
import com.lambton.fa_namrata_c0853345_android.entities.AddExpense;

@Database(entities = {AddExpense.class}, version = 1,exportSchema = false)
@TypeConverters({DateTypeConverter.class})

public abstract class AppDatabase extends RoomDatabase {

    public abstract AddExpenseDao addExpenseDao();
}
