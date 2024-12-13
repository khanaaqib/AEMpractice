package com.adobe.aem.tutorial.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderComponentSubNavigationModel {
    @Inject
    private String couresTitle;

    @Inject
    private String coursesUrl;

    public String getCouresTitle() {
        return couresTitle;
    }

    public String getCoursesUrl() {
        return coursesUrl;
    }
}
