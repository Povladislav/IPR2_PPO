package com.example.grocerylistapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

import java.util.ArrayList;

@RunWith(JUnit4.class)
public class CustomAdapterOrderTest {

    private CustomAdapterOrder customAdapterOrder;

    @Before
    public void setUp() throws Exception {
        groceryListGragment = Mockito.mock(ChangeAlbumListActivity.class);
    }

    @Test
    public void getCount_isCorrect() throws Exception {
        ArrayList<ProductOrder> productsList;
        assertEquals(productsList.size(),customAdapterOrder.getCount());
    }
    @Test
    public void getItem_isCorrect(int position ) throws Exception {
        ArrayList<ProductOrder> productsList;
        assertEquals(productsList.get(position), customAdapterOrder.getItem(position));
    }

    @After
    public void tearDown() throws Exception {
        groceryListGragment = null;
    }
}
