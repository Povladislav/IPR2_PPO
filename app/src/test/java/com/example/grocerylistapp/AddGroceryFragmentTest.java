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

    private AddGroceryFragment addGroceryFragment;

    @Before
    public void setUp() throws Exception {
        addGroceryFragment = Mockito.mock(ChangeAlbumListActivity.class);
    }
    @Test
    public void build_db_isCorrect() throws Exception {
        addGroceryFragment.SQLiteDataBaseBuild();
        verify(addGroceryFragment).SQLiteDataBaseBuild();
    }
    @Test
    public void build_table_isCorrect() throws Exception {
        addGroceryFragment.SQLiteTableBuild();
        verify(addGroceryFragment).SQLiteTableBuild();
    }

    @Test
    public void insert_isCorrect() throws Exception {
        addGroceryFragment.InsertDataIntoSQLiteDatabase();
        verify(addGroceryFragment).InsertDataIntoSQLiteDatabase();
    }

    @After
    public void tearDown() throws Exception {
        addGroceryFragment = null;
    }
}