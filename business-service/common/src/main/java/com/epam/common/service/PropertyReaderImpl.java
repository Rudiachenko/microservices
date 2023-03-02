package com.epam.common.service;
import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;

public class PropertyReaderImpl implements PropertyReader {
    public static final String UNDEFINED_STRING_PROPERTY = "undefined";

    @Override
    public String getStringProperty(String propName) {
        if (propName == null) {
            return UNDEFINED_STRING_PROPERTY;
        }
        DynamicStringProperty property = DynamicPropertyFactory.getInstance().getStringProperty(propName, UNDEFINED_STRING_PROPERTY);
        return property.get();
    }
}
