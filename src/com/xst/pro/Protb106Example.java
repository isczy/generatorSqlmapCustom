package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb106Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb106Example() {
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

        public Criteria andProtb106idIsNull() {
            addCriterion("PROTB106ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb106idIsNotNull() {
            addCriterion("PROTB106ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb106idEqualTo(String value) {
            addCriterion("PROTB106ID =", value, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106idNotEqualTo(String value) {
            addCriterion("PROTB106ID <>", value, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106idGreaterThan(String value) {
            addCriterion("PROTB106ID >", value, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB106ID >=", value, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106idLessThan(String value) {
            addCriterion("PROTB106ID <", value, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106idLessThanOrEqualTo(String value) {
            addCriterion("PROTB106ID <=", value, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106idLike(String value) {
            addCriterion("PROTB106ID like", value, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106idNotLike(String value) {
            addCriterion("PROTB106ID not like", value, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106idIn(List<String> values) {
            addCriterion("PROTB106ID in", values, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106idNotIn(List<String> values) {
            addCriterion("PROTB106ID not in", values, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106idBetween(String value1, String value2) {
            addCriterion("PROTB106ID between", value1, value2, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106idNotBetween(String value1, String value2) {
            addCriterion("PROTB106ID not between", value1, value2, "protb106id");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01IsNull() {
            addCriterion("PROTB106CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01IsNotNull() {
            addCriterion("PROTB106CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01EqualTo(String value) {
            addCriterion("PROTB106CD01 =", value, "protb106cd01");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01NotEqualTo(String value) {
            addCriterion("PROTB106CD01 <>", value, "protb106cd01");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01GreaterThan(String value) {
            addCriterion("PROTB106CD01 >", value, "protb106cd01");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB106CD01 >=", value, "protb106cd01");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01LessThan(String value) {
            addCriterion("PROTB106CD01 <", value, "protb106cd01");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB106CD01 <=", value, "protb106cd01");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01Like(String value) {
            addCriterion("PROTB106CD01 like", value, "protb106cd01");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01NotLike(String value) {
            addCriterion("PROTB106CD01 not like", value, "protb106cd01");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01In(List<String> values) {
            addCriterion("PROTB106CD01 in", values, "protb106cd01");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01NotIn(List<String> values) {
            addCriterion("PROTB106CD01 not in", values, "protb106cd01");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01Between(String value1, String value2) {
            addCriterion("PROTB106CD01 between", value1, value2, "protb106cd01");
            return (Criteria) this;
        }

        public Criteria andProtb106cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB106CD01 not between", value1, value2, "protb106cd01");
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

        public Criteria andSettb11idIsNull() {
            addCriterion("SETTB11ID is null");
            return (Criteria) this;
        }

        public Criteria andSettb11idIsNotNull() {
            addCriterion("SETTB11ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettb11idEqualTo(String value) {
            addCriterion("SETTB11ID =", value, "settb11id");
            return (Criteria) this;
        }

        public Criteria andSettb11idNotEqualTo(String value) {
            addCriterion("SETTB11ID <>", value, "settb11id");
            return (Criteria) this;
        }

        public Criteria andSettb11idGreaterThan(String value) {
            addCriterion("SETTB11ID >", value, "settb11id");
            return (Criteria) this;
        }

        public Criteria andSettb11idGreaterThanOrEqualTo(String value) {
            addCriterion("SETTB11ID >=", value, "settb11id");
            return (Criteria) this;
        }

        public Criteria andSettb11idLessThan(String value) {
            addCriterion("SETTB11ID <", value, "settb11id");
            return (Criteria) this;
        }

        public Criteria andSettb11idLessThanOrEqualTo(String value) {
            addCriterion("SETTB11ID <=", value, "settb11id");
            return (Criteria) this;
        }

        public Criteria andSettb11idLike(String value) {
            addCriterion("SETTB11ID like", value, "settb11id");
            return (Criteria) this;
        }

        public Criteria andSettb11idNotLike(String value) {
            addCriterion("SETTB11ID not like", value, "settb11id");
            return (Criteria) this;
        }

        public Criteria andSettb11idIn(List<String> values) {
            addCriterion("SETTB11ID in", values, "settb11id");
            return (Criteria) this;
        }

        public Criteria andSettb11idNotIn(List<String> values) {
            addCriterion("SETTB11ID not in", values, "settb11id");
            return (Criteria) this;
        }

        public Criteria andSettb11idBetween(String value1, String value2) {
            addCriterion("SETTB11ID between", value1, value2, "settb11id");
            return (Criteria) this;
        }

        public Criteria andSettb11idNotBetween(String value1, String value2) {
            addCriterion("SETTB11ID not between", value1, value2, "settb11id");
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

        public Criteria andProtb106ca00IsNull() {
            addCriterion("PROTB106CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb106ca00IsNotNull() {
            addCriterion("PROTB106CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb106ca00EqualTo(Double value) {
            addCriterion("PROTB106CA00 =", value, "protb106ca00");
            return (Criteria) this;
        }

        public Criteria andProtb106ca00NotEqualTo(Double value) {
            addCriterion("PROTB106CA00 <>", value, "protb106ca00");
            return (Criteria) this;
        }

        public Criteria andProtb106ca00GreaterThan(Double value) {
            addCriterion("PROTB106CA00 >", value, "protb106ca00");
            return (Criteria) this;
        }

        public Criteria andProtb106ca00GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB106CA00 >=", value, "protb106ca00");
            return (Criteria) this;
        }

        public Criteria andProtb106ca00LessThan(Double value) {
            addCriterion("PROTB106CA00 <", value, "protb106ca00");
            return (Criteria) this;
        }

        public Criteria andProtb106ca00LessThanOrEqualTo(Double value) {
            addCriterion("PROTB106CA00 <=", value, "protb106ca00");
            return (Criteria) this;
        }

        public Criteria andProtb106ca00In(List<Double> values) {
            addCriterion("PROTB106CA00 in", values, "protb106ca00");
            return (Criteria) this;
        }

        public Criteria andProtb106ca00NotIn(List<Double> values) {
            addCriterion("PROTB106CA00 not in", values, "protb106ca00");
            return (Criteria) this;
        }

        public Criteria andProtb106ca00Between(Double value1, Double value2) {
            addCriterion("PROTB106CA00 between", value1, value2, "protb106ca00");
            return (Criteria) this;
        }

        public Criteria andProtb106ca00NotBetween(Double value1, Double value2) {
            addCriterion("PROTB106CA00 not between", value1, value2, "protb106ca00");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00IsNull() {
            addCriterion("PROTB106CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00IsNotNull() {
            addCriterion("PROTB106CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00EqualTo(Date value) {
            addCriterion("PROTB106CC00 =", value, "protb106cc00");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00NotEqualTo(Date value) {
            addCriterion("PROTB106CC00 <>", value, "protb106cc00");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00GreaterThan(Date value) {
            addCriterion("PROTB106CC00 >", value, "protb106cc00");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB106CC00 >=", value, "protb106cc00");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00LessThan(Date value) {
            addCriterion("PROTB106CC00 <", value, "protb106cc00");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB106CC00 <=", value, "protb106cc00");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00In(List<Date> values) {
            addCriterion("PROTB106CC00 in", values, "protb106cc00");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00NotIn(List<Date> values) {
            addCriterion("PROTB106CC00 not in", values, "protb106cc00");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00Between(Date value1, Date value2) {
            addCriterion("PROTB106CC00 between", value1, value2, "protb106cc00");
            return (Criteria) this;
        }

        public Criteria andProtb106cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB106CC00 not between", value1, value2, "protb106cc00");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01IsNull() {
            addCriterion("PROTB106CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01IsNotNull() {
            addCriterion("PROTB106CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01EqualTo(String value) {
            addCriterion("PROTB106CC01 =", value, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01NotEqualTo(String value) {
            addCriterion("PROTB106CC01 <>", value, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01GreaterThan(String value) {
            addCriterion("PROTB106CC01 >", value, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB106CC01 >=", value, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01LessThan(String value) {
            addCriterion("PROTB106CC01 <", value, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB106CC01 <=", value, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01Like(String value) {
            addCriterion("PROTB106CC01 like", value, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01NotLike(String value) {
            addCriterion("PROTB106CC01 not like", value, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01In(List<String> values) {
            addCriterion("PROTB106CC01 in", values, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01NotIn(List<String> values) {
            addCriterion("PROTB106CC01 not in", values, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01Between(String value1, String value2) {
            addCriterion("PROTB106CC01 between", value1, value2, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB106CC01 not between", value1, value2, "protb106cc01");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02IsNull() {
            addCriterion("PROTB106CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02IsNotNull() {
            addCriterion("PROTB106CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02EqualTo(Date value) {
            addCriterion("PROTB106CC02 =", value, "protb106cc02");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02NotEqualTo(Date value) {
            addCriterion("PROTB106CC02 <>", value, "protb106cc02");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02GreaterThan(Date value) {
            addCriterion("PROTB106CC02 >", value, "protb106cc02");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB106CC02 >=", value, "protb106cc02");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02LessThan(Date value) {
            addCriterion("PROTB106CC02 <", value, "protb106cc02");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB106CC02 <=", value, "protb106cc02");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02In(List<Date> values) {
            addCriterion("PROTB106CC02 in", values, "protb106cc02");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02NotIn(List<Date> values) {
            addCriterion("PROTB106CC02 not in", values, "protb106cc02");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02Between(Date value1, Date value2) {
            addCriterion("PROTB106CC02 between", value1, value2, "protb106cc02");
            return (Criteria) this;
        }

        public Criteria andProtb106cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB106CC02 not between", value1, value2, "protb106cc02");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03IsNull() {
            addCriterion("PROTB106CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03IsNotNull() {
            addCriterion("PROTB106CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03EqualTo(String value) {
            addCriterion("PROTB106CC03 =", value, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03NotEqualTo(String value) {
            addCriterion("PROTB106CC03 <>", value, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03GreaterThan(String value) {
            addCriterion("PROTB106CC03 >", value, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB106CC03 >=", value, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03LessThan(String value) {
            addCriterion("PROTB106CC03 <", value, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB106CC03 <=", value, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03Like(String value) {
            addCriterion("PROTB106CC03 like", value, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03NotLike(String value) {
            addCriterion("PROTB106CC03 not like", value, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03In(List<String> values) {
            addCriterion("PROTB106CC03 in", values, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03NotIn(List<String> values) {
            addCriterion("PROTB106CC03 not in", values, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03Between(String value1, String value2) {
            addCriterion("PROTB106CC03 between", value1, value2, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB106CC03 not between", value1, value2, "protb106cc03");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00IsNull() {
            addCriterion("PROTB106CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00IsNotNull() {
            addCriterion("PROTB106CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00EqualTo(String value) {
            addCriterion("PROTB106CD00 =", value, "protb106cd00");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00NotEqualTo(String value) {
            addCriterion("PROTB106CD00 <>", value, "protb106cd00");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00GreaterThan(String value) {
            addCriterion("PROTB106CD00 >", value, "protb106cd00");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB106CD00 >=", value, "protb106cd00");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00LessThan(String value) {
            addCriterion("PROTB106CD00 <", value, "protb106cd00");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB106CD00 <=", value, "protb106cd00");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00Like(String value) {
            addCriterion("PROTB106CD00 like", value, "protb106cd00");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00NotLike(String value) {
            addCriterion("PROTB106CD00 not like", value, "protb106cd00");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00In(List<String> values) {
            addCriterion("PROTB106CD00 in", values, "protb106cd00");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00NotIn(List<String> values) {
            addCriterion("PROTB106CD00 not in", values, "protb106cd00");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00Between(String value1, String value2) {
            addCriterion("PROTB106CD00 between", value1, value2, "protb106cd00");
            return (Criteria) this;
        }

        public Criteria andProtb106cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB106CD00 not between", value1, value2, "protb106cd00");
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