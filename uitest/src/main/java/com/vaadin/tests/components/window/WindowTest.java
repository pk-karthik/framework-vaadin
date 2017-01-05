package com.vaadin.tests.components.window;

import com.vaadin.tests.components.panel.PanelTest;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class WindowTest extends PanelTest<Window> {

    @Override
    protected Class<Window> getTestClass() {
        return Window.class;
    }

    @Override
    protected void addTestComponent(Window w) {
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        w.setContent(layout);
        addWindow(w);
        getTestComponents().add(w);
    }

}
