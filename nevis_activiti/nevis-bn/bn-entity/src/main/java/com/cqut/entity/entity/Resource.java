package com.cqut.entity.entity;

import static com.cqut.util.string.StringUtil.emptyStr2NullStr;

public class Resource {
    private String resourceId;

    private String resourceName;

    private String resourcePath;

    private String level0;

    private String resourceIconClass;

    private Byte resourceShowOrder;

    private String parentResourceId;

    private Boolean isMenu;

    private String authorizationToken;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath == null ? null : resourcePath.trim();
    }

    public String getLevel0() {
        return level0;
    }

    public void setLevel0(String level0) {
        this.level0 = level0;
    }

    public String getResourceIconClass() {
        return resourceIconClass;
    }

    public void setResourceIconClass(String resourceIconClass) {
        this.resourceIconClass = resourceIconClass == null ? null : resourceIconClass.trim();
    }

    public Byte getResourceShowOrder() {
        return resourceShowOrder;
    }

    public void setResourceShowOrder(Byte resourceShowOrder) {
        this.resourceShowOrder = resourceShowOrder;
    }

    public String getParentResourceId() {
        return parentResourceId;
    }

    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = emptyStr2NullStr(parentResourceId);
    }

    public Boolean getIsMenu() {
        return isMenu;
    }

    public void setIsMenu(Boolean isMenu) {
        this.isMenu = isMenu;
    }

    public String getAuthorizationToken() {
        return authorizationToken;
    }

    public void setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken == null ? null : authorizationToken.trim();
    }
}