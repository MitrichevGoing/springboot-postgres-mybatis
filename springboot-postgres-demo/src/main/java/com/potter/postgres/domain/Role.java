package com.potter.postgres.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Role implements Serializable {
    private String id;

    private String roleName;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String[] menuIds;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String[] getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(String[] menuIds) {
        this.menuIds = menuIds;
    }
}