package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb203Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb203Example() {
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

        public Criteria andProtb203idIsNull() {
            addCriterion("PROTB203ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb203idIsNotNull() {
            addCriterion("PROTB203ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203idEqualTo(String value) {
            addCriterion("PROTB203ID =", value, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203idNotEqualTo(String value) {
            addCriterion("PROTB203ID <>", value, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203idGreaterThan(String value) {
            addCriterion("PROTB203ID >", value, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB203ID >=", value, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203idLessThan(String value) {
            addCriterion("PROTB203ID <", value, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203idLessThanOrEqualTo(String value) {
            addCriterion("PROTB203ID <=", value, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203idLike(String value) {
            addCriterion("PROTB203ID like", value, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203idNotLike(String value) {
            addCriterion("PROTB203ID not like", value, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203idIn(List<String> values) {
            addCriterion("PROTB203ID in", values, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203idNotIn(List<String> values) {
            addCriterion("PROTB203ID not in", values, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203idBetween(String value1, String value2) {
            addCriterion("PROTB203ID between", value1, value2, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203idNotBetween(String value1, String value2) {
            addCriterion("PROTB203ID not between", value1, value2, "protb203id");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01IsNull() {
            addCriterion("PROTB203CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01IsNotNull() {
            addCriterion("PROTB203CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01EqualTo(String value) {
            addCriterion("PROTB203CD01 =", value, "protb203cd01");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01NotEqualTo(String value) {
            addCriterion("PROTB203CD01 <>", value, "protb203cd01");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01GreaterThan(String value) {
            addCriterion("PROTB203CD01 >", value, "protb203cd01");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB203CD01 >=", value, "protb203cd01");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01LessThan(String value) {
            addCriterion("PROTB203CD01 <", value, "protb203cd01");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB203CD01 <=", value, "protb203cd01");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01Like(String value) {
            addCriterion("PROTB203CD01 like", value, "protb203cd01");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01NotLike(String value) {
            addCriterion("PROTB203CD01 not like", value, "protb203cd01");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01In(List<String> values) {
            addCriterion("PROTB203CD01 in", values, "protb203cd01");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01NotIn(List<String> values) {
            addCriterion("PROTB203CD01 not in", values, "protb203cd01");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01Between(String value1, String value2) {
            addCriterion("PROTB203CD01 between", value1, value2, "protb203cd01");
            return (Criteria) this;
        }

        public Criteria andProtb203cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB203CD01 not between", value1, value2, "protb203cd01");
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

        public Criteria andProtb203ca00IsNull() {
            addCriterion("PROTB203CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00IsNotNull() {
            addCriterion("PROTB203CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00EqualTo(String value) {
            addCriterion("PROTB203CA00 =", value, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00NotEqualTo(String value) {
            addCriterion("PROTB203CA00 <>", value, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00GreaterThan(String value) {
            addCriterion("PROTB203CA00 >", value, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB203CA00 >=", value, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00LessThan(String value) {
            addCriterion("PROTB203CA00 <", value, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00LessThanOrEqualTo(String value) {
            addCriterion("PROTB203CA00 <=", value, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00Like(String value) {
            addCriterion("PROTB203CA00 like", value, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00NotLike(String value) {
            addCriterion("PROTB203CA00 not like", value, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00In(List<String> values) {
            addCriterion("PROTB203CA00 in", values, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00NotIn(List<String> values) {
            addCriterion("PROTB203CA00 not in", values, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00Between(String value1, String value2) {
            addCriterion("PROTB203CA00 between", value1, value2, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca00NotBetween(String value1, String value2) {
            addCriterion("PROTB203CA00 not between", value1, value2, "protb203ca00");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01IsNull() {
            addCriterion("PROTB203CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01IsNotNull() {
            addCriterion("PROTB203CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01EqualTo(Date value) {
            addCriterion("PROTB203CA01 =", value, "protb203ca01");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01NotEqualTo(Date value) {
            addCriterion("PROTB203CA01 <>", value, "protb203ca01");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01GreaterThan(Date value) {
            addCriterion("PROTB203CA01 >", value, "protb203ca01");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB203CA01 >=", value, "protb203ca01");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01LessThan(Date value) {
            addCriterion("PROTB203CA01 <", value, "protb203ca01");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01LessThanOrEqualTo(Date value) {
            addCriterion("PROTB203CA01 <=", value, "protb203ca01");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01In(List<Date> values) {
            addCriterion("PROTB203CA01 in", values, "protb203ca01");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01NotIn(List<Date> values) {
            addCriterion("PROTB203CA01 not in", values, "protb203ca01");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01Between(Date value1, Date value2) {
            addCriterion("PROTB203CA01 between", value1, value2, "protb203ca01");
            return (Criteria) this;
        }

        public Criteria andProtb203ca01NotBetween(Date value1, Date value2) {
            addCriterion("PROTB203CA01 not between", value1, value2, "protb203ca01");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02IsNull() {
            addCriterion("PROTB203CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02IsNotNull() {
            addCriterion("PROTB203CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02EqualTo(Date value) {
            addCriterion("PROTB203CA02 =", value, "protb203ca02");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02NotEqualTo(Date value) {
            addCriterion("PROTB203CA02 <>", value, "protb203ca02");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02GreaterThan(Date value) {
            addCriterion("PROTB203CA02 >", value, "protb203ca02");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB203CA02 >=", value, "protb203ca02");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02LessThan(Date value) {
            addCriterion("PROTB203CA02 <", value, "protb203ca02");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB203CA02 <=", value, "protb203ca02");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02In(List<Date> values) {
            addCriterion("PROTB203CA02 in", values, "protb203ca02");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02NotIn(List<Date> values) {
            addCriterion("PROTB203CA02 not in", values, "protb203ca02");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02Between(Date value1, Date value2) {
            addCriterion("PROTB203CA02 between", value1, value2, "protb203ca02");
            return (Criteria) this;
        }

        public Criteria andProtb203ca02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB203CA02 not between", value1, value2, "protb203ca02");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03IsNull() {
            addCriterion("PROTB203CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03IsNotNull() {
            addCriterion("PROTB203CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03EqualTo(Double value) {
            addCriterion("PROTB203CA03 =", value, "protb203ca03");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03NotEqualTo(Double value) {
            addCriterion("PROTB203CA03 <>", value, "protb203ca03");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03GreaterThan(Double value) {
            addCriterion("PROTB203CA03 >", value, "protb203ca03");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB203CA03 >=", value, "protb203ca03");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03LessThan(Double value) {
            addCriterion("PROTB203CA03 <", value, "protb203ca03");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03LessThanOrEqualTo(Double value) {
            addCriterion("PROTB203CA03 <=", value, "protb203ca03");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03In(List<Double> values) {
            addCriterion("PROTB203CA03 in", values, "protb203ca03");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03NotIn(List<Double> values) {
            addCriterion("PROTB203CA03 not in", values, "protb203ca03");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03Between(Double value1, Double value2) {
            addCriterion("PROTB203CA03 between", value1, value2, "protb203ca03");
            return (Criteria) this;
        }

        public Criteria andProtb203ca03NotBetween(Double value1, Double value2) {
            addCriterion("PROTB203CA03 not between", value1, value2, "protb203ca03");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04IsNull() {
            addCriterion("PROTB203CA04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04IsNotNull() {
            addCriterion("PROTB203CA04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04EqualTo(Integer value) {
            addCriterion("PROTB203CA04 =", value, "protb203ca04");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04NotEqualTo(Integer value) {
            addCriterion("PROTB203CA04 <>", value, "protb203ca04");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04GreaterThan(Integer value) {
            addCriterion("PROTB203CA04 >", value, "protb203ca04");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04GreaterThanOrEqualTo(Integer value) {
            addCriterion("PROTB203CA04 >=", value, "protb203ca04");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04LessThan(Integer value) {
            addCriterion("PROTB203CA04 <", value, "protb203ca04");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04LessThanOrEqualTo(Integer value) {
            addCriterion("PROTB203CA04 <=", value, "protb203ca04");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04In(List<Integer> values) {
            addCriterion("PROTB203CA04 in", values, "protb203ca04");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04NotIn(List<Integer> values) {
            addCriterion("PROTB203CA04 not in", values, "protb203ca04");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04Between(Integer value1, Integer value2) {
            addCriterion("PROTB203CA04 between", value1, value2, "protb203ca04");
            return (Criteria) this;
        }

        public Criteria andProtb203ca04NotBetween(Integer value1, Integer value2) {
            addCriterion("PROTB203CA04 not between", value1, value2, "protb203ca04");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05IsNull() {
            addCriterion("PROTB203CA05 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05IsNotNull() {
            addCriterion("PROTB203CA05 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05EqualTo(String value) {
            addCriterion("PROTB203CA05 =", value, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05NotEqualTo(String value) {
            addCriterion("PROTB203CA05 <>", value, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05GreaterThan(String value) {
            addCriterion("PROTB203CA05 >", value, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB203CA05 >=", value, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05LessThan(String value) {
            addCriterion("PROTB203CA05 <", value, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05LessThanOrEqualTo(String value) {
            addCriterion("PROTB203CA05 <=", value, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05Like(String value) {
            addCriterion("PROTB203CA05 like", value, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05NotLike(String value) {
            addCriterion("PROTB203CA05 not like", value, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05In(List<String> values) {
            addCriterion("PROTB203CA05 in", values, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05NotIn(List<String> values) {
            addCriterion("PROTB203CA05 not in", values, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05Between(String value1, String value2) {
            addCriterion("PROTB203CA05 between", value1, value2, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203ca05NotBetween(String value1, String value2) {
            addCriterion("PROTB203CA05 not between", value1, value2, "protb203ca05");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00IsNull() {
            addCriterion("PROTB203CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00IsNotNull() {
            addCriterion("PROTB203CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00EqualTo(Date value) {
            addCriterion("PROTB203CC00 =", value, "protb203cc00");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00NotEqualTo(Date value) {
            addCriterion("PROTB203CC00 <>", value, "protb203cc00");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00GreaterThan(Date value) {
            addCriterion("PROTB203CC00 >", value, "protb203cc00");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB203CC00 >=", value, "protb203cc00");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00LessThan(Date value) {
            addCriterion("PROTB203CC00 <", value, "protb203cc00");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB203CC00 <=", value, "protb203cc00");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00In(List<Date> values) {
            addCriterion("PROTB203CC00 in", values, "protb203cc00");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00NotIn(List<Date> values) {
            addCriterion("PROTB203CC00 not in", values, "protb203cc00");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00Between(Date value1, Date value2) {
            addCriterion("PROTB203CC00 between", value1, value2, "protb203cc00");
            return (Criteria) this;
        }

        public Criteria andProtb203cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB203CC00 not between", value1, value2, "protb203cc00");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01IsNull() {
            addCriterion("PROTB203CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01IsNotNull() {
            addCriterion("PROTB203CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01EqualTo(String value) {
            addCriterion("PROTB203CC01 =", value, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01NotEqualTo(String value) {
            addCriterion("PROTB203CC01 <>", value, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01GreaterThan(String value) {
            addCriterion("PROTB203CC01 >", value, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB203CC01 >=", value, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01LessThan(String value) {
            addCriterion("PROTB203CC01 <", value, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB203CC01 <=", value, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01Like(String value) {
            addCriterion("PROTB203CC01 like", value, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01NotLike(String value) {
            addCriterion("PROTB203CC01 not like", value, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01In(List<String> values) {
            addCriterion("PROTB203CC01 in", values, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01NotIn(List<String> values) {
            addCriterion("PROTB203CC01 not in", values, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01Between(String value1, String value2) {
            addCriterion("PROTB203CC01 between", value1, value2, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB203CC01 not between", value1, value2, "protb203cc01");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02IsNull() {
            addCriterion("PROTB203CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02IsNotNull() {
            addCriterion("PROTB203CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02EqualTo(Date value) {
            addCriterion("PROTB203CC02 =", value, "protb203cc02");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02NotEqualTo(Date value) {
            addCriterion("PROTB203CC02 <>", value, "protb203cc02");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02GreaterThan(Date value) {
            addCriterion("PROTB203CC02 >", value, "protb203cc02");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB203CC02 >=", value, "protb203cc02");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02LessThan(Date value) {
            addCriterion("PROTB203CC02 <", value, "protb203cc02");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB203CC02 <=", value, "protb203cc02");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02In(List<Date> values) {
            addCriterion("PROTB203CC02 in", values, "protb203cc02");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02NotIn(List<Date> values) {
            addCriterion("PROTB203CC02 not in", values, "protb203cc02");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02Between(Date value1, Date value2) {
            addCriterion("PROTB203CC02 between", value1, value2, "protb203cc02");
            return (Criteria) this;
        }

        public Criteria andProtb203cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB203CC02 not between", value1, value2, "protb203cc02");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03IsNull() {
            addCriterion("PROTB203CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03IsNotNull() {
            addCriterion("PROTB203CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03EqualTo(String value) {
            addCriterion("PROTB203CC03 =", value, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03NotEqualTo(String value) {
            addCriterion("PROTB203CC03 <>", value, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03GreaterThan(String value) {
            addCriterion("PROTB203CC03 >", value, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB203CC03 >=", value, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03LessThan(String value) {
            addCriterion("PROTB203CC03 <", value, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB203CC03 <=", value, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03Like(String value) {
            addCriterion("PROTB203CC03 like", value, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03NotLike(String value) {
            addCriterion("PROTB203CC03 not like", value, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03In(List<String> values) {
            addCriterion("PROTB203CC03 in", values, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03NotIn(List<String> values) {
            addCriterion("PROTB203CC03 not in", values, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03Between(String value1, String value2) {
            addCriterion("PROTB203CC03 between", value1, value2, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB203CC03 not between", value1, value2, "protb203cc03");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00IsNull() {
            addCriterion("PROTB203CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00IsNotNull() {
            addCriterion("PROTB203CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00EqualTo(String value) {
            addCriterion("PROTB203CD00 =", value, "protb203cd00");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00NotEqualTo(String value) {
            addCriterion("PROTB203CD00 <>", value, "protb203cd00");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00GreaterThan(String value) {
            addCriterion("PROTB203CD00 >", value, "protb203cd00");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB203CD00 >=", value, "protb203cd00");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00LessThan(String value) {
            addCriterion("PROTB203CD00 <", value, "protb203cd00");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB203CD00 <=", value, "protb203cd00");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00Like(String value) {
            addCriterion("PROTB203CD00 like", value, "protb203cd00");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00NotLike(String value) {
            addCriterion("PROTB203CD00 not like", value, "protb203cd00");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00In(List<String> values) {
            addCriterion("PROTB203CD00 in", values, "protb203cd00");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00NotIn(List<String> values) {
            addCriterion("PROTB203CD00 not in", values, "protb203cd00");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00Between(String value1, String value2) {
            addCriterion("PROTB203CD00 between", value1, value2, "protb203cd00");
            return (Criteria) this;
        }

        public Criteria andProtb203cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB203CD00 not between", value1, value2, "protb203cd00");
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