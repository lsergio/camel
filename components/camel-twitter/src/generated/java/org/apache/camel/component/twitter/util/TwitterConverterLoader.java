/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twitter.util;

import javax.annotation.processing.Generated;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.TypeConverterLoaderGeneratorMojo")
@SuppressWarnings("unchecked")
@DeferredContextBinding
public final class TwitterConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public TwitterConverterLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, java.lang.String.class, twitter4j.v1.DirectMessage.class, false,
            (type, exchange, value) -> {
                Object answer = org.apache.camel.component.twitter.util.TwitterConverter.toString((twitter4j.v1.DirectMessage) value);
                if (false && answer == null) {
                    answer = Void.class;
                }
                return answer;
            });
        addTypeConverter(registry, java.lang.String.class, twitter4j.v1.Status.class, false,
            (type, exchange, value) -> {
                Object answer = org.apache.camel.component.twitter.util.TwitterConverter.toString((twitter4j.v1.Status) value);
                if (false && answer == null) {
                    answer = Void.class;
                }
                return answer;
            });
        addTypeConverter(registry, java.lang.String.class, twitter4j.v1.Trend.class, false,
            (type, exchange, value) -> {
                Object answer = org.apache.camel.component.twitter.util.TwitterConverter.toString((twitter4j.v1.Trend) value);
                if (false && answer == null) {
                    answer = Void.class;
                }
                return answer;
            });
        addTypeConverter(registry, java.lang.String.class, twitter4j.v1.Trends.class, false,
            (type, exchange, value) -> {
                Object answer = org.apache.camel.component.twitter.util.TwitterConverter.toString((twitter4j.v1.Trends) value);
                if (false && answer == null) {
                    answer = Void.class;
                }
                return answer;
            });
        addTypeConverter(registry, java.lang.String.class, twitter4j.v1.UserList.class, false,
            (type, exchange, value) -> {
                Object answer = org.apache.camel.component.twitter.util.TwitterConverter.toString((twitter4j.v1.UserList) value);
                if (false && answer == null) {
                    answer = Void.class;
                }
                return answer;
            });
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) {
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }
}
