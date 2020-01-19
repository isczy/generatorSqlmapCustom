package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb108Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb108Example() {
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

        public Criteria andProtb108idIsNull() {
            addCriterion("PROTB108ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb108idIsNotNull() {
            addCriterion("PROTB108ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108idEqualTo(String value) {
            addCriterion("PROTB108ID =", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idNotEqualTo(String value) {
            addCriterion("PROTB108ID <>", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idGreaterThan(String value) {
            addCriterion("PROTB108ID >", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB108ID >=", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idLessThan(String value) {
            addCriterion("PROTB108ID <", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idLessThanOrEqualTo(String value) {
            addCriterion("PROTB108ID <=", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idLike(String value) {
            addCriterion("PROTB108ID like", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idNotLike(String value) {
            addCriterion("PROTB108ID not like", value, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idIn(List<String> values) {
            addCriterion("PROTB108ID in", values, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idNotIn(List<String> values) {
            addCriterion("PROTB108ID not in", values, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idBetween(String value1, String value2) {
            addCriterion("PROTB108ID between", value1, value2, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108idNotBetween(String value1, String value2) {
            addCriterion("PROTB108ID not between", value1, value2, "protb108id");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01IsNull() {
            addCriterion("PROTB108CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01IsNotNull() {
            addCriterion("PROTB108CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01EqualTo(String value) {
            addCriterion("PROTB108CD01 =", value, "protb108cd01");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01NotEqualTo(String value) {
            addCriterion("PROTB108CD01 <>", value, "protb108cd01");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01GreaterThan(String value) {
            addCriterion("PROTB108CD01 >", value, "protb108cd01");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB108CD01 >=", value, "protb108cd01");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01LessThan(String value) {
            addCriterion("PROTB108CD01 <", value, "protb108cd01");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB108CD01 <=", value, "protb108cd01");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01Like(String value) {
            addCriterion("PROTB108CD01 like", value, "protb108cd01");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01NotLike(String value) {
            addCriterion("PROTB108CD01 not like", value, "protb108cd01");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01In(List<String> values) {
            addCriterion("PROTB108CD01 in", values, "protb108cd01");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01NotIn(List<String> values) {
            addCriterion("PROTB108CD01 not in", values, "protb108cd01");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01Between(String value1, String value2) {
            addCriterion("PROTB108CD01 between", value1, value2, "protb108cd01");
            return (Criteria) this;
        }

        public Criteria andProtb108cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB108CD01 not between", value1, value2, "protb108cd01");
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

        public Criteria andProtb108ca00IsNull() {
            addCriterion("PROTB108CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00IsNotNull() {
            addCriterion("PROTB108CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00EqualTo(String value) {
            addCriterion("PROTB108CA00 =", value, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00NotEqualTo(String value) {
            addCriterion("PROTB108CA00 <>", value, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00GreaterThan(String value) {
            addCriterion("PROTB108CA00 >", value, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB108CA00 >=", value, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00LessThan(String value) {
            addCriterion("PROTB108CA00 <", value, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00LessThanOrEqualTo(String value) {
            addCriterion("PROTB108CA00 <=", value, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00Like(String value) {
            addCriterion("PROTB108CA00 like", value, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00NotLike(String value) {
            addCriterion("PROTB108CA00 not like", value, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00In(List<String> values) {
            addCriterion("PROTB108CA00 in", values, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00NotIn(List<String> values) {
            addCriterion("PROTB108CA00 not in", values, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00Between(String value1, String value2) {
            addCriterion("PROTB108CA00 between", value1, value2, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca00NotBetween(String value1, String value2) {
            addCriterion("PROTB108CA00 not between", value1, value2, "protb108ca00");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01IsNull() {
            addCriterion("PROTB108CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01IsNotNull() {
            addCriterion("PROTB108CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01EqualTo(Double value) {
            addCriterion("PROTB108CA01 =", value, "protb108ca01");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01NotEqualTo(Double value) {
            addCriterion("PROTB108CA01 <>", value, "protb108ca01");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01GreaterThan(Double value) {
            addCriterion("PROTB108CA01 >", value, "protb108ca01");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB108CA01 >=", value, "protb108ca01");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01LessThan(Double value) {
            addCriterion("PROTB108CA01 <", value, "protb108ca01");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01LessThanOrEqualTo(Double value) {
            addCriterion("PROTB108CA01 <=", value, "protb108ca01");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01In(List<Double> values) {
            addCriterion("PROTB108CA01 in", values, "protb108ca01");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01NotIn(List<Double> values) {
            addCriterion("PROTB108CA01 not in", values, "protb108ca01");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01Between(Double value1, Double value2) {
            addCriterion("PROTB108CA01 between", value1, value2, "protb108ca01");
            return (Criteria) this;
        }

        public Criteria andProtb108ca01NotBetween(Double value1, Double value2) {
            addCriterion("PROTB108CA01 not between", value1, value2, "protb108ca01");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02IsNull() {
            addCriterion("PROTB108CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02IsNotNull() {
            addCriterion("PROTB108CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02EqualTo(Double value) {
            addCriterion("PROTB108CA02 =", value, "protb108ca02");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02NotEqualTo(Double value) {
            addCriterion("PROTB108CA02 <>", value, "protb108ca02");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02GreaterThan(Double value) {
            addCriterion("PROTB108CA02 >", value, "protb108ca02");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB108CA02 >=", value, "protb108ca02");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02LessThan(Double value) {
            addCriterion("PROTB108CA02 <", value, "protb108ca02");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02LessThanOrEqualTo(Double value) {
            addCriterion("PROTB108CA02 <=", value, "protb108ca02");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02In(List<Double> values) {
            addCriterion("PROTB108CA02 in", values, "protb108ca02");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02NotIn(List<Double> values) {
            addCriterion("PROTB108CA02 not in", values, "protb108ca02");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02Between(Double value1, Double value2) {
            addCriterion("PROTB108CA02 between", value1, value2, "protb108ca02");
            return (Criteria) this;
        }

        public Criteria andProtb108ca02NotBetween(Double value1, Double value2) {
            addCriterion("PROTB108CA02 not between", value1, value2, "protb108ca02");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03IsNull() {
            addCriterion("PROTB108CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03IsNotNull() {
            addCriterion("PROTB108CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03EqualTo(String value) {
            addCriterion("PROTB108CA03 =", value, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03NotEqualTo(String value) {
            addCriterion("PROTB108CA03 <>", value, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03GreaterThan(String value) {
            addCriterion("PROTB108CA03 >", value, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB108CA03 >=", value, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03LessThan(String value) {
            addCriterion("PROTB108CA03 <", value, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03LessThanOrEqualTo(String value) {
            addCriterion("PROTB108CA03 <=", value, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03Like(String value) {
            addCriterion("PROTB108CA03 like", value, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03NotLike(String value) {
            addCriterion("PROTB108CA03 not like", value, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03In(List<String> values) {
            addCriterion("PROTB108CA03 in", values, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03NotIn(List<String> values) {
            addCriterion("PROTB108CA03 not in", values, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03Between(String value1, String value2) {
            addCriterion("PROTB108CA03 between", value1, value2, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca03NotBetween(String value1, String value2) {
            addCriterion("PROTB108CA03 not between", value1, value2, "protb108ca03");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04IsNull() {
            addCriterion("PROTB108CA04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04IsNotNull() {
            addCriterion("PROTB108CA04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04EqualTo(String value) {
            addCriterion("PROTB108CA04 =", value, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04NotEqualTo(String value) {
            addCriterion("PROTB108CA04 <>", value, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04GreaterThan(String value) {
            addCriterion("PROTB108CA04 >", value, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB108CA04 >=", value, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04LessThan(String value) {
            addCriterion("PROTB108CA04 <", value, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04LessThanOrEqualTo(String value) {
            addCriterion("PROTB108CA04 <=", value, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04Like(String value) {
            addCriterion("PROTB108CA04 like", value, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04NotLike(String value) {
            addCriterion("PROTB108CA04 not like", value, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04In(List<String> values) {
            addCriterion("PROTB108CA04 in", values, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04NotIn(List<String> values) {
            addCriterion("PROTB108CA04 not in", values, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04Between(String value1, String value2) {
            addCriterion("PROTB108CA04 between", value1, value2, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca04NotBetween(String value1, String value2) {
            addCriterion("PROTB108CA04 not between", value1, value2, "protb108ca04");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05IsNull() {
            addCriterion("PROTB108CA05 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05IsNotNull() {
            addCriterion("PROTB108CA05 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05EqualTo(String value) {
            addCriterion("PROTB108CA05 =", value, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05NotEqualTo(String value) {
            addCriterion("PROTB108CA05 <>", value, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05GreaterThan(String value) {
            addCriterion("PROTB108CA05 >", value, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB108CA05 >=", value, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05LessThan(String value) {
            addCriterion("PROTB108CA05 <", value, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05LessThanOrEqualTo(String value) {
            addCriterion("PROTB108CA05 <=", value, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05Like(String value) {
            addCriterion("PROTB108CA05 like", value, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05NotLike(String value) {
            addCriterion("PROTB108CA05 not like", value, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05In(List<String> values) {
            addCriterion("PROTB108CA05 in", values, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05NotIn(List<String> values) {
            addCriterion("PROTB108CA05 not in", values, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05Between(String value1, String value2) {
            addCriterion("PROTB108CA05 between", value1, value2, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca05NotBetween(String value1, String value2) {
            addCriterion("PROTB108CA05 not between", value1, value2, "protb108ca05");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06IsNull() {
            addCriterion("PROTB108CA06 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06IsNotNull() {
            addCriterion("PROTB108CA06 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06EqualTo(Double value) {
            addCriterion("PROTB108CA06 =", value, "protb108ca06");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06NotEqualTo(Double value) {
            addCriterion("PROTB108CA06 <>", value, "protb108ca06");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06GreaterThan(Double value) {
            addCriterion("PROTB108CA06 >", value, "protb108ca06");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB108CA06 >=", value, "protb108ca06");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06LessThan(Double value) {
            addCriterion("PROTB108CA06 <", value, "protb108ca06");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06LessThanOrEqualTo(Double value) {
            addCriterion("PROTB108CA06 <=", value, "protb108ca06");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06In(List<Double> values) {
            addCriterion("PROTB108CA06 in", values, "protb108ca06");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06NotIn(List<Double> values) {
            addCriterion("PROTB108CA06 not in", values, "protb108ca06");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06Between(Double value1, Double value2) {
            addCriterion("PROTB108CA06 between", value1, value2, "protb108ca06");
            return (Criteria) this;
        }

        public Criteria andProtb108ca06NotBetween(Double value1, Double value2) {
            addCriterion("PROTB108CA06 not between", value1, value2, "protb108ca06");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07IsNull() {
            addCriterion("PROTB108CA07 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07IsNotNull() {
            addCriterion("PROTB108CA07 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07EqualTo(Integer value) {
            addCriterion("PROTB108CA07 =", value, "protb108ca07");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07NotEqualTo(Integer value) {
            addCriterion("PROTB108CA07 <>", value, "protb108ca07");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07GreaterThan(Integer value) {
            addCriterion("PROTB108CA07 >", value, "protb108ca07");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07GreaterThanOrEqualTo(Integer value) {
            addCriterion("PROTB108CA07 >=", value, "protb108ca07");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07LessThan(Integer value) {
            addCriterion("PROTB108CA07 <", value, "protb108ca07");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07LessThanOrEqualTo(Integer value) {
            addCriterion("PROTB108CA07 <=", value, "protb108ca07");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07In(List<Integer> values) {
            addCriterion("PROTB108CA07 in", values, "protb108ca07");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07NotIn(List<Integer> values) {
            addCriterion("PROTB108CA07 not in", values, "protb108ca07");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07Between(Integer value1, Integer value2) {
            addCriterion("PROTB108CA07 between", value1, value2, "protb108ca07");
            return (Criteria) this;
        }

        public Criteria andProtb108ca07NotBetween(Integer value1, Integer value2) {
            addCriterion("PROTB108CA07 not between", value1, value2, "protb108ca07");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00IsNull() {
            addCriterion("PROTB108CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00IsNotNull() {
            addCriterion("PROTB108CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00EqualTo(Date value) {
            addCriterion("PROTB108CC00 =", value, "protb108cc00");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00NotEqualTo(Date value) {
            addCriterion("PROTB108CC00 <>", value, "protb108cc00");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00GreaterThan(Date value) {
            addCriterion("PROTB108CC00 >", value, "protb108cc00");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB108CC00 >=", value, "protb108cc00");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00LessThan(Date value) {
            addCriterion("PROTB108CC00 <", value, "protb108cc00");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB108CC00 <=", value, "protb108cc00");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00In(List<Date> values) {
            addCriterion("PROTB108CC00 in", values, "protb108cc00");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00NotIn(List<Date> values) {
            addCriterion("PROTB108CC00 not in", values, "protb108cc00");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00Between(Date value1, Date value2) {
            addCriterion("PROTB108CC00 between", value1, value2, "protb108cc00");
            return (Criteria) this;
        }

        public Criteria andProtb108cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB108CC00 not between", value1, value2, "protb108cc00");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01IsNull() {
            addCriterion("PROTB108CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01IsNotNull() {
            addCriterion("PROTB108CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01EqualTo(String value) {
            addCriterion("PROTB108CC01 =", value, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01NotEqualTo(String value) {
            addCriterion("PROTB108CC01 <>", value, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01GreaterThan(String value) {
            addCriterion("PROTB108CC01 >", value, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB108CC01 >=", value, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01LessThan(String value) {
            addCriterion("PROTB108CC01 <", value, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB108CC01 <=", value, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01Like(String value) {
            addCriterion("PROTB108CC01 like", value, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01NotLike(String value) {
            addCriterion("PROTB108CC01 not like", value, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01In(List<String> values) {
            addCriterion("PROTB108CC01 in", values, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01NotIn(List<String> values) {
            addCriterion("PROTB108CC01 not in", values, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01Between(String value1, String value2) {
            addCriterion("PROTB108CC01 between", value1, value2, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB108CC01 not between", value1, value2, "protb108cc01");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02IsNull() {
            addCriterion("PROTB108CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02IsNotNull() {
            addCriterion("PROTB108CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02EqualTo(Date value) {
            addCriterion("PROTB108CC02 =", value, "protb108cc02");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02NotEqualTo(Date value) {
            addCriterion("PROTB108CC02 <>", value, "protb108cc02");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02GreaterThan(Date value) {
            addCriterion("PROTB108CC02 >", value, "protb108cc02");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB108CC02 >=", value, "protb108cc02");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02LessThan(Date value) {
            addCriterion("PROTB108CC02 <", value, "protb108cc02");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB108CC02 <=", value, "protb108cc02");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02In(List<Date> values) {
            addCriterion("PROTB108CC02 in", values, "protb108cc02");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02NotIn(List<Date> values) {
            addCriterion("PROTB108CC02 not in", values, "protb108cc02");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02Between(Date value1, Date value2) {
            addCriterion("PROTB108CC02 between", value1, value2, "protb108cc02");
            return (Criteria) this;
        }

        public Criteria andProtb108cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB108CC02 not between", value1, value2, "protb108cc02");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03IsNull() {
            addCriterion("PROTB108CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03IsNotNull() {
            addCriterion("PROTB108CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03EqualTo(String value) {
            addCriterion("PROTB108CC03 =", value, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03NotEqualTo(String value) {
            addCriterion("PROTB108CC03 <>", value, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03GreaterThan(String value) {
            addCriterion("PROTB108CC03 >", value, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB108CC03 >=", value, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03LessThan(String value) {
            addCriterion("PROTB108CC03 <", value, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB108CC03 <=", value, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03Like(String value) {
            addCriterion("PROTB108CC03 like", value, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03NotLike(String value) {
            addCriterion("PROTB108CC03 not like", value, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03In(List<String> values) {
            addCriterion("PROTB108CC03 in", values, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03NotIn(List<String> values) {
            addCriterion("PROTB108CC03 not in", values, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03Between(String value1, String value2) {
            addCriterion("PROTB108CC03 between", value1, value2, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB108CC03 not between", value1, value2, "protb108cc03");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00IsNull() {
            addCriterion("PROTB108CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00IsNotNull() {
            addCriterion("PROTB108CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00EqualTo(String value) {
            addCriterion("PROTB108CD00 =", value, "protb108cd00");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00NotEqualTo(String value) {
            addCriterion("PROTB108CD00 <>", value, "protb108cd00");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00GreaterThan(String value) {
            addCriterion("PROTB108CD00 >", value, "protb108cd00");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB108CD00 >=", value, "protb108cd00");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00LessThan(String value) {
            addCriterion("PROTB108CD00 <", value, "protb108cd00");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB108CD00 <=", value, "protb108cd00");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00Like(String value) {
            addCriterion("PROTB108CD00 like", value, "protb108cd00");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00NotLike(String value) {
            addCriterion("PROTB108CD00 not like", value, "protb108cd00");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00In(List<String> values) {
            addCriterion("PROTB108CD00 in", values, "protb108cd00");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00NotIn(List<String> values) {
            addCriterion("PROTB108CD00 not in", values, "protb108cd00");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00Between(String value1, String value2) {
            addCriterion("PROTB108CD00 between", value1, value2, "protb108cd00");
            return (Criteria) this;
        }

        public Criteria andProtb108cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB108CD00 not between", value1, value2, "protb108cd00");
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