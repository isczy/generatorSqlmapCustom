package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb109Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb109Example() {
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

        public Criteria andProtb109idIsNull() {
            addCriterion("PROTB109ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb109idIsNotNull() {
            addCriterion("PROTB109ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109idEqualTo(String value) {
            addCriterion("PROTB109ID =", value, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109idNotEqualTo(String value) {
            addCriterion("PROTB109ID <>", value, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109idGreaterThan(String value) {
            addCriterion("PROTB109ID >", value, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB109ID >=", value, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109idLessThan(String value) {
            addCriterion("PROTB109ID <", value, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109idLessThanOrEqualTo(String value) {
            addCriterion("PROTB109ID <=", value, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109idLike(String value) {
            addCriterion("PROTB109ID like", value, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109idNotLike(String value) {
            addCriterion("PROTB109ID not like", value, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109idIn(List<String> values) {
            addCriterion("PROTB109ID in", values, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109idNotIn(List<String> values) {
            addCriterion("PROTB109ID not in", values, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109idBetween(String value1, String value2) {
            addCriterion("PROTB109ID between", value1, value2, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109idNotBetween(String value1, String value2) {
            addCriterion("PROTB109ID not between", value1, value2, "protb109id");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01IsNull() {
            addCriterion("PROTB109CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01IsNotNull() {
            addCriterion("PROTB109CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01EqualTo(String value) {
            addCriterion("PROTB109CD01 =", value, "protb109cd01");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01NotEqualTo(String value) {
            addCriterion("PROTB109CD01 <>", value, "protb109cd01");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01GreaterThan(String value) {
            addCriterion("PROTB109CD01 >", value, "protb109cd01");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB109CD01 >=", value, "protb109cd01");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01LessThan(String value) {
            addCriterion("PROTB109CD01 <", value, "protb109cd01");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB109CD01 <=", value, "protb109cd01");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01Like(String value) {
            addCriterion("PROTB109CD01 like", value, "protb109cd01");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01NotLike(String value) {
            addCriterion("PROTB109CD01 not like", value, "protb109cd01");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01In(List<String> values) {
            addCriterion("PROTB109CD01 in", values, "protb109cd01");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01NotIn(List<String> values) {
            addCriterion("PROTB109CD01 not in", values, "protb109cd01");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01Between(String value1, String value2) {
            addCriterion("PROTB109CD01 between", value1, value2, "protb109cd01");
            return (Criteria) this;
        }

        public Criteria andProtb109cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB109CD01 not between", value1, value2, "protb109cd01");
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

        public Criteria andProtb109ca00IsNull() {
            addCriterion("PROTB109CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca00IsNotNull() {
            addCriterion("PROTB109CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca00EqualTo(Date value) {
            addCriterion("PROTB109CA00 =", value, "protb109ca00");
            return (Criteria) this;
        }

        public Criteria andProtb109ca00NotEqualTo(Date value) {
            addCriterion("PROTB109CA00 <>", value, "protb109ca00");
            return (Criteria) this;
        }

        public Criteria andProtb109ca00GreaterThan(Date value) {
            addCriterion("PROTB109CA00 >", value, "protb109ca00");
            return (Criteria) this;
        }

        public Criteria andProtb109ca00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB109CA00 >=", value, "protb109ca00");
            return (Criteria) this;
        }

        public Criteria andProtb109ca00LessThan(Date value) {
            addCriterion("PROTB109CA00 <", value, "protb109ca00");
            return (Criteria) this;
        }

        public Criteria andProtb109ca00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB109CA00 <=", value, "protb109ca00");
            return (Criteria) this;
        }

        public Criteria andProtb109ca00In(List<Date> values) {
            addCriterion("PROTB109CA00 in", values, "protb109ca00");
            return (Criteria) this;
        }

        public Criteria andProtb109ca00NotIn(List<Date> values) {
            addCriterion("PROTB109CA00 not in", values, "protb109ca00");
            return (Criteria) this;
        }

        public Criteria andProtb109ca00Between(Date value1, Date value2) {
            addCriterion("PROTB109CA00 between", value1, value2, "protb109ca00");
            return (Criteria) this;
        }

        public Criteria andProtb109ca00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB109CA00 not between", value1, value2, "protb109ca00");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01IsNull() {
            addCriterion("PROTB109CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01IsNotNull() {
            addCriterion("PROTB109CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01EqualTo(Date value) {
            addCriterion("PROTB109CA01 =", value, "protb109ca01");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01NotEqualTo(Date value) {
            addCriterion("PROTB109CA01 <>", value, "protb109ca01");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01GreaterThan(Date value) {
            addCriterion("PROTB109CA01 >", value, "protb109ca01");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB109CA01 >=", value, "protb109ca01");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01LessThan(Date value) {
            addCriterion("PROTB109CA01 <", value, "protb109ca01");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01LessThanOrEqualTo(Date value) {
            addCriterion("PROTB109CA01 <=", value, "protb109ca01");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01In(List<Date> values) {
            addCriterion("PROTB109CA01 in", values, "protb109ca01");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01NotIn(List<Date> values) {
            addCriterion("PROTB109CA01 not in", values, "protb109ca01");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01Between(Date value1, Date value2) {
            addCriterion("PROTB109CA01 between", value1, value2, "protb109ca01");
            return (Criteria) this;
        }

        public Criteria andProtb109ca01NotBetween(Date value1, Date value2) {
            addCriterion("PROTB109CA01 not between", value1, value2, "protb109ca01");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02IsNull() {
            addCriterion("PROTB109CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02IsNotNull() {
            addCriterion("PROTB109CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02EqualTo(String value) {
            addCriterion("PROTB109CA02 =", value, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02NotEqualTo(String value) {
            addCriterion("PROTB109CA02 <>", value, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02GreaterThan(String value) {
            addCriterion("PROTB109CA02 >", value, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB109CA02 >=", value, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02LessThan(String value) {
            addCriterion("PROTB109CA02 <", value, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02LessThanOrEqualTo(String value) {
            addCriterion("PROTB109CA02 <=", value, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02Like(String value) {
            addCriterion("PROTB109CA02 like", value, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02NotLike(String value) {
            addCriterion("PROTB109CA02 not like", value, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02In(List<String> values) {
            addCriterion("PROTB109CA02 in", values, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02NotIn(List<String> values) {
            addCriterion("PROTB109CA02 not in", values, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02Between(String value1, String value2) {
            addCriterion("PROTB109CA02 between", value1, value2, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca02NotBetween(String value1, String value2) {
            addCriterion("PROTB109CA02 not between", value1, value2, "protb109ca02");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03IsNull() {
            addCriterion("PROTB109CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03IsNotNull() {
            addCriterion("PROTB109CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03EqualTo(String value) {
            addCriterion("PROTB109CA03 =", value, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03NotEqualTo(String value) {
            addCriterion("PROTB109CA03 <>", value, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03GreaterThan(String value) {
            addCriterion("PROTB109CA03 >", value, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB109CA03 >=", value, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03LessThan(String value) {
            addCriterion("PROTB109CA03 <", value, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03LessThanOrEqualTo(String value) {
            addCriterion("PROTB109CA03 <=", value, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03Like(String value) {
            addCriterion("PROTB109CA03 like", value, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03NotLike(String value) {
            addCriterion("PROTB109CA03 not like", value, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03In(List<String> values) {
            addCriterion("PROTB109CA03 in", values, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03NotIn(List<String> values) {
            addCriterion("PROTB109CA03 not in", values, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03Between(String value1, String value2) {
            addCriterion("PROTB109CA03 between", value1, value2, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca03NotBetween(String value1, String value2) {
            addCriterion("PROTB109CA03 not between", value1, value2, "protb109ca03");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04IsNull() {
            addCriterion("PROTB109CA04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04IsNotNull() {
            addCriterion("PROTB109CA04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04EqualTo(Integer value) {
            addCriterion("PROTB109CA04 =", value, "protb109ca04");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04NotEqualTo(Integer value) {
            addCriterion("PROTB109CA04 <>", value, "protb109ca04");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04GreaterThan(Integer value) {
            addCriterion("PROTB109CA04 >", value, "protb109ca04");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04GreaterThanOrEqualTo(Integer value) {
            addCriterion("PROTB109CA04 >=", value, "protb109ca04");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04LessThan(Integer value) {
            addCriterion("PROTB109CA04 <", value, "protb109ca04");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04LessThanOrEqualTo(Integer value) {
            addCriterion("PROTB109CA04 <=", value, "protb109ca04");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04In(List<Integer> values) {
            addCriterion("PROTB109CA04 in", values, "protb109ca04");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04NotIn(List<Integer> values) {
            addCriterion("PROTB109CA04 not in", values, "protb109ca04");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04Between(Integer value1, Integer value2) {
            addCriterion("PROTB109CA04 between", value1, value2, "protb109ca04");
            return (Criteria) this;
        }

        public Criteria andProtb109ca04NotBetween(Integer value1, Integer value2) {
            addCriterion("PROTB109CA04 not between", value1, value2, "protb109ca04");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05IsNull() {
            addCriterion("PROTB109CA05 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05IsNotNull() {
            addCriterion("PROTB109CA05 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05EqualTo(String value) {
            addCriterion("PROTB109CA05 =", value, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05NotEqualTo(String value) {
            addCriterion("PROTB109CA05 <>", value, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05GreaterThan(String value) {
            addCriterion("PROTB109CA05 >", value, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB109CA05 >=", value, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05LessThan(String value) {
            addCriterion("PROTB109CA05 <", value, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05LessThanOrEqualTo(String value) {
            addCriterion("PROTB109CA05 <=", value, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05Like(String value) {
            addCriterion("PROTB109CA05 like", value, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05NotLike(String value) {
            addCriterion("PROTB109CA05 not like", value, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05In(List<String> values) {
            addCriterion("PROTB109CA05 in", values, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05NotIn(List<String> values) {
            addCriterion("PROTB109CA05 not in", values, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05Between(String value1, String value2) {
            addCriterion("PROTB109CA05 between", value1, value2, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109ca05NotBetween(String value1, String value2) {
            addCriterion("PROTB109CA05 not between", value1, value2, "protb109ca05");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00IsNull() {
            addCriterion("PROTB109CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00IsNotNull() {
            addCriterion("PROTB109CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00EqualTo(Date value) {
            addCriterion("PROTB109CC00 =", value, "protb109cc00");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00NotEqualTo(Date value) {
            addCriterion("PROTB109CC00 <>", value, "protb109cc00");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00GreaterThan(Date value) {
            addCriterion("PROTB109CC00 >", value, "protb109cc00");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB109CC00 >=", value, "protb109cc00");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00LessThan(Date value) {
            addCriterion("PROTB109CC00 <", value, "protb109cc00");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB109CC00 <=", value, "protb109cc00");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00In(List<Date> values) {
            addCriterion("PROTB109CC00 in", values, "protb109cc00");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00NotIn(List<Date> values) {
            addCriterion("PROTB109CC00 not in", values, "protb109cc00");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00Between(Date value1, Date value2) {
            addCriterion("PROTB109CC00 between", value1, value2, "protb109cc00");
            return (Criteria) this;
        }

        public Criteria andProtb109cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB109CC00 not between", value1, value2, "protb109cc00");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01IsNull() {
            addCriterion("PROTB109CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01IsNotNull() {
            addCriterion("PROTB109CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01EqualTo(String value) {
            addCriterion("PROTB109CC01 =", value, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01NotEqualTo(String value) {
            addCriterion("PROTB109CC01 <>", value, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01GreaterThan(String value) {
            addCriterion("PROTB109CC01 >", value, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB109CC01 >=", value, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01LessThan(String value) {
            addCriterion("PROTB109CC01 <", value, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB109CC01 <=", value, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01Like(String value) {
            addCriterion("PROTB109CC01 like", value, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01NotLike(String value) {
            addCriterion("PROTB109CC01 not like", value, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01In(List<String> values) {
            addCriterion("PROTB109CC01 in", values, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01NotIn(List<String> values) {
            addCriterion("PROTB109CC01 not in", values, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01Between(String value1, String value2) {
            addCriterion("PROTB109CC01 between", value1, value2, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB109CC01 not between", value1, value2, "protb109cc01");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02IsNull() {
            addCriterion("PROTB109CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02IsNotNull() {
            addCriterion("PROTB109CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02EqualTo(Date value) {
            addCriterion("PROTB109CC02 =", value, "protb109cc02");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02NotEqualTo(Date value) {
            addCriterion("PROTB109CC02 <>", value, "protb109cc02");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02GreaterThan(Date value) {
            addCriterion("PROTB109CC02 >", value, "protb109cc02");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB109CC02 >=", value, "protb109cc02");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02LessThan(Date value) {
            addCriterion("PROTB109CC02 <", value, "protb109cc02");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB109CC02 <=", value, "protb109cc02");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02In(List<Date> values) {
            addCriterion("PROTB109CC02 in", values, "protb109cc02");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02NotIn(List<Date> values) {
            addCriterion("PROTB109CC02 not in", values, "protb109cc02");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02Between(Date value1, Date value2) {
            addCriterion("PROTB109CC02 between", value1, value2, "protb109cc02");
            return (Criteria) this;
        }

        public Criteria andProtb109cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB109CC02 not between", value1, value2, "protb109cc02");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03IsNull() {
            addCriterion("PROTB109CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03IsNotNull() {
            addCriterion("PROTB109CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03EqualTo(String value) {
            addCriterion("PROTB109CC03 =", value, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03NotEqualTo(String value) {
            addCriterion("PROTB109CC03 <>", value, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03GreaterThan(String value) {
            addCriterion("PROTB109CC03 >", value, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB109CC03 >=", value, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03LessThan(String value) {
            addCriterion("PROTB109CC03 <", value, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB109CC03 <=", value, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03Like(String value) {
            addCriterion("PROTB109CC03 like", value, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03NotLike(String value) {
            addCriterion("PROTB109CC03 not like", value, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03In(List<String> values) {
            addCriterion("PROTB109CC03 in", values, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03NotIn(List<String> values) {
            addCriterion("PROTB109CC03 not in", values, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03Between(String value1, String value2) {
            addCriterion("PROTB109CC03 between", value1, value2, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB109CC03 not between", value1, value2, "protb109cc03");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00IsNull() {
            addCriterion("PROTB109CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00IsNotNull() {
            addCriterion("PROTB109CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00EqualTo(String value) {
            addCriterion("PROTB109CD00 =", value, "protb109cd00");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00NotEqualTo(String value) {
            addCriterion("PROTB109CD00 <>", value, "protb109cd00");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00GreaterThan(String value) {
            addCriterion("PROTB109CD00 >", value, "protb109cd00");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB109CD00 >=", value, "protb109cd00");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00LessThan(String value) {
            addCriterion("PROTB109CD00 <", value, "protb109cd00");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB109CD00 <=", value, "protb109cd00");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00Like(String value) {
            addCriterion("PROTB109CD00 like", value, "protb109cd00");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00NotLike(String value) {
            addCriterion("PROTB109CD00 not like", value, "protb109cd00");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00In(List<String> values) {
            addCriterion("PROTB109CD00 in", values, "protb109cd00");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00NotIn(List<String> values) {
            addCriterion("PROTB109CD00 not in", values, "protb109cd00");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00Between(String value1, String value2) {
            addCriterion("PROTB109CD00 between", value1, value2, "protb109cd00");
            return (Criteria) this;
        }

        public Criteria andProtb109cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB109CD00 not between", value1, value2, "protb109cd00");
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