package hello.filter;


import org.sitemesh.builder.SiteMeshFilterBuilder;

import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter {

    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/**", "/WEB-INF/views/decorators/default/index.jsp");
        builder.addDecoratorPath("/hello/**", "/WEB-INF/views/decorators/default/index.jsp");
    }

}

