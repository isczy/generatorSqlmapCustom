package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb114Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb114Example() {
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

        public Criteria andProtb114idIsNull() {
            addCriterion("PROTB114ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb114idIsNotNull() {
            addCriterion("PROTB114ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb114idEqualTo(String value) {
            addCriterion("PROTB114ID =", value, "protb114id");
            return (Criteria) this;
        }

        public Criteria andProtb114idNotEqualTo(String value) {
            addCriterion("PROTB114ID <>", value, "protb114id");
            return (Criteria) this;
        }

        public Criteria andProtb114idGreaterThan(String value) {
            addCriterion("PROTB114ID >", value, "protb114id");
            return (Criteria) this;
        }

        public Criteria andProtb114idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB114ID >=", value, "protb114id");
            return (Criteria) this;
        }

        public Criteria andProtb114idLessThan(String value) {
            addCriterion("PROTB114ID <", value, "protb114id");
            return (Criteria) this;
        }

        public Criteria andProtb114idLessThanOrEqualTo(String value) {
            addCriterion("PROTB114ID <=", value, "protb114id");
            return (Criteria) this;
        }

        public Criteria andProtb114idLike(String value) {
            addCriterion("PROTB114ID like", value, "protb114id");
            return (Criteria) this;
        }

        public Criteria andProtb114idNotLike(String value) {
            addCriterion("PROTB114ID not like", value, "protb114id");
            return (Criteria) this;
        }

        public Criteria andProtb114idIn(List<String> values) {
            addCriterion("PROTB114ID in", values, "protb114id");
            return (Criteria) this;
        }

        public Criteria andProtb114idNotIn(List<String> values) {
            addCriterion("PROTB114ID not in", values, "protb114id");
            return (Criteria) this;
        }

        public Criteria andProtb114idBetween(String value1, String value2) {
            addCriterion("PROTB114ID between", value1, value2, "protb114id");
            return (Criteria) this;
        }

        public Criteria andProtb114idNotBetween(String value1, String value2) {
            addCriterion("PROTB114ID not between", value1, value2, "protb114id");
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

        public Criteria andProtb114ca00IsNull() {
            addCriterion("PROTB114CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00IsNotNull() {
            addCriterion("PROTB114CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00EqualTo(String value) {
            addCriterion("PROTB114CA00 =", value, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00NotEqualTo(String value) {
            addCriterion("PROTB114CA00 <>", value, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00GreaterThan(String value) {
            addCriterion("PROTB114CA00 >", value, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB114CA00 >=", value, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00LessThan(String value) {
            addCriterion("PROTB114CA00 <", value, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00LessThanOrEqualTo(String value) {
            addCriterion("PROTB114CA00 <=", value, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00Like(String value) {
            addCriterion("PROTB114CA00 like", value, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00NotLike(String value) {
            addCriterion("PROTB114CA00 not like", value, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00In(List<String> values) {
            addCriterion("PROTB114CA00 in", values, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00NotIn(List<String> values) {
            addCriterion("PROTB114CA00 not in", values, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00Between(String value1, String value2) {
            addCriterion("PROTB114CA00 between", value1, value2, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca00NotBetween(String value1, String value2) {
            addCriterion("PROTB114CA00 not between", value1, value2, "protb114ca00");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01IsNull() {
            addCriterion("PROTB114CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01IsNotNull() {
            addCriterion("PROTB114CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01EqualTo(String value) {
            addCriterion("PROTB114CA01 =", value, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01NotEqualTo(String value) {
            addCriterion("PROTB114CA01 <>", value, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01GreaterThan(String value) {
            addCriterion("PROTB114CA01 >", value, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB114CA01 >=", value, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01LessThan(String value) {
            addCriterion("PROTB114CA01 <", value, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01LessThanOrEqualTo(String value) {
            addCriterion("PROTB114CA01 <=", value, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01Like(String value) {
            addCriterion("PROTB114CA01 like", value, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01NotLike(String value) {
            addCriterion("PROTB114CA01 not like", value, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01In(List<String> values) {
            addCriterion("PROTB114CA01 in", values, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01NotIn(List<String> values) {
            addCriterion("PROTB114CA01 not in", values, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01Between(String value1, String value2) {
            addCriterion("PROTB114CA01 between", value1, value2, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114ca01NotBetween(String value1, String value2) {
            addCriterion("PROTB114CA01 not between", value1, value2, "protb114ca01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00IsNull() {
            addCriterion("PROTB114CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00IsNotNull() {
            addCriterion("PROTB114CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00EqualTo(Date value) {
            addCriterion("PROTB114CC00 =", value, "protb114cc00");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00NotEqualTo(Date value) {
            addCriterion("PROTB114CC00 <>", value, "protb114cc00");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00GreaterThan(Date value) {
            addCriterion("PROTB114CC00 >", value, "protb114cc00");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB114CC00 >=", value, "protb114cc00");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00LessThan(Date value) {
            addCriterion("PROTB114CC00 <", value, "protb114cc00");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB114CC00 <=", value, "protb114cc00");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00In(List<Date> values) {
            addCriterion("PROTB114CC00 in", values, "protb114cc00");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00NotIn(List<Date> values) {
            addCriterion("PROTB114CC00 not in", values, "protb114cc00");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00Between(Date value1, Date value2) {
            addCriterion("PROTB114CC00 between", value1, value2, "protb114cc00");
            return (Criteria) this;
        }

        public Criteria andProtb114cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB114CC00 not between", value1, value2, "protb114cc00");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01IsNull() {
            addCriterion("PROTB114CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01IsNotNull() {
            addCriterion("PROTB114CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01EqualTo(String value) {
            addCriterion("PROTB114CC01 =", value, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01NotEqualTo(String value) {
            addCriterion("PROTB114CC01 <>", value, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01GreaterThan(String value) {
            addCriterion("PROTB114CC01 >", value, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB114CC01 >=", value, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01LessThan(String value) {
            addCriterion("PROTB114CC01 <", value, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB114CC01 <=", value, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01Like(String value) {
            addCriterion("PROTB114CC01 like", value, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01NotLike(String value) {
            addCriterion("PROTB114CC01 not like", value, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01In(List<String> values) {
            addCriterion("PROTB114CC01 in", values, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01NotIn(List<String> values) {
            addCriterion("PROTB114CC01 not in", values, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01Between(String value1, String value2) {
            addCriterion("PROTB114CC01 between", value1, value2, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB114CC01 not between", value1, value2, "protb114cc01");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02IsNull() {
            addCriterion("PROTB114CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02IsNotNull() {
            addCriterion("PROTB114CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02EqualTo(Date value) {
            addCriterion("PROTB114CC02 =", value, "protb114cc02");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02NotEqualTo(Date value) {
            addCriterion("PROTB114CC02 <>", value, "protb114cc02");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02GreaterThan(Date value) {
            addCriterion("PROTB114CC02 >", value, "protb114cc02");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB114CC02 >=", value, "protb114cc02");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02LessThan(Date value) {
            addCriterion("PROTB114CC02 <", value, "protb114cc02");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB114CC02 <=", value, "protb114cc02");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02In(List<Date> values) {
            addCriterion("PROTB114CC02 in", values, "protb114cc02");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02NotIn(List<Date> values) {
            addCriterion("PROTB114CC02 not in", values, "protb114cc02");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02Between(Date value1, Date value2) {
            addCriterion("PROTB114CC02 between", value1, value2, "protb114cc02");
            return (Criteria) this;
        }

        public Criteria andProtb114cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB114CC02 not between", value1, value2, "protb114cc02");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03IsNull() {
            addCriterion("PROTB114CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03IsNotNull() {
            addCriterion("PROTB114CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03EqualTo(String value) {
            addCriterion("PROTB114CC03 =", value, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03NotEqualTo(String value) {
            addCriterion("PROTB114CC03 <>", value, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03GreaterThan(String value) {
            addCriterion("PROTB114CC03 >", value, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB114CC03 >=", value, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03LessThan(String value) {
            addCriterion("PROTB114CC03 <", value, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB114CC03 <=", value, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03Like(String value) {
            addCriterion("PROTB114CC03 like", value, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03NotLike(String value) {
            addCriterion("PROTB114CC03 not like", value, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03In(List<String> values) {
            addCriterion("PROTB114CC03 in", values, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03NotIn(List<String> values) {
            addCriterion("PROTB114CC03 not in", values, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03Between(String value1, String value2) {
            addCriterion("PROTB114CC03 between", value1, value2, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB114CC03 not between", value1, value2, "protb114cc03");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00IsNull() {
            addCriterion("PROTB114CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00IsNotNull() {
            addCriterion("PROTB114CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00EqualTo(String value) {
            addCriterion("PROTB114CD00 =", value, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00NotEqualTo(String value) {
            addCriterion("PROTB114CD00 <>", value, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00GreaterThan(String value) {
            addCriterion("PROTB114CD00 >", value, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB114CD00 >=", value, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00LessThan(String value) {
            addCriterion("PROTB114CD00 <", value, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB114CD00 <=", value, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00Like(String value) {
            addCriterion("PROTB114CD00 like", value, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00NotLike(String value) {
            addCriterion("PROTB114CD00 not like", value, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00In(List<String> values) {
            addCriterion("PROTB114CD00 in", values, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00NotIn(List<String> values) {
            addCriterion("PROTB114CD00 not in", values, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00Between(String value1, String value2) {
            addCriterion("PROTB114CD00 between", value1, value2, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB114CD00 not between", value1, value2, "protb114cd00");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01IsNull() {
            addCriterion("PROTB114CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01IsNotNull() {
            addCriterion("PROTB114CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01EqualTo(String value) {
            addCriterion("PROTB114CD01 =", value, "protb114cd01");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01NotEqualTo(String value) {
            addCriterion("PROTB114CD01 <>", value, "protb114cd01");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01GreaterThan(String value) {
            addCriterion("PROTB114CD01 >", value, "protb114cd01");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB114CD01 >=", value, "protb114cd01");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01LessThan(String value) {
            addCriterion("PROTB114CD01 <", value, "protb114cd01");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB114CD01 <=", value, "protb114cd01");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01Like(String value) {
            addCriterion("PROTB114CD01 like", value, "protb114cd01");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01NotLike(String value) {
            addCriterion("PROTB114CD01 not like", value, "protb114cd01");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01In(List<String> values) {
            addCriterion("PROTB114CD01 in", values, "protb114cd01");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01NotIn(List<String> values) {
            addCriterion("PROTB114CD01 not in", values, "protb114cd01");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01Between(String value1, String value2) {
            addCriterion("PROTB114CD01 between", value1, value2, "protb114cd01");
            return (Criteria) this;
        }

        public Criteria andProtb114cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB114CD01 not between", value1, value2, "protb114cd01");
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