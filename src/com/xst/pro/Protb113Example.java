package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb113Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb113Example() {
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

        public Criteria andProtb113idIsNull() {
            addCriterion("PROTB113ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb113idIsNotNull() {
            addCriterion("PROTB113ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb113idEqualTo(String value) {
            addCriterion("PROTB113ID =", value, "protb113id");
            return (Criteria) this;
        }

        public Criteria andProtb113idNotEqualTo(String value) {
            addCriterion("PROTB113ID <>", value, "protb113id");
            return (Criteria) this;
        }

        public Criteria andProtb113idGreaterThan(String value) {
            addCriterion("PROTB113ID >", value, "protb113id");
            return (Criteria) this;
        }

        public Criteria andProtb113idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB113ID >=", value, "protb113id");
            return (Criteria) this;
        }

        public Criteria andProtb113idLessThan(String value) {
            addCriterion("PROTB113ID <", value, "protb113id");
            return (Criteria) this;
        }

        public Criteria andProtb113idLessThanOrEqualTo(String value) {
            addCriterion("PROTB113ID <=", value, "protb113id");
            return (Criteria) this;
        }

        public Criteria andProtb113idLike(String value) {
            addCriterion("PROTB113ID like", value, "protb113id");
            return (Criteria) this;
        }

        public Criteria andProtb113idNotLike(String value) {
            addCriterion("PROTB113ID not like", value, "protb113id");
            return (Criteria) this;
        }

        public Criteria andProtb113idIn(List<String> values) {
            addCriterion("PROTB113ID in", values, "protb113id");
            return (Criteria) this;
        }

        public Criteria andProtb113idNotIn(List<String> values) {
            addCriterion("PROTB113ID not in", values, "protb113id");
            return (Criteria) this;
        }

        public Criteria andProtb113idBetween(String value1, String value2) {
            addCriterion("PROTB113ID between", value1, value2, "protb113id");
            return (Criteria) this;
        }

        public Criteria andProtb113idNotBetween(String value1, String value2) {
            addCriterion("PROTB113ID not between", value1, value2, "protb113id");
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

        public Criteria andProtb113ca00IsNull() {
            addCriterion("PROTB113CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00IsNotNull() {
            addCriterion("PROTB113CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00EqualTo(String value) {
            addCriterion("PROTB113CA00 =", value, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00NotEqualTo(String value) {
            addCriterion("PROTB113CA00 <>", value, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00GreaterThan(String value) {
            addCriterion("PROTB113CA00 >", value, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB113CA00 >=", value, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00LessThan(String value) {
            addCriterion("PROTB113CA00 <", value, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00LessThanOrEqualTo(String value) {
            addCriterion("PROTB113CA00 <=", value, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00Like(String value) {
            addCriterion("PROTB113CA00 like", value, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00NotLike(String value) {
            addCriterion("PROTB113CA00 not like", value, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00In(List<String> values) {
            addCriterion("PROTB113CA00 in", values, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00NotIn(List<String> values) {
            addCriterion("PROTB113CA00 not in", values, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00Between(String value1, String value2) {
            addCriterion("PROTB113CA00 between", value1, value2, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113ca00NotBetween(String value1, String value2) {
            addCriterion("PROTB113CA00 not between", value1, value2, "protb113ca00");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00IsNull() {
            addCriterion("PROTB113CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00IsNotNull() {
            addCriterion("PROTB113CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00EqualTo(Date value) {
            addCriterion("PROTB113CC00 =", value, "protb113cc00");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00NotEqualTo(Date value) {
            addCriterion("PROTB113CC00 <>", value, "protb113cc00");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00GreaterThan(Date value) {
            addCriterion("PROTB113CC00 >", value, "protb113cc00");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB113CC00 >=", value, "protb113cc00");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00LessThan(Date value) {
            addCriterion("PROTB113CC00 <", value, "protb113cc00");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB113CC00 <=", value, "protb113cc00");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00In(List<Date> values) {
            addCriterion("PROTB113CC00 in", values, "protb113cc00");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00NotIn(List<Date> values) {
            addCriterion("PROTB113CC00 not in", values, "protb113cc00");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00Between(Date value1, Date value2) {
            addCriterion("PROTB113CC00 between", value1, value2, "protb113cc00");
            return (Criteria) this;
        }

        public Criteria andProtb113cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB113CC00 not between", value1, value2, "protb113cc00");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01IsNull() {
            addCriterion("PROTB113CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01IsNotNull() {
            addCriterion("PROTB113CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01EqualTo(String value) {
            addCriterion("PROTB113CC01 =", value, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01NotEqualTo(String value) {
            addCriterion("PROTB113CC01 <>", value, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01GreaterThan(String value) {
            addCriterion("PROTB113CC01 >", value, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB113CC01 >=", value, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01LessThan(String value) {
            addCriterion("PROTB113CC01 <", value, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB113CC01 <=", value, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01Like(String value) {
            addCriterion("PROTB113CC01 like", value, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01NotLike(String value) {
            addCriterion("PROTB113CC01 not like", value, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01In(List<String> values) {
            addCriterion("PROTB113CC01 in", values, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01NotIn(List<String> values) {
            addCriterion("PROTB113CC01 not in", values, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01Between(String value1, String value2) {
            addCriterion("PROTB113CC01 between", value1, value2, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB113CC01 not between", value1, value2, "protb113cc01");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02IsNull() {
            addCriterion("PROTB113CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02IsNotNull() {
            addCriterion("PROTB113CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02EqualTo(Date value) {
            addCriterion("PROTB113CC02 =", value, "protb113cc02");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02NotEqualTo(Date value) {
            addCriterion("PROTB113CC02 <>", value, "protb113cc02");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02GreaterThan(Date value) {
            addCriterion("PROTB113CC02 >", value, "protb113cc02");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB113CC02 >=", value, "protb113cc02");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02LessThan(Date value) {
            addCriterion("PROTB113CC02 <", value, "protb113cc02");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB113CC02 <=", value, "protb113cc02");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02In(List<Date> values) {
            addCriterion("PROTB113CC02 in", values, "protb113cc02");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02NotIn(List<Date> values) {
            addCriterion("PROTB113CC02 not in", values, "protb113cc02");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02Between(Date value1, Date value2) {
            addCriterion("PROTB113CC02 between", value1, value2, "protb113cc02");
            return (Criteria) this;
        }

        public Criteria andProtb113cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB113CC02 not between", value1, value2, "protb113cc02");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03IsNull() {
            addCriterion("PROTB113CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03IsNotNull() {
            addCriterion("PROTB113CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03EqualTo(String value) {
            addCriterion("PROTB113CC03 =", value, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03NotEqualTo(String value) {
            addCriterion("PROTB113CC03 <>", value, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03GreaterThan(String value) {
            addCriterion("PROTB113CC03 >", value, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB113CC03 >=", value, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03LessThan(String value) {
            addCriterion("PROTB113CC03 <", value, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB113CC03 <=", value, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03Like(String value) {
            addCriterion("PROTB113CC03 like", value, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03NotLike(String value) {
            addCriterion("PROTB113CC03 not like", value, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03In(List<String> values) {
            addCriterion("PROTB113CC03 in", values, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03NotIn(List<String> values) {
            addCriterion("PROTB113CC03 not in", values, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03Between(String value1, String value2) {
            addCriterion("PROTB113CC03 between", value1, value2, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB113CC03 not between", value1, value2, "protb113cc03");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00IsNull() {
            addCriterion("PROTB113CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00IsNotNull() {
            addCriterion("PROTB113CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00EqualTo(String value) {
            addCriterion("PROTB113CD00 =", value, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00NotEqualTo(String value) {
            addCriterion("PROTB113CD00 <>", value, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00GreaterThan(String value) {
            addCriterion("PROTB113CD00 >", value, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB113CD00 >=", value, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00LessThan(String value) {
            addCriterion("PROTB113CD00 <", value, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB113CD00 <=", value, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00Like(String value) {
            addCriterion("PROTB113CD00 like", value, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00NotLike(String value) {
            addCriterion("PROTB113CD00 not like", value, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00In(List<String> values) {
            addCriterion("PROTB113CD00 in", values, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00NotIn(List<String> values) {
            addCriterion("PROTB113CD00 not in", values, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00Between(String value1, String value2) {
            addCriterion("PROTB113CD00 between", value1, value2, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB113CD00 not between", value1, value2, "protb113cd00");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01IsNull() {
            addCriterion("PROTB113CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01IsNotNull() {
            addCriterion("PROTB113CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01EqualTo(String value) {
            addCriterion("PROTB113CD01 =", value, "protb113cd01");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01NotEqualTo(String value) {
            addCriterion("PROTB113CD01 <>", value, "protb113cd01");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01GreaterThan(String value) {
            addCriterion("PROTB113CD01 >", value, "protb113cd01");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB113CD01 >=", value, "protb113cd01");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01LessThan(String value) {
            addCriterion("PROTB113CD01 <", value, "protb113cd01");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB113CD01 <=", value, "protb113cd01");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01Like(String value) {
            addCriterion("PROTB113CD01 like", value, "protb113cd01");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01NotLike(String value) {
            addCriterion("PROTB113CD01 not like", value, "protb113cd01");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01In(List<String> values) {
            addCriterion("PROTB113CD01 in", values, "protb113cd01");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01NotIn(List<String> values) {
            addCriterion("PROTB113CD01 not in", values, "protb113cd01");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01Between(String value1, String value2) {
            addCriterion("PROTB113CD01 between", value1, value2, "protb113cd01");
            return (Criteria) this;
        }

        public Criteria andProtb113cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB113CD01 not between", value1, value2, "protb113cd01");
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