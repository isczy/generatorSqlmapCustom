package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb101Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb101Example() {
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

        public Criteria andProtb101idIsNull() {
            addCriterion("PROTB101ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb101idIsNotNull() {
            addCriterion("PROTB101ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb101idEqualTo(String value) {
            addCriterion("PROTB101ID =", value, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101idNotEqualTo(String value) {
            addCriterion("PROTB101ID <>", value, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101idGreaterThan(String value) {
            addCriterion("PROTB101ID >", value, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB101ID >=", value, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101idLessThan(String value) {
            addCriterion("PROTB101ID <", value, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101idLessThanOrEqualTo(String value) {
            addCriterion("PROTB101ID <=", value, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101idLike(String value) {
            addCriterion("PROTB101ID like", value, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101idNotLike(String value) {
            addCriterion("PROTB101ID not like", value, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101idIn(List<String> values) {
            addCriterion("PROTB101ID in", values, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101idNotIn(List<String> values) {
            addCriterion("PROTB101ID not in", values, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101idBetween(String value1, String value2) {
            addCriterion("PROTB101ID between", value1, value2, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101idNotBetween(String value1, String value2) {
            addCriterion("PROTB101ID not between", value1, value2, "protb101id");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01IsNull() {
            addCriterion("PROTB101CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01IsNotNull() {
            addCriterion("PROTB101CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01EqualTo(String value) {
            addCriterion("PROTB101CD01 =", value, "protb101cd01");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01NotEqualTo(String value) {
            addCriterion("PROTB101CD01 <>", value, "protb101cd01");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01GreaterThan(String value) {
            addCriterion("PROTB101CD01 >", value, "protb101cd01");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB101CD01 >=", value, "protb101cd01");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01LessThan(String value) {
            addCriterion("PROTB101CD01 <", value, "protb101cd01");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB101CD01 <=", value, "protb101cd01");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01Like(String value) {
            addCriterion("PROTB101CD01 like", value, "protb101cd01");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01NotLike(String value) {
            addCriterion("PROTB101CD01 not like", value, "protb101cd01");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01In(List<String> values) {
            addCriterion("PROTB101CD01 in", values, "protb101cd01");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01NotIn(List<String> values) {
            addCriterion("PROTB101CD01 not in", values, "protb101cd01");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01Between(String value1, String value2) {
            addCriterion("PROTB101CD01 between", value1, value2, "protb101cd01");
            return (Criteria) this;
        }

        public Criteria andProtb101cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB101CD01 not between", value1, value2, "protb101cd01");
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

        public Criteria andSettb14idIsNull() {
            addCriterion("SETTB14ID is null");
            return (Criteria) this;
        }

        public Criteria andSettb14idIsNotNull() {
            addCriterion("SETTB14ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettb14idEqualTo(String value) {
            addCriterion("SETTB14ID =", value, "settb14id");
            return (Criteria) this;
        }

        public Criteria andSettb14idNotEqualTo(String value) {
            addCriterion("SETTB14ID <>", value, "settb14id");
            return (Criteria) this;
        }

        public Criteria andSettb14idGreaterThan(String value) {
            addCriterion("SETTB14ID >", value, "settb14id");
            return (Criteria) this;
        }

        public Criteria andSettb14idGreaterThanOrEqualTo(String value) {
            addCriterion("SETTB14ID >=", value, "settb14id");
            return (Criteria) this;
        }

        public Criteria andSettb14idLessThan(String value) {
            addCriterion("SETTB14ID <", value, "settb14id");
            return (Criteria) this;
        }

        public Criteria andSettb14idLessThanOrEqualTo(String value) {
            addCriterion("SETTB14ID <=", value, "settb14id");
            return (Criteria) this;
        }

        public Criteria andSettb14idLike(String value) {
            addCriterion("SETTB14ID like", value, "settb14id");
            return (Criteria) this;
        }

        public Criteria andSettb14idNotLike(String value) {
            addCriterion("SETTB14ID not like", value, "settb14id");
            return (Criteria) this;
        }

        public Criteria andSettb14idIn(List<String> values) {
            addCriterion("SETTB14ID in", values, "settb14id");
            return (Criteria) this;
        }

        public Criteria andSettb14idNotIn(List<String> values) {
            addCriterion("SETTB14ID not in", values, "settb14id");
            return (Criteria) this;
        }

        public Criteria andSettb14idBetween(String value1, String value2) {
            addCriterion("SETTB14ID between", value1, value2, "settb14id");
            return (Criteria) this;
        }

        public Criteria andSettb14idNotBetween(String value1, String value2) {
            addCriterion("SETTB14ID not between", value1, value2, "settb14id");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00IsNull() {
            addCriterion("PROTB101CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00IsNotNull() {
            addCriterion("PROTB101CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00EqualTo(String value) {
            addCriterion("PROTB101CA00 =", value, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00NotEqualTo(String value) {
            addCriterion("PROTB101CA00 <>", value, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00GreaterThan(String value) {
            addCriterion("PROTB101CA00 >", value, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB101CA00 >=", value, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00LessThan(String value) {
            addCriterion("PROTB101CA00 <", value, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00LessThanOrEqualTo(String value) {
            addCriterion("PROTB101CA00 <=", value, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00Like(String value) {
            addCriterion("PROTB101CA00 like", value, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00NotLike(String value) {
            addCriterion("PROTB101CA00 not like", value, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00In(List<String> values) {
            addCriterion("PROTB101CA00 in", values, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00NotIn(List<String> values) {
            addCriterion("PROTB101CA00 not in", values, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00Between(String value1, String value2) {
            addCriterion("PROTB101CA00 between", value1, value2, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca00NotBetween(String value1, String value2) {
            addCriterion("PROTB101CA00 not between", value1, value2, "protb101ca00");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01IsNull() {
            addCriterion("PROTB101CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01IsNotNull() {
            addCriterion("PROTB101CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01EqualTo(String value) {
            addCriterion("PROTB101CA01 =", value, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01NotEqualTo(String value) {
            addCriterion("PROTB101CA01 <>", value, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01GreaterThan(String value) {
            addCriterion("PROTB101CA01 >", value, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB101CA01 >=", value, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01LessThan(String value) {
            addCriterion("PROTB101CA01 <", value, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01LessThanOrEqualTo(String value) {
            addCriterion("PROTB101CA01 <=", value, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01Like(String value) {
            addCriterion("PROTB101CA01 like", value, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01NotLike(String value) {
            addCriterion("PROTB101CA01 not like", value, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01In(List<String> values) {
            addCriterion("PROTB101CA01 in", values, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01NotIn(List<String> values) {
            addCriterion("PROTB101CA01 not in", values, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01Between(String value1, String value2) {
            addCriterion("PROTB101CA01 between", value1, value2, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca01NotBetween(String value1, String value2) {
            addCriterion("PROTB101CA01 not between", value1, value2, "protb101ca01");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02IsNull() {
            addCriterion("PROTB101CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02IsNotNull() {
            addCriterion("PROTB101CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02EqualTo(String value) {
            addCriterion("PROTB101CA02 =", value, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02NotEqualTo(String value) {
            addCriterion("PROTB101CA02 <>", value, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02GreaterThan(String value) {
            addCriterion("PROTB101CA02 >", value, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB101CA02 >=", value, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02LessThan(String value) {
            addCriterion("PROTB101CA02 <", value, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02LessThanOrEqualTo(String value) {
            addCriterion("PROTB101CA02 <=", value, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02Like(String value) {
            addCriterion("PROTB101CA02 like", value, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02NotLike(String value) {
            addCriterion("PROTB101CA02 not like", value, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02In(List<String> values) {
            addCriterion("PROTB101CA02 in", values, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02NotIn(List<String> values) {
            addCriterion("PROTB101CA02 not in", values, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02Between(String value1, String value2) {
            addCriterion("PROTB101CA02 between", value1, value2, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101ca02NotBetween(String value1, String value2) {
            addCriterion("PROTB101CA02 not between", value1, value2, "protb101ca02");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00IsNull() {
            addCriterion("PROTB101CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00IsNotNull() {
            addCriterion("PROTB101CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00EqualTo(Date value) {
            addCriterion("PROTB101CC00 =", value, "protb101cc00");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00NotEqualTo(Date value) {
            addCriterion("PROTB101CC00 <>", value, "protb101cc00");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00GreaterThan(Date value) {
            addCriterion("PROTB101CC00 >", value, "protb101cc00");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB101CC00 >=", value, "protb101cc00");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00LessThan(Date value) {
            addCriterion("PROTB101CC00 <", value, "protb101cc00");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB101CC00 <=", value, "protb101cc00");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00In(List<Date> values) {
            addCriterion("PROTB101CC00 in", values, "protb101cc00");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00NotIn(List<Date> values) {
            addCriterion("PROTB101CC00 not in", values, "protb101cc00");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00Between(Date value1, Date value2) {
            addCriterion("PROTB101CC00 between", value1, value2, "protb101cc00");
            return (Criteria) this;
        }

        public Criteria andProtb101cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB101CC00 not between", value1, value2, "protb101cc00");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01IsNull() {
            addCriterion("PROTB101CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01IsNotNull() {
            addCriterion("PROTB101CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01EqualTo(String value) {
            addCriterion("PROTB101CC01 =", value, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01NotEqualTo(String value) {
            addCriterion("PROTB101CC01 <>", value, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01GreaterThan(String value) {
            addCriterion("PROTB101CC01 >", value, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB101CC01 >=", value, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01LessThan(String value) {
            addCriterion("PROTB101CC01 <", value, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB101CC01 <=", value, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01Like(String value) {
            addCriterion("PROTB101CC01 like", value, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01NotLike(String value) {
            addCriterion("PROTB101CC01 not like", value, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01In(List<String> values) {
            addCriterion("PROTB101CC01 in", values, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01NotIn(List<String> values) {
            addCriterion("PROTB101CC01 not in", values, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01Between(String value1, String value2) {
            addCriterion("PROTB101CC01 between", value1, value2, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB101CC01 not between", value1, value2, "protb101cc01");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02IsNull() {
            addCriterion("PROTB101CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02IsNotNull() {
            addCriterion("PROTB101CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02EqualTo(Date value) {
            addCriterion("PROTB101CC02 =", value, "protb101cc02");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02NotEqualTo(Date value) {
            addCriterion("PROTB101CC02 <>", value, "protb101cc02");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02GreaterThan(Date value) {
            addCriterion("PROTB101CC02 >", value, "protb101cc02");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB101CC02 >=", value, "protb101cc02");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02LessThan(Date value) {
            addCriterion("PROTB101CC02 <", value, "protb101cc02");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB101CC02 <=", value, "protb101cc02");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02In(List<Date> values) {
            addCriterion("PROTB101CC02 in", values, "protb101cc02");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02NotIn(List<Date> values) {
            addCriterion("PROTB101CC02 not in", values, "protb101cc02");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02Between(Date value1, Date value2) {
            addCriterion("PROTB101CC02 between", value1, value2, "protb101cc02");
            return (Criteria) this;
        }

        public Criteria andProtb101cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB101CC02 not between", value1, value2, "protb101cc02");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03IsNull() {
            addCriterion("PROTB101CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03IsNotNull() {
            addCriterion("PROTB101CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03EqualTo(String value) {
            addCriterion("PROTB101CC03 =", value, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03NotEqualTo(String value) {
            addCriterion("PROTB101CC03 <>", value, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03GreaterThan(String value) {
            addCriterion("PROTB101CC03 >", value, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB101CC03 >=", value, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03LessThan(String value) {
            addCriterion("PROTB101CC03 <", value, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB101CC03 <=", value, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03Like(String value) {
            addCriterion("PROTB101CC03 like", value, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03NotLike(String value) {
            addCriterion("PROTB101CC03 not like", value, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03In(List<String> values) {
            addCriterion("PROTB101CC03 in", values, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03NotIn(List<String> values) {
            addCriterion("PROTB101CC03 not in", values, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03Between(String value1, String value2) {
            addCriterion("PROTB101CC03 between", value1, value2, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB101CC03 not between", value1, value2, "protb101cc03");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00IsNull() {
            addCriterion("PROTB101CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00IsNotNull() {
            addCriterion("PROTB101CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00EqualTo(String value) {
            addCriterion("PROTB101CD00 =", value, "protb101cd00");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00NotEqualTo(String value) {
            addCriterion("PROTB101CD00 <>", value, "protb101cd00");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00GreaterThan(String value) {
            addCriterion("PROTB101CD00 >", value, "protb101cd00");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB101CD00 >=", value, "protb101cd00");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00LessThan(String value) {
            addCriterion("PROTB101CD00 <", value, "protb101cd00");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB101CD00 <=", value, "protb101cd00");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00Like(String value) {
            addCriterion("PROTB101CD00 like", value, "protb101cd00");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00NotLike(String value) {
            addCriterion("PROTB101CD00 not like", value, "protb101cd00");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00In(List<String> values) {
            addCriterion("PROTB101CD00 in", values, "protb101cd00");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00NotIn(List<String> values) {
            addCriterion("PROTB101CD00 not in", values, "protb101cd00");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00Between(String value1, String value2) {
            addCriterion("PROTB101CD00 between", value1, value2, "protb101cd00");
            return (Criteria) this;
        }

        public Criteria andProtb101cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB101CD00 not between", value1, value2, "protb101cd00");
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