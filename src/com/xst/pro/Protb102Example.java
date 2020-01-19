package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb102Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb102Example() {
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

        public Criteria andProtb102idIsNull() {
            addCriterion("PROTB102ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb102idIsNotNull() {
            addCriterion("PROTB102ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102idEqualTo(String value) {
            addCriterion("PROTB102ID =", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotEqualTo(String value) {
            addCriterion("PROTB102ID <>", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idGreaterThan(String value) {
            addCriterion("PROTB102ID >", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB102ID >=", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idLessThan(String value) {
            addCriterion("PROTB102ID <", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idLessThanOrEqualTo(String value) {
            addCriterion("PROTB102ID <=", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idLike(String value) {
            addCriterion("PROTB102ID like", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotLike(String value) {
            addCriterion("PROTB102ID not like", value, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idIn(List<String> values) {
            addCriterion("PROTB102ID in", values, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotIn(List<String> values) {
            addCriterion("PROTB102ID not in", values, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idBetween(String value1, String value2) {
            addCriterion("PROTB102ID between", value1, value2, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102idNotBetween(String value1, String value2) {
            addCriterion("PROTB102ID not between", value1, value2, "protb102id");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01IsNull() {
            addCriterion("PROTB102CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01IsNotNull() {
            addCriterion("PROTB102CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01EqualTo(String value) {
            addCriterion("PROTB102CD01 =", value, "protb102cd01");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01NotEqualTo(String value) {
            addCriterion("PROTB102CD01 <>", value, "protb102cd01");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01GreaterThan(String value) {
            addCriterion("PROTB102CD01 >", value, "protb102cd01");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB102CD01 >=", value, "protb102cd01");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01LessThan(String value) {
            addCriterion("PROTB102CD01 <", value, "protb102cd01");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB102CD01 <=", value, "protb102cd01");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01Like(String value) {
            addCriterion("PROTB102CD01 like", value, "protb102cd01");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01NotLike(String value) {
            addCriterion("PROTB102CD01 not like", value, "protb102cd01");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01In(List<String> values) {
            addCriterion("PROTB102CD01 in", values, "protb102cd01");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01NotIn(List<String> values) {
            addCriterion("PROTB102CD01 not in", values, "protb102cd01");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01Between(String value1, String value2) {
            addCriterion("PROTB102CD01 between", value1, value2, "protb102cd01");
            return (Criteria) this;
        }

        public Criteria andProtb102cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB102CD01 not between", value1, value2, "protb102cd01");
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

        public Criteria andProtb102ca01IsNull() {
            addCriterion("PROTB102CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca01IsNotNull() {
            addCriterion("PROTB102CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca01EqualTo(Date value) {
            addCriterion("PROTB102CA01 =", value, "protb102ca01");
            return (Criteria) this;
        }

        public Criteria andProtb102ca01NotEqualTo(Date value) {
            addCriterion("PROTB102CA01 <>", value, "protb102ca01");
            return (Criteria) this;
        }

        public Criteria andProtb102ca01GreaterThan(Date value) {
            addCriterion("PROTB102CA01 >", value, "protb102ca01");
            return (Criteria) this;
        }

        public Criteria andProtb102ca01GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB102CA01 >=", value, "protb102ca01");
            return (Criteria) this;
        }

        public Criteria andProtb102ca01LessThan(Date value) {
            addCriterion("PROTB102CA01 <", value, "protb102ca01");
            return (Criteria) this;
        }

        public Criteria andProtb102ca01LessThanOrEqualTo(Date value) {
            addCriterion("PROTB102CA01 <=", value, "protb102ca01");
            return (Criteria) this;
        }

        public Criteria andProtb102ca01In(List<Date> values) {
            addCriterion("PROTB102CA01 in", values, "protb102ca01");
            return (Criteria) this;
        }

        public Criteria andProtb102ca01NotIn(List<Date> values) {
            addCriterion("PROTB102CA01 not in", values, "protb102ca01");
            return (Criteria) this;
        }

        public Criteria andProtb102ca01Between(Date value1, Date value2) {
            addCriterion("PROTB102CA01 between", value1, value2, "protb102ca01");
            return (Criteria) this;
        }

        public Criteria andProtb102ca01NotBetween(Date value1, Date value2) {
            addCriterion("PROTB102CA01 not between", value1, value2, "protb102ca01");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02IsNull() {
            addCriterion("PROTB102CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02IsNotNull() {
            addCriterion("PROTB102CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02EqualTo(Date value) {
            addCriterion("PROTB102CA02 =", value, "protb102ca02");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02NotEqualTo(Date value) {
            addCriterion("PROTB102CA02 <>", value, "protb102ca02");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02GreaterThan(Date value) {
            addCriterion("PROTB102CA02 >", value, "protb102ca02");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB102CA02 >=", value, "protb102ca02");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02LessThan(Date value) {
            addCriterion("PROTB102CA02 <", value, "protb102ca02");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB102CA02 <=", value, "protb102ca02");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02In(List<Date> values) {
            addCriterion("PROTB102CA02 in", values, "protb102ca02");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02NotIn(List<Date> values) {
            addCriterion("PROTB102CA02 not in", values, "protb102ca02");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02Between(Date value1, Date value2) {
            addCriterion("PROTB102CA02 between", value1, value2, "protb102ca02");
            return (Criteria) this;
        }

        public Criteria andProtb102ca02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB102CA02 not between", value1, value2, "protb102ca02");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03IsNull() {
            addCriterion("PROTB102CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03IsNotNull() {
            addCriterion("PROTB102CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03EqualTo(Date value) {
            addCriterion("PROTB102CA03 =", value, "protb102ca03");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03NotEqualTo(Date value) {
            addCriterion("PROTB102CA03 <>", value, "protb102ca03");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03GreaterThan(Date value) {
            addCriterion("PROTB102CA03 >", value, "protb102ca03");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB102CA03 >=", value, "protb102ca03");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03LessThan(Date value) {
            addCriterion("PROTB102CA03 <", value, "protb102ca03");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03LessThanOrEqualTo(Date value) {
            addCriterion("PROTB102CA03 <=", value, "protb102ca03");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03In(List<Date> values) {
            addCriterion("PROTB102CA03 in", values, "protb102ca03");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03NotIn(List<Date> values) {
            addCriterion("PROTB102CA03 not in", values, "protb102ca03");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03Between(Date value1, Date value2) {
            addCriterion("PROTB102CA03 between", value1, value2, "protb102ca03");
            return (Criteria) this;
        }

        public Criteria andProtb102ca03NotBetween(Date value1, Date value2) {
            addCriterion("PROTB102CA03 not between", value1, value2, "protb102ca03");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04IsNull() {
            addCriterion("PROTB102CA04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04IsNotNull() {
            addCriterion("PROTB102CA04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04EqualTo(String value) {
            addCriterion("PROTB102CA04 =", value, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04NotEqualTo(String value) {
            addCriterion("PROTB102CA04 <>", value, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04GreaterThan(String value) {
            addCriterion("PROTB102CA04 >", value, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB102CA04 >=", value, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04LessThan(String value) {
            addCriterion("PROTB102CA04 <", value, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04LessThanOrEqualTo(String value) {
            addCriterion("PROTB102CA04 <=", value, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04Like(String value) {
            addCriterion("PROTB102CA04 like", value, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04NotLike(String value) {
            addCriterion("PROTB102CA04 not like", value, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04In(List<String> values) {
            addCriterion("PROTB102CA04 in", values, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04NotIn(List<String> values) {
            addCriterion("PROTB102CA04 not in", values, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04Between(String value1, String value2) {
            addCriterion("PROTB102CA04 between", value1, value2, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca04NotBetween(String value1, String value2) {
            addCriterion("PROTB102CA04 not between", value1, value2, "protb102ca04");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05IsNull() {
            addCriterion("PROTB102CA05 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05IsNotNull() {
            addCriterion("PROTB102CA05 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05EqualTo(Date value) {
            addCriterion("PROTB102CA05 =", value, "protb102ca05");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05NotEqualTo(Date value) {
            addCriterion("PROTB102CA05 <>", value, "protb102ca05");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05GreaterThan(Date value) {
            addCriterion("PROTB102CA05 >", value, "protb102ca05");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB102CA05 >=", value, "protb102ca05");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05LessThan(Date value) {
            addCriterion("PROTB102CA05 <", value, "protb102ca05");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05LessThanOrEqualTo(Date value) {
            addCriterion("PROTB102CA05 <=", value, "protb102ca05");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05In(List<Date> values) {
            addCriterion("PROTB102CA05 in", values, "protb102ca05");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05NotIn(List<Date> values) {
            addCriterion("PROTB102CA05 not in", values, "protb102ca05");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05Between(Date value1, Date value2) {
            addCriterion("PROTB102CA05 between", value1, value2, "protb102ca05");
            return (Criteria) this;
        }

        public Criteria andProtb102ca05NotBetween(Date value1, Date value2) {
            addCriterion("PROTB102CA05 not between", value1, value2, "protb102ca05");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06IsNull() {
            addCriterion("PROTB102CA06 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06IsNotNull() {
            addCriterion("PROTB102CA06 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06EqualTo(Date value) {
            addCriterion("PROTB102CA06 =", value, "protb102ca06");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06NotEqualTo(Date value) {
            addCriterion("PROTB102CA06 <>", value, "protb102ca06");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06GreaterThan(Date value) {
            addCriterion("PROTB102CA06 >", value, "protb102ca06");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB102CA06 >=", value, "protb102ca06");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06LessThan(Date value) {
            addCriterion("PROTB102CA06 <", value, "protb102ca06");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06LessThanOrEqualTo(Date value) {
            addCriterion("PROTB102CA06 <=", value, "protb102ca06");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06In(List<Date> values) {
            addCriterion("PROTB102CA06 in", values, "protb102ca06");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06NotIn(List<Date> values) {
            addCriterion("PROTB102CA06 not in", values, "protb102ca06");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06Between(Date value1, Date value2) {
            addCriterion("PROTB102CA06 between", value1, value2, "protb102ca06");
            return (Criteria) this;
        }

        public Criteria andProtb102ca06NotBetween(Date value1, Date value2) {
            addCriterion("PROTB102CA06 not between", value1, value2, "protb102ca06");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00IsNull() {
            addCriterion("PROTB102CB00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00IsNotNull() {
            addCriterion("PROTB102CB00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00EqualTo(String value) {
            addCriterion("PROTB102CB00 =", value, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00NotEqualTo(String value) {
            addCriterion("PROTB102CB00 <>", value, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00GreaterThan(String value) {
            addCriterion("PROTB102CB00 >", value, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB102CB00 >=", value, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00LessThan(String value) {
            addCriterion("PROTB102CB00 <", value, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00LessThanOrEqualTo(String value) {
            addCriterion("PROTB102CB00 <=", value, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00Like(String value) {
            addCriterion("PROTB102CB00 like", value, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00NotLike(String value) {
            addCriterion("PROTB102CB00 not like", value, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00In(List<String> values) {
            addCriterion("PROTB102CB00 in", values, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00NotIn(List<String> values) {
            addCriterion("PROTB102CB00 not in", values, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00Between(String value1, String value2) {
            addCriterion("PROTB102CB00 between", value1, value2, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb00NotBetween(String value1, String value2) {
            addCriterion("PROTB102CB00 not between", value1, value2, "protb102cb00");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01IsNull() {
            addCriterion("PROTB102CB01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01IsNotNull() {
            addCriterion("PROTB102CB01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01EqualTo(String value) {
            addCriterion("PROTB102CB01 =", value, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01NotEqualTo(String value) {
            addCriterion("PROTB102CB01 <>", value, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01GreaterThan(String value) {
            addCriterion("PROTB102CB01 >", value, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB102CB01 >=", value, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01LessThan(String value) {
            addCriterion("PROTB102CB01 <", value, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01LessThanOrEqualTo(String value) {
            addCriterion("PROTB102CB01 <=", value, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01Like(String value) {
            addCriterion("PROTB102CB01 like", value, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01NotLike(String value) {
            addCriterion("PROTB102CB01 not like", value, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01In(List<String> values) {
            addCriterion("PROTB102CB01 in", values, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01NotIn(List<String> values) {
            addCriterion("PROTB102CB01 not in", values, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01Between(String value1, String value2) {
            addCriterion("PROTB102CB01 between", value1, value2, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cb01NotBetween(String value1, String value2) {
            addCriterion("PROTB102CB01 not between", value1, value2, "protb102cb01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00IsNull() {
            addCriterion("PROTB102CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00IsNotNull() {
            addCriterion("PROTB102CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00EqualTo(Date value) {
            addCriterion("PROTB102CC00 =", value, "protb102cc00");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00NotEqualTo(Date value) {
            addCriterion("PROTB102CC00 <>", value, "protb102cc00");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00GreaterThan(Date value) {
            addCriterion("PROTB102CC00 >", value, "protb102cc00");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB102CC00 >=", value, "protb102cc00");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00LessThan(Date value) {
            addCriterion("PROTB102CC00 <", value, "protb102cc00");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB102CC00 <=", value, "protb102cc00");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00In(List<Date> values) {
            addCriterion("PROTB102CC00 in", values, "protb102cc00");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00NotIn(List<Date> values) {
            addCriterion("PROTB102CC00 not in", values, "protb102cc00");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00Between(Date value1, Date value2) {
            addCriterion("PROTB102CC00 between", value1, value2, "protb102cc00");
            return (Criteria) this;
        }

        public Criteria andProtb102cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB102CC00 not between", value1, value2, "protb102cc00");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01IsNull() {
            addCriterion("PROTB102CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01IsNotNull() {
            addCriterion("PROTB102CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01EqualTo(String value) {
            addCriterion("PROTB102CC01 =", value, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01NotEqualTo(String value) {
            addCriterion("PROTB102CC01 <>", value, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01GreaterThan(String value) {
            addCriterion("PROTB102CC01 >", value, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB102CC01 >=", value, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01LessThan(String value) {
            addCriterion("PROTB102CC01 <", value, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB102CC01 <=", value, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01Like(String value) {
            addCriterion("PROTB102CC01 like", value, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01NotLike(String value) {
            addCriterion("PROTB102CC01 not like", value, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01In(List<String> values) {
            addCriterion("PROTB102CC01 in", values, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01NotIn(List<String> values) {
            addCriterion("PROTB102CC01 not in", values, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01Between(String value1, String value2) {
            addCriterion("PROTB102CC01 between", value1, value2, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB102CC01 not between", value1, value2, "protb102cc01");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02IsNull() {
            addCriterion("PROTB102CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02IsNotNull() {
            addCriterion("PROTB102CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02EqualTo(Date value) {
            addCriterion("PROTB102CC02 =", value, "protb102cc02");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02NotEqualTo(Date value) {
            addCriterion("PROTB102CC02 <>", value, "protb102cc02");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02GreaterThan(Date value) {
            addCriterion("PROTB102CC02 >", value, "protb102cc02");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB102CC02 >=", value, "protb102cc02");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02LessThan(Date value) {
            addCriterion("PROTB102CC02 <", value, "protb102cc02");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB102CC02 <=", value, "protb102cc02");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02In(List<Date> values) {
            addCriterion("PROTB102CC02 in", values, "protb102cc02");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02NotIn(List<Date> values) {
            addCriterion("PROTB102CC02 not in", values, "protb102cc02");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02Between(Date value1, Date value2) {
            addCriterion("PROTB102CC02 between", value1, value2, "protb102cc02");
            return (Criteria) this;
        }

        public Criteria andProtb102cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB102CC02 not between", value1, value2, "protb102cc02");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03IsNull() {
            addCriterion("PROTB102CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03IsNotNull() {
            addCriterion("PROTB102CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03EqualTo(String value) {
            addCriterion("PROTB102CC03 =", value, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03NotEqualTo(String value) {
            addCriterion("PROTB102CC03 <>", value, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03GreaterThan(String value) {
            addCriterion("PROTB102CC03 >", value, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB102CC03 >=", value, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03LessThan(String value) {
            addCriterion("PROTB102CC03 <", value, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB102CC03 <=", value, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03Like(String value) {
            addCriterion("PROTB102CC03 like", value, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03NotLike(String value) {
            addCriterion("PROTB102CC03 not like", value, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03In(List<String> values) {
            addCriterion("PROTB102CC03 in", values, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03NotIn(List<String> values) {
            addCriterion("PROTB102CC03 not in", values, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03Between(String value1, String value2) {
            addCriterion("PROTB102CC03 between", value1, value2, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB102CC03 not between", value1, value2, "protb102cc03");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00IsNull() {
            addCriterion("PROTB102CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00IsNotNull() {
            addCriterion("PROTB102CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00EqualTo(String value) {
            addCriterion("PROTB102CD00 =", value, "protb102cd00");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00NotEqualTo(String value) {
            addCriterion("PROTB102CD00 <>", value, "protb102cd00");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00GreaterThan(String value) {
            addCriterion("PROTB102CD00 >", value, "protb102cd00");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB102CD00 >=", value, "protb102cd00");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00LessThan(String value) {
            addCriterion("PROTB102CD00 <", value, "protb102cd00");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB102CD00 <=", value, "protb102cd00");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00Like(String value) {
            addCriterion("PROTB102CD00 like", value, "protb102cd00");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00NotLike(String value) {
            addCriterion("PROTB102CD00 not like", value, "protb102cd00");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00In(List<String> values) {
            addCriterion("PROTB102CD00 in", values, "protb102cd00");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00NotIn(List<String> values) {
            addCriterion("PROTB102CD00 not in", values, "protb102cd00");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00Between(String value1, String value2) {
            addCriterion("PROTB102CD00 between", value1, value2, "protb102cd00");
            return (Criteria) this;
        }

        public Criteria andProtb102cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB102CD00 not between", value1, value2, "protb102cd00");
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