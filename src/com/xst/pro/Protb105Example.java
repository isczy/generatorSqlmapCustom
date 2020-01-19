package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb105Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb105Example() {
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

        public Criteria andProtb105idIsNull() {
            addCriterion("PROTB105ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb105idIsNotNull() {
            addCriterion("PROTB105ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb105idEqualTo(String value) {
            addCriterion("PROTB105ID =", value, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105idNotEqualTo(String value) {
            addCriterion("PROTB105ID <>", value, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105idGreaterThan(String value) {
            addCriterion("PROTB105ID >", value, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB105ID >=", value, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105idLessThan(String value) {
            addCriterion("PROTB105ID <", value, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105idLessThanOrEqualTo(String value) {
            addCriterion("PROTB105ID <=", value, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105idLike(String value) {
            addCriterion("PROTB105ID like", value, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105idNotLike(String value) {
            addCriterion("PROTB105ID not like", value, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105idIn(List<String> values) {
            addCriterion("PROTB105ID in", values, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105idNotIn(List<String> values) {
            addCriterion("PROTB105ID not in", values, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105idBetween(String value1, String value2) {
            addCriterion("PROTB105ID between", value1, value2, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105idNotBetween(String value1, String value2) {
            addCriterion("PROTB105ID not between", value1, value2, "protb105id");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01IsNull() {
            addCriterion("PROTB105CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01IsNotNull() {
            addCriterion("PROTB105CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01EqualTo(String value) {
            addCriterion("PROTB105CD01 =", value, "protb105cd01");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01NotEqualTo(String value) {
            addCriterion("PROTB105CD01 <>", value, "protb105cd01");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01GreaterThan(String value) {
            addCriterion("PROTB105CD01 >", value, "protb105cd01");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB105CD01 >=", value, "protb105cd01");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01LessThan(String value) {
            addCriterion("PROTB105CD01 <", value, "protb105cd01");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB105CD01 <=", value, "protb105cd01");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01Like(String value) {
            addCriterion("PROTB105CD01 like", value, "protb105cd01");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01NotLike(String value) {
            addCriterion("PROTB105CD01 not like", value, "protb105cd01");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01In(List<String> values) {
            addCriterion("PROTB105CD01 in", values, "protb105cd01");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01NotIn(List<String> values) {
            addCriterion("PROTB105CD01 not in", values, "protb105cd01");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01Between(String value1, String value2) {
            addCriterion("PROTB105CD01 between", value1, value2, "protb105cd01");
            return (Criteria) this;
        }

        public Criteria andProtb105cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB105CD01 not between", value1, value2, "protb105cd01");
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

        public Criteria andProtb104idIsNull() {
            addCriterion("PROTB104ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb104idIsNotNull() {
            addCriterion("PROTB104ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb104idEqualTo(String value) {
            addCriterion("PROTB104ID =", value, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb104idNotEqualTo(String value) {
            addCriterion("PROTB104ID <>", value, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb104idGreaterThan(String value) {
            addCriterion("PROTB104ID >", value, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb104idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB104ID >=", value, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb104idLessThan(String value) {
            addCriterion("PROTB104ID <", value, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb104idLessThanOrEqualTo(String value) {
            addCriterion("PROTB104ID <=", value, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb104idLike(String value) {
            addCriterion("PROTB104ID like", value, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb104idNotLike(String value) {
            addCriterion("PROTB104ID not like", value, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb104idIn(List<String> values) {
            addCriterion("PROTB104ID in", values, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb104idNotIn(List<String> values) {
            addCriterion("PROTB104ID not in", values, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb104idBetween(String value1, String value2) {
            addCriterion("PROTB104ID between", value1, value2, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb104idNotBetween(String value1, String value2) {
            addCriterion("PROTB104ID not between", value1, value2, "protb104id");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00IsNull() {
            addCriterion("PROTB105CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00IsNotNull() {
            addCriterion("PROTB105CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00EqualTo(String value) {
            addCriterion("PROTB105CA00 =", value, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00NotEqualTo(String value) {
            addCriterion("PROTB105CA00 <>", value, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00GreaterThan(String value) {
            addCriterion("PROTB105CA00 >", value, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB105CA00 >=", value, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00LessThan(String value) {
            addCriterion("PROTB105CA00 <", value, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00LessThanOrEqualTo(String value) {
            addCriterion("PROTB105CA00 <=", value, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00Like(String value) {
            addCriterion("PROTB105CA00 like", value, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00NotLike(String value) {
            addCriterion("PROTB105CA00 not like", value, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00In(List<String> values) {
            addCriterion("PROTB105CA00 in", values, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00NotIn(List<String> values) {
            addCriterion("PROTB105CA00 not in", values, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00Between(String value1, String value2) {
            addCriterion("PROTB105CA00 between", value1, value2, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca00NotBetween(String value1, String value2) {
            addCriterion("PROTB105CA00 not between", value1, value2, "protb105ca00");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01IsNull() {
            addCriterion("PROTB105CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01IsNotNull() {
            addCriterion("PROTB105CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01EqualTo(String value) {
            addCriterion("PROTB105CA01 =", value, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01NotEqualTo(String value) {
            addCriterion("PROTB105CA01 <>", value, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01GreaterThan(String value) {
            addCriterion("PROTB105CA01 >", value, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB105CA01 >=", value, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01LessThan(String value) {
            addCriterion("PROTB105CA01 <", value, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01LessThanOrEqualTo(String value) {
            addCriterion("PROTB105CA01 <=", value, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01Like(String value) {
            addCriterion("PROTB105CA01 like", value, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01NotLike(String value) {
            addCriterion("PROTB105CA01 not like", value, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01In(List<String> values) {
            addCriterion("PROTB105CA01 in", values, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01NotIn(List<String> values) {
            addCriterion("PROTB105CA01 not in", values, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01Between(String value1, String value2) {
            addCriterion("PROTB105CA01 between", value1, value2, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca01NotBetween(String value1, String value2) {
            addCriterion("PROTB105CA01 not between", value1, value2, "protb105ca01");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02IsNull() {
            addCriterion("PROTB105CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02IsNotNull() {
            addCriterion("PROTB105CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02EqualTo(Integer value) {
            addCriterion("PROTB105CA02 =", value, "protb105ca02");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02NotEqualTo(Integer value) {
            addCriterion("PROTB105CA02 <>", value, "protb105ca02");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02GreaterThan(Integer value) {
            addCriterion("PROTB105CA02 >", value, "protb105ca02");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02GreaterThanOrEqualTo(Integer value) {
            addCriterion("PROTB105CA02 >=", value, "protb105ca02");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02LessThan(Integer value) {
            addCriterion("PROTB105CA02 <", value, "protb105ca02");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02LessThanOrEqualTo(Integer value) {
            addCriterion("PROTB105CA02 <=", value, "protb105ca02");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02In(List<Integer> values) {
            addCriterion("PROTB105CA02 in", values, "protb105ca02");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02NotIn(List<Integer> values) {
            addCriterion("PROTB105CA02 not in", values, "protb105ca02");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02Between(Integer value1, Integer value2) {
            addCriterion("PROTB105CA02 between", value1, value2, "protb105ca02");
            return (Criteria) this;
        }

        public Criteria andProtb105ca02NotBetween(Integer value1, Integer value2) {
            addCriterion("PROTB105CA02 not between", value1, value2, "protb105ca02");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00IsNull() {
            addCriterion("PROTB105CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00IsNotNull() {
            addCriterion("PROTB105CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00EqualTo(Date value) {
            addCriterion("PROTB105CC00 =", value, "protb105cc00");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00NotEqualTo(Date value) {
            addCriterion("PROTB105CC00 <>", value, "protb105cc00");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00GreaterThan(Date value) {
            addCriterion("PROTB105CC00 >", value, "protb105cc00");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB105CC00 >=", value, "protb105cc00");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00LessThan(Date value) {
            addCriterion("PROTB105CC00 <", value, "protb105cc00");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB105CC00 <=", value, "protb105cc00");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00In(List<Date> values) {
            addCriterion("PROTB105CC00 in", values, "protb105cc00");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00NotIn(List<Date> values) {
            addCriterion("PROTB105CC00 not in", values, "protb105cc00");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00Between(Date value1, Date value2) {
            addCriterion("PROTB105CC00 between", value1, value2, "protb105cc00");
            return (Criteria) this;
        }

        public Criteria andProtb105cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB105CC00 not between", value1, value2, "protb105cc00");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01IsNull() {
            addCriterion("PROTB105CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01IsNotNull() {
            addCriterion("PROTB105CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01EqualTo(String value) {
            addCriterion("PROTB105CC01 =", value, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01NotEqualTo(String value) {
            addCriterion("PROTB105CC01 <>", value, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01GreaterThan(String value) {
            addCriterion("PROTB105CC01 >", value, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB105CC01 >=", value, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01LessThan(String value) {
            addCriterion("PROTB105CC01 <", value, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB105CC01 <=", value, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01Like(String value) {
            addCriterion("PROTB105CC01 like", value, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01NotLike(String value) {
            addCriterion("PROTB105CC01 not like", value, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01In(List<String> values) {
            addCriterion("PROTB105CC01 in", values, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01NotIn(List<String> values) {
            addCriterion("PROTB105CC01 not in", values, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01Between(String value1, String value2) {
            addCriterion("PROTB105CC01 between", value1, value2, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB105CC01 not between", value1, value2, "protb105cc01");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02IsNull() {
            addCriterion("PROTB105CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02IsNotNull() {
            addCriterion("PROTB105CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02EqualTo(Date value) {
            addCriterion("PROTB105CC02 =", value, "protb105cc02");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02NotEqualTo(Date value) {
            addCriterion("PROTB105CC02 <>", value, "protb105cc02");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02GreaterThan(Date value) {
            addCriterion("PROTB105CC02 >", value, "protb105cc02");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB105CC02 >=", value, "protb105cc02");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02LessThan(Date value) {
            addCriterion("PROTB105CC02 <", value, "protb105cc02");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB105CC02 <=", value, "protb105cc02");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02In(List<Date> values) {
            addCriterion("PROTB105CC02 in", values, "protb105cc02");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02NotIn(List<Date> values) {
            addCriterion("PROTB105CC02 not in", values, "protb105cc02");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02Between(Date value1, Date value2) {
            addCriterion("PROTB105CC02 between", value1, value2, "protb105cc02");
            return (Criteria) this;
        }

        public Criteria andProtb105cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB105CC02 not between", value1, value2, "protb105cc02");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03IsNull() {
            addCriterion("PROTB105CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03IsNotNull() {
            addCriterion("PROTB105CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03EqualTo(String value) {
            addCriterion("PROTB105CC03 =", value, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03NotEqualTo(String value) {
            addCriterion("PROTB105CC03 <>", value, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03GreaterThan(String value) {
            addCriterion("PROTB105CC03 >", value, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB105CC03 >=", value, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03LessThan(String value) {
            addCriterion("PROTB105CC03 <", value, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB105CC03 <=", value, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03Like(String value) {
            addCriterion("PROTB105CC03 like", value, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03NotLike(String value) {
            addCriterion("PROTB105CC03 not like", value, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03In(List<String> values) {
            addCriterion("PROTB105CC03 in", values, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03NotIn(List<String> values) {
            addCriterion("PROTB105CC03 not in", values, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03Between(String value1, String value2) {
            addCriterion("PROTB105CC03 between", value1, value2, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB105CC03 not between", value1, value2, "protb105cc03");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00IsNull() {
            addCriterion("PROTB105CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00IsNotNull() {
            addCriterion("PROTB105CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00EqualTo(String value) {
            addCriterion("PROTB105CD00 =", value, "protb105cd00");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00NotEqualTo(String value) {
            addCriterion("PROTB105CD00 <>", value, "protb105cd00");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00GreaterThan(String value) {
            addCriterion("PROTB105CD00 >", value, "protb105cd00");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB105CD00 >=", value, "protb105cd00");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00LessThan(String value) {
            addCriterion("PROTB105CD00 <", value, "protb105cd00");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB105CD00 <=", value, "protb105cd00");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00Like(String value) {
            addCriterion("PROTB105CD00 like", value, "protb105cd00");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00NotLike(String value) {
            addCriterion("PROTB105CD00 not like", value, "protb105cd00");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00In(List<String> values) {
            addCriterion("PROTB105CD00 in", values, "protb105cd00");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00NotIn(List<String> values) {
            addCriterion("PROTB105CD00 not in", values, "protb105cd00");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00Between(String value1, String value2) {
            addCriterion("PROTB105CD00 between", value1, value2, "protb105cd00");
            return (Criteria) this;
        }

        public Criteria andProtb105cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB105CD00 not between", value1, value2, "protb105cd00");
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