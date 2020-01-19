package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb204Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb204Example() {
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

        public Criteria andProtb204idIsNull() {
            addCriterion("PROTB204ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb204idIsNotNull() {
            addCriterion("PROTB204ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204idEqualTo(String value) {
            addCriterion("PROTB204ID =", value, "protb204id");
            return (Criteria) this;
        }

        public Criteria andProtb204idNotEqualTo(String value) {
            addCriterion("PROTB204ID <>", value, "protb204id");
            return (Criteria) this;
        }

        public Criteria andProtb204idGreaterThan(String value) {
            addCriterion("PROTB204ID >", value, "protb204id");
            return (Criteria) this;
        }

        public Criteria andProtb204idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB204ID >=", value, "protb204id");
            return (Criteria) this;
        }

        public Criteria andProtb204idLessThan(String value) {
            addCriterion("PROTB204ID <", value, "protb204id");
            return (Criteria) this;
        }

        public Criteria andProtb204idLessThanOrEqualTo(String value) {
            addCriterion("PROTB204ID <=", value, "protb204id");
            return (Criteria) this;
        }

        public Criteria andProtb204idLike(String value) {
            addCriterion("PROTB204ID like", value, "protb204id");
            return (Criteria) this;
        }

        public Criteria andProtb204idNotLike(String value) {
            addCriterion("PROTB204ID not like", value, "protb204id");
            return (Criteria) this;
        }

        public Criteria andProtb204idIn(List<String> values) {
            addCriterion("PROTB204ID in", values, "protb204id");
            return (Criteria) this;
        }

        public Criteria andProtb204idNotIn(List<String> values) {
            addCriterion("PROTB204ID not in", values, "protb204id");
            return (Criteria) this;
        }

        public Criteria andProtb204idBetween(String value1, String value2) {
            addCriterion("PROTB204ID between", value1, value2, "protb204id");
            return (Criteria) this;
        }

        public Criteria andProtb204idNotBetween(String value1, String value2) {
            addCriterion("PROTB204ID not between", value1, value2, "protb204id");
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

        public Criteria andProtb204ca00IsNull() {
            addCriterion("PROTB204CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca00IsNotNull() {
            addCriterion("PROTB204CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca00EqualTo(Date value) {
            addCriterion("PROTB204CA00 =", value, "protb204ca00");
            return (Criteria) this;
        }

        public Criteria andProtb204ca00NotEqualTo(Date value) {
            addCriterion("PROTB204CA00 <>", value, "protb204ca00");
            return (Criteria) this;
        }

        public Criteria andProtb204ca00GreaterThan(Date value) {
            addCriterion("PROTB204CA00 >", value, "protb204ca00");
            return (Criteria) this;
        }

        public Criteria andProtb204ca00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB204CA00 >=", value, "protb204ca00");
            return (Criteria) this;
        }

        public Criteria andProtb204ca00LessThan(Date value) {
            addCriterion("PROTB204CA00 <", value, "protb204ca00");
            return (Criteria) this;
        }

        public Criteria andProtb204ca00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB204CA00 <=", value, "protb204ca00");
            return (Criteria) this;
        }

        public Criteria andProtb204ca00In(List<Date> values) {
            addCriterion("PROTB204CA00 in", values, "protb204ca00");
            return (Criteria) this;
        }

        public Criteria andProtb204ca00NotIn(List<Date> values) {
            addCriterion("PROTB204CA00 not in", values, "protb204ca00");
            return (Criteria) this;
        }

        public Criteria andProtb204ca00Between(Date value1, Date value2) {
            addCriterion("PROTB204CA00 between", value1, value2, "protb204ca00");
            return (Criteria) this;
        }

        public Criteria andProtb204ca00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB204CA00 not between", value1, value2, "protb204ca00");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01IsNull() {
            addCriterion("PROTB204CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01IsNotNull() {
            addCriterion("PROTB204CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01EqualTo(Date value) {
            addCriterion("PROTB204CA01 =", value, "protb204ca01");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01NotEqualTo(Date value) {
            addCriterion("PROTB204CA01 <>", value, "protb204ca01");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01GreaterThan(Date value) {
            addCriterion("PROTB204CA01 >", value, "protb204ca01");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB204CA01 >=", value, "protb204ca01");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01LessThan(Date value) {
            addCriterion("PROTB204CA01 <", value, "protb204ca01");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01LessThanOrEqualTo(Date value) {
            addCriterion("PROTB204CA01 <=", value, "protb204ca01");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01In(List<Date> values) {
            addCriterion("PROTB204CA01 in", values, "protb204ca01");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01NotIn(List<Date> values) {
            addCriterion("PROTB204CA01 not in", values, "protb204ca01");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01Between(Date value1, Date value2) {
            addCriterion("PROTB204CA01 between", value1, value2, "protb204ca01");
            return (Criteria) this;
        }

        public Criteria andProtb204ca01NotBetween(Date value1, Date value2) {
            addCriterion("PROTB204CA01 not between", value1, value2, "protb204ca01");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02IsNull() {
            addCriterion("PROTB204CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02IsNotNull() {
            addCriterion("PROTB204CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02EqualTo(String value) {
            addCriterion("PROTB204CA02 =", value, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02NotEqualTo(String value) {
            addCriterion("PROTB204CA02 <>", value, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02GreaterThan(String value) {
            addCriterion("PROTB204CA02 >", value, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB204CA02 >=", value, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02LessThan(String value) {
            addCriterion("PROTB204CA02 <", value, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02LessThanOrEqualTo(String value) {
            addCriterion("PROTB204CA02 <=", value, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02Like(String value) {
            addCriterion("PROTB204CA02 like", value, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02NotLike(String value) {
            addCriterion("PROTB204CA02 not like", value, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02In(List<String> values) {
            addCriterion("PROTB204CA02 in", values, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02NotIn(List<String> values) {
            addCriterion("PROTB204CA02 not in", values, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02Between(String value1, String value2) {
            addCriterion("PROTB204CA02 between", value1, value2, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca02NotBetween(String value1, String value2) {
            addCriterion("PROTB204CA02 not between", value1, value2, "protb204ca02");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03IsNull() {
            addCriterion("PROTB204CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03IsNotNull() {
            addCriterion("PROTB204CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03EqualTo(Integer value) {
            addCriterion("PROTB204CA03 =", value, "protb204ca03");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03NotEqualTo(Integer value) {
            addCriterion("PROTB204CA03 <>", value, "protb204ca03");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03GreaterThan(Integer value) {
            addCriterion("PROTB204CA03 >", value, "protb204ca03");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03GreaterThanOrEqualTo(Integer value) {
            addCriterion("PROTB204CA03 >=", value, "protb204ca03");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03LessThan(Integer value) {
            addCriterion("PROTB204CA03 <", value, "protb204ca03");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03LessThanOrEqualTo(Integer value) {
            addCriterion("PROTB204CA03 <=", value, "protb204ca03");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03In(List<Integer> values) {
            addCriterion("PROTB204CA03 in", values, "protb204ca03");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03NotIn(List<Integer> values) {
            addCriterion("PROTB204CA03 not in", values, "protb204ca03");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03Between(Integer value1, Integer value2) {
            addCriterion("PROTB204CA03 between", value1, value2, "protb204ca03");
            return (Criteria) this;
        }

        public Criteria andProtb204ca03NotBetween(Integer value1, Integer value2) {
            addCriterion("PROTB204CA03 not between", value1, value2, "protb204ca03");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04IsNull() {
            addCriterion("PROTB204CA04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04IsNotNull() {
            addCriterion("PROTB204CA04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04EqualTo(Double value) {
            addCriterion("PROTB204CA04 =", value, "protb204ca04");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04NotEqualTo(Double value) {
            addCriterion("PROTB204CA04 <>", value, "protb204ca04");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04GreaterThan(Double value) {
            addCriterion("PROTB204CA04 >", value, "protb204ca04");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB204CA04 >=", value, "protb204ca04");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04LessThan(Double value) {
            addCriterion("PROTB204CA04 <", value, "protb204ca04");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04LessThanOrEqualTo(Double value) {
            addCriterion("PROTB204CA04 <=", value, "protb204ca04");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04In(List<Double> values) {
            addCriterion("PROTB204CA04 in", values, "protb204ca04");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04NotIn(List<Double> values) {
            addCriterion("PROTB204CA04 not in", values, "protb204ca04");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04Between(Double value1, Double value2) {
            addCriterion("PROTB204CA04 between", value1, value2, "protb204ca04");
            return (Criteria) this;
        }

        public Criteria andProtb204ca04NotBetween(Double value1, Double value2) {
            addCriterion("PROTB204CA04 not between", value1, value2, "protb204ca04");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05IsNull() {
            addCriterion("PROTB204CA05 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05IsNotNull() {
            addCriterion("PROTB204CA05 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05EqualTo(Double value) {
            addCriterion("PROTB204CA05 =", value, "protb204ca05");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05NotEqualTo(Double value) {
            addCriterion("PROTB204CA05 <>", value, "protb204ca05");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05GreaterThan(Double value) {
            addCriterion("PROTB204CA05 >", value, "protb204ca05");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB204CA05 >=", value, "protb204ca05");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05LessThan(Double value) {
            addCriterion("PROTB204CA05 <", value, "protb204ca05");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05LessThanOrEqualTo(Double value) {
            addCriterion("PROTB204CA05 <=", value, "protb204ca05");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05In(List<Double> values) {
            addCriterion("PROTB204CA05 in", values, "protb204ca05");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05NotIn(List<Double> values) {
            addCriterion("PROTB204CA05 not in", values, "protb204ca05");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05Between(Double value1, Double value2) {
            addCriterion("PROTB204CA05 between", value1, value2, "protb204ca05");
            return (Criteria) this;
        }

        public Criteria andProtb204ca05NotBetween(Double value1, Double value2) {
            addCriterion("PROTB204CA05 not between", value1, value2, "protb204ca05");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00IsNull() {
            addCriterion("PROTB204CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00IsNotNull() {
            addCriterion("PROTB204CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00EqualTo(Date value) {
            addCriterion("PROTB204CC00 =", value, "protb204cc00");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00NotEqualTo(Date value) {
            addCriterion("PROTB204CC00 <>", value, "protb204cc00");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00GreaterThan(Date value) {
            addCriterion("PROTB204CC00 >", value, "protb204cc00");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB204CC00 >=", value, "protb204cc00");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00LessThan(Date value) {
            addCriterion("PROTB204CC00 <", value, "protb204cc00");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB204CC00 <=", value, "protb204cc00");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00In(List<Date> values) {
            addCriterion("PROTB204CC00 in", values, "protb204cc00");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00NotIn(List<Date> values) {
            addCriterion("PROTB204CC00 not in", values, "protb204cc00");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00Between(Date value1, Date value2) {
            addCriterion("PROTB204CC00 between", value1, value2, "protb204cc00");
            return (Criteria) this;
        }

        public Criteria andProtb204cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB204CC00 not between", value1, value2, "protb204cc00");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01IsNull() {
            addCriterion("PROTB204CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01IsNotNull() {
            addCriterion("PROTB204CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01EqualTo(String value) {
            addCriterion("PROTB204CC01 =", value, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01NotEqualTo(String value) {
            addCriterion("PROTB204CC01 <>", value, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01GreaterThan(String value) {
            addCriterion("PROTB204CC01 >", value, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB204CC01 >=", value, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01LessThan(String value) {
            addCriterion("PROTB204CC01 <", value, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB204CC01 <=", value, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01Like(String value) {
            addCriterion("PROTB204CC01 like", value, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01NotLike(String value) {
            addCriterion("PROTB204CC01 not like", value, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01In(List<String> values) {
            addCriterion("PROTB204CC01 in", values, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01NotIn(List<String> values) {
            addCriterion("PROTB204CC01 not in", values, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01Between(String value1, String value2) {
            addCriterion("PROTB204CC01 between", value1, value2, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB204CC01 not between", value1, value2, "protb204cc01");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02IsNull() {
            addCriterion("PROTB204CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02IsNotNull() {
            addCriterion("PROTB204CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02EqualTo(Date value) {
            addCriterion("PROTB204CC02 =", value, "protb204cc02");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02NotEqualTo(Date value) {
            addCriterion("PROTB204CC02 <>", value, "protb204cc02");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02GreaterThan(Date value) {
            addCriterion("PROTB204CC02 >", value, "protb204cc02");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB204CC02 >=", value, "protb204cc02");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02LessThan(Date value) {
            addCriterion("PROTB204CC02 <", value, "protb204cc02");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB204CC02 <=", value, "protb204cc02");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02In(List<Date> values) {
            addCriterion("PROTB204CC02 in", values, "protb204cc02");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02NotIn(List<Date> values) {
            addCriterion("PROTB204CC02 not in", values, "protb204cc02");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02Between(Date value1, Date value2) {
            addCriterion("PROTB204CC02 between", value1, value2, "protb204cc02");
            return (Criteria) this;
        }

        public Criteria andProtb204cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB204CC02 not between", value1, value2, "protb204cc02");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03IsNull() {
            addCriterion("PROTB204CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03IsNotNull() {
            addCriterion("PROTB204CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03EqualTo(String value) {
            addCriterion("PROTB204CC03 =", value, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03NotEqualTo(String value) {
            addCriterion("PROTB204CC03 <>", value, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03GreaterThan(String value) {
            addCriterion("PROTB204CC03 >", value, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB204CC03 >=", value, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03LessThan(String value) {
            addCriterion("PROTB204CC03 <", value, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB204CC03 <=", value, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03Like(String value) {
            addCriterion("PROTB204CC03 like", value, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03NotLike(String value) {
            addCriterion("PROTB204CC03 not like", value, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03In(List<String> values) {
            addCriterion("PROTB204CC03 in", values, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03NotIn(List<String> values) {
            addCriterion("PROTB204CC03 not in", values, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03Between(String value1, String value2) {
            addCriterion("PROTB204CC03 between", value1, value2, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB204CC03 not between", value1, value2, "protb204cc03");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00IsNull() {
            addCriterion("PROTB204CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00IsNotNull() {
            addCriterion("PROTB204CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00EqualTo(String value) {
            addCriterion("PROTB204CD00 =", value, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00NotEqualTo(String value) {
            addCriterion("PROTB204CD00 <>", value, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00GreaterThan(String value) {
            addCriterion("PROTB204CD00 >", value, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB204CD00 >=", value, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00LessThan(String value) {
            addCriterion("PROTB204CD00 <", value, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB204CD00 <=", value, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00Like(String value) {
            addCriterion("PROTB204CD00 like", value, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00NotLike(String value) {
            addCriterion("PROTB204CD00 not like", value, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00In(List<String> values) {
            addCriterion("PROTB204CD00 in", values, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00NotIn(List<String> values) {
            addCriterion("PROTB204CD00 not in", values, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00Between(String value1, String value2) {
            addCriterion("PROTB204CD00 between", value1, value2, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB204CD00 not between", value1, value2, "protb204cd00");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01IsNull() {
            addCriterion("PROTB204CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01IsNotNull() {
            addCriterion("PROTB204CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01EqualTo(String value) {
            addCriterion("PROTB204CD01 =", value, "protb204cd01");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01NotEqualTo(String value) {
            addCriterion("PROTB204CD01 <>", value, "protb204cd01");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01GreaterThan(String value) {
            addCriterion("PROTB204CD01 >", value, "protb204cd01");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB204CD01 >=", value, "protb204cd01");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01LessThan(String value) {
            addCriterion("PROTB204CD01 <", value, "protb204cd01");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB204CD01 <=", value, "protb204cd01");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01Like(String value) {
            addCriterion("PROTB204CD01 like", value, "protb204cd01");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01NotLike(String value) {
            addCriterion("PROTB204CD01 not like", value, "protb204cd01");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01In(List<String> values) {
            addCriterion("PROTB204CD01 in", values, "protb204cd01");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01NotIn(List<String> values) {
            addCriterion("PROTB204CD01 not in", values, "protb204cd01");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01Between(String value1, String value2) {
            addCriterion("PROTB204CD01 between", value1, value2, "protb204cd01");
            return (Criteria) this;
        }

        public Criteria andProtb204cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB204CD01 not between", value1, value2, "protb204cd01");
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