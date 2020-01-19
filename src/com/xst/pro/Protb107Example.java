package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb107Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb107Example() {
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

        public Criteria andProtb107idIsNull() {
            addCriterion("PROTB107ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb107idIsNotNull() {
            addCriterion("PROTB107ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107idEqualTo(String value) {
            addCriterion("PROTB107ID =", value, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107idNotEqualTo(String value) {
            addCriterion("PROTB107ID <>", value, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107idGreaterThan(String value) {
            addCriterion("PROTB107ID >", value, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107ID >=", value, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107idLessThan(String value) {
            addCriterion("PROTB107ID <", value, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107idLessThanOrEqualTo(String value) {
            addCriterion("PROTB107ID <=", value, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107idLike(String value) {
            addCriterion("PROTB107ID like", value, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107idNotLike(String value) {
            addCriterion("PROTB107ID not like", value, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107idIn(List<String> values) {
            addCriterion("PROTB107ID in", values, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107idNotIn(List<String> values) {
            addCriterion("PROTB107ID not in", values, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107idBetween(String value1, String value2) {
            addCriterion("PROTB107ID between", value1, value2, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107idNotBetween(String value1, String value2) {
            addCriterion("PROTB107ID not between", value1, value2, "protb107id");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01IsNull() {
            addCriterion("PROTB107CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01IsNotNull() {
            addCriterion("PROTB107CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01EqualTo(String value) {
            addCriterion("PROTB107CD01 =", value, "protb107cd01");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01NotEqualTo(String value) {
            addCriterion("PROTB107CD01 <>", value, "protb107cd01");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01GreaterThan(String value) {
            addCriterion("PROTB107CD01 >", value, "protb107cd01");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107CD01 >=", value, "protb107cd01");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01LessThan(String value) {
            addCriterion("PROTB107CD01 <", value, "protb107cd01");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB107CD01 <=", value, "protb107cd01");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01Like(String value) {
            addCriterion("PROTB107CD01 like", value, "protb107cd01");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01NotLike(String value) {
            addCriterion("PROTB107CD01 not like", value, "protb107cd01");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01In(List<String> values) {
            addCriterion("PROTB107CD01 in", values, "protb107cd01");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01NotIn(List<String> values) {
            addCriterion("PROTB107CD01 not in", values, "protb107cd01");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01Between(String value1, String value2) {
            addCriterion("PROTB107CD01 between", value1, value2, "protb107cd01");
            return (Criteria) this;
        }

        public Criteria andProtb107cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB107CD01 not between", value1, value2, "protb107cd01");
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

        public Criteria andProtb107ca00IsNull() {
            addCriterion("PROTB107CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00IsNotNull() {
            addCriterion("PROTB107CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00EqualTo(String value) {
            addCriterion("PROTB107CA00 =", value, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00NotEqualTo(String value) {
            addCriterion("PROTB107CA00 <>", value, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00GreaterThan(String value) {
            addCriterion("PROTB107CA00 >", value, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107CA00 >=", value, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00LessThan(String value) {
            addCriterion("PROTB107CA00 <", value, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00LessThanOrEqualTo(String value) {
            addCriterion("PROTB107CA00 <=", value, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00Like(String value) {
            addCriterion("PROTB107CA00 like", value, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00NotLike(String value) {
            addCriterion("PROTB107CA00 not like", value, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00In(List<String> values) {
            addCriterion("PROTB107CA00 in", values, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00NotIn(List<String> values) {
            addCriterion("PROTB107CA00 not in", values, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00Between(String value1, String value2) {
            addCriterion("PROTB107CA00 between", value1, value2, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca00NotBetween(String value1, String value2) {
            addCriterion("PROTB107CA00 not between", value1, value2, "protb107ca00");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01IsNull() {
            addCriterion("PROTB107CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01IsNotNull() {
            addCriterion("PROTB107CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01EqualTo(String value) {
            addCriterion("PROTB107CA01 =", value, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01NotEqualTo(String value) {
            addCriterion("PROTB107CA01 <>", value, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01GreaterThan(String value) {
            addCriterion("PROTB107CA01 >", value, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107CA01 >=", value, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01LessThan(String value) {
            addCriterion("PROTB107CA01 <", value, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01LessThanOrEqualTo(String value) {
            addCriterion("PROTB107CA01 <=", value, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01Like(String value) {
            addCriterion("PROTB107CA01 like", value, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01NotLike(String value) {
            addCriterion("PROTB107CA01 not like", value, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01In(List<String> values) {
            addCriterion("PROTB107CA01 in", values, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01NotIn(List<String> values) {
            addCriterion("PROTB107CA01 not in", values, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01Between(String value1, String value2) {
            addCriterion("PROTB107CA01 between", value1, value2, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca01NotBetween(String value1, String value2) {
            addCriterion("PROTB107CA01 not between", value1, value2, "protb107ca01");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02IsNull() {
            addCriterion("PROTB107CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02IsNotNull() {
            addCriterion("PROTB107CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02EqualTo(String value) {
            addCriterion("PROTB107CA02 =", value, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02NotEqualTo(String value) {
            addCriterion("PROTB107CA02 <>", value, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02GreaterThan(String value) {
            addCriterion("PROTB107CA02 >", value, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107CA02 >=", value, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02LessThan(String value) {
            addCriterion("PROTB107CA02 <", value, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02LessThanOrEqualTo(String value) {
            addCriterion("PROTB107CA02 <=", value, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02Like(String value) {
            addCriterion("PROTB107CA02 like", value, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02NotLike(String value) {
            addCriterion("PROTB107CA02 not like", value, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02In(List<String> values) {
            addCriterion("PROTB107CA02 in", values, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02NotIn(List<String> values) {
            addCriterion("PROTB107CA02 not in", values, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02Between(String value1, String value2) {
            addCriterion("PROTB107CA02 between", value1, value2, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca02NotBetween(String value1, String value2) {
            addCriterion("PROTB107CA02 not between", value1, value2, "protb107ca02");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03IsNull() {
            addCriterion("PROTB107CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03IsNotNull() {
            addCriterion("PROTB107CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03EqualTo(Double value) {
            addCriterion("PROTB107CA03 =", value, "protb107ca03");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03NotEqualTo(Double value) {
            addCriterion("PROTB107CA03 <>", value, "protb107ca03");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03GreaterThan(Double value) {
            addCriterion("PROTB107CA03 >", value, "protb107ca03");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB107CA03 >=", value, "protb107ca03");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03LessThan(Double value) {
            addCriterion("PROTB107CA03 <", value, "protb107ca03");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03LessThanOrEqualTo(Double value) {
            addCriterion("PROTB107CA03 <=", value, "protb107ca03");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03In(List<Double> values) {
            addCriterion("PROTB107CA03 in", values, "protb107ca03");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03NotIn(List<Double> values) {
            addCriterion("PROTB107CA03 not in", values, "protb107ca03");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03Between(Double value1, Double value2) {
            addCriterion("PROTB107CA03 between", value1, value2, "protb107ca03");
            return (Criteria) this;
        }

        public Criteria andProtb107ca03NotBetween(Double value1, Double value2) {
            addCriterion("PROTB107CA03 not between", value1, value2, "protb107ca03");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04IsNull() {
            addCriterion("PROTB107CA04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04IsNotNull() {
            addCriterion("PROTB107CA04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04EqualTo(String value) {
            addCriterion("PROTB107CA04 =", value, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04NotEqualTo(String value) {
            addCriterion("PROTB107CA04 <>", value, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04GreaterThan(String value) {
            addCriterion("PROTB107CA04 >", value, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107CA04 >=", value, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04LessThan(String value) {
            addCriterion("PROTB107CA04 <", value, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04LessThanOrEqualTo(String value) {
            addCriterion("PROTB107CA04 <=", value, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04Like(String value) {
            addCriterion("PROTB107CA04 like", value, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04NotLike(String value) {
            addCriterion("PROTB107CA04 not like", value, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04In(List<String> values) {
            addCriterion("PROTB107CA04 in", values, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04NotIn(List<String> values) {
            addCriterion("PROTB107CA04 not in", values, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04Between(String value1, String value2) {
            addCriterion("PROTB107CA04 between", value1, value2, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca04NotBetween(String value1, String value2) {
            addCriterion("PROTB107CA04 not between", value1, value2, "protb107ca04");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05IsNull() {
            addCriterion("PROTB107CA05 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05IsNotNull() {
            addCriterion("PROTB107CA05 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05EqualTo(String value) {
            addCriterion("PROTB107CA05 =", value, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05NotEqualTo(String value) {
            addCriterion("PROTB107CA05 <>", value, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05GreaterThan(String value) {
            addCriterion("PROTB107CA05 >", value, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107CA05 >=", value, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05LessThan(String value) {
            addCriterion("PROTB107CA05 <", value, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05LessThanOrEqualTo(String value) {
            addCriterion("PROTB107CA05 <=", value, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05Like(String value) {
            addCriterion("PROTB107CA05 like", value, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05NotLike(String value) {
            addCriterion("PROTB107CA05 not like", value, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05In(List<String> values) {
            addCriterion("PROTB107CA05 in", values, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05NotIn(List<String> values) {
            addCriterion("PROTB107CA05 not in", values, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05Between(String value1, String value2) {
            addCriterion("PROTB107CA05 between", value1, value2, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca05NotBetween(String value1, String value2) {
            addCriterion("PROTB107CA05 not between", value1, value2, "protb107ca05");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06IsNull() {
            addCriterion("PROTB107CA06 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06IsNotNull() {
            addCriterion("PROTB107CA06 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06EqualTo(String value) {
            addCriterion("PROTB107CA06 =", value, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06NotEqualTo(String value) {
            addCriterion("PROTB107CA06 <>", value, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06GreaterThan(String value) {
            addCriterion("PROTB107CA06 >", value, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107CA06 >=", value, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06LessThan(String value) {
            addCriterion("PROTB107CA06 <", value, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06LessThanOrEqualTo(String value) {
            addCriterion("PROTB107CA06 <=", value, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06Like(String value) {
            addCriterion("PROTB107CA06 like", value, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06NotLike(String value) {
            addCriterion("PROTB107CA06 not like", value, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06In(List<String> values) {
            addCriterion("PROTB107CA06 in", values, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06NotIn(List<String> values) {
            addCriterion("PROTB107CA06 not in", values, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06Between(String value1, String value2) {
            addCriterion("PROTB107CA06 between", value1, value2, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca06NotBetween(String value1, String value2) {
            addCriterion("PROTB107CA06 not between", value1, value2, "protb107ca06");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07IsNull() {
            addCriterion("PROTB107CA07 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07IsNotNull() {
            addCriterion("PROTB107CA07 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07EqualTo(String value) {
            addCriterion("PROTB107CA07 =", value, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07NotEqualTo(String value) {
            addCriterion("PROTB107CA07 <>", value, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07GreaterThan(String value) {
            addCriterion("PROTB107CA07 >", value, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107CA07 >=", value, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07LessThan(String value) {
            addCriterion("PROTB107CA07 <", value, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07LessThanOrEqualTo(String value) {
            addCriterion("PROTB107CA07 <=", value, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07Like(String value) {
            addCriterion("PROTB107CA07 like", value, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07NotLike(String value) {
            addCriterion("PROTB107CA07 not like", value, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07In(List<String> values) {
            addCriterion("PROTB107CA07 in", values, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07NotIn(List<String> values) {
            addCriterion("PROTB107CA07 not in", values, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07Between(String value1, String value2) {
            addCriterion("PROTB107CA07 between", value1, value2, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107ca07NotBetween(String value1, String value2) {
            addCriterion("PROTB107CA07 not between", value1, value2, "protb107ca07");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00IsNull() {
            addCriterion("PROTB107CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00IsNotNull() {
            addCriterion("PROTB107CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00EqualTo(Date value) {
            addCriterion("PROTB107CC00 =", value, "protb107cc00");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00NotEqualTo(Date value) {
            addCriterion("PROTB107CC00 <>", value, "protb107cc00");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00GreaterThan(Date value) {
            addCriterion("PROTB107CC00 >", value, "protb107cc00");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB107CC00 >=", value, "protb107cc00");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00LessThan(Date value) {
            addCriterion("PROTB107CC00 <", value, "protb107cc00");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB107CC00 <=", value, "protb107cc00");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00In(List<Date> values) {
            addCriterion("PROTB107CC00 in", values, "protb107cc00");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00NotIn(List<Date> values) {
            addCriterion("PROTB107CC00 not in", values, "protb107cc00");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00Between(Date value1, Date value2) {
            addCriterion("PROTB107CC00 between", value1, value2, "protb107cc00");
            return (Criteria) this;
        }

        public Criteria andProtb107cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB107CC00 not between", value1, value2, "protb107cc00");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01IsNull() {
            addCriterion("PROTB107CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01IsNotNull() {
            addCriterion("PROTB107CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01EqualTo(String value) {
            addCriterion("PROTB107CC01 =", value, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01NotEqualTo(String value) {
            addCriterion("PROTB107CC01 <>", value, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01GreaterThan(String value) {
            addCriterion("PROTB107CC01 >", value, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107CC01 >=", value, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01LessThan(String value) {
            addCriterion("PROTB107CC01 <", value, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB107CC01 <=", value, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01Like(String value) {
            addCriterion("PROTB107CC01 like", value, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01NotLike(String value) {
            addCriterion("PROTB107CC01 not like", value, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01In(List<String> values) {
            addCriterion("PROTB107CC01 in", values, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01NotIn(List<String> values) {
            addCriterion("PROTB107CC01 not in", values, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01Between(String value1, String value2) {
            addCriterion("PROTB107CC01 between", value1, value2, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB107CC01 not between", value1, value2, "protb107cc01");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02IsNull() {
            addCriterion("PROTB107CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02IsNotNull() {
            addCriterion("PROTB107CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02EqualTo(Date value) {
            addCriterion("PROTB107CC02 =", value, "protb107cc02");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02NotEqualTo(Date value) {
            addCriterion("PROTB107CC02 <>", value, "protb107cc02");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02GreaterThan(Date value) {
            addCriterion("PROTB107CC02 >", value, "protb107cc02");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB107CC02 >=", value, "protb107cc02");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02LessThan(Date value) {
            addCriterion("PROTB107CC02 <", value, "protb107cc02");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB107CC02 <=", value, "protb107cc02");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02In(List<Date> values) {
            addCriterion("PROTB107CC02 in", values, "protb107cc02");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02NotIn(List<Date> values) {
            addCriterion("PROTB107CC02 not in", values, "protb107cc02");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02Between(Date value1, Date value2) {
            addCriterion("PROTB107CC02 between", value1, value2, "protb107cc02");
            return (Criteria) this;
        }

        public Criteria andProtb107cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB107CC02 not between", value1, value2, "protb107cc02");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03IsNull() {
            addCriterion("PROTB107CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03IsNotNull() {
            addCriterion("PROTB107CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03EqualTo(String value) {
            addCriterion("PROTB107CC03 =", value, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03NotEqualTo(String value) {
            addCriterion("PROTB107CC03 <>", value, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03GreaterThan(String value) {
            addCriterion("PROTB107CC03 >", value, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107CC03 >=", value, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03LessThan(String value) {
            addCriterion("PROTB107CC03 <", value, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB107CC03 <=", value, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03Like(String value) {
            addCriterion("PROTB107CC03 like", value, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03NotLike(String value) {
            addCriterion("PROTB107CC03 not like", value, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03In(List<String> values) {
            addCriterion("PROTB107CC03 in", values, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03NotIn(List<String> values) {
            addCriterion("PROTB107CC03 not in", values, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03Between(String value1, String value2) {
            addCriterion("PROTB107CC03 between", value1, value2, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB107CC03 not between", value1, value2, "protb107cc03");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00IsNull() {
            addCriterion("PROTB107CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00IsNotNull() {
            addCriterion("PROTB107CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00EqualTo(String value) {
            addCriterion("PROTB107CD00 =", value, "protb107cd00");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00NotEqualTo(String value) {
            addCriterion("PROTB107CD00 <>", value, "protb107cd00");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00GreaterThan(String value) {
            addCriterion("PROTB107CD00 >", value, "protb107cd00");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB107CD00 >=", value, "protb107cd00");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00LessThan(String value) {
            addCriterion("PROTB107CD00 <", value, "protb107cd00");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB107CD00 <=", value, "protb107cd00");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00Like(String value) {
            addCriterion("PROTB107CD00 like", value, "protb107cd00");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00NotLike(String value) {
            addCriterion("PROTB107CD00 not like", value, "protb107cd00");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00In(List<String> values) {
            addCriterion("PROTB107CD00 in", values, "protb107cd00");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00NotIn(List<String> values) {
            addCriterion("PROTB107CD00 not in", values, "protb107cd00");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00Between(String value1, String value2) {
            addCriterion("PROTB107CD00 between", value1, value2, "protb107cd00");
            return (Criteria) this;
        }

        public Criteria andProtb107cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB107CD00 not between", value1, value2, "protb107cd00");
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