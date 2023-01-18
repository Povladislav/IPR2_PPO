package com.example.grocerylistapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

@RunWith(JUnit4.class)
public class DBHelperTest extends SQLiteOpenHelper  {

    private DatabaseHelper databaseHelper;

    @Before
    public void setUp() throws Exception {
        databaseHelper = Mockito.mock(ChangeAlbumListActivity.class);
    }
    @Test
    public void get_all_of_products() throws Exception {
        ArrayList<ProductOrder> productArrayList = new ArrayList<>();

        SQLiteDatabase database = this.getWritableDatabase();
        databaseHelper.getAllOrderProduct(database);
        verify(databaseHelper).getAllOrderProduct(database);
    }
    
    @Test
    public void get_all_of_data() throws Exception {
        ArrayList<ProductOrder> productArrayList = new ArrayList<>();

        SQLiteDatabase database = this.getWritableDatabase();
        databaseHelper.getAllData(database);
        verify(databaseHelper).getAllData(database);
    }
    @After
    public void tearDown() throws Exception {
        groceryListGragment = null;
    }
}
