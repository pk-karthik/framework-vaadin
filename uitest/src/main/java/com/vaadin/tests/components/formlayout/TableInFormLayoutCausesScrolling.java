package com.vaadin.tests.components.formlayout;

import com.vaadin.server.VaadinRequest;
import com.vaadin.tests.components.AbstractReindeerTestUI;
import com.vaadin.ui.FormLayout;
import com.vaadin.v7.ui.Table;
import com.vaadin.v7.ui.TextField;

public class TableInFormLayoutCausesScrolling extends AbstractReindeerTestUI {

    @Override
    public void setup(VaadinRequest request) {

        final FormLayout fl = new FormLayout();
        addComponent(fl);

        for (int i = 20; i-- > 0;) {
            fl.addComponent(new TextField());
        }

        final Table table = new Table();
        table.setSelectable(true);
        table.addContainerProperty("item", String.class, "");
        for (int i = 50; i-- > 0;) {
            table.addItem(new String[] { "item" + i }, i);
        }

        fl.addComponent(table);
    }

    @Override
    protected String getTestDescription() {
        return "Clicking in the Table should not cause the page to scroll";
    }

    @Override
    protected Integer getTicketNumber() {
        return 7309;
    }
}
