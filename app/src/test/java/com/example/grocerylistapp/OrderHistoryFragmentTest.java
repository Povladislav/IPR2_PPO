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

    private OrderHistoryFragment orderHistoryFragment;

    @Before
    public void setUp() throws Exception {
        orderHistoryFragment = Mockito.mock(ChangeAlbumListActivity.class);
    }
    @Test
    public void build_db_isCorrect() throws Exception {
        orderHistoryFragment.SQLiteDataBaseBuild();
        verify(orderHistoryFragment).SQLiteDataBaseBuild();
    }
    @Test
    public void build_table_isCorrect() throws Exception {
        orderHistoryFragment.SQLiteTableBuild();
        verify(orderHistoryFragment).SQLiteTableBuild();
    }

    @Test
    public void insert_isCorrect() throws Exception {
        orderHistoryFragment.InsertDataIntoSQLiteDatabase();
        verify(orderHistoryFragment).InsertDataIntoSQLiteDatabase();
    }

    @After
    public void tearDown() throws Exception {
        orderHistoryFragment = null;
    }
}