/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.Otel2ConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class Otel2ConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("Enabled", boolean.class);
        map.put("Encoding", boolean.class);
        map.put("ExcludePatterns", java.lang.String.class);
        map.put("InstrumentationName", java.lang.String.class);
        map.put("TraceProcessors", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.Otel2ConfigurationProperties target = (org.apache.camel.main.Otel2ConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "enabled": target.setEnabled(property(camelContext, boolean.class, value)); return true;
        case "encoding": target.setEncoding(property(camelContext, boolean.class, value)); return true;
        case "excludepatterns":
        case "excludePatterns": target.setExcludePatterns(property(camelContext, java.lang.String.class, value)); return true;
        case "instrumentationname":
        case "instrumentationName": target.setInstrumentationName(property(camelContext, java.lang.String.class, value)); return true;
        case "traceprocessors":
        case "traceProcessors": target.setTraceProcessors(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "enabled": return boolean.class;
        case "encoding": return boolean.class;
        case "excludepatterns":
        case "excludePatterns": return java.lang.String.class;
        case "instrumentationname":
        case "instrumentationName": return java.lang.String.class;
        case "traceprocessors":
        case "traceProcessors": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.Otel2ConfigurationProperties target = (org.apache.camel.main.Otel2ConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "enabled": return target.isEnabled();
        case "encoding": return target.isEncoding();
        case "excludepatterns":
        case "excludePatterns": return target.getExcludePatterns();
        case "instrumentationname":
        case "instrumentationName": return target.getInstrumentationName();
        case "traceprocessors":
        case "traceProcessors": return target.isTraceProcessors();
        default: return null;
        }
    }
}

