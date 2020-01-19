package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb110Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb110Example() {
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

        public Criteria andProtb110idIsNull() {
            addCriterion("PROTB110ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb110idIsNotNull() {
            addCriterion("PROTB110ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110idEqualTo(String value) {
            addCriterion("PROTB110ID =", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idNotEqualTo(String value) {
            addCriterion("PROTB110ID <>", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idGreaterThan(String value) {
            addCriterion("PROTB110ID >", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB110ID >=", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idLessThan(String value) {
            addCriterion("PROTB110ID <", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idLessThanOrEqualTo(String value) {
            addCriterion("PROTB110ID <=", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idLike(String value) {
            addCriterion("PROTB110ID like", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idNotLike(String value) {
            addCriterion("PROTB110ID not like", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idIn(List<String> values) {
            addCriterion("PROTB110ID in", values, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idNotIn(List<String> values) {
            addCriterion("PROTB110ID not in", values, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idBetween(String value1, String value2) {
            addCriterion("PROTB110ID between", value1, value2, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idNotBetween(String value1, String value2) {
            addCriterion("PROTB110ID not between", value1, value2, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01IsNull() {
            addCriterion("PROTB110CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01IsNotNull() {
            addCriterion("PROTB110CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01EqualTo(String value) {
            addCriterion("PROTB110CD01 =", value, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01NotEqualTo(String value) {
            addCriterion("PROTB110CD01 <>", value, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01GreaterThan(String value) {
            addCriterion("PROTB110CD01 >", value, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB110CD01 >=", value, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01LessThan(String value) {
            addCriterion("PROTB110CD01 <", value, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB110CD01 <=", value, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01Like(String value) {
            addCriterion("PROTB110CD01 like", value, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01NotLike(String value) {
            addCriterion("PROTB110CD01 not like", value, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01In(List<String> values) {
            addCriterion("PROTB110CD01 in", values, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01NotIn(List<String> values) {
            addCriterion("PROTB110CD01 not in", values, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01Between(String value1, String value2) {
            addCriterion("PROTB110CD01 between", value1, value2, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andProtb110cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB110CD01 not between", value1, value2, "protb110cd01");
            return (Criteria) this;
        }

        public Criteria andSettb03idIsNull() {
            addCriterion("SETTB03ID is null");
            return (Criteria) this;
        }

        public Criteria andSettb03idIsNotNull() {
            addCriterion("SETTB03ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettb03idEqualTo(String value) {
            addCriterion("SETTB03ID =", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotEqualTo(String value) {
            addCriterion("SETTB03ID <>", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idGreaterThan(String value) {
            addCriterion("SETTB03ID >", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idGreaterThanOrEqualTo(String value) {
            addCriterion("SETTB03ID >=", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idLessThan(String value) {
            addCriterion("SETTB03ID <", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idLessThanOrEqualTo(String value) {
            addCriterion("SETTB03ID <=", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idLike(String value) {
            addCriterion("SETTB03ID like", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotLike(String value) {
            addCriterion("SETTB03ID not like", value, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idIn(List<String> values) {
            addCriterion("SETTB03ID in", values, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotIn(List<String> values) {
            addCriterion("SETTB03ID not in", values, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idBetween(String value1, String value2) {
            addCriterion("SETTB03ID between", value1, value2, "settb03id");
            return (Criteria) this;
        }

        public Criteria andSettb03idNotBetween(String value1, String value2) {
            addCriterion("SETTB03ID not between", value1, value2, "settb03id");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00IsNull() {
            addCriterion("PROTB110CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00IsNotNull() {
            addCriterion("PROTB110CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00EqualTo(Date value) {
            addCriterion("PROTB110CA00 =", value, "protb110ca00");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00NotEqualTo(Date value) {
            addCriterion("PROTB110CA00 <>", value, "protb110ca00");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00GreaterThan(Date value) {
            addCriterion("PROTB110CA00 >", value, "protb110ca00");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB110CA00 >=", value, "protb110ca00");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00LessThan(Date value) {
            addCriterion("PROTB110CA00 <", value, "protb110ca00");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB110CA00 <=", value, "protb110ca00");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00In(List<Date> values) {
            addCriterion("PROTB110CA00 in", values, "protb110ca00");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00NotIn(List<Date> values) {
            addCriterion("PROTB110CA00 not in", values, "protb110ca00");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00Between(Date value1, Date value2) {
            addCriterion("PROTB110CA00 between", value1, value2, "protb110ca00");
            return (Criteria) this;
        }

        public Criteria andProtb110ca00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB110CA00 not between", value1, value2, "protb110ca00");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01IsNull() {
            addCriterion("PROTB110CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01IsNotNull() {
            addCriterion("PROTB110CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01EqualTo(Date value) {
            addCriterion("PROTB110CA01 =", value, "protb110ca01");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01NotEqualTo(Date value) {
            addCriterion("PROTB110CA01 <>", value, "protb110ca01");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01GreaterThan(Date value) {
            addCriterion("PROTB110CA01 >", value, "protb110ca01");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB110CA01 >=", value, "protb110ca01");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01LessThan(Date value) {
            addCriterion("PROTB110CA01 <", value, "protb110ca01");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01LessThanOrEqualTo(Date value) {
            addCriterion("PROTB110CA01 <=", value, "protb110ca01");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01In(List<Date> values) {
            addCriterion("PROTB110CA01 in", values, "protb110ca01");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01NotIn(List<Date> values) {
            addCriterion("PROTB110CA01 not in", values, "protb110ca01");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01Between(Date value1, Date value2) {
            addCriterion("PROTB110CA01 between", value1, value2, "protb110ca01");
            return (Criteria) this;
        }

        public Criteria andProtb110ca01NotBetween(Date value1, Date value2) {
            addCriterion("PROTB110CA01 not between", value1, value2, "protb110ca01");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02IsNull() {
            addCriterion("PROTB110CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02IsNotNull() {
            addCriterion("PROTB110CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02EqualTo(String value) {
            addCriterion("PROTB110CA02 =", value, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02NotEqualTo(String value) {
            addCriterion("PROTB110CA02 <>", value, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02GreaterThan(String value) {
            addCriterion("PROTB110CA02 >", value, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB110CA02 >=", value, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02LessThan(String value) {
            addCriterion("PROTB110CA02 <", value, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02LessThanOrEqualTo(String value) {
            addCriterion("PROTB110CA02 <=", value, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02Like(String value) {
            addCriterion("PROTB110CA02 like", value, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02NotLike(String value) {
            addCriterion("PROTB110CA02 not like", value, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02In(List<String> values) {
            addCriterion("PROTB110CA02 in", values, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02NotIn(List<String> values) {
            addCriterion("PROTB110CA02 not in", values, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02Between(String value1, String value2) {
            addCriterion("PROTB110CA02 between", value1, value2, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca02NotBetween(String value1, String value2) {
            addCriterion("PROTB110CA02 not between", value1, value2, "protb110ca02");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03IsNull() {
            addCriterion("PROTB110CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03IsNotNull() {
            addCriterion("PROTB110CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03EqualTo(String value) {
            addCriterion("PROTB110CA03 =", value, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03NotEqualTo(String value) {
            addCriterion("PROTB110CA03 <>", value, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03GreaterThan(String value) {
            addCriterion("PROTB110CA03 >", value, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB110CA03 >=", value, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03LessThan(String value) {
            addCriterion("PROTB110CA03 <", value, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03LessThanOrEqualTo(String value) {
            addCriterion("PROTB110CA03 <=", value, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03Like(String value) {
            addCriterion("PROTB110CA03 like", value, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03NotLike(String value) {
            addCriterion("PROTB110CA03 not like", value, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03In(List<String> values) {
            addCriterion("PROTB110CA03 in", values, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03NotIn(List<String> values) {
            addCriterion("PROTB110CA03 not in", values, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03Between(String value1, String value2) {
            addCriterion("PROTB110CA03 between", value1, value2, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110ca03NotBetween(String value1, String value2) {
            addCriterion("PROTB110CA03 not between", value1, value2, "protb110ca03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00IsNull() {
            addCriterion("PROTB110CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00IsNotNull() {
            addCriterion("PROTB110CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00EqualTo(Date value) {
            addCriterion("PROTB110CC00 =", value, "protb110cc00");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00NotEqualTo(Date value) {
            addCriterion("PROTB110CC00 <>", value, "protb110cc00");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00GreaterThan(Date value) {
            addCriterion("PROTB110CC00 >", value, "protb110cc00");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB110CC00 >=", value, "protb110cc00");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00LessThan(Date value) {
            addCriterion("PROTB110CC00 <", value, "protb110cc00");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB110CC00 <=", value, "protb110cc00");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00In(List<Date> values) {
            addCriterion("PROTB110CC00 in", values, "protb110cc00");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00NotIn(List<Date> values) {
            addCriterion("PROTB110CC00 not in", values, "protb110cc00");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00Between(Date value1, Date value2) {
            addCriterion("PROTB110CC00 between", value1, value2, "protb110cc00");
            return (Criteria) this;
        }

        public Criteria andProtb110cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB110CC00 not between", value1, value2, "protb110cc00");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01IsNull() {
            addCriterion("PROTB110CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01IsNotNull() {
            addCriterion("PROTB110CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01EqualTo(String value) {
            addCriterion("PROTB110CC01 =", value, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01NotEqualTo(String value) {
            addCriterion("PROTB110CC01 <>", value, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01GreaterThan(String value) {
            addCriterion("PROTB110CC01 >", value, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB110CC01 >=", value, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01LessThan(String value) {
            addCriterion("PROTB110CC01 <", value, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB110CC01 <=", value, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01Like(String value) {
            addCriterion("PROTB110CC01 like", value, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01NotLike(String value) {
            addCriterion("PROTB110CC01 not like", value, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01In(List<String> values) {
            addCriterion("PROTB110CC01 in", values, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01NotIn(List<String> values) {
            addCriterion("PROTB110CC01 not in", values, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01Between(String value1, String value2) {
            addCriterion("PROTB110CC01 between", value1, value2, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB110CC01 not between", value1, value2, "protb110cc01");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02IsNull() {
            addCriterion("PROTB110CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02IsNotNull() {
            addCriterion("PROTB110CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02EqualTo(Date value) {
            addCriterion("PROTB110CC02 =", value, "protb110cc02");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02NotEqualTo(Date value) {
            addCriterion("PROTB110CC02 <>", value, "protb110cc02");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02GreaterThan(Date value) {
            addCriterion("PROTB110CC02 >", value, "protb110cc02");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB110CC02 >=", value, "protb110cc02");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02LessThan(Date value) {
            addCriterion("PROTB110CC02 <", value, "protb110cc02");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB110CC02 <=", value, "protb110cc02");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02In(List<Date> values) {
            addCriterion("PROTB110CC02 in", values, "protb110cc02");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02NotIn(List<Date> values) {
            addCriterion("PROTB110CC02 not in", values, "protb110cc02");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02Between(Date value1, Date value2) {
            addCriterion("PROTB110CC02 between", value1, value2, "protb110cc02");
            return (Criteria) this;
        }

        public Criteria andProtb110cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB110CC02 not between", value1, value2, "protb110cc02");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03IsNull() {
            addCriterion("PROTB110CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03IsNotNull() {
            addCriterion("PROTB110CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03EqualTo(String value) {
            addCriterion("PROTB110CC03 =", value, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03NotEqualTo(String value) {
            addCriterion("PROTB110CC03 <>", value, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03GreaterThan(String value) {
            addCriterion("PROTB110CC03 >", value, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB110CC03 >=", value, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03LessThan(String value) {
            addCriterion("PROTB110CC03 <", value, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB110CC03 <=", value, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03Like(String value) {
            addCriterion("PROTB110CC03 like", value, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03NotLike(String value) {
            addCriterion("PROTB110CC03 not like", value, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03In(List<String> values) {
            addCriterion("PROTB110CC03 in", values, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03NotIn(List<String> values) {
            addCriterion("PROTB110CC03 not in", values, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03Between(String value1, String value2) {
            addCriterion("PROTB110CC03 between", value1, value2, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB110CC03 not between", value1, value2, "protb110cc03");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00IsNull() {
            addCriterion("PROTB110CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00IsNotNull() {
            addCriterion("PROTB110CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00EqualTo(String value) {
            addCriterion("PROTB110CD00 =", value, "protb110cd00");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00NotEqualTo(String value) {
            addCriterion("PROTB110CD00 <>", value, "protb110cd00");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00GreaterThan(String value) {
            addCriterion("PROTB110CD00 >", value, "protb110cd00");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB110CD00 >=", value, "protb110cd00");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00LessThan(String value) {
            addCriterion("PROTB110CD00 <", value, "protb110cd00");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB110CD00 <=", value, "protb110cd00");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00Like(String value) {
            addCriterion("PROTB110CD00 like", value, "protb110cd00");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00NotLike(String value) {
            addCriterion("PROTB110CD00 not like", value, "protb110cd00");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00In(List<String> values) {
            addCriterion("PROTB110CD00 in", values, "protb110cd00");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00NotIn(List<String> values) {
            addCriterion("PROTB110CD00 not in", values, "protb110cd00");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00Between(String value1, String value2) {
            addCriterion("PROTB110CD00 between", value1, value2, "protb110cd00");
            return (Criteria) this;
        }

        public Criteria andProtb110cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB110CD00 not between", value1, value2, "protb110cd00");
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