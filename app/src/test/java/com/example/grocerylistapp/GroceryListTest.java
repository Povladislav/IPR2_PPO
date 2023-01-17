package com.example.grocerylistapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

@RunWith(JUnit4.class)
public class GroceryListFragmentTest {

    private GroceryListGragment groceryListGragment;

    @Before
    public void setUp() throws Exception {
        groceryListGragment = Mockito.mock(ChangeAlbumListActivity.class);
    }
    @Test
    public void build_db_isCorrect() throws Exception {
        groceryListGragment.SQLiteDataBaseBuild();
        verify(groceryListGragment).SQLiteDataBaseBuild();
    }
    @Test
    public void build_table_isCorrect() throws Exception {
        groceryListGragment.SQLiteTableBuild();
        verify(groceryListGragment).SQLiteTableBuild();
    }

    @Test
    public void insert_isCorrect() throws Exception {
        groceryListGragment.InsertDataIntoSQLiteDatabase();
        verify(groceryListGragment).InsertDataIntoSQLiteDatabase();
    }

    @After
    public void tearDown() throws Exception {
        groceryListGragment = null;
    }
}