package com.adobe.aem.tutorial.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;


//adaptables = Resource.class-> we are adapting model class as a resource
@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderComponentModel {

    @Inject
    private String homePage;

    @Inject
    private String homePageUrl;

    @Inject
    private String courses;

    @Inject
    private List<HeaderComponentSubNavigationModel> coursesMenu;

    @Inject
    private String educator;

    @Inject
    private String myAccountPage;

    @Inject
    private String myAccountUrl;

    @Inject
    private String loginPage;

    @Inject
    private String loginPageUrl;

    @Inject
    private String registerPage;

    @Inject
    private String registerPageUrl;

    public String getHomePage() {
        return homePage;
    }

    public String getHomePageUrl() {
        return homePageUrl;
    }

    public String getEducator() {
        return educator;
    }

    public String getMyAccountPage() {
        return myAccountPage;
    }

    public String getMyAccountUrl() {
        return myAccountUrl;
    }

    public String getLoginPage() {
        return loginPage;
    }

    public String getLoginPageUrl() {
        return loginPageUrl;
    }

    public String getRegisterPage() {
        return registerPage;
    }

    public String getRegisterPageUrl() {
        return registerPageUrl;
    }

    public String getCourses() {
        return courses;
    }

    public List<HeaderComponentSubNavigationModel> getCoursesMenu() {
        return coursesMenu;
    }
}
