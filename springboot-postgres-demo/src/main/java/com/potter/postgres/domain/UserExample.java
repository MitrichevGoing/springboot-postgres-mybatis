package com.potter.postgres.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> deptInfoCriteria;

        protected List<Criterion> roleIdsCriteria;

        protected List<Criterion> menuIdsCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            deptInfoCriteria = new ArrayList<Criterion>();
            roleIdsCriteria = new ArrayList<Criterion>();
            menuIdsCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getDeptInfoCriteria() {
            return deptInfoCriteria;
        }

        protected void addDeptInfoCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            deptInfoCriteria.add(new Criterion(condition, value, "com.potter.postgres.config.JSONTypeHandler"));
            allCriteria = null;
        }

        protected void addDeptInfoCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            deptInfoCriteria.add(new Criterion(condition, value1, value2, "com.potter.postgres.config.JSONTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getRoleIdsCriteria() {
            return roleIdsCriteria;
        }

        protected void addRoleIdsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            roleIdsCriteria.add(new Criterion(condition, value, "com.potter.postgres.config.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addRoleIdsCriterion(String condition, String[] value1, String[] value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            roleIdsCriteria.add(new Criterion(condition, value1, value2, "com.potter.postgres.config.ArrayTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getMenuIdsCriteria() {
            return menuIdsCriteria;
        }

        protected void addMenuIdsCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            menuIdsCriteria.add(new Criterion(condition, value, "com.potter.postgres.config.ArrayTypeHandler"));
            allCriteria = null;
        }

        protected void addMenuIdsCriterion(String condition, String[] value1, String[] value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            menuIdsCriteria.add(new Criterion(condition, value1, value2, "com.potter.postgres.config.ArrayTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || deptInfoCriteria.size() > 0
                || roleIdsCriteria.size() > 0
                || menuIdsCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(deptInfoCriteria);
                allCriteria.addAll(roleIdsCriteria);
                allCriteria.addAll(menuIdsCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUserGuidIsNull() {
            addCriterion("user_guid is null");
            return (Criteria) this;
        }

        public Criteria andUserGuidIsNotNull() {
            addCriterion("user_guid is not null");
            return (Criteria) this;
        }

        public Criteria andUserGuidEqualTo(String value) {
            addCriterion("user_guid =", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotEqualTo(String value) {
            addCriterion("user_guid <>", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidGreaterThan(String value) {
            addCriterion("user_guid >", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidGreaterThanOrEqualTo(String value) {
            addCriterion("user_guid >=", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLessThan(String value) {
            addCriterion("user_guid <", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLessThanOrEqualTo(String value) {
            addCriterion("user_guid <=", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLike(String value) {
            addCriterion("user_guid like", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotLike(String value) {
            addCriterion("user_guid not like", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidIn(List<String> values) {
            addCriterion("user_guid in", values, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotIn(List<String> values) {
            addCriterion("user_guid not in", values, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidBetween(String value1, String value2) {
            addCriterion("user_guid between", value1, value2, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotBetween(String value1, String value2) {
            addCriterion("user_guid not between", value1, value2, "userGuid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNull() {
            addCriterion("avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNotNull() {
            addCriterion("avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlEqualTo(String value) {
            addCriterion("avatar_url =", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotEqualTo(String value) {
            addCriterion("avatar_url <>", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThan(String value) {
            addCriterion("avatar_url >", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_url >=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThan(String value) {
            addCriterion("avatar_url <", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("avatar_url <=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLike(String value) {
            addCriterion("avatar_url like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotLike(String value) {
            addCriterion("avatar_url not like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIn(List<String> values) {
            addCriterion("avatar_url in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotIn(List<String> values) {
            addCriterion("avatar_url not in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlBetween(String value1, String value2) {
            addCriterion("avatar_url between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("avatar_url not between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtIsNull() {
            addCriterion("last_sign_in_at is null");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtIsNotNull() {
            addCriterion("last_sign_in_at is not null");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtEqualTo(LocalDateTime value) {
            addCriterion("last_sign_in_at =", value, "lastSignInAt");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtNotEqualTo(LocalDateTime value) {
            addCriterion("last_sign_in_at <>", value, "lastSignInAt");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtGreaterThan(LocalDateTime value) {
            addCriterion("last_sign_in_at >", value, "lastSignInAt");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("last_sign_in_at >=", value, "lastSignInAt");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtLessThan(LocalDateTime value) {
            addCriterion("last_sign_in_at <", value, "lastSignInAt");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("last_sign_in_at <=", value, "lastSignInAt");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtIn(List<LocalDateTime> values) {
            addCriterion("last_sign_in_at in", values, "lastSignInAt");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtNotIn(List<LocalDateTime> values) {
            addCriterion("last_sign_in_at not in", values, "lastSignInAt");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("last_sign_in_at between", value1, value2, "lastSignInAt");
            return (Criteria) this;
        }

        public Criteria andLastSignInAtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("last_sign_in_at not between", value1, value2, "lastSignInAt");
            return (Criteria) this;
        }

        public Criteria andDeptInfoIsNull() {
            addCriterion("dept_info is null");
            return (Criteria) this;
        }

        public Criteria andDeptInfoIsNotNull() {
            addCriterion("dept_info is not null");
            return (Criteria) this;
        }

        public Criteria andDeptInfoEqualTo(Object value) {
            addDeptInfoCriterion("dept_info =", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoNotEqualTo(Object value) {
            addDeptInfoCriterion("dept_info <>", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoGreaterThan(Object value) {
            addDeptInfoCriterion("dept_info >", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoGreaterThanOrEqualTo(Object value) {
            addDeptInfoCriterion("dept_info >=", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoLessThan(Object value) {
            addDeptInfoCriterion("dept_info <", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoLessThanOrEqualTo(Object value) {
            addDeptInfoCriterion("dept_info <=", value, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoIn(List<Object> values) {
            addDeptInfoCriterion("dept_info in", values, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoNotIn(List<Object> values) {
            addDeptInfoCriterion("dept_info not in", values, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoBetween(Object value1, Object value2) {
            addDeptInfoCriterion("dept_info between", value1, value2, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andDeptInfoNotBetween(Object value1, Object value2) {
            addDeptInfoCriterion("dept_info not between", value1, value2, "deptInfo");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(LocalDateTime value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(LocalDateTime value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(LocalDateTime value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(LocalDateTime value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<LocalDateTime> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<LocalDateTime> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(LocalDateTime value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(LocalDateTime value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(LocalDateTime value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(LocalDateTime value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<LocalDateTime> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<LocalDateTime> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andRoleIdsIsNull() {
            addCriterion("role_ids is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdsIsNotNull() {
            addCriterion("role_ids is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdsEqualTo(String[] value) {
            addRoleIdsCriterion("role_ids =", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsNotEqualTo(String[] value) {
            addRoleIdsCriterion("role_ids <>", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsGreaterThan(String[] value) {
            addRoleIdsCriterion("role_ids >", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsGreaterThanOrEqualTo(String[] value) {
            addRoleIdsCriterion("role_ids >=", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsLessThan(String[] value) {
            addRoleIdsCriterion("role_ids <", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsLessThanOrEqualTo(String[] value) {
            addRoleIdsCriterion("role_ids <=", value, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsIn(List<String[]> values) {
            addRoleIdsCriterion("role_ids in", values, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsNotIn(List<String[]> values) {
            addRoleIdsCriterion("role_ids not in", values, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsBetween(String[] value1, String[] value2) {
            addRoleIdsCriterion("role_ids between", value1, value2, "roleIds");
            return (Criteria) this;
        }

        public Criteria andRoleIdsNotBetween(String[] value1, String[] value2) {
            addRoleIdsCriterion("role_ids not between", value1, value2, "roleIds");
            return (Criteria) this;
        }

        public Criteria andMenuIdsIsNull() {
            addCriterion("menu_ids is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdsIsNotNull() {
            addCriterion("menu_ids is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdsEqualTo(String[] value) {
            addMenuIdsCriterion("menu_ids =", value, "menuIds");
            return (Criteria) this;
        }

        public Criteria andMenuIdsNotEqualTo(String[] value) {
            addMenuIdsCriterion("menu_ids <>", value, "menuIds");
            return (Criteria) this;
        }

        public Criteria andMenuIdsGreaterThan(String[] value) {
            addMenuIdsCriterion("menu_ids >", value, "menuIds");
            return (Criteria) this;
        }

        public Criteria andMenuIdsGreaterThanOrEqualTo(String[] value) {
            addMenuIdsCriterion("menu_ids >=", value, "menuIds");
            return (Criteria) this;
        }

        public Criteria andMenuIdsLessThan(String[] value) {
            addMenuIdsCriterion("menu_ids <", value, "menuIds");
            return (Criteria) this;
        }

        public Criteria andMenuIdsLessThanOrEqualTo(String[] value) {
            addMenuIdsCriterion("menu_ids <=", value, "menuIds");
            return (Criteria) this;
        }

        public Criteria andMenuIdsIn(List<String[]> values) {
            addMenuIdsCriterion("menu_ids in", values, "menuIds");
            return (Criteria) this;
        }

        public Criteria andMenuIdsNotIn(List<String[]> values) {
            addMenuIdsCriterion("menu_ids not in", values, "menuIds");
            return (Criteria) this;
        }

        public Criteria andMenuIdsBetween(String[] value1, String[] value2) {
            addMenuIdsCriterion("menu_ids between", value1, value2, "menuIds");
            return (Criteria) this;
        }

        public Criteria andMenuIdsNotBetween(String[] value1, String[] value2) {
            addMenuIdsCriterion("menu_ids not between", value1, value2, "menuIds");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andUserGuidLikeInsensitive(String value) {
            addCriterion("upper(user_guid) like", value.toUpperCase(), "userGuid");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLikeInsensitive(String value) {
            addCriterion("upper(avatar_url) like", value.toUpperCase(), "avatarUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}