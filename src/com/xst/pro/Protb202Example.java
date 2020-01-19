package com.xst.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Protb202Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Protb202Example() {
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

        public Criteria andProtb202idIsNull() {
            addCriterion("PROTB202ID is null");
            return (Criteria) this;
        }

        public Criteria andProtb202idIsNotNull() {
            addCriterion("PROTB202ID is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202idEqualTo(String value) {
            addCriterion("PROTB202ID =", value, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202idNotEqualTo(String value) {
            addCriterion("PROTB202ID <>", value, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202idGreaterThan(String value) {
            addCriterion("PROTB202ID >", value, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202idGreaterThanOrEqualTo(String value) {
            addCriterion("PROTB202ID >=", value, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202idLessThan(String value) {
            addCriterion("PROTB202ID <", value, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202idLessThanOrEqualTo(String value) {
            addCriterion("PROTB202ID <=", value, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202idLike(String value) {
            addCriterion("PROTB202ID like", value, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202idNotLike(String value) {
            addCriterion("PROTB202ID not like", value, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202idIn(List<String> values) {
            addCriterion("PROTB202ID in", values, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202idNotIn(List<String> values) {
            addCriterion("PROTB202ID not in", values, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202idBetween(String value1, String value2) {
            addCriterion("PROTB202ID between", value1, value2, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202idNotBetween(String value1, String value2) {
            addCriterion("PROTB202ID not between", value1, value2, "protb202id");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01IsNull() {
            addCriterion("PROTB202CD01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01IsNotNull() {
            addCriterion("PROTB202CD01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01EqualTo(String value) {
            addCriterion("PROTB202CD01 =", value, "protb202cd01");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01NotEqualTo(String value) {
            addCriterion("PROTB202CD01 <>", value, "protb202cd01");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01GreaterThan(String value) {
            addCriterion("PROTB202CD01 >", value, "protb202cd01");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB202CD01 >=", value, "protb202cd01");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01LessThan(String value) {
            addCriterion("PROTB202CD01 <", value, "protb202cd01");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01LessThanOrEqualTo(String value) {
            addCriterion("PROTB202CD01 <=", value, "protb202cd01");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01Like(String value) {
            addCriterion("PROTB202CD01 like", value, "protb202cd01");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01NotLike(String value) {
            addCriterion("PROTB202CD01 not like", value, "protb202cd01");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01In(List<String> values) {
            addCriterion("PROTB202CD01 in", values, "protb202cd01");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01NotIn(List<String> values) {
            addCriterion("PROTB202CD01 not in", values, "protb202cd01");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01Between(String value1, String value2) {
            addCriterion("PROTB202CD01 between", value1, value2, "protb202cd01");
            return (Criteria) this;
        }

        public Criteria andProtb202cd01NotBetween(String value1, String value2) {
            addCriterion("PROTB202CD01 not between", value1, value2, "protb202cd01");
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

        public Criteria andSettb09idIsNull() {
            addCriterion("SETTB09ID is null");
            return (Criteria) this;
        }

        public Criteria andSettb09idIsNotNull() {
            addCriterion("SETTB09ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettb09idEqualTo(String value) {
            addCriterion("SETTB09ID =", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idNotEqualTo(String value) {
            addCriterion("SETTB09ID <>", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idGreaterThan(String value) {
            addCriterion("SETTB09ID >", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idGreaterThanOrEqualTo(String value) {
            addCriterion("SETTB09ID >=", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idLessThan(String value) {
            addCriterion("SETTB09ID <", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idLessThanOrEqualTo(String value) {
            addCriterion("SETTB09ID <=", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idLike(String value) {
            addCriterion("SETTB09ID like", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idNotLike(String value) {
            addCriterion("SETTB09ID not like", value, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idIn(List<String> values) {
            addCriterion("SETTB09ID in", values, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idNotIn(List<String> values) {
            addCriterion("SETTB09ID not in", values, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idBetween(String value1, String value2) {
            addCriterion("SETTB09ID between", value1, value2, "settb09id");
            return (Criteria) this;
        }

        public Criteria andSettb09idNotBetween(String value1, String value2) {
            addCriterion("SETTB09ID not between", value1, value2, "settb09id");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00IsNull() {
            addCriterion("PROTB202CA00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00IsNotNull() {
            addCriterion("PROTB202CA00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00EqualTo(String value) {
            addCriterion("PROTB202CA00 =", value, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00NotEqualTo(String value) {
            addCriterion("PROTB202CA00 <>", value, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00GreaterThan(String value) {
            addCriterion("PROTB202CA00 >", value, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB202CA00 >=", value, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00LessThan(String value) {
            addCriterion("PROTB202CA00 <", value, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00LessThanOrEqualTo(String value) {
            addCriterion("PROTB202CA00 <=", value, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00Like(String value) {
            addCriterion("PROTB202CA00 like", value, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00NotLike(String value) {
            addCriterion("PROTB202CA00 not like", value, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00In(List<String> values) {
            addCriterion("PROTB202CA00 in", values, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00NotIn(List<String> values) {
            addCriterion("PROTB202CA00 not in", values, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00Between(String value1, String value2) {
            addCriterion("PROTB202CA00 between", value1, value2, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca00NotBetween(String value1, String value2) {
            addCriterion("PROTB202CA00 not between", value1, value2, "protb202ca00");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01IsNull() {
            addCriterion("PROTB202CA01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01IsNotNull() {
            addCriterion("PROTB202CA01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01EqualTo(Date value) {
            addCriterion("PROTB202CA01 =", value, "protb202ca01");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01NotEqualTo(Date value) {
            addCriterion("PROTB202CA01 <>", value, "protb202ca01");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01GreaterThan(Date value) {
            addCriterion("PROTB202CA01 >", value, "protb202ca01");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB202CA01 >=", value, "protb202ca01");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01LessThan(Date value) {
            addCriterion("PROTB202CA01 <", value, "protb202ca01");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01LessThanOrEqualTo(Date value) {
            addCriterion("PROTB202CA01 <=", value, "protb202ca01");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01In(List<Date> values) {
            addCriterion("PROTB202CA01 in", values, "protb202ca01");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01NotIn(List<Date> values) {
            addCriterion("PROTB202CA01 not in", values, "protb202ca01");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01Between(Date value1, Date value2) {
            addCriterion("PROTB202CA01 between", value1, value2, "protb202ca01");
            return (Criteria) this;
        }

        public Criteria andProtb202ca01NotBetween(Date value1, Date value2) {
            addCriterion("PROTB202CA01 not between", value1, value2, "protb202ca01");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02IsNull() {
            addCriterion("PROTB202CA02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02IsNotNull() {
            addCriterion("PROTB202CA02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02EqualTo(Date value) {
            addCriterion("PROTB202CA02 =", value, "protb202ca02");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02NotEqualTo(Date value) {
            addCriterion("PROTB202CA02 <>", value, "protb202ca02");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02GreaterThan(Date value) {
            addCriterion("PROTB202CA02 >", value, "protb202ca02");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB202CA02 >=", value, "protb202ca02");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02LessThan(Date value) {
            addCriterion("PROTB202CA02 <", value, "protb202ca02");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB202CA02 <=", value, "protb202ca02");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02In(List<Date> values) {
            addCriterion("PROTB202CA02 in", values, "protb202ca02");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02NotIn(List<Date> values) {
            addCriterion("PROTB202CA02 not in", values, "protb202ca02");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02Between(Date value1, Date value2) {
            addCriterion("PROTB202CA02 between", value1, value2, "protb202ca02");
            return (Criteria) this;
        }

        public Criteria andProtb202ca02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB202CA02 not between", value1, value2, "protb202ca02");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03IsNull() {
            addCriterion("PROTB202CA03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03IsNotNull() {
            addCriterion("PROTB202CA03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03EqualTo(Integer value) {
            addCriterion("PROTB202CA03 =", value, "protb202ca03");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03NotEqualTo(Integer value) {
            addCriterion("PROTB202CA03 <>", value, "protb202ca03");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03GreaterThan(Integer value) {
            addCriterion("PROTB202CA03 >", value, "protb202ca03");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03GreaterThanOrEqualTo(Integer value) {
            addCriterion("PROTB202CA03 >=", value, "protb202ca03");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03LessThan(Integer value) {
            addCriterion("PROTB202CA03 <", value, "protb202ca03");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03LessThanOrEqualTo(Integer value) {
            addCriterion("PROTB202CA03 <=", value, "protb202ca03");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03In(List<Integer> values) {
            addCriterion("PROTB202CA03 in", values, "protb202ca03");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03NotIn(List<Integer> values) {
            addCriterion("PROTB202CA03 not in", values, "protb202ca03");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03Between(Integer value1, Integer value2) {
            addCriterion("PROTB202CA03 between", value1, value2, "protb202ca03");
            return (Criteria) this;
        }

        public Criteria andProtb202ca03NotBetween(Integer value1, Integer value2) {
            addCriterion("PROTB202CA03 not between", value1, value2, "protb202ca03");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04IsNull() {
            addCriterion("PROTB202CA04 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04IsNotNull() {
            addCriterion("PROTB202CA04 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04EqualTo(String value) {
            addCriterion("PROTB202CA04 =", value, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04NotEqualTo(String value) {
            addCriterion("PROTB202CA04 <>", value, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04GreaterThan(String value) {
            addCriterion("PROTB202CA04 >", value, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB202CA04 >=", value, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04LessThan(String value) {
            addCriterion("PROTB202CA04 <", value, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04LessThanOrEqualTo(String value) {
            addCriterion("PROTB202CA04 <=", value, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04Like(String value) {
            addCriterion("PROTB202CA04 like", value, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04NotLike(String value) {
            addCriterion("PROTB202CA04 not like", value, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04In(List<String> values) {
            addCriterion("PROTB202CA04 in", values, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04NotIn(List<String> values) {
            addCriterion("PROTB202CA04 not in", values, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04Between(String value1, String value2) {
            addCriterion("PROTB202CA04 between", value1, value2, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca04NotBetween(String value1, String value2) {
            addCriterion("PROTB202CA04 not between", value1, value2, "protb202ca04");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05IsNull() {
            addCriterion("PROTB202CA05 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05IsNotNull() {
            addCriterion("PROTB202CA05 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05EqualTo(String value) {
            addCriterion("PROTB202CA05 =", value, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05NotEqualTo(String value) {
            addCriterion("PROTB202CA05 <>", value, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05GreaterThan(String value) {
            addCriterion("PROTB202CA05 >", value, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB202CA05 >=", value, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05LessThan(String value) {
            addCriterion("PROTB202CA05 <", value, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05LessThanOrEqualTo(String value) {
            addCriterion("PROTB202CA05 <=", value, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05Like(String value) {
            addCriterion("PROTB202CA05 like", value, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05NotLike(String value) {
            addCriterion("PROTB202CA05 not like", value, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05In(List<String> values) {
            addCriterion("PROTB202CA05 in", values, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05NotIn(List<String> values) {
            addCriterion("PROTB202CA05 not in", values, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05Between(String value1, String value2) {
            addCriterion("PROTB202CA05 between", value1, value2, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca05NotBetween(String value1, String value2) {
            addCriterion("PROTB202CA05 not between", value1, value2, "protb202ca05");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06IsNull() {
            addCriterion("PROTB202CA06 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06IsNotNull() {
            addCriterion("PROTB202CA06 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06EqualTo(String value) {
            addCriterion("PROTB202CA06 =", value, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06NotEqualTo(String value) {
            addCriterion("PROTB202CA06 <>", value, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06GreaterThan(String value) {
            addCriterion("PROTB202CA06 >", value, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB202CA06 >=", value, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06LessThan(String value) {
            addCriterion("PROTB202CA06 <", value, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06LessThanOrEqualTo(String value) {
            addCriterion("PROTB202CA06 <=", value, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06Like(String value) {
            addCriterion("PROTB202CA06 like", value, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06NotLike(String value) {
            addCriterion("PROTB202CA06 not like", value, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06In(List<String> values) {
            addCriterion("PROTB202CA06 in", values, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06NotIn(List<String> values) {
            addCriterion("PROTB202CA06 not in", values, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06Between(String value1, String value2) {
            addCriterion("PROTB202CA06 between", value1, value2, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca06NotBetween(String value1, String value2) {
            addCriterion("PROTB202CA06 not between", value1, value2, "protb202ca06");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07IsNull() {
            addCriterion("PROTB202CA07 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07IsNotNull() {
            addCriterion("PROTB202CA07 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07EqualTo(String value) {
            addCriterion("PROTB202CA07 =", value, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07NotEqualTo(String value) {
            addCriterion("PROTB202CA07 <>", value, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07GreaterThan(String value) {
            addCriterion("PROTB202CA07 >", value, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB202CA07 >=", value, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07LessThan(String value) {
            addCriterion("PROTB202CA07 <", value, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07LessThanOrEqualTo(String value) {
            addCriterion("PROTB202CA07 <=", value, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07Like(String value) {
            addCriterion("PROTB202CA07 like", value, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07NotLike(String value) {
            addCriterion("PROTB202CA07 not like", value, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07In(List<String> values) {
            addCriterion("PROTB202CA07 in", values, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07NotIn(List<String> values) {
            addCriterion("PROTB202CA07 not in", values, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07Between(String value1, String value2) {
            addCriterion("PROTB202CA07 between", value1, value2, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202ca07NotBetween(String value1, String value2) {
            addCriterion("PROTB202CA07 not between", value1, value2, "protb202ca07");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00IsNull() {
            addCriterion("PROTB202CC00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00IsNotNull() {
            addCriterion("PROTB202CC00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00EqualTo(Date value) {
            addCriterion("PROTB202CC00 =", value, "protb202cc00");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00NotEqualTo(Date value) {
            addCriterion("PROTB202CC00 <>", value, "protb202cc00");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00GreaterThan(Date value) {
            addCriterion("PROTB202CC00 >", value, "protb202cc00");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB202CC00 >=", value, "protb202cc00");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00LessThan(Date value) {
            addCriterion("PROTB202CC00 <", value, "protb202cc00");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00LessThanOrEqualTo(Date value) {
            addCriterion("PROTB202CC00 <=", value, "protb202cc00");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00In(List<Date> values) {
            addCriterion("PROTB202CC00 in", values, "protb202cc00");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00NotIn(List<Date> values) {
            addCriterion("PROTB202CC00 not in", values, "protb202cc00");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00Between(Date value1, Date value2) {
            addCriterion("PROTB202CC00 between", value1, value2, "protb202cc00");
            return (Criteria) this;
        }

        public Criteria andProtb202cc00NotBetween(Date value1, Date value2) {
            addCriterion("PROTB202CC00 not between", value1, value2, "protb202cc00");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01IsNull() {
            addCriterion("PROTB202CC01 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01IsNotNull() {
            addCriterion("PROTB202CC01 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01EqualTo(String value) {
            addCriterion("PROTB202CC01 =", value, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01NotEqualTo(String value) {
            addCriterion("PROTB202CC01 <>", value, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01GreaterThan(String value) {
            addCriterion("PROTB202CC01 >", value, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB202CC01 >=", value, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01LessThan(String value) {
            addCriterion("PROTB202CC01 <", value, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01LessThanOrEqualTo(String value) {
            addCriterion("PROTB202CC01 <=", value, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01Like(String value) {
            addCriterion("PROTB202CC01 like", value, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01NotLike(String value) {
            addCriterion("PROTB202CC01 not like", value, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01In(List<String> values) {
            addCriterion("PROTB202CC01 in", values, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01NotIn(List<String> values) {
            addCriterion("PROTB202CC01 not in", values, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01Between(String value1, String value2) {
            addCriterion("PROTB202CC01 between", value1, value2, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc01NotBetween(String value1, String value2) {
            addCriterion("PROTB202CC01 not between", value1, value2, "protb202cc01");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02IsNull() {
            addCriterion("PROTB202CC02 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02IsNotNull() {
            addCriterion("PROTB202CC02 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02EqualTo(Date value) {
            addCriterion("PROTB202CC02 =", value, "protb202cc02");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02NotEqualTo(Date value) {
            addCriterion("PROTB202CC02 <>", value, "protb202cc02");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02GreaterThan(Date value) {
            addCriterion("PROTB202CC02 >", value, "protb202cc02");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02GreaterThanOrEqualTo(Date value) {
            addCriterion("PROTB202CC02 >=", value, "protb202cc02");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02LessThan(Date value) {
            addCriterion("PROTB202CC02 <", value, "protb202cc02");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02LessThanOrEqualTo(Date value) {
            addCriterion("PROTB202CC02 <=", value, "protb202cc02");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02In(List<Date> values) {
            addCriterion("PROTB202CC02 in", values, "protb202cc02");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02NotIn(List<Date> values) {
            addCriterion("PROTB202CC02 not in", values, "protb202cc02");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02Between(Date value1, Date value2) {
            addCriterion("PROTB202CC02 between", value1, value2, "protb202cc02");
            return (Criteria) this;
        }

        public Criteria andProtb202cc02NotBetween(Date value1, Date value2) {
            addCriterion("PROTB202CC02 not between", value1, value2, "protb202cc02");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03IsNull() {
            addCriterion("PROTB202CC03 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03IsNotNull() {
            addCriterion("PROTB202CC03 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03EqualTo(String value) {
            addCriterion("PROTB202CC03 =", value, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03NotEqualTo(String value) {
            addCriterion("PROTB202CC03 <>", value, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03GreaterThan(String value) {
            addCriterion("PROTB202CC03 >", value, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB202CC03 >=", value, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03LessThan(String value) {
            addCriterion("PROTB202CC03 <", value, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03LessThanOrEqualTo(String value) {
            addCriterion("PROTB202CC03 <=", value, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03Like(String value) {
            addCriterion("PROTB202CC03 like", value, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03NotLike(String value) {
            addCriterion("PROTB202CC03 not like", value, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03In(List<String> values) {
            addCriterion("PROTB202CC03 in", values, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03NotIn(List<String> values) {
            addCriterion("PROTB202CC03 not in", values, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03Between(String value1, String value2) {
            addCriterion("PROTB202CC03 between", value1, value2, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cc03NotBetween(String value1, String value2) {
            addCriterion("PROTB202CC03 not between", value1, value2, "protb202cc03");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00IsNull() {
            addCriterion("PROTB202CD00 is null");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00IsNotNull() {
            addCriterion("PROTB202CD00 is not null");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00EqualTo(String value) {
            addCriterion("PROTB202CD00 =", value, "protb202cd00");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00NotEqualTo(String value) {
            addCriterion("PROTB202CD00 <>", value, "protb202cd00");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00GreaterThan(String value) {
            addCriterion("PROTB202CD00 >", value, "protb202cd00");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00GreaterThanOrEqualTo(String value) {
            addCriterion("PROTB202CD00 >=", value, "protb202cd00");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00LessThan(String value) {
            addCriterion("PROTB202CD00 <", value, "protb202cd00");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00LessThanOrEqualTo(String value) {
            addCriterion("PROTB202CD00 <=", value, "protb202cd00");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00Like(String value) {
            addCriterion("PROTB202CD00 like", value, "protb202cd00");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00NotLike(String value) {
            addCriterion("PROTB202CD00 not like", value, "protb202cd00");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00In(List<String> values) {
            addCriterion("PROTB202CD00 in", values, "protb202cd00");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00NotIn(List<String> values) {
            addCriterion("PROTB202CD00 not in", values, "protb202cd00");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00Between(String value1, String value2) {
            addCriterion("PROTB202CD00 between", value1, value2, "protb202cd00");
            return (Criteria) this;
        }

        public Criteria andProtb202cd00NotBetween(String value1, String value2) {
            addCriterion("PROTB202CD00 not between", value1, value2, "protb202cd00");
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