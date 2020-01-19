package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb100Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb100Example() {
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

        public Criteria andProtb100cd01IsNull() {
            addCriterion("PROTB100CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01IsNotNull() {
            addCriterion("PROTB100CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01EqualTo(String value) {
            addCriterion("PROTB100CD01 =", value, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01NotEqualTo(String value) {
            addCriterion("PROTB100CD01 <>", value, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01GreaterThan(String value) {
            addCriterion("PROTB100CD01 >", value, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CD01 >=", value, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01LessThan(String value) {
            addCriterion("PROTB100CD01 <", value, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CD01 <=", value, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01Like(String value) {
            addCriterion("PROTB100CD01 like", value, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01NotLike(String value) {
            addCriterion("PROTB100CD01 not like", value, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01In(List<String> values) {
            addCriterion("PROTB100CD01 in", values, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01NotIn(List<String> values) {
            addCriterion("PROTB100CD01 not in", values, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01Between(String value1, String value2) {
            addCriterion("PROTB100CD01 between", value1, value2, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB100CD01 not between", value1, value2, "protb100cd01");
            return (Criteria) this;
        }

        public Criteria andProtb100idIsNull() {
            addCriterion("PROTB100ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb100idIsNotNull() {
            addCriterion("PROTB100ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100idEqualTo(String value) {
            addCriterion("PROTB100ID =", value, "protb100id");
            return (Criteria) this;
        }

        public Criteria andProtb100idNotEqualTo(String value) {
            addCriterion("PROTB100ID <>", value, "protb100id");
            return (Criteria) this;
        }

        public Criteria andProtb100idGreaterThan(String value) {
            addCriterion("PROTB100ID >", value, "protb100id");
            return (Criteria) this;
        }

        public Criteria andProtb100idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100ID >=", value, "protb100id");
            return (Criteria) this;
        }

        public Criteria andProtb100idLessThan(String value) {
            addCriterion("PROTB100ID <", value, "protb100id");
            return (Criteria) this;
        }

        public Criteria andProtb100idLessThanOrEqualTo(String value) {
            addCriterion("PROTB100ID <=", value, "protb100id");
            return (Criteria) this;
        }

        public Criteria andProtb100idLike(String value) {
            addCriterion("PROTB100ID like", value, "protb100id");
            return (Criteria) this;
        }

        public Criteria andProtb100idNotLike(String value) {
            addCriterion("PROTB100ID not like", value, "protb100id");
            return (Criteria) this;
        }

        public Criteria andProtb100idIn(List<String> values) {
            addCriterion("PROTB100ID in", values, "protb100id");
            return (Criteria) this;
        }

        public Criteria andProtb100idNotIn(List<String> values) {
            addCriterion("PROTB100ID not in", values, "protb100id");
            return (Criteria) this;
        }

        public Criteria andProtb100idBetween(String value1, String value2) {
            addCriterion("PROTB100ID between", value1, value2, "protb100id");
            return (Criteria) this;
        }

        public Criteria andProtb100idNotBetween(String value1, String value2) {
            addCriterion("PROTB100ID not between", value1, value2, "protb100id");
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

        public Criteria andSettb10idIsNull() {
            addCriterion("SETTB10ID is null");
            return (Criteria) this;
        }

        public Criteria andSettb10idIsNotNull() {
            addCriterion("SETTB10ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettb10idEqualTo(String value) {
            addCriterion("SETTB10ID =", value, "settb10id");
            return (Criteria) this;
        }

        public Criteria andSettb10idNotEqualTo(String value) {
            addCriterion("SETTB10ID <>", value, "settb10id");
            return (Criteria) this;
        }

        public Criteria andSettb10idGreaterThan(String value) {
            addCriterion("SETTB10ID >", value, "settb10id");
            return (Criteria) this;
        }

        public Criteria andSettb10idGreaterThanOrEqualTo(String value) {
            addCriterion("SETTB10ID >=", value, "settb10id");
            return (Criteria) this;
        }

        public Criteria andSettb10idLessThan(String value) {
            addCriterion("SETTB10ID <", value, "settb10id");
            return (Criteria) this;
        }

        public Criteria andSettb10idLessThanOrEqualTo(String value) {
            addCriterion("SETTB10ID <=", value, "settb10id");
            return (Criteria) this;
        }

        public Criteria andSettb10idLike(String value) {
            addCriterion("SETTB10ID like", value, "settb10id");
            return (Criteria) this;
        }

        public Criteria andSettb10idNotLike(String value) {
            addCriterion("SETTB10ID not like", value, "settb10id");
            return (Criteria) this;
        }

        public Criteria andSettb10idIn(List<String> values) {
            addCriterion("SETTB10ID in", values, "settb10id");
            return (Criteria) this;
        }

        public Criteria andSettb10idNotIn(List<String> values) {
            addCriterion("SETTB10ID not in", values, "settb10id");
            return (Criteria) this;
        }

        public Criteria andSettb10idBetween(String value1, String value2) {
            addCriterion("SETTB10ID between", value1, value2, "settb10id");
            return (Criteria) this;
        }

        public Criteria andSettb10idNotBetween(String value1, String value2) {
            addCriterion("SETTB10ID not between", value1, value2, "settb10id");
            return (Criteria) this;
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

        public Criteria andProtb110idIsNull() {
            addCriterion("PROTB110ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb110idIsNotNull() {
            addCriterion("PROTB110ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb110idEqualTo(String value) {
            addCriterion("PROTB110ID =", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idNotEqualTo(String value) {
            addCriterion("PROTB110ID <>", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idGreaterThan(String value) {
            addCriterion("PROTB110ID >", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB110ID >=", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idLessThan(String value) {
            addCriterion("PROTB110ID <", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idLessThanOrEqualTo(String value) {
            addCriterion("PROTB110ID <=", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idLike(String value) {
            addCriterion("PROTB110ID like", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idNotLike(String value) {
            addCriterion("PROTB110ID not like", value, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idIn(List<String> values) {
            addCriterion("PROTB110ID in", values, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idNotIn(List<String> values) {
            addCriterion("PROTB110ID not in", values, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idBetween(String value1, String value2) {
            addCriterion("PROTB110ID between", value1, value2, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb110idNotBetween(String value1, String value2) {
            addCriterion("PROTB110ID not between", value1, value2, "protb110id");
            return (Criteria) this;
        }

        public Criteria andProtb115idIsNull() {
            addCriterion("PROTB115ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb115idIsNotNull() {
            addCriterion("PROTB115ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb115idEqualTo(String value) {
            addCriterion("PROTB115ID =", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idNotEqualTo(String value) {
            addCriterion("PROTB115ID <>", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idGreaterThan(String value) {
            addCriterion("PROTB115ID >", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB115ID >=", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idLessThan(String value) {
            addCriterion("PROTB115ID <", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idLessThanOrEqualTo(String value) {
            addCriterion("PROTB115ID <=", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idLike(String value) {
            addCriterion("PROTB115ID like", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idNotLike(String value) {
            addCriterion("PROTB115ID not like", value, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idIn(List<String> values) {
            addCriterion("PROTB115ID in", values, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idNotIn(List<String> values) {
            addCriterion("PROTB115ID not in", values, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idBetween(String value1, String value2) {
            addCriterion("PROTB115ID between", value1, value2, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb115idNotBetween(String value1, String value2) {
            addCriterion("PROTB115ID not between", value1, value2, "protb115id");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00IsNull() {
            addCriterion("PROTB100CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00IsNotNull() {
            addCriterion("PROTB100CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00EqualTo(String value) {
            addCriterion("PROTB100CA00 =", value, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00NotEqualTo(String value) {
            addCriterion("PROTB100CA00 <>", value, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00GreaterThan(String value) {
            addCriterion("PROTB100CA00 >", value, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CA00 >=", value, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00LessThan(String value) {
            addCriterion("PROTB100CA00 <", value, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CA00 <=", value, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00Like(String value) {
            addCriterion("PROTB100CA00 like", value, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00NotLike(String value) {
            addCriterion("PROTB100CA00 not like", value, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00In(List<String> values) {
            addCriterion("PROTB100CA00 in", values, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00NotIn(List<String> values) {
            addCriterion("PROTB100CA00 not in", values, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00Between(String value1, String value2) {
            addCriterion("PROTB100CA00 between", value1, value2, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca00NotBetween(String value1, String value2) {
            addCriterion("PROTB100CA00 not between", value1, value2, "protb100ca00");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01IsNull() {
            addCriterion("PROTB100CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01IsNotNull() {
            addCriterion("PROTB100CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01EqualTo(String value) {
            addCriterion("PROTB100CA01 =", value, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01NotEqualTo(String value) {
            addCriterion("PROTB100CA01 <>", value, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01GreaterThan(String value) {
            addCriterion("PROTB100CA01 >", value, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CA01 >=", value, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01LessThan(String value) {
            addCriterion("PROTB100CA01 <", value, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CA01 <=", value, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01Like(String value) {
            addCriterion("PROTB100CA01 like", value, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01NotLike(String value) {
            addCriterion("PROTB100CA01 not like", value, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01In(List<String> values) {
            addCriterion("PROTB100CA01 in", values, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01NotIn(List<String> values) {
            addCriterion("PROTB100CA01 not in", values, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01Between(String value1, String value2) {
            addCriterion("PROTB100CA01 between", value1, value2, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca01NotBetween(String value1, String value2) {
            addCriterion("PROTB100CA01 not between", value1, value2, "protb100ca01");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02IsNull() {
            addCriterion("PROTB100CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02IsNotNull() {
            addCriterion("PROTB100CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02EqualTo(Double value) {
            addCriterion("PROTB100CA02 =", value, "protb100ca02");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02NotEqualTo(Double value) {
            addCriterion("PROTB100CA02 <>", value, "protb100ca02");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02GreaterThan(Double value) {
            addCriterion("PROTB100CA02 >", value, "protb100ca02");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB100CA02 >=", value, "protb100ca02");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02LessThan(Double value) {
            addCriterion("PROTB100CA02 <", value, "protb100ca02");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02LessThanOrEqualTo(Double value) {
            addCriterion("PROTB100CA02 <=", value, "protb100ca02");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02In(List<Double> values) {
            addCriterion("PROTB100CA02 in", values, "protb100ca02");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02NotIn(List<Double> values) {
            addCriterion("PROTB100CA02 not in", values, "protb100ca02");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02Between(Double value1, Double value2) {
            addCriterion("PROTB100CA02 between", value1, value2, "protb100ca02");
            return (Criteria) this;
        }

        public Criteria andProtb100ca02NotBetween(Double value1, Double value2) {
            addCriterion("PROTB100CA02 not between", value1, value2, "protb100ca02");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03IsNull() {
            addCriterion("PROTB100CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03IsNotNull() {
            addCriterion("PROTB100CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03EqualTo(Date value) {
            addCriterion("PROTB100CA03 =", value, "protb100ca03");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03NotEqualTo(Date value) {
            addCriterion("PROTB100CA03 <>", value, "protb100ca03");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03GreaterThan(Date value) {
            addCriterion("PROTB100CA03 >", value, "protb100ca03");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB100CA03 >=", value, "protb100ca03");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03LessThan(Date value) {
            addCriterion("PROTB100CA03 <", value, "protb100ca03");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03LessThanOrEqualTo(Date value) {
            addCriterion("PROTB100CA03 <=", value, "protb100ca03");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03In(List<Date> values) {
            addCriterion("PROTB100CA03 in", values, "protb100ca03");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03NotIn(List<Date> values) {
            addCriterion("PROTB100CA03 not in", values, "protb100ca03");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03Between(Date value1, Date value2) {
            addCriterion("PROTB100CA03 between", value1, value2, "protb100ca03");
            return (Criteria) this;
        }

        public Criteria andProtb100ca03NotBetween(Date value1, Date value2) {
            addCriterion("PROTB100CA03 not between", value1, value2, "protb100ca03");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04IsNull() {
            addCriterion("PROTB100CA04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04IsNotNull() {
            addCriterion("PROTB100CA04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04EqualTo(Double value) {
            addCriterion("PROTB100CA04 =", value, "protb100ca04");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04NotEqualTo(Double value) {
            addCriterion("PROTB100CA04 <>", value, "protb100ca04");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04GreaterThan(Double value) {
            addCriterion("PROTB100CA04 >", value, "protb100ca04");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB100CA04 >=", value, "protb100ca04");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04LessThan(Double value) {
            addCriterion("PROTB100CA04 <", value, "protb100ca04");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04LessThanOrEqualTo(Double value) {
            addCriterion("PROTB100CA04 <=", value, "protb100ca04");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04In(List<Double> values) {
            addCriterion("PROTB100CA04 in", values, "protb100ca04");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04NotIn(List<Double> values) {
            addCriterion("PROTB100CA04 not in", values, "protb100ca04");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04Between(Double value1, Double value2) {
            addCriterion("PROTB100CA04 between", value1, value2, "protb100ca04");
            return (Criteria) this;
        }

        public Criteria andProtb100ca04NotBetween(Double value1, Double value2) {
            addCriterion("PROTB100CA04 not between", value1, value2, "protb100ca04");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05IsNull() {
            addCriterion("PROTB100CA05 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05IsNotNull() {
            addCriterion("PROTB100CA05 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05EqualTo(Double value) {
            addCriterion("PROTB100CA05 =", value, "protb100ca05");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05NotEqualTo(Double value) {
            addCriterion("PROTB100CA05 <>", value, "protb100ca05");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05GreaterThan(Double value) {
            addCriterion("PROTB100CA05 >", value, "protb100ca05");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB100CA05 >=", value, "protb100ca05");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05LessThan(Double value) {
            addCriterion("PROTB100CA05 <", value, "protb100ca05");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05LessThanOrEqualTo(Double value) {
            addCriterion("PROTB100CA05 <=", value, "protb100ca05");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05In(List<Double> values) {
            addCriterion("PROTB100CA05 in", values, "protb100ca05");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05NotIn(List<Double> values) {
            addCriterion("PROTB100CA05 not in", values, "protb100ca05");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05Between(Double value1, Double value2) {
            addCriterion("PROTB100CA05 between", value1, value2, "protb100ca05");
            return (Criteria) this;
        }

        public Criteria andProtb100ca05NotBetween(Double value1, Double value2) {
            addCriterion("PROTB100CA05 not between", value1, value2, "protb100ca05");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06IsNull() {
            addCriterion("PROTB100CA06 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06IsNotNull() {
            addCriterion("PROTB100CA06 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06EqualTo(String value) {
            addCriterion("PROTB100CA06 =", value, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06NotEqualTo(String value) {
            addCriterion("PROTB100CA06 <>", value, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06GreaterThan(String value) {
            addCriterion("PROTB100CA06 >", value, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CA06 >=", value, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06LessThan(String value) {
            addCriterion("PROTB100CA06 <", value, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CA06 <=", value, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06Like(String value) {
            addCriterion("PROTB100CA06 like", value, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06NotLike(String value) {
            addCriterion("PROTB100CA06 not like", value, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06In(List<String> values) {
            addCriterion("PROTB100CA06 in", values, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06NotIn(List<String> values) {
            addCriterion("PROTB100CA06 not in", values, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06Between(String value1, String value2) {
            addCriterion("PROTB100CA06 between", value1, value2, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca06NotBetween(String value1, String value2) {
            addCriterion("PROTB100CA06 not between", value1, value2, "protb100ca06");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07IsNull() {
            addCriterion("PROTB100CA07 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07IsNotNull() {
            addCriterion("PROTB100CA07 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07EqualTo(String value) {
            addCriterion("PROTB100CA07 =", value, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07NotEqualTo(String value) {
            addCriterion("PROTB100CA07 <>", value, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07GreaterThan(String value) {
            addCriterion("PROTB100CA07 >", value, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CA07 >=", value, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07LessThan(String value) {
            addCriterion("PROTB100CA07 <", value, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CA07 <=", value, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07Like(String value) {
            addCriterion("PROTB100CA07 like", value, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07NotLike(String value) {
            addCriterion("PROTB100CA07 not like", value, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07In(List<String> values) {
            addCriterion("PROTB100CA07 in", values, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07NotIn(List<String> values) {
            addCriterion("PROTB100CA07 not in", values, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07Between(String value1, String value2) {
            addCriterion("PROTB100CA07 between", value1, value2, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca07NotBetween(String value1, String value2) {
            addCriterion("PROTB100CA07 not between", value1, value2, "protb100ca07");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08IsNull() {
            addCriterion("PROTB100CA08 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08IsNotNull() {
            addCriterion("PROTB100CA08 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08EqualTo(Date value) {
            addCriterion("PROTB100CA08 =", value, "protb100ca08");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08NotEqualTo(Date value) {
            addCriterion("PROTB100CA08 <>", value, "protb100ca08");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08GreaterThan(Date value) {
            addCriterion("PROTB100CA08 >", value, "protb100ca08");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB100CA08 >=", value, "protb100ca08");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08LessThan(Date value) {
            addCriterion("PROTB100CA08 <", value, "protb100ca08");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08LessThanOrEqualTo(Date value) {
            addCriterion("PROTB100CA08 <=", value, "protb100ca08");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08In(List<Date> values) {
            addCriterion("PROTB100CA08 in", values, "protb100ca08");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08NotIn(List<Date> values) {
            addCriterion("PROTB100CA08 not in", values, "protb100ca08");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08Between(Date value1, Date value2) {
            addCriterion("PROTB100CA08 between", value1, value2, "protb100ca08");
            return (Criteria) this;
        }

        public Criteria andProtb100ca08NotBetween(Date value1, Date value2) {
            addCriterion("PROTB100CA08 not between", value1, value2, "protb100ca08");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09IsNull() {
            addCriterion("PROTB100CA09 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09IsNotNull() {
            addCriterion("PROTB100CA09 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09EqualTo(String value) {
            addCriterion("PROTB100CA09 =", value, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09NotEqualTo(String value) {
            addCriterion("PROTB100CA09 <>", value, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09GreaterThan(String value) {
            addCriterion("PROTB100CA09 >", value, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CA09 >=", value, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09LessThan(String value) {
            addCriterion("PROTB100CA09 <", value, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CA09 <=", value, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09Like(String value) {
            addCriterion("PROTB100CA09 like", value, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09NotLike(String value) {
            addCriterion("PROTB100CA09 not like", value, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09In(List<String> values) {
            addCriterion("PROTB100CA09 in", values, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09NotIn(List<String> values) {
            addCriterion("PROTB100CA09 not in", values, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09Between(String value1, String value2) {
            addCriterion("PROTB100CA09 between", value1, value2, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca09NotBetween(String value1, String value2) {
            addCriterion("PROTB100CA09 not between", value1, value2, "protb100ca09");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10IsNull() {
            addCriterion("PROTB100CA10 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10IsNotNull() {
            addCriterion("PROTB100CA10 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10EqualTo(String value) {
            addCriterion("PROTB100CA10 =", value, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10NotEqualTo(String value) {
            addCriterion("PROTB100CA10 <>", value, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10GreaterThan(String value) {
            addCriterion("PROTB100CA10 >", value, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CA10 >=", value, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10LessThan(String value) {
            addCriterion("PROTB100CA10 <", value, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CA10 <=", value, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10Like(String value) {
            addCriterion("PROTB100CA10 like", value, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10NotLike(String value) {
            addCriterion("PROTB100CA10 not like", value, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10In(List<String> values) {
            addCriterion("PROTB100CA10 in", values, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10NotIn(List<String> values) {
            addCriterion("PROTB100CA10 not in", values, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10Between(String value1, String value2) {
            addCriterion("PROTB100CA10 between", value1, value2, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca10NotBetween(String value1, String value2) {
            addCriterion("PROTB100CA10 not between", value1, value2, "protb100ca10");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11IsNull() {
            addCriterion("PROTB100CA11 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11IsNotNull() {
            addCriterion("PROTB100CA11 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11EqualTo(Double value) {
            addCriterion("PROTB100CA11 =", value, "protb100ca11");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11NotEqualTo(Double value) {
            addCriterion("PROTB100CA11 <>", value, "protb100ca11");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11GreaterThan(Double value) {
            addCriterion("PROTB100CA11 >", value, "protb100ca11");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11GreaterThanOrEqualTo(Double value) {
            addCriterion("PROTB100CA11 >=", value, "protb100ca11");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11LessThan(Double value) {
            addCriterion("PROTB100CA11 <", value, "protb100ca11");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11LessThanOrEqualTo(Double value) {
            addCriterion("PROTB100CA11 <=", value, "protb100ca11");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11In(List<Double> values) {
            addCriterion("PROTB100CA11 in", values, "protb100ca11");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11NotIn(List<Double> values) {
            addCriterion("PROTB100CA11 not in", values, "protb100ca11");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11Between(Double value1, Double value2) {
            addCriterion("PROTB100CA11 between", value1, value2, "protb100ca11");
            return (Criteria) this;
        }

        public Criteria andProtb100ca11NotBetween(Double value1, Double value2) {
            addCriterion("PROTB100CA11 not between", value1, value2, "protb100ca11");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12IsNull() {
            addCriterion("PROTB100CA12 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12IsNotNull() {
            addCriterion("PROTB100CA12 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12EqualTo(Date value) {
            addCriterion("PROTB100CA12 =", value, "protb100ca12");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12NotEqualTo(Date value) {
            addCriterion("PROTB100CA12 <>", value, "protb100ca12");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12GreaterThan(Date value) {
            addCriterion("PROTB100CA12 >", value, "protb100ca12");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB100CA12 >=", value, "protb100ca12");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12LessThan(Date value) {
            addCriterion("PROTB100CA12 <", value, "protb100ca12");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12LessThanOrEqualTo(Date value) {
            addCriterion("PROTB100CA12 <=", value, "protb100ca12");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12In(List<Date> values) {
            addCriterion("PROTB100CA12 in", values, "protb100ca12");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12NotIn(List<Date> values) {
            addCriterion("PROTB100CA12 not in", values, "protb100ca12");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12Between(Date value1, Date value2) {
            addCriterion("PROTB100CA12 between", value1, value2, "protb100ca12");
            return (Criteria) this;
        }

        public Criteria andProtb100ca12NotBetween(Date value1, Date value2) {
            addCriterion("PROTB100CA12 not between", value1, value2, "protb100ca12");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13IsNull() {
            addCriterion("PROTB100CA13 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13IsNotNull() {
            addCriterion("PROTB100CA13 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13EqualTo(String value) {
            addCriterion("PROTB100CA13 =", value, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13NotEqualTo(String value) {
            addCriterion("PROTB100CA13 <>", value, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13GreaterThan(String value) {
            addCriterion("PROTB100CA13 >", value, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CA13 >=", value, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13LessThan(String value) {
            addCriterion("PROTB100CA13 <", value, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CA13 <=", value, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13Like(String value) {
            addCriterion("PROTB100CA13 like", value, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13NotLike(String value) {
            addCriterion("PROTB100CA13 not like", value, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13In(List<String> values) {
            addCriterion("PROTB100CA13 in", values, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13NotIn(List<String> values) {
            addCriterion("PROTB100CA13 not in", values, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13Between(String value1, String value2) {
            addCriterion("PROTB100CA13 between", value1, value2, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca13NotBetween(String value1, String value2) {
            addCriterion("PROTB100CA13 not between", value1, value2, "protb100ca13");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14IsNull() {
            addCriterion("PROTB100CA14 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14IsNotNull() {
            addCriterion("PROTB100CA14 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14EqualTo(String value) {
            addCriterion("PROTB100CA14 =", value, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14NotEqualTo(String value) {
            addCriterion("PROTB100CA14 <>", value, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14GreaterThan(String value) {
            addCriterion("PROTB100CA14 >", value, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CA14 >=", value, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14LessThan(String value) {
            addCriterion("PROTB100CA14 <", value, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CA14 <=", value, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14Like(String value) {
            addCriterion("PROTB100CA14 like", value, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14NotLike(String value) {
            addCriterion("PROTB100CA14 not like", value, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14In(List<String> values) {
            addCriterion("PROTB100CA14 in", values, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14NotIn(List<String> values) {
            addCriterion("PROTB100CA14 not in", values, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14Between(String value1, String value2) {
            addCriterion("PROTB100CA14 between", value1, value2, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca14NotBetween(String value1, String value2) {
            addCriterion("PROTB100CA14 not between", value1, value2, "protb100ca14");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15IsNull() {
            addCriterion("PROTB100CA15 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15IsNotNull() {
            addCriterion("PROTB100CA15 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15EqualTo(String value) {
            addCriterion("PROTB100CA15 =", value, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15NotEqualTo(String value) {
            addCriterion("PROTB100CA15 <>", value, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15GreaterThan(String value) {
            addCriterion("PROTB100CA15 >", value, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CA15 >=", value, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15LessThan(String value) {
            addCriterion("PROTB100CA15 <", value, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CA15 <=", value, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15Like(String value) {
            addCriterion("PROTB100CA15 like", value, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15NotLike(String value) {
            addCriterion("PROTB100CA15 not like", value, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15In(List<String> values) {
            addCriterion("PROTB100CA15 in", values, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15NotIn(List<String> values) {
            addCriterion("PROTB100CA15 not in", values, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15Between(String value1, String value2) {
            addCriterion("PROTB100CA15 between", value1, value2, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100ca15NotBetween(String value1, String value2) {
            addCriterion("PROTB100CA15 not between", value1, value2, "protb100ca15");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00IsNull() {
            addCriterion("PROTB100CB00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00IsNotNull() {
            addCriterion("PROTB100CB00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00EqualTo(String value) {
            addCriterion("PROTB100CB00 =", value, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00NotEqualTo(String value) {
            addCriterion("PROTB100CB00 <>", value, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00GreaterThan(String value) {
            addCriterion("PROTB100CB00 >", value, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CB00 >=", value, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00LessThan(String value) {
            addCriterion("PROTB100CB00 <", value, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CB00 <=", value, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00Like(String value) {
            addCriterion("PROTB100CB00 like", value, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00NotLike(String value) {
            addCriterion("PROTB100CB00 not like", value, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00In(List<String> values) {
            addCriterion("PROTB100CB00 in", values, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00NotIn(List<String> values) {
            addCriterion("PROTB100CB00 not in", values, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00Between(String value1, String value2) {
            addCriterion("PROTB100CB00 between", value1, value2, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb00NotBetween(String value1, String value2) {
            addCriterion("PROTB100CB00 not between", value1, value2, "protb100cb00");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01IsNull() {
            addCriterion("PROTB100CB01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01IsNotNull() {
            addCriterion("PROTB100CB01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01EqualTo(String value) {
            addCriterion("PROTB100CB01 =", value, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01NotEqualTo(String value) {
            addCriterion("PROTB100CB01 <>", value, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01GreaterThan(String value) {
            addCriterion("PROTB100CB01 >", value, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CB01 >=", value, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01LessThan(String value) {
            addCriterion("PROTB100CB01 <", value, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CB01 <=", value, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01Like(String value) {
            addCriterion("PROTB100CB01 like", value, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01NotLike(String value) {
            addCriterion("PROTB100CB01 not like", value, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01In(List<String> values) {
            addCriterion("PROTB100CB01 in", values, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01NotIn(List<String> values) {
            addCriterion("PROTB100CB01 not in", values, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01Between(String value1, String value2) {
            addCriterion("PROTB100CB01 between", value1, value2, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb01NotBetween(String value1, String value2) {
            addCriterion("PROTB100CB01 not between", value1, value2, "protb100cb01");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02IsNull() {
            addCriterion("PROTB100CB02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02IsNotNull() {
            addCriterion("PROTB100CB02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02EqualTo(Date value) {
            addCriterion("PROTB100CB02 =", value, "protb100cb02");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02NotEqualTo(Date value) {
            addCriterion("PROTB100CB02 <>", value, "protb100cb02");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02GreaterThan(Date value) {
            addCriterion("PROTB100CB02 >", value, "protb100cb02");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB100CB02 >=", value, "protb100cb02");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02LessThan(Date value) {
            addCriterion("PROTB100CB02 <", value, "protb100cb02");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB100CB02 <=", value, "protb100cb02");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02In(List<Date> values) {
            addCriterion("PROTB100CB02 in", values, "protb100cb02");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02NotIn(List<Date> values) {
            addCriterion("PROTB100CB02 not in", values, "protb100cb02");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02Between(Date value1, Date value2) {
            addCriterion("PROTB100CB02 between", value1, value2, "protb100cb02");
            return (Criteria) this;
        }

        public Criteria andProtb100cb02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB100CB02 not between", value1, value2, "protb100cb02");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03IsNull() {
            addCriterion("PROTB100CB03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03IsNotNull() {
            addCriterion("PROTB100CB03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03EqualTo(Date value) {
            addCriterion("PROTB100CB03 =", value, "protb100cb03");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03NotEqualTo(Date value) {
            addCriterion("PROTB100CB03 <>", value, "protb100cb03");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03GreaterThan(Date value) {
            addCriterion("PROTB100CB03 >", value, "protb100cb03");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB100CB03 >=", value, "protb100cb03");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03LessThan(Date value) {
            addCriterion("PROTB100CB03 <", value, "protb100cb03");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03LessThanOrEqualTo(Date value) {
            addCriterion("PROTB100CB03 <=", value, "protb100cb03");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03In(List<Date> values) {
            addCriterion("PROTB100CB03 in", values, "protb100cb03");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03NotIn(List<Date> values) {
            addCriterion("PROTB100CB03 not in", values, "protb100cb03");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03Between(Date value1, Date value2) {
            addCriterion("PROTB100CB03 between", value1, value2, "protb100cb03");
            return (Criteria) this;
        }

        public Criteria andProtb100cb03NotBetween(Date value1, Date value2) {
            addCriterion("PROTB100CB03 not between", value1, value2, "protb100cb03");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04IsNull() {
            addCriterion("PROTB100CB04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04IsNotNull() {
            addCriterion("PROTB100CB04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04EqualTo(Date value) {
            addCriterion("PROTB100CB04 =", value, "protb100cb04");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04NotEqualTo(Date value) {
            addCriterion("PROTB100CB04 <>", value, "protb100cb04");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04GreaterThan(Date value) {
            addCriterion("PROTB100CB04 >", value, "protb100cb04");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB100CB04 >=", value, "protb100cb04");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04LessThan(Date value) {
            addCriterion("PROTB100CB04 <", value, "protb100cb04");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04LessThanOrEqualTo(Date value) {
            addCriterion("PROTB100CB04 <=", value, "protb100cb04");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04In(List<Date> values) {
            addCriterion("PROTB100CB04 in", values, "protb100cb04");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04NotIn(List<Date> values) {
            addCriterion("PROTB100CB04 not in", values, "protb100cb04");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04Between(Date value1, Date value2) {
            addCriterion("PROTB100CB04 between", value1, value2, "protb100cb04");
            return (Criteria) this;
        }

        public Criteria andProtb100cb04NotBetween(Date value1, Date value2) {
            addCriterion("PROTB100CB04 not between", value1, value2, "protb100cb04");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05IsNull() {
            addCriterion("PROTB100CB05 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05IsNotNull() {
            addCriterion("PROTB100CB05 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05EqualTo(String value) {
            addCriterion("PROTB100CB05 =", value, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05NotEqualTo(String value) {
            addCriterion("PROTB100CB05 <>", value, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05GreaterThan(String value) {
            addCriterion("PROTB100CB05 >", value, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CB05 >=", value, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05LessThan(String value) {
            addCriterion("PROTB100CB05 <", value, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CB05 <=", value, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05Like(String value) {
            addCriterion("PROTB100CB05 like", value, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05NotLike(String value) {
            addCriterion("PROTB100CB05 not like", value, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05In(List<String> values) {
            addCriterion("PROTB100CB05 in", values, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05NotIn(List<String> values) {
            addCriterion("PROTB100CB05 not in", values, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05Between(String value1, String value2) {
            addCriterion("PROTB100CB05 between", value1, value2, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb05NotBetween(String value1, String value2) {
            addCriterion("PROTB100CB05 not between", value1, value2, "protb100cb05");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06IsNull() {
            addCriterion("PROTB100CB06 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06IsNotNull() {
            addCriterion("PROTB100CB06 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06EqualTo(String value) {
            addCriterion("PROTB100CB06 =", value, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06NotEqualTo(String value) {
            addCriterion("PROTB100CB06 <>", value, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06GreaterThan(String value) {
            addCriterion("PROTB100CB06 >", value, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CB06 >=", value, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06LessThan(String value) {
            addCriterion("PROTB100CB06 <", value, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CB06 <=", value, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06Like(String value) {
            addCriterion("PROTB100CB06 like", value, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06NotLike(String value) {
            addCriterion("PROTB100CB06 not like", value, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06In(List<String> values) {
            addCriterion("PROTB100CB06 in", values, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06NotIn(List<String> values) {
            addCriterion("PROTB100CB06 not in", values, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06Between(String value1, String value2) {
            addCriterion("PROTB100CB06 between", value1, value2, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100cb06NotBetween(String value1, String value2) {
            addCriterion("PROTB100CB06 not between", value1, value2, "protb100cb06");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00IsNull() {
            addCriterion("PROTB100CE00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00IsNotNull() {
            addCriterion("PROTB100CE00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00EqualTo(String value) {
            addCriterion("PROTB100CE00 =", value, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00NotEqualTo(String value) {
            addCriterion("PROTB100CE00 <>", value, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00GreaterThan(String value) {
            addCriterion("PROTB100CE00 >", value, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CE00 >=", value, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00LessThan(String value) {
            addCriterion("PROTB100CE00 <", value, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CE00 <=", value, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00Like(String value) {
            addCriterion("PROTB100CE00 like", value, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00NotLike(String value) {
            addCriterion("PROTB100CE00 not like", value, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00In(List<String> values) {
            addCriterion("PROTB100CE00 in", values, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00NotIn(List<String> values) {
            addCriterion("PROTB100CE00 not in", values, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00Between(String value1, String value2) {
            addCriterion("PROTB100CE00 between", value1, value2, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100ce00NotBetween(String value1, String value2) {
            addCriterion("PROTB100CE00 not between", value1, value2, "protb100ce00");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00IsNull() {
            addCriterion("PROTB100CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00IsNotNull() {
            addCriterion("PROTB100CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00EqualTo(Date value) {
            addCriterion("PROTB100CC00 =", value, "protb100cc00");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00NotEqualTo(Date value) {
            addCriterion("PROTB100CC00 <>", value, "protb100cc00");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00GreaterThan(Date value) {
            addCriterion("PROTB100CC00 >", value, "protb100cc00");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB100CC00 >=", value, "protb100cc00");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00LessThan(Date value) {
            addCriterion("PROTB100CC00 <", value, "protb100cc00");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB100CC00 <=", value, "protb100cc00");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00In(List<Date> values) {
            addCriterion("PROTB100CC00 in", values, "protb100cc00");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00NotIn(List<Date> values) {
            addCriterion("PROTB100CC00 not in", values, "protb100cc00");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00Between(Date value1, Date value2) {
            addCriterion("PROTB100CC00 between", value1, value2, "protb100cc00");
            return (Criteria) this;
        }

        public Criteria andProtb100cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB100CC00 not between", value1, value2, "protb100cc00");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01IsNull() {
            addCriterion("PROTB100CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01IsNotNull() {
            addCriterion("PROTB100CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01EqualTo(String value) {
            addCriterion("PROTB100CC01 =", value, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01NotEqualTo(String value) {
            addCriterion("PROTB100CC01 <>", value, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01GreaterThan(String value) {
            addCriterion("PROTB100CC01 >", value, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CC01 >=", value, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01LessThan(String value) {
            addCriterion("PROTB100CC01 <", value, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CC01 <=", value, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01Like(String value) {
            addCriterion("PROTB100CC01 like", value, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01NotLike(String value) {
            addCriterion("PROTB100CC01 not like", value, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01In(List<String> values) {
            addCriterion("PROTB100CC01 in", values, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01NotIn(List<String> values) {
            addCriterion("PROTB100CC01 not in", values, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01Between(String value1, String value2) {
            addCriterion("PROTB100CC01 between", value1, value2, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB100CC01 not between", value1, value2, "protb100cc01");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02IsNull() {
            addCriterion("PROTB100CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02IsNotNull() {
            addCriterion("PROTB100CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02EqualTo(Date value) {
            addCriterion("PROTB100CC02 =", value, "protb100cc02");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02NotEqualTo(Date value) {
            addCriterion("PROTB100CC02 <>", value, "protb100cc02");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02GreaterThan(Date value) {
            addCriterion("PROTB100CC02 >", value, "protb100cc02");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB100CC02 >=", value, "protb100cc02");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02LessThan(Date value) {
            addCriterion("PROTB100CC02 <", value, "protb100cc02");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB100CC02 <=", value, "protb100cc02");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02In(List<Date> values) {
            addCriterion("PROTB100CC02 in", values, "protb100cc02");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02NotIn(List<Date> values) {
            addCriterion("PROTB100CC02 not in", values, "protb100cc02");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02Between(Date value1, Date value2) {
            addCriterion("PROTB100CC02 between", value1, value2, "protb100cc02");
            return (Criteria) this;
        }

        public Criteria andProtb100cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB100CC02 not between", value1, value2, "protb100cc02");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03IsNull() {
            addCriterion("PROTB100CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03IsNotNull() {
            addCriterion("PROTB100CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03EqualTo(String value) {
            addCriterion("PROTB100CC03 =", value, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03NotEqualTo(String value) {
            addCriterion("PROTB100CC03 <>", value, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03GreaterThan(String value) {
            addCriterion("PROTB100CC03 >", value, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CC03 >=", value, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03LessThan(String value) {
            addCriterion("PROTB100CC03 <", value, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CC03 <=", value, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03Like(String value) {
            addCriterion("PROTB100CC03 like", value, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03NotLike(String value) {
            addCriterion("PROTB100CC03 not like", value, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03In(List<String> values) {
            addCriterion("PROTB100CC03 in", values, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03NotIn(List<String> values) {
            addCriterion("PROTB100CC03 not in", values, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03Between(String value1, String value2) {
            addCriterion("PROTB100CC03 between", value1, value2, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB100CC03 not between", value1, value2, "protb100cc03");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00IsNull() {
            addCriterion("PROTB100CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00IsNotNull() {
            addCriterion("PROTB100CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00EqualTo(String value) {
            addCriterion("PROTB100CD00 =", value, "protb100cd00");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00NotEqualTo(String value) {
            addCriterion("PROTB100CD00 <>", value, "protb100cd00");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00GreaterThan(String value) {
            addCriterion("PROTB100CD00 >", value, "protb100cd00");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB100CD00 >=", value, "protb100cd00");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00LessThan(String value) {
            addCriterion("PROTB100CD00 <", value, "protb100cd00");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB100CD00 <=", value, "protb100cd00");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00Like(String value) {
            addCriterion("PROTB100CD00 like", value, "protb100cd00");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00NotLike(String value) {
            addCriterion("PROTB100CD00 not like", value, "protb100cd00");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00In(List<String> values) {
            addCriterion("PROTB100CD00 in", values, "protb100cd00");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00NotIn(List<String> values) {
            addCriterion("PROTB100CD00 not in", values, "protb100cd00");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00Between(String value1, String value2) {
            addCriterion("PROTB100CD00 between", value1, value2, "protb100cd00");
            return (Criteria) this;
        }

        public Criteria andProtb100cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB100CD00 not between", value1, value2, "protb100cd00");
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