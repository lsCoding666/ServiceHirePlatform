package xyz.lsgdut.dhxt.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserExample() {
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
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumIsNull() {
            addCriterion("user_phone_num is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumIsNotNull() {
            addCriterion("user_phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumEqualTo(String value) {
            addCriterion("user_phone_num =", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotEqualTo(String value) {
            addCriterion("user_phone_num <>", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumGreaterThan(String value) {
            addCriterion("user_phone_num >", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone_num >=", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumLessThan(String value) {
            addCriterion("user_phone_num <", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("user_phone_num <=", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumLike(String value) {
            addCriterion("user_phone_num like", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotLike(String value) {
            addCriterion("user_phone_num not like", value, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumIn(List<String> values) {
            addCriterion("user_phone_num in", values, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotIn(List<String> values) {
            addCriterion("user_phone_num not in", values, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumBetween(String value1, String value2) {
            addCriterion("user_phone_num between", value1, value2, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumNotBetween(String value1, String value2) {
            addCriterion("user_phone_num not between", value1, value2, "userPhoneNum");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNull() {
            addCriterion("user_wechat is null");
            return (Criteria) this;
        }

        public Criteria andUserWechatIsNotNull() {
            addCriterion("user_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andUserWechatEqualTo(String value) {
            addCriterion("user_wechat =", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotEqualTo(String value) {
            addCriterion("user_wechat <>", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThan(String value) {
            addCriterion("user_wechat >", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatGreaterThanOrEqualTo(String value) {
            addCriterion("user_wechat >=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThan(String value) {
            addCriterion("user_wechat <", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLessThanOrEqualTo(String value) {
            addCriterion("user_wechat <=", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatLike(String value) {
            addCriterion("user_wechat like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotLike(String value) {
            addCriterion("user_wechat not like", value, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatIn(List<String> values) {
            addCriterion("user_wechat in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotIn(List<String> values) {
            addCriterion("user_wechat not in", values, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatBetween(String value1, String value2) {
            addCriterion("user_wechat between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserWechatNotBetween(String value1, String value2) {
            addCriterion("user_wechat not between", value1, value2, "userWechat");
            return (Criteria) this;
        }

        public Criteria andUserQqNumIsNull() {
            addCriterion("user_qq_num is null");
            return (Criteria) this;
        }

        public Criteria andUserQqNumIsNotNull() {
            addCriterion("user_qq_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserQqNumEqualTo(String value) {
            addCriterion("user_qq_num =", value, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserQqNumNotEqualTo(String value) {
            addCriterion("user_qq_num <>", value, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserQqNumGreaterThan(String value) {
            addCriterion("user_qq_num >", value, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserQqNumGreaterThanOrEqualTo(String value) {
            addCriterion("user_qq_num >=", value, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserQqNumLessThan(String value) {
            addCriterion("user_qq_num <", value, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserQqNumLessThanOrEqualTo(String value) {
            addCriterion("user_qq_num <=", value, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserQqNumLike(String value) {
            addCriterion("user_qq_num like", value, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserQqNumNotLike(String value) {
            addCriterion("user_qq_num not like", value, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserQqNumIn(List<String> values) {
            addCriterion("user_qq_num in", values, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserQqNumNotIn(List<String> values) {
            addCriterion("user_qq_num not in", values, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserQqNumBetween(String value1, String value2) {
            addCriterion("user_qq_num between", value1, value2, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserQqNumNotBetween(String value1, String value2) {
            addCriterion("user_qq_num not between", value1, value2, "userQqNum");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressIsNull() {
            addCriterion("user_email_address is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressIsNotNull() {
            addCriterion("user_email_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressEqualTo(String value) {
            addCriterion("user_email_address =", value, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressNotEqualTo(String value) {
            addCriterion("user_email_address <>", value, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressGreaterThan(String value) {
            addCriterion("user_email_address >", value, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_email_address >=", value, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressLessThan(String value) {
            addCriterion("user_email_address <", value, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressLessThanOrEqualTo(String value) {
            addCriterion("user_email_address <=", value, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressLike(String value) {
            addCriterion("user_email_address like", value, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressNotLike(String value) {
            addCriterion("user_email_address not like", value, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressIn(List<String> values) {
            addCriterion("user_email_address in", values, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressNotIn(List<String> values) {
            addCriterion("user_email_address not in", values, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressBetween(String value1, String value2) {
            addCriterion("user_email_address between", value1, value2, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserEmailAddressNotBetween(String value1, String value2) {
            addCriterion("user_email_address not between", value1, value2, "userEmailAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdIsNull() {
            addCriterion("user_category_id is null");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdIsNotNull() {
            addCriterion("user_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdEqualTo(Integer value) {
            addCriterion("user_category_id =", value, "userCategoryId");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdNotEqualTo(Integer value) {
            addCriterion("user_category_id <>", value, "userCategoryId");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdGreaterThan(Integer value) {
            addCriterion("user_category_id >", value, "userCategoryId");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_category_id >=", value, "userCategoryId");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdLessThan(Integer value) {
            addCriterion("user_category_id <", value, "userCategoryId");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_category_id <=", value, "userCategoryId");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdIn(List<Integer> values) {
            addCriterion("user_category_id in", values, "userCategoryId");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdNotIn(List<Integer> values) {
            addCriterion("user_category_id not in", values, "userCategoryId");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("user_category_id between", value1, value2, "userCategoryId");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_category_id not between", value1, value2, "userCategoryId");
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