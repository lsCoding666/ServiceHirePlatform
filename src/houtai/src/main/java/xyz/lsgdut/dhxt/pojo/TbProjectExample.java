package xyz.lsgdut.dhxt.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProjectExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlIsNull() {
            addCriterion("project_html is null");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlIsNotNull() {
            addCriterion("project_html is not null");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlEqualTo(String value) {
            addCriterion("project_html =", value, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlNotEqualTo(String value) {
            addCriterion("project_html <>", value, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlGreaterThan(String value) {
            addCriterion("project_html >", value, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlGreaterThanOrEqualTo(String value) {
            addCriterion("project_html >=", value, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlLessThan(String value) {
            addCriterion("project_html <", value, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlLessThanOrEqualTo(String value) {
            addCriterion("project_html <=", value, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlLike(String value) {
            addCriterion("project_html like", value, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlNotLike(String value) {
            addCriterion("project_html not like", value, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlIn(List<String> values) {
            addCriterion("project_html in", values, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlNotIn(List<String> values) {
            addCriterion("project_html not in", values, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlBetween(String value1, String value2) {
            addCriterion("project_html between", value1, value2, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectHtmlNotBetween(String value1, String value2) {
            addCriterion("project_html not between", value1, value2, "projectHtml");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateIsNull() {
            addCriterion("project_insert_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateIsNotNull() {
            addCriterion("project_insert_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateEqualTo(Date value) {
            addCriterionForJDBCDate("project_insert_date =", value, "projectInsertDate");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_insert_date <>", value, "projectInsertDate");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateGreaterThan(Date value) {
            addCriterionForJDBCDate("project_insert_date >", value, "projectInsertDate");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_insert_date >=", value, "projectInsertDate");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateLessThan(Date value) {
            addCriterionForJDBCDate("project_insert_date <", value, "projectInsertDate");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_insert_date <=", value, "projectInsertDate");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateIn(List<Date> values) {
            addCriterionForJDBCDate("project_insert_date in", values, "projectInsertDate");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_insert_date not in", values, "projectInsertDate");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_insert_date between", value1, value2, "projectInsertDate");
            return (Criteria) this;
        }

        public Criteria andProjectInsertDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_insert_date not between", value1, value2, "projectInsertDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIsNull() {
            addCriterion("project_start_date is null");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIsNotNull() {
            addCriterion("project_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_date =", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_date <>", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("project_start_date >", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_date >=", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThan(Date value) {
            addCriterionForJDBCDate("project_start_date <", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_date <=", value, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("project_start_date in", values, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_start_date not in", values, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_start_date between", value1, value2, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andProjectStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_start_date not between", value1, value2, "projectStartDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateIsNull() {
            addCriterion("prject_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateIsNotNull() {
            addCriterion("prject_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateEqualTo(String value) {
            addCriterion("prject_end_date =", value, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateNotEqualTo(String value) {
            addCriterion("prject_end_date <>", value, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateGreaterThan(String value) {
            addCriterion("prject_end_date >", value, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("prject_end_date >=", value, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateLessThan(String value) {
            addCriterion("prject_end_date <", value, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateLessThanOrEqualTo(String value) {
            addCriterion("prject_end_date <=", value, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateLike(String value) {
            addCriterion("prject_end_date like", value, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateNotLike(String value) {
            addCriterion("prject_end_date not like", value, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateIn(List<String> values) {
            addCriterion("prject_end_date in", values, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateNotIn(List<String> values) {
            addCriterion("prject_end_date not in", values, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateBetween(String value1, String value2) {
            addCriterion("prject_end_date between", value1, value2, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andPrjectEndDateNotBetween(String value1, String value2) {
            addCriterion("prject_end_date not between", value1, value2, "prjectEndDate");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdIsNull() {
            addCriterion("project_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdIsNotNull() {
            addCriterion("project_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdEqualTo(Integer value) {
            addCriterion("project_category_id =", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdNotEqualTo(Integer value) {
            addCriterion("project_category_id <>", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdGreaterThan(Integer value) {
            addCriterion("project_category_id >", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_category_id >=", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdLessThan(Integer value) {
            addCriterion("project_category_id <", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_category_id <=", value, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdIn(List<Integer> values) {
            addCriterion("project_category_id in", values, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdNotIn(List<Integer> values) {
            addCriterion("project_category_id not in", values, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("project_category_id between", value1, value2, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andProjectCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_category_id not between", value1, value2, "projectCategoryId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
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