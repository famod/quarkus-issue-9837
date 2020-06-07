package org.acme.testcoverage;

import java.util.Collections;

import org.eclipse.microprofile.config.spi.ConfigSource;
import org.eclipse.microprofile.config.spi.ConfigSourceProvider;

public class SomeConfigSourceProvider implements ConfigSourceProvider {

    @Override
    public Iterable<ConfigSource> getConfigSources(ClassLoader forClassLoader) {
        System.out.println("::: SomeConfigSourceProvider.getConfigSources() called");
        return Collections.emptySet();
    }
}
