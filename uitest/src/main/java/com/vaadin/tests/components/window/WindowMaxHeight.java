package com.vaadin.tests.components.window;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class WindowMaxHeight extends UI {

    @Override
    protected void init(VaadinRequest request) {
        WindowNotFullHeight window = new WindowNotFullHeight();
        addWindow(window);
        window.focus();
    }

    class WindowNotFullHeight extends Window {

        public WindowNotFullHeight() {
            setCaption("Should be 200px high");
            setWidth(200, Unit.PIXELS);

            VerticalLayout layoutRoot = new VerticalLayout();
            layoutRoot.setMargin(false);
            layoutRoot.setSpacing(false);

            Panel container = new Panel();
            container.setHeight(200, Unit.PIXELS);

            VerticalLayout containerContent = new VerticalLayout();
            containerContent.setMargin(false);
            containerContent.setSpacing(false);
            for (int i = 0; i < 300; i++) {
                Panel hello = new Panel("hello");
                containerContent.addComponent(hello);
            }

            container.setContent(containerContent);
            layoutRoot.addComponent(container);
            setContent(layoutRoot);

        }

    }

}
