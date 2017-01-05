package com.vaadin.v7.tests.server.component.abstractselect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import com.vaadin.v7.ui.OptionGroup;

public class OptionGroupTest {

    private OptionGroup optionGroup;

    @Before
    public void setup() {
        optionGroup = new OptionGroup();
    }

    @Test
    public void itemsAreAdded() {
        optionGroup.addItems("foo", "bar");

        Collection<?> itemIds = optionGroup.getItemIds();

        assertEquals(2, itemIds.size());
        assertTrue(itemIds.contains("foo"));
        assertTrue(itemIds.contains("bar"));
    }
}
