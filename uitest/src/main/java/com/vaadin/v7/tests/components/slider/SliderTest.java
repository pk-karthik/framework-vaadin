package com.vaadin.v7.tests.components.slider;

import java.util.LinkedHashMap;

import com.vaadin.tests.components.abstractfield.LegacyAbstractFieldTest;
import com.vaadin.v7.shared.ui.slider.SliderOrientation;
import com.vaadin.v7.ui.Slider;

public class SliderTest extends LegacyAbstractFieldTest<Slider> {

    private Command<Slider, Double> minCommand = new Command<Slider, Double>() {
        @Override
        public void execute(Slider c, Double value, Object data) {
            c.setMin(value);
        }
    };

    private Command<Slider, Double> maxCommand = new Command<Slider, Double>() {
        @Override
        public void execute(Slider c, Double value, Object data) {
            c.setMax(value);
        }
    };

    private Command<Slider, SliderOrientation> orientationCommand = new Command<Slider, SliderOrientation>() {
        @Override
        public void execute(Slider c, SliderOrientation value, Object data) {
            c.setOrientation(value);
        }
    };
    private Command<Slider, Integer> resolutionCommand = new Command<Slider, Integer>() {
        @Override
        public void execute(Slider c, Integer value, Object data) {
            c.setResolution(value);
        }
    };

    @Override
    protected Class<Slider> getTestClass() {
        return Slider.class;
    }

    @Override
    protected void createActions() {
        super.createActions();

        createMinSelect(CATEGORY_FEATURES);
        createMaxSelect(CATEGORY_FEATURES);
        createResolutionSelect(CATEGORY_FEATURES);
        createOrientationSelect(CATEGORY_FEATURES);
    }

    private void createResolutionSelect(String category) {
        createSelectAction("Resolution", category, createIntegerOptions(10),
                "1", resolutionCommand);

    }

    private void createOrientationSelect(String category) {
        LinkedHashMap<String, SliderOrientation> options = new LinkedHashMap<String, SliderOrientation>();
        options.put("Horizontal", SliderOrientation.HORIZONTAL);
        options.put("Vertical", SliderOrientation.VERTICAL);
        createSelectAction("Orientation", category, options, "Horizontal",
                orientationCommand);

    }

    private void createMaxSelect(String category) {
        createSelectAction("Max", category, createDoubleOptions(100), "0",
                maxCommand);
    }

    private void createMinSelect(String category) {
        createSelectAction("Min", category, createDoubleOptions(100), "0",
                minCommand);

    }

}
