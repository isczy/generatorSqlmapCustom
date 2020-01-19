package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb104Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb104Example() {
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

        public Criteria andProtb104cd01IsNull() {
            addCriterion("PROTB104CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01IsNotNull() {
            addCriterion("PROTB104CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01EqualTo(String value) {
            addCriterion("PROTB104CD01 =", value, "protb104cd01");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01NotEqualTo(String value) {
            addCriterion("PROTB104CD01 <>", value, "protb104cd01");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01GreaterThan(String value) {
            addCriterion("PROTB104CD01 >", value, "protb104cd01");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB104CD01 >=", value, "protb104cd01");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01LessThan(String value) {
            addCriterion("PROTB104CD01 <", value, "protb104cd01");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB104CD01 <=", value, "protb104cd01");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01Like(String value) {
            addCriterion("PROTB104CD01 like", value, "protb104cd01");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01NotLike(String value) {
            addCriterion("PROTB104CD01 not like", value, "protb104cd01");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01In(List<String> values) {
            addCriterion("PROTB104CD01 in", values, "protb104cd01");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01NotIn(List<String> values) {
            addCriterion("PROTB104CD01 not in", values, "protb104cd01");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01Between(String value1, String value2) {
            addCriterion("PROTB104CD01 between", value1, value2, "protb104cd01");
            return (Criteria) this;
        }

        public Criteria andProtb104cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB104CD01 not between", value1, value2, "protb104cd01");
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

        public Criteria andSettb05idIsNull() {
            addCriterion("SETTB05ID is null");
            return (Criteria) this;
        }

        public Criteria andSettb05idIsNotNull() {
            addCriterion("SETTB05ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettb05idEqualTo(String value) {
            addCriterion("SETTB05ID =", value, "settb05id");
            return (Criteria) this;
        }

        public Criteria andSettb05idNotEqualTo(String value) {
            addCriterion("SETTB05ID <>", value, "settb05id");
            return (Criteria) this;
        }

        public Criteria andSettb05idGreaterThan(String value) {
            addCriterion("SETTB05ID >", value, "settb05id");
            return (Criteria) this;
        }

        public Criteria andSettb05idGreaterThanOrEqualTo(String value) {
            addCriterion("SETTB05ID >=", value, "settb05id");
            return (Criteria) this;
        }

        public Criteria andSettb05idLessThan(String value) {
            addCriterion("SETTB05ID <", value, "settb05id");
            return (Criteria) this;
        }

        public Criteria andSettb05idLessThanOrEqualTo(String value) {
            addCriterion("SETTB05ID <=", value, "settb05id");
            return (Criteria) this;
        }

        public Criteria andSettb05idLike(String value) {
            addCriterion("SETTB05ID like", value, "settb05id");
            return (Criteria) this;
        }

        public Criteria andSettb05idNotLike(String value) {
            addCriterion("SETTB05ID not like", value, "settb05id");
            return (Criteria) this;
        }

        public Criteria andSettb05idIn(List<String> values) {
            addCriterion("SETTB05ID in", values, "settb05id");
            return (Criteria) this;
        }

        public Criteria andSettb05idNotIn(List<String> values) {
            addCriterion("SETTB05ID not in", values, "settb05id");
            return (Criteria) this;
        }

        public Criteria andSettb05idBetween(String value1, String value2) {
            addCriterion("SETTB05ID between", value1, value2, "settb05id");
            return (Criteria) this;
        }

        public Criteria andSettb05idNotBetween(String value1, String value2) {
            addCriterion("SETTB05ID not between", value1, value2, "settb05id");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00IsNull() {
            addCriterion("PROTB104CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00IsNotNull() {
            addCriterion("PROTB104CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00EqualTo(String value) {
            addCriterion("PROTB104CA00 =", value, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00NotEqualTo(String value) {
            addCriterion("PROTB104CA00 <>", value, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00GreaterThan(String value) {
            addCriterion("PROTB104CA00 >", value, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB104CA00 >=", value, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00LessThan(String value) {
            addCriterion("PROTB104CA00 <", value, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00LessThanOrEqualTo(String value) {
            addCriterion("PROTB104CA00 <=", value, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00Like(String value) {
            addCriterion("PROTB104CA00 like", value, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00NotLike(String value) {
            addCriterion("PROTB104CA00 not like", value, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00In(List<String> values) {
            addCriterion("PROTB104CA00 in", values, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00NotIn(List<String> values) {
            addCriterion("PROTB104CA00 not in", values, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00Between(String value1, String value2) {
            addCriterion("PROTB104CA00 between", value1, value2, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104ca00NotBetween(String value1, String value2) {
            addCriterion("PROTB104CA00 not between", value1, value2, "protb104ca00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00IsNull() {
            addCriterion("PROTB104CB00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00IsNotNull() {
            addCriterion("PROTB104CB00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00EqualTo(String value) {
            addCriterion("PROTB104CB00 =", value, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00NotEqualTo(String value) {
            addCriterion("PROTB104CB00 <>", value, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00GreaterThan(String value) {
            addCriterion("PROTB104CB00 >", value, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB104CB00 >=", value, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00LessThan(String value) {
            addCriterion("PROTB104CB00 <", value, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00LessThanOrEqualTo(String value) {
            addCriterion("PROTB104CB00 <=", value, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00Like(String value) {
            addCriterion("PROTB104CB00 like", value, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00NotLike(String value) {
            addCriterion("PROTB104CB00 not like", value, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00In(List<String> values) {
            addCriterion("PROTB104CB00 in", values, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00NotIn(List<String> values) {
            addCriterion("PROTB104CB00 not in", values, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00Between(String value1, String value2) {
            addCriterion("PROTB104CB00 between", value1, value2, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cb00NotBetween(String value1, String value2) {
            addCriterion("PROTB104CB00 not between", value1, value2, "protb104cb00");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00IsNull() {
            addCriterion("PROTB104CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00IsNotNull() {
            addCriterion("PROTB104CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00EqualTo(Date value) {
            addCriterion("PROTB104CC00 =", value, "protb104cc00");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00NotEqualTo(Date value) {
            addCriterion("PROTB104CC00 <>", value, "protb104cc00");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00GreaterThan(Date value) {
            addCriterion("PROTB104CC00 >", value, "protb104cc00");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB104CC00 >=", value, "protb104cc00");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00LessThan(Date value) {
            addCriterion("PROTB104CC00 <", value, "protb104cc00");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB104CC00 <=", value, "protb104cc00");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00In(List<Date> values) {
            addCriterion("PROTB104CC00 in", values, "protb104cc00");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00NotIn(List<Date> values) {
            addCriterion("PROTB104CC00 not in", values, "protb104cc00");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00Between(Date value1, Date value2) {
            addCriterion("PROTB104CC00 between", value1, value2, "protb104cc00");
            return (Criteria) this;
        }

        public Criteria andProtb104cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB104CC00 not between", value1, value2, "protb104cc00");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01IsNull() {
            addCriterion("PROTB104CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01IsNotNull() {
            addCriterion("PROTB104CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01EqualTo(String value) {
            addCriterion("PROTB104CC01 =", value, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01NotEqualTo(String value) {
            addCriterion("PROTB104CC01 <>", value, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01GreaterThan(String value) {
            addCriterion("PROTB104CC01 >", value, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB104CC01 >=", value, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01LessThan(String value) {
            addCriterion("PROTB104CC01 <", value, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB104CC01 <=", value, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01Like(String value) {
            addCriterion("PROTB104CC01 like", value, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01NotLike(String value) {
            addCriterion("PROTB104CC01 not like", value, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01In(List<String> values) {
            addCriterion("PROTB104CC01 in", values, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01NotIn(List<String> values) {
            addCriterion("PROTB104CC01 not in", values, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01Between(String value1, String value2) {
            addCriterion("PROTB104CC01 between", value1, value2, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB104CC01 not between", value1, value2, "protb104cc01");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02IsNull() {
            addCriterion("PROTB104CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02IsNotNull() {
            addCriterion("PROTB104CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02EqualTo(Date value) {
            addCriterion("PROTB104CC02 =", value, "protb104cc02");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02NotEqualTo(Date value) {
            addCriterion("PROTB104CC02 <>", value, "protb104cc02");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02GreaterThan(Date value) {
            addCriterion("PROTB104CC02 >", value, "protb104cc02");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB104CC02 >=", value, "protb104cc02");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02LessThan(Date value) {
            addCriterion("PROTB104CC02 <", value, "protb104cc02");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB104CC02 <=", value, "protb104cc02");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02In(List<Date> values) {
            addCriterion("PROTB104CC02 in", values, "protb104cc02");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02NotIn(List<Date> values) {
            addCriterion("PROTB104CC02 not in", values, "protb104cc02");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02Between(Date value1, Date value2) {
            addCriterion("PROTB104CC02 between", value1, value2, "protb104cc02");
            return (Criteria) this;
        }

        public Criteria andProtb104cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB104CC02 not between", value1, value2, "protb104cc02");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03IsNull() {
            addCriterion("PROTB104CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03IsNotNull() {
            addCriterion("PROTB104CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03EqualTo(String value) {
            addCriterion("PROTB104CC03 =", value, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03NotEqualTo(String value) {
            addCriterion("PROTB104CC03 <>", value, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03GreaterThan(String value) {
            addCriterion("PROTB104CC03 >", value, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB104CC03 >=", value, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03LessThan(String value) {
            addCriterion("PROTB104CC03 <", value, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB104CC03 <=", value, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03Like(String value) {
            addCriterion("PROTB104CC03 like", value, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03NotLike(String value) {
            addCriterion("PROTB104CC03 not like", value, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03In(List<String> values) {
            addCriterion("PROTB104CC03 in", values, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03NotIn(List<String> values) {
            addCriterion("PROTB104CC03 not in", values, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03Between(String value1, String value2) {
            addCriterion("PROTB104CC03 between", value1, value2, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB104CC03 not between", value1, value2, "protb104cc03");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00IsNull() {
            addCriterion("PROTB104CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00IsNotNull() {
            addCriterion("PROTB104CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00EqualTo(String value) {
            addCriterion("PROTB104CD00 =", value, "protb104cd00");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00NotEqualTo(String value) {
            addCriterion("PROTB104CD00 <>", value, "protb104cd00");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00GreaterThan(String value) {
            addCriterion("PROTB104CD00 >", value, "protb104cd00");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB104CD00 >=", value, "protb104cd00");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00LessThan(String value) {
            addCriterion("PROTB104CD00 <", value, "protb104cd00");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB104CD00 <=", value, "protb104cd00");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00Like(String value) {
            addCriterion("PROTB104CD00 like", value, "protb104cd00");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00NotLike(String value) {
            addCriterion("PROTB104CD00 not like", value, "protb104cd00");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00In(List<String> values) {
            addCriterion("PROTB104CD00 in", values, "protb104cd00");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00NotIn(List<String> values) {
            addCriterion("PROTB104CD00 not in", values, "protb104cd00");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00Between(String value1, String value2) {
            addCriterion("PROTB104CD00 between", value1, value2, "protb104cd00");
            return (Criteria) this;
        }

        public Criteria andProtb104cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB104CD00 not between", value1, value2, "protb104cd00");
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